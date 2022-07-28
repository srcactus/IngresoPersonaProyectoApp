/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Corporacion;
import entidades.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cactus
 */
public class CorporacionDAO {

    private Conexion conexion = new Conexion();
    
    int valorId;
    int valorId2;
    String nombreCorp;

    public boolean consultaDatos(Corporacion corporacion, Persona persona) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {
            String sql = "select id_corporacion from corporacion where "
                    + "nombre_corporacion=(?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, corporacion.getNombreCorporacion());
            
            ResultSet rs = stmt.executeQuery();
            
            int valor = 0;
            
            while(rs.next()){
                
                valor = rs.getInt("id_corporacion");
                
            }
            
            System.out.println("valor id_corporacion que toma en el select: "+ valor);
            
            if(valor>0){
                
                
                persona.setIdCorpF(valor);
                consultaCorrecta = true;
                
                System.out.println("despues de setear getIdCorporacionF: "+persona.getIdCorpF());
                
            }else{
                
                String sql2 = "insert into corporacion(nombre_corporacion) values(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                
                stmt2.setString(1, corporacion.getNombreCorporacion());
                
                String sqlCons = "select id_corporacion from corporacion where "
                        + "nombre_corporacion=(?)";
                
                PreparedStatement stmtCons = conn.prepareStatement(sqlCons);
                
                stmtCons.setString(1, corporacion.getNombreCorporacion());
                
                ResultSet rsCons = stmtCons.executeQuery();
                
                int valorB = 0;
                
                while(rsCons.next()){
                    
                    valorB = rsCons.getInt("id_corporacion");
                    
                }
                
                persona.setIdCorpF(valorB);
                
                
                int cantidad = stmt2.executeUpdate();
                
                consultaCorrecta = (cantidad > 0);
                
                
                
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }

}
