/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Discapacidad;
import entidades.Localidad;
import entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class DiscapacidadDAO {

    private Conexion conexion = new Conexion();

    int valorForanea;

    int cantidad;

    public boolean consultaDatos(Discapacidad discapacidad, Persona persona) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sqlP = "select id_disc from discapacidad where situacion_disc=(?) and credencial_disc=(?)";
            PreparedStatement stmt3 = conn.prepareStatement(sqlP);
            stmt3.setString(1, discapacidad.getSituacionDiscapacidad());
            stmt3.setString(2, discapacidad.getCredencialDiscapacidad());

            ResultSet rs = stmt3.executeQuery();

            while (rs.next()) {

                valorForanea = rs.getInt("id_disc");

            }
            System.out.println("valorForanea recorriendo rs: "+ valorForanea);

            System.out.println("discapacidad insertada con exito");
            
            if (valorForanea != 0) {

                persona.setIdDiscapacidadF(valorForanea);

                System.out.println("Valor de getIdDiscapacidadF: " + persona.getIdDiscapacidadF());

                consultaCorrecta = true;

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    
    public ArrayList<Discapacidad> listarDiscapacidadPorId(Discapacidad discapacidad) throws SQLException{
        
        ArrayList<Discapacidad> discapacida = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select situacion_disc, credencial_disc from discapacidad where id_disc=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, discapacidad.getIdDiscapacidad());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Discapacidad d = new Discapacidad();
                
                d.setSituacionDiscapacidad(rs.getString("situacion_disc"));
                d.setCredencialDiscapacidad(rs.getString("credencial_disc"));
                
                discapacida.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return discapacida;
    }

}
