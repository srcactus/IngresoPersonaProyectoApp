/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Provincia;
import dao.RegionDAO;
import entidades.Comuna;
import entidades.Region;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ProvinciaDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Provincia provincia, Comuna comuna) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            if (provincia.getNombreProvincia() == "No aplica/Otro") {

                String sql3 = "insert into provincia (nombre_prov, id_region) values "
                        + "(?,?)";
                PreparedStatement stmt3 = conn.prepareStatement(sql3);

                stmt3.setString(1, provincia.getNombreProvincia());
                stmt3.setInt(2, provincia.getIdRegionF());

                int cantidad = stmt3.executeUpdate();

                if (cantidad > 0) {
                    consultaCorrecta = true;
                }

            } else {

                String sql = "select id_provincia from provincia where nombre_prov=(?)";

                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, provincia.getNombreProvincia());

                ResultSet rs = stmt.executeQuery();

                System.out.println("***valor getIdRegionF:--> " + provincia.getIdRegionF());

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_provincia");
                }

                comuna.setIdProvinciaF(valor);

                System.out.println("valor del getIdProvinciaF: " + comuna.getIdProvinciaF());

                if (valor > 0) {

                    consultaCorrecta = true;

                }
            }

            if (provincia.getNombreProvinciaEmp() == "No aplica/Otro") {

                String sql4 = "insert into provincia (nombre_prov, id_region) values "
                        + "(?,?)";
                PreparedStatement stmt4 = conn.prepareStatement(sql4);

                stmt4.setString(1, provincia.getNombreProvinciaEmp());
                stmt4.setInt(2, provincia.getIdRegionFEmp());

                int cantidad = stmt4.executeUpdate();

                if (cantidad > 0) {
                    consultaCorrecta = true;
                }

            } else {

                String sql2 = "select id_provincia from provincia where nombre_prov=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);

                stmt2.setString(1, provincia.getNombreProvinciaEmp());

                ResultSet rs2 = stmt2.executeQuery();

                int valor2 = 0;
                while (rs2.next()) {
                    valor2 = rs2.getInt("id_provincia");
                }

                comuna.setIdProvinciaFEmp(valor2);

                System.out.println("valor del getIdProvinciaFEmp: " + comuna.getIdProvinciaFEmp());

                if (valor2 > 0) {
                    consultaCorrecta = true;
                }
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<Provincia> listarProvinciaPorId(Provincia provincia, Region region) throws SQLException{
        
        ArrayList<Provincia> provi = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_prov, id_region from provincia where id_provincia=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, provincia.getIdProvincia());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Provincia p = new Provincia();
                
                p.setNombreProvincia(rs.getString("nombre_prov"));
                region.setIdRegion(rs.getInt("id_region"));
                
                provi.add(p);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return provi;
    }
    
    
    public ArrayList<Provincia> listarProvinciaEmpresaPorId(Provincia provincia, Region region) throws SQLException{
        
        ArrayList<Provincia> proviEmp = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_prov, id_region from provincia where id_provincia=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, provincia.getIdProvinciaEmp());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Provincia p = new Provincia();
                
                p.setNombreProvinciaEmp(rs.getString("nombre_prov"));
                region.setIdRegionEmp(rs.getInt("id_region"));
                
                proviEmp.add(p);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return proviEmp;
    }

}
