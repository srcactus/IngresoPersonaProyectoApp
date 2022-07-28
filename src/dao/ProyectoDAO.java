/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cactus
 */
public class ProyectoDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Proyecto proyecto) throws SQLException {
        
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql2 = "insert into proyecto(fecha_entrega_proyecto_estimada, "
                    + "persona_contacto_proyecto, descripcion_proyecto, "
                    + "nombre_proyecto, id_persona) values(?,?,?,?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, proyecto.getFechaEntregaProyectoEstimada());
            stmt2.setString(2, proyecto.getPersonaContactoProyecto());
            stmt2.setString(3, proyecto.getDescripcionProyecto());
            stmt2.setString(4, proyecto.getNombreProyecto());
            stmt2.setInt(5, proyecto.getIdPersonaF());
            
            
            
            int cantidad = stmt2.executeUpdate();

            
            consultaCorrecta = (cantidad>0);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
}
