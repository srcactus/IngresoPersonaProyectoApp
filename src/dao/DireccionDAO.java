/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Direccion;
import entidades.Empresa;
import entidades.Localidad;
import entidades.Nacimiento;
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
public class DireccionDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Direccion direccion, Persona persona, Empresa empresa) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {
            String sqlDir = "insert into direccion (direccion, id_localidad) values(?,?)";
            PreparedStatement stmt3 = conn.prepareStatement(sqlDir);
            stmt3.setString(1, direccion.getDireccionEmp());
            stmt3.setInt(2, direccion.getIdLocalidadFEmp());
            
            int cantidad2 = stmt3.executeUpdate();
            
            if(cantidad2 > 0){
                
                String sql = "select id_direccion from direccion where direccion=(?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, direccion.getDireccionEmp());
                
                ResultSet rs = stmt.executeQuery();
                
                int valor = 0;
                while(rs.next()){
                    
                    valor = rs.getInt("id_direccion");
                    
                }
                
                empresa.setIdDireccionF(valor);
                
                System.out.println("Valor recogido por Empresa getIdDireccionF: " + empresa.getIdDireccionF());
                
                
            }

            String sql2 = "insert into direccion(direccion, id_localidad) values(?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, direccion.getDireccion());
            stmt2.setInt(2, direccion.getIdLocalidadF());

            int cantidad = stmt2.executeUpdate();

            System.out.println("direccion insertada con exito");
            if (cantidad > 0) {

                String sql = "select id_direccion from direccion where direccion=(?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, direccion.getDireccion());

                ResultSet rs = stmt.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_direccion");
                }

                

                
                persona.setIdDireccionF(valor);

                
                System.out.println("Valor recogido por Persona getIdDireccionF: " + persona.getIdDireccionF());

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<Direccion> listarDireccionPorId(Direccion direccion, Localidad localidad) throws SQLException{
        
        ArrayList<Direccion> direcc = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select direccion, id_localidad from direccion where id_direccion=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, direccion.getIdDireccion());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Direccion d = new Direccion();
                
                
                d.setDireccion(rs.getString("direccion"));
                localidad.setIdLocalidad(rs.getInt("id_localidad"));
                
                
                direcc.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return direcc;
    }
    
    public ArrayList<Direccion> listarDireccionEmpresaPorId(Direccion direccion, Localidad localidad) throws SQLException{
        
        ArrayList<Direccion> direccEmp = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select direccion, id_localidad from direccion where id_direccion=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, direccion.getIdDireccionEmp());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Direccion d = new Direccion();
                
                
                d.setDireccionEmp(rs.getString("direccion"));
                localidad.setIdLocalidadEmp(rs.getInt("id_localidad"));
                
                
                direccEmp.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return direccEmp;
    }

}
