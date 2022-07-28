/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.FichaTec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cactus
 */
public class FichaTecDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(FichaTec fichaTec) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into ficha_tec (nombre_proy, descripcion_proy, id_persona) values(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fichaTec.getNombreProy());
            stmt.setString(2, fichaTec.getDescripcionProy());
            stmt.setInt(3, fichaTec.getIdPersonaF());
            
            int cantidad = stmt.executeUpdate();
            
            if(cantidad > 0 ){
                
                consultaCorrecta = true;
                
            }
            
        } catch (Exception e) {
            
            System.out.println("ERROR: "+e.getMessage());
            
        }
        
        
        return consultaCorrecta;
    }
    
}
