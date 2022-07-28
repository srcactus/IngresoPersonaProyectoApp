/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.Direccion;
import entidades.Localidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class LocalidadDAO {

    private Conexion conexion = new Conexion();
    String valorC;
    String valorD;
    int valorE;
    int valorL;
    int valorZ;
    int valorK;
    int cantidad;
    int cantidad2;

    public boolean consultaDatos(Localidad localidad, Direccion direccion) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sqlC = "select nombre_loc from localidad where nombre_loc=(?)";
            PreparedStatement stmtC = conn.prepareStatement(sqlC);
            stmtC.setString(1, localidad.getNombreLocalidad());

            ResultSet rsC = stmtC.executeQuery();

            while (rsC.next()) {
                valorC = rsC.getString("nombre_loc");

            }

            if (valorC != localidad.getNombreLocalidad()) {

                String sql2 = "insert into localidad(id_comuna, nombre_loc) values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setInt(1, localidad.getIdComunaF());
                System.out.println("valor del getIdComunaF para el insert de localidad: " + localidad.getIdComunaF());
                stmt2.setString(2, localidad.getNombreLocalidad());

                cantidad = stmt2.executeUpdate();

                if (cantidad != 0) {

                    String sqlZ = "select id_localidad from localidad where "
                            + "nombre_loc=(?)";
                    PreparedStatement stmtZ = conn.prepareStatement(sqlZ);
                    stmtZ.setString(1, localidad.getNombreLocalidad());

                    ResultSet rsZ = stmtZ.executeQuery();

                    while (rsZ.next()) {

                        valorZ = rsZ.getInt("id_localidad");

                    }

                    direccion.setIdLocalidadF(valorZ);

                    System.out.println("valor del getIdLocalidadF: " + direccion.getIdLocalidadF());

                    consultaCorrecta = true;

                }

            } else if (valorC == localidad.getNombreLocalidad()) {

                String sql3 = "select id_localidad from localidad where "
                        + "nombre_loc=(?)";
                PreparedStatement stmtL = conn.prepareStatement(sql3);
                stmtL.setString(1, localidad.getNombreLocalidad());

                ResultSet rsL = stmtL.executeQuery();

                while (rsL.next()) {

                    valorL = rsL.getInt("id_localidad");

                }

                direccion.setIdLocalidadF(valorL);

                System.out.println("valor del getIdLocalidadF: " + direccion.getIdLocalidadF());

                if (valorL != 0) {
                    consultaCorrecta = true;
                }

            } else {
                consultaCorrecta = false;
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }

    public boolean consultaDatosEmp(Localidad localidad, Direccion direccion) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sqlD = "select nombre_loc from localidad where nombre_loc=(?)";
            PreparedStatement stmtD = conn.prepareStatement(sqlD);
            stmtD.setString(1, localidad.getNombreLocalidadEmp());
            
            

            ResultSet rsD = stmtD.executeQuery();

            while (rsD.next()) {
                valorD = rsD.getString("nombre_loc");

            }

            if (valorD != localidad.getNombreLocalidadEmp()) {

                String sql2 = "insert into localidad(id_comuna, nombre_loc) values(?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setInt(1, localidad.getIdComunaFEmp());
                System.out.println("valor del getIdComunaFEmp para el insert de localidad: " + localidad.getIdComunaFEmp());
                stmt2.setString(2, localidad.getNombreLocalidadEmp());

                cantidad2 = stmt2.executeUpdate();

                if (cantidad2 != 0) {

                    String sqlZ = "select id_localidad from localidad where "
                            + "nombre_loc=(?)";
                    PreparedStatement stmtZ = conn.prepareStatement(sqlZ);
                    stmtZ.setString(1, localidad.getNombreLocalidadEmp());

                    ResultSet rsZ = stmtZ.executeQuery();

                    while (rsZ.next()) {

                        valorK = rsZ.getInt("id_localidad");

                    }

                    direccion.setIdLocalidadFEmp(valorK);

                    System.out.println("valor del getIdLocalidadFEmp: " + direccion.getIdLocalidadFEmp());

                    consultaCorrecta = true;

                }

            } else if (valorD == localidad.getNombreLocalidadEmp()) {

                String sql3 = "select id_localidad from localidad where "
                        + "nombre_loc=(?)";
                PreparedStatement stmtL = conn.prepareStatement(sql3);
                stmtL.setString(1, localidad.getNombreLocalidadEmp());

                ResultSet rsL = stmtL.executeQuery();

                while (rsL.next()) {

                    valorE = rsL.getInt("id_localidad");

                }

                direccion.setIdLocalidadFEmp(valorE);

                System.out.println("valor del getIdLocalidadFEmp: " + direccion.getIdLocalidadFEmp());

                if (valorE != 0) {
                    consultaCorrecta = true;
                }

            } else {
                consultaCorrecta = false;
            }

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return consultaCorrecta;

    }
    
    public ArrayList<Localidad> listarLocalidadPorId(Localidad localidad, Comuna comuna) throws SQLException{
        
        ArrayList<Localidad> localida = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_loc, id_comuna from localidad where id_localidad=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, localidad.getIdLocalidad());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Localidad l = new Localidad();
                
                
                l.setNombreLocalidad(rs.getString("nombre_loc"));
                comuna.setIdComuna(rs.getInt("id_comuna"));
                
                
                localida.add(l);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return localida;
    }
    
    
    public ArrayList<Localidad> listarLocalidadEmpresaPorId(Localidad localidad, Comuna comuna) throws SQLException{
        
        ArrayList<Localidad> localidaEmp = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_loc, id_comuna from localidad where id_localidad=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, localidad.getIdLocalidadEmp());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Localidad l = new Localidad();
                
                
                l.setNombreLocalidadEmp(rs.getString("nombre_loc"));
                comuna.setIdComunaEmp(rs.getInt("id_comuna"));
                
                
                localidaEmp.add(l);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return localidaEmp;
    }
    

}
