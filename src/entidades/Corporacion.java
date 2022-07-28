/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Corporacion {
    
    
    private int idCorporacion;
    private String nombreCorporacion;

    public Corporacion() {
    }

    public Corporacion(int idCorporacion, String nombreCorporacion) {
        this.setIdCorporacion(idCorporacion);
        this.setNombreCorporacion(nombreCorporacion);
        
        
    }

    public int getIdCorporacion() {
        return idCorporacion;
    }

    public void setIdCorporacion(int idCorporacion) {
        this.idCorporacion = idCorporacion;
    }

    public String getNombreCorporacion() {
        return nombreCorporacion;
    }

    public void setNombreCorporacion(String nombreCorporacion) {
        this.nombreCorporacion = nombreCorporacion;
    }

    @Override
    public String toString() {
        return "Corporacion{" + "idCorporacion=" + idCorporacion + ", nombreCorporacion=" + nombreCorporacion + '}';
    }

    

    

    

    
    
    
    
    
    
}
