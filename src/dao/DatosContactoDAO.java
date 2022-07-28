/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bd.Conexion;
import entidades.DatosContacto;
import entidades.Discapacidad;
import entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class DatosContactoDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(DatosContacto datosContacto, Persona persona) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql2 = "insert into datos_contacto(email, email_alt, celular,"
                    + " telefono) values(?,?,?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, datosContacto.getEmail());
            stmt2.setString(2, datosContacto.getEmailAlternativo());
            stmt2.setString(3, datosContacto.getCelular());
            stmt2.setString(4, datosContacto.getTelefono());
            
            
            int cantidad = stmt2.executeUpdate();

            
            if (cantidad > 0) {

                String sql = "select id_dc from datos_contacto where email=(?) "
                        + "and email_alt=(?) and celular=(?) and telefono=(?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, datosContacto.getEmail());
                stmt.setString(2, datosContacto.getEmailAlternativo());
                stmt.setString(3, datosContacto.getCelular());
                stmt.setString(4, datosContacto.getTelefono());
                
                ResultSet rs = stmt.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_dc");
                }

                persona.setIdDatosContactoF(valor);

                System.out.println("Valor getIdDatosContactoF: " + persona.getIdDatosContactoF());

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<DatosContacto> listarDatosContactoPorId(DatosContacto datosContacto) throws SQLException{
        
        ArrayList<DatosContacto> datosContact = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select email, email_alt, celular, telefono from datos_contacto where id_dc=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, datosContacto.getIdDatosContacto());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                DatosContacto dc = new DatosContacto();
                
                dc.setEmail(rs.getString("email"));
                dc.setEmailAlternativo(rs.getString("email_alt"));
                dc.setCelular(rs.getString("celular"));
                dc.setTelefono(rs.getString("telefono"));
                
                datosContact.add(dc);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return datosContact;
    }
    
}
