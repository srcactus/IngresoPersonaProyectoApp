/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Proyecto {
    
    
    private int idProyecto;
    private String fechaEntregaProyectoEstimada;
    private String personaContactoProyecto;
    private String descripcionProyecto;
    private String nombreProyecto;
    private int idPersonaF;
    

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String fechaEntregaProyectoEstimada, String personaContactoProyecto, String descripcionProyecto, String nombreProyecto, int idPersonaF) {
        this.setIdProyecto(idProyecto);
        this.setFechaEntregaProyectoEstimada(fechaEntregaProyectoEstimada);
        this.setPersonaContactoProyecto(personaContactoProyecto);
        this.setDescripcionProyecto(descripcionProyecto);
        this.setNombreProyecto(nombreProyecto);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getFechaEntregaProyectoEstimada() {
        return fechaEntregaProyectoEstimada;
    }

    public void setFechaEntregaProyectoEstimada(String fechaEntregaProyectoEstimada) {
        this.fechaEntregaProyectoEstimada = fechaEntregaProyectoEstimada;
    }

    public String getPersonaContactoProyecto() {
        return personaContactoProyecto;
    }

    public void setPersonaContactoProyecto(String personaContactoProyecto) {
        this.personaContactoProyecto = personaContactoProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", fechaEntregaProyectoEstimada=" + fechaEntregaProyectoEstimada + ", personaContactoProyecto=" + personaContactoProyecto + ", descripcionProyecto=" + descripcionProyecto + ", nombreProyecto=" + nombreProyecto + ", idPersonaF=" + idPersonaF + '}';
    }
    
    

   
    
}
