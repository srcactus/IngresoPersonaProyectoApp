/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Localidad;
import entidades.Provincia;
import entidades.Region;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vistas.FormularioSercotecCanvasCuatro;

/**
 *
 * @author Cactus
 */
public class RegionDAO {

    private Conexion conexion = new Conexion();

    
    public boolean consultaDatos(Region region, Provincia provincia) throws SQLException {
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "select id_region from region where nombre_reg=(?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, region.getNombreRegion());

            ResultSet rs = stmt.executeQuery();
            
            int valor = 0;

            while (rs.next()) {
                valor = rs.getInt("id_region");
            }
            
       
            provincia.setIdRegionF(valor);
            
           
            System.out.println("valor del getIdRegionF: "+ provincia.getIdRegionF());
            
            

            if (valor != 0) {
                
                
                String sql2 = "select id_region from region where nombre_reg=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, region.getNombreRegionEmp());
                
                ResultSet rs2 = stmt2.executeQuery();
                
                int valor2 = 0;
                
                while(rs2.next()){
                    
                    valor2 = rs2.getInt("id_region");
                    
                }
                
                provincia.setIdRegionFEmp(valor2);
                
                System.out.println("valor del getIdRegionFEmp: "+ provincia.getIdRegionFEmp());
                
                
                consultaCorrecta = true;
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    
    public ArrayList<Region> listarRegionPorId(Region region) throws SQLException{
        
        ArrayList<Region> regi = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_reg from region where id_region=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, region.getIdRegion());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Region r = new Region();
                
                r.setNombreRegion(rs.getString("nombre_reg"));
                
                
                regi.add(r);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return regi;
    }
    
    
    public ArrayList<Region> listarRegionEmpresaPorId(Region region) throws SQLException{
        
        ArrayList<Region> regiEmp = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_reg from region where id_region=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, region.getIdRegionEmp());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Region r = new Region();
                
                r.setNombreRegionEmp(rs.getString("nombre_reg"));
                
                
                regiEmp.add(r);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return regiEmp;
    }
    

}
