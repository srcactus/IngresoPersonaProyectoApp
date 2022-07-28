/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.Localidad;
import entidades.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ComunaDAO {

    private Conexion conexion = new Conexion();
    

    public boolean consultaDatos(Comuna comuna, Localidad localidad) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "select id_comuna from comuna where nombre_com=(?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, comuna.getNombreComuna());

            ResultSet rs = stmt.executeQuery();

            int valor = 0;

            while (rs.next()) {
                valor = rs.getInt("id_comuna");
            }

            localidad.setIdComunaF(valor);

            System.out.println("valor del getIdComunaF: " + localidad.getIdComunaF());

            if (valor != 0) {

                String sql2 = "select id_comuna from comuna where nombre_com=(?)";
                
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                
                stmt2.setString(1, comuna.getNombreComunaEmp());

                ResultSet rs2 = stmt2.executeQuery();

                int valor2 = 0;

                while (rs2.next()) {
                    valor2 = rs2.getInt("id_comuna");
                }
                
                localidad.setIdComunaFEmp(valor2);
                
                System.out.println("valor del getIdComunaFEmp: " + localidad.getIdComunaFEmp());
                

                consultaCorrecta = true;
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<Comuna> listarComunaPorId(Provincia provincia, Comuna comuna) throws SQLException{
        
        ArrayList<Comuna> comun = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_com, id_provincia from comuna where id_comuna=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, comuna.getIdComuna());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Comuna c = new Comuna();
                
                
                c.setNombreComuna(rs.getString("nombre_com"));
                provincia.setIdProvincia(rs.getInt("id_provincia"));
                
                
                comun.add(c);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return comun;
    }
    
    
    public ArrayList<Comuna> listarComunaEmpresaPorId(Provincia provincia, Comuna comuna) throws SQLException{
        
        ArrayList<Comuna> comunEmp = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_com, id_provincia from comuna where id_comuna=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, comuna.getIdComunaEmp());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Comuna c = new Comuna();
                
                
                c.setNombreComunaEmp(rs.getString("nombre_com"));
                provincia.setIdProvinciaEmp(rs.getInt("id_provincia"));
                
                
                comunEmp.add(c);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return comunEmp;
    }
    
}
