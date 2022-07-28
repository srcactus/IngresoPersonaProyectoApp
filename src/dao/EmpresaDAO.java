/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bd.Conexion;
import entidades.Direccion;
import entidades.Discapacidad;
import entidades.Empresa;
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
public class EmpresaDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Empresa empresa) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql2 = "insert into empresa(tipo_persona, num_trab_contrato, "
                    + "nivel_ventas_anual, rut_empresa, nombre_empresa, "
                    + "id_persona, id_direccion) values(?,?,?,?,?,?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, empresa.getTipoPersona());
            stmt2.setInt(2, empresa.getNumeroTrabajadoresContrato());
            stmt2.setInt(3, empresa.getNivelVentasAnual());
            stmt2.setInt(4, empresa.getRutEmpresa());
            stmt2.setString(5, empresa.getNombreEmpresa());
            stmt2.setInt(6, empresa.getIdPersonaF());
            stmt2.setInt(7, empresa.getIdDireccionF());
            
            
            int cantidad = stmt2.executeUpdate();

            
            consultaCorrecta = (cantidad>0);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    public ArrayList<Empresa> listarEmpresaPorId(Empresa empresa, Persona persona, Direccion direccion) throws SQLException{
        
        ArrayList<Empresa> empres = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select tipo_persona, num_trab_contrato, nivel_ventas_anual, rut_empresa, nombre_empresa, id_direccion from empresa where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, persona.getIdPersona());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Empresa e = new Empresa();
                
                e.setTipoPersona(rs.getString("tipo_persona"));
                e.setNumeroTrabajadoresContrato(rs.getInt("num_trab_contrato"));
                e.setNivelVentasAnual(rs.getInt("nivel_ventas_anual"));
                e.setRutEmpresa(rs.getInt("rut_empresa"));
                e.setNombreEmpresa(rs.getString("nombre_empresa"));
                direccion.setIdDireccionEmp(rs.getInt("id_direccion"));
                
                empres.add(e);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return empres;
    }
    
}
