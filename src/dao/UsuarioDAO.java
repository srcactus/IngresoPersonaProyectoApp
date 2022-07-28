/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bd.Conexion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cactus
 */
public class UsuarioDAO {
    
    private Conexion conexion = new Conexion();
    String valor1;
    String valor2;
    
    public boolean consultaDatosLogin(Usuario usuario) throws SQLException {
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            
            
            System.out.println("name user que viene para la consulta: "+usuario.getNameUsuario());
            System.out.println("pass user que viene para la consulta: "+usuario.getPassUsuario());
            
            String sql = "select name_user, pass_user from users where "
                    + "name_user=(?) and pass_user=(?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNameUsuario());
            stmt.setString(2, usuario.getPassUsuario());
            
            
            
            ResultSet rs = stmt.executeQuery();
            
            
            while(rs.next()){
                valor1 = rs.getString("name_user");
                valor2 = rs.getString("pass_user");
            }
            
            System.out.println("name user que toma de la bd: "+ valor1 );
            System.out.println("pass user que toma de la bd: "+ valor2 );
            
            if(usuario.getNameUsuario().equals(valor1)){
                if(usuario.getPassUsuario().equals(valor2)){
                    consultaCorrecta = true;
                    System.out.println("Logeado correctamente");
                }
            }else{
                System.out.println("Error compruebe los datos e intentelo nuevamente");
            }
            
            
            
         
            
            
        } catch (Exception e) {
            
            System.out.println("Error de logeo: " + e.getMessage());
            
        }
        
        
        return consultaCorrecta;
    }
    
}
