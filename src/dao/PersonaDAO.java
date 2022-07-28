/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bd.Conexion;
import entidades.DatosContacto;
import entidades.Direccion;
import entidades.Discapacidad;
import entidades.Empresa;
import entidades.FichaTec;
import entidades.Nacimiento;
import entidades.Persona;

import entidades.Proyecto;
import entidades.Respuesta;
import entidades.UsoInterno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class PersonaDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Persona persona, Empresa empresa, Proyecto proyecto, FichaTec fichaTec) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql2 = "insert into persona(rut, nombres, apellido_pat, "
                    + "apellido_mat, concurso, horario_video, nivel_educ, "
                    + "etnia_indi, jef_hogar, pers_dependiente, est_civil, "
                    + "id_disc, id_dc, id_uso_interno, id_nacimiento, id_direccion, id_corp) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setInt(1, persona.getRut());
            stmt2.setString(2, persona.getNombres());
            stmt2.setString(3, persona.getApellidoPaterno());
            stmt2.setString(4, persona.getApellidoMaterno());
            stmt2.setString(5, persona.getConcurso());
            stmt2.setString(6, persona.getHorarioVideo());
            stmt2.setString(7, persona.getNivelEducacional());
            stmt2.setString(8, persona.getEtniaIndigena());
            stmt2.setString(9, persona.getJefeHogar());
            stmt2.setInt(10, persona.getPersonasDependiente());
            stmt2.setString(11, persona.getEstadoCivil());
            stmt2.setInt(12, persona.getIdDiscapacidadF());
            stmt2.setInt(13, persona.getIdDatosContactoF());
            stmt2.setInt(14, persona.getIdUsoInternoF());
            stmt2.setInt(15, persona.getIdNacimientoF());
            stmt2.setInt(16, persona.getIdDireccionF());
            stmt2.setInt(17, persona.getIdCorpF());
            
            
            int cantidad = stmt2.executeUpdate();

            
            if (cantidad > 0) {

                String sql = "select id_persona from persona where rut=(?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, persona.getRut());
                
                
                ResultSet rs = stmt.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_persona");
                }

                
                
                
                proyecto.setIdPersonaF(valor);
                empresa.setIdPersonaF(valor);
                fichaTec.setIdPersonaF(valor);
                
                

                
                System.out.println("Valor desde Proyecto getIdPersonaF: " + proyecto.getIdPersonaF());
                System.out.println("Valor desde empresa getIdPersonaF: " + empresa.getIdPersonaF());

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }
    
    
    public ArrayList<Persona> listarPersonaPorId(int id) throws SQLException{
        
        ArrayList<Persona> personas = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select rut, nombres, apellido_pat, apellido_mat, "
                    + "concurso, horario_video, nivel_educ, etnia_indi, "
                    + "jef_hogar, pers_dependiente, est_civil from persona "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Persona p = new Persona();
                p.setRut(rs.getInt("rut"));
                p.setNombres(rs.getString("nombres"));
                p.setApellidoPaterno(rs.getString("apellido_pat"));
                p.setApellidoMaterno(rs.getString("apellido_mat"));
                p.setConcurso(rs.getString("concurso"));
                p.setHorarioVideo(rs.getString("horario_video"));
                p.setNivelEducacional(rs.getString("nivel_educ"));
                p.setEtniaIndigena(rs.getString("etnia_indi"));
                p.setJefeHogar(rs.getString("jef_hogar"));
                p.setPersonasDependiente(rs.getInt("pers_dependiente"));
                p.setEstadoCivil(rs.getString("est_civil"));
                personas.add(p);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return personas;
    }
    
    
    public boolean consultaForaneas(int id, Discapacidad discapacidad, DatosContacto datosContacto, UsoInterno usoInterno, Nacimiento nacimiento, Direccion direccion) throws SQLException {
        

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "select id_disc, id_dc, id_uso_interno, id_nacimiento, "
                    + "id_direccion from persona where id_persona=(?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                discapacidad.setIdDiscapacidad(rs.getInt("id_disc"));
                datosContacto.setIdDatosContacto(rs.getInt("id_dc"));
                usoInterno.setIdUsoInterno(rs.getInt("id_uso_interno"));
                nacimiento.setIdNacimiento(rs.getInt("id_nacimiento"));
                direccion.setIdDireccion(rs.getInt("id_direccion"));
                
            }
            
            if(discapacidad.getIdDiscapacidad() != 0 && datosContacto.getIdDatosContacto() != 0 
                    && usoInterno.getIdUsoInterno() != 0 && nacimiento.getIdNacimiento() != 0 
                    && direccion.getIdDireccion() != 0){
                
                consultaCorrecta = true;
                
            }
            
            
        } catch (Exception e) {
            
            System.out.println("ERROR: "+e.getMessage());
            
        }
        
        return consultaCorrecta;
    }
    
    
    
}
