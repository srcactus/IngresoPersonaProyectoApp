/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.ListaRespuesta;
import entidades.Persona;
import entidades.Respuesta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ListaRespuestaDAO {
    
    private Conexion conexion = new Conexion();
    
    public ArrayList<String> listarRespuestaPorId(Respuesta respuesta, Persona persona) throws SQLException{
        
        ArrayList<String> respuest = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select descripcion from respuesta where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, persona.getIdPersona());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                ListaRespuesta r = new ListaRespuesta();
                
                r.setRespuesta(rs.getString("descripcion"));
                
                
                respuest.add(r.toString());
                
                
            }
            
            
            
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return respuest;
    }
    
}
