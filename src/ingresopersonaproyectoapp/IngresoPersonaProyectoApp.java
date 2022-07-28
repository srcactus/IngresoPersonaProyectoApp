/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresopersonaproyectoapp;
import dao.DiscapacidadDAO;
import entidades.Persona;
import dao.PersonaDAO;
import entidades.Discapacidad;
import dao.ComunaDAO;
import entidades.Comuna;
import java.sql.SQLException;
import dao.DatosContactoDAO;
import entidades.DatosContacto;
import dao.DireccionDAO;
import entidades.Direccion;
import dao.LocalidadDAO;
import entidades.Localidad;
import dao.NacimientoDAO;
import entidades.Nacimiento;
import dao.ProvinciaDAO;
import entidades.Provincia;
import dao.RegionDAO;
import entidades.Region;
import dao.UsoInternoDAO;
import entidades.UsoInterno;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.Login;

/**
 *
 * @author Cactus
 */
public class IngresoPersonaProyectoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        
        Login l = new Login();
        l.setVisible(true);
        
        
        /*Discapacidad d = new Discapacidad("disca 1","Si");
        Persona p = new Persona(200554108,"Cristobal Andres","Jara","Cortes","ConcursoPulento","10:30","Superior","Mapuche","Hijo",0,"Pololeando");
        
        Comuna c = new Comuna("La florida");
        DatosContacto dc = new DatosContacto("jara.cris.cortes@gmail.com","cjara@newsolution.cl","957655400","257655400");
        Direccion dir = new Direccion("Lientur 7386");
        Localidad l = new Localidad("Santiago");
        Nacimiento n = new Nacimiento("Hospital central","24/03/1999","Masculino");
        Provincia prov = new Provincia("Santiago");
        Region r = new Region("Metropolitana");
        
        UsoInterno ui = new UsoInterno("correocrisinterno@gmail.com", "clavecrisinterno","cactus","passcactus");
        
        
        DiscapacidadDAO dDAO = new DiscapacidadDAO();
        PersonaDAO pDAO = new PersonaDAO();
        
        ComunaDAO cDAO = new ComunaDAO();
        DatosContactoDAO dcDAO = new DatosContactoDAO();
        DireccionDAO dirDAO = new DireccionDAO();
        LocalidadDAO lDAO = new LocalidadDAO();
        NacimientoDAO nDAO = new NacimientoDAO();
        ProvinciaDAO provDAO = new ProvinciaDAO();
        RegionDAO rDAO = new RegionDAO();
        
        UsoInternoDAO uiDAO = new UsoInternoDAO();
        
        try {
            if(pDAO.agregarPersona(p) && dDAO.agregarDiscapacidad(d) && cDAO.agregarComuna(c)
                    && dcDAO.agregarDatosContacto(dc) && dirDAO.agregarDireccion(dir)
                    && lDAO.agregarLocalidad(l) && nDAO.agregarNacimiento(n)
                    && provDAO.agregarProvincia(prov) && rDAO.agregarRegion(r)
                    && uiDAO.agregarUsoInterno(ui)){
                
                System.out.println("Agregado");
                
            }else{
                
                System.out.println("ha ocurrido un error: ");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }*/
        
    }
    
}
