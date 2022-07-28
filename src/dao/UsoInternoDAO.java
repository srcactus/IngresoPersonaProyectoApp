/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bd.Conexion;
import entidades.DatosContacto;
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
public class UsoInternoDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(UsoInterno usoInterno, Persona persona) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql2 = "insert into uso_interno(correo, clave, usuario_sercotec, clave_sercotec) values(?,?,?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, usoInterno.getCorreo());
            stmt2.setString(2, usoInterno.getClave());
            stmt2.setString(3, usoInterno.getUsuarioSercotec());
            stmt2.setString(4, usoInterno.getClaveSercotec());
            
            
            int cantidad = stmt2.executeUpdate();

            
            if (cantidad > 0) {

                String sql = "select id_uso_interno from uso_interno where "
                        + "correo=(?) and clave=(?) and usuario_sercotec=(?) "
                        + "and clave_sercotec=(?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, usoInterno.getCorreo());
                stmt.setString(2, usoInterno.getClave());
                stmt.setString(3, usoInterno.getUsuarioSercotec());
                stmt.setString(4, usoInterno.getClaveSercotec());

                ResultSet rs = stmt.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_uso_interno");
                }

                persona.setIdUsoInternoF(valor);

                System.out.println("Valor getIdUsoInternoF: " + persona.getIdUsoInternoF());

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<UsoInterno> listarUsoInternoPorId(UsoInterno usoInterno) throws SQLException{
        
        ArrayList<UsoInterno> usoIntern = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select correo, clave, usuario_sercotec, clave_sercotec from uso_interno where id_uso_interno=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, usoInterno.getIdUsoInterno());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                UsoInterno ui = new UsoInterno();
                
                ui.setCorreo(rs.getString("correo"));
                ui.setClave(rs.getString("clave"));
                ui.setUsuarioSercotec(rs.getString("usuario_sercotec"));
                ui.setClaveSercotec(rs.getString("clave_sercotec"));
                
                usoIntern.add(ui);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return usoIntern;
    }
    
}
