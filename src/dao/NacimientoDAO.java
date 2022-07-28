/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bd.Conexion;
import entidades.Nacimiento;
import entidades.Persona;
import entidades.UsoInterno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class NacimientoDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Nacimiento nacimiento, Persona persona) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql2 = "insert into nacimiento(lugar_nac, fecha_nac, genero) values(?,?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, nacimiento.getLugarNacimiento());
            stmt2.setString(2, nacimiento.getFechaNacimiento());
            stmt2.setString(3, nacimiento.getGenero());
            
            
            int cantidad = stmt2.executeUpdate();

            
            if (cantidad > 0) {

                String sql = "select id_nacimiento from nacimiento where "
                        + "lugar_nac=(?) and fecha_nac=(?) and genero=(?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, nacimiento.getLugarNacimiento());
                stmt.setString(2, nacimiento.getFechaNacimiento());
                stmt.setString(3, nacimiento.getGenero());


                ResultSet rs = stmt.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_nacimiento");
                }

                

                persona.setIdNacimientoF(valor);

                System.out.println("Valor getIdNacimientoF: " + persona.getIdNacimientoF());

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<Nacimiento> listarNacimientoPorId(Nacimiento nacimiento) throws SQLException{
        
        ArrayList<Nacimiento> naci = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select lugar_nac, fecha_nac, genero from nacimiento where id_nacimiento=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, nacimiento.getIdNacimiento());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Nacimiento n = new Nacimiento();
                
                n.setLugarNacimiento(rs.getString("lugar_nac"));
                n.setFechaNacimiento(rs.getString("fecha_nac"));
                n.setGenero(rs.getString("genero"));
                
                naci.add(n);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return naci;
    }
    
}
