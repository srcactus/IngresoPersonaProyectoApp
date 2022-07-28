/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class FichaTec {
    
    private int idFichaTec;
    private String nombreProy;
    private String descripcionProy;
    private int idPersonaF;

    public FichaTec() {
    }

    public FichaTec(int idFichaTec, String nombreProy, String descripcionProy, int idPersonaF) {
        this.setIdFichaTec(idFichaTec);
        this.setNombreProy(nombreProy);
        this.setDescripcionProy(descripcionProy);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdFichaTec() {
        return idFichaTec;
    }

    public void setIdFichaTec(int idFichaTec) {
        this.idFichaTec = idFichaTec;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getDescripcionProy() {
        return descripcionProy;
    }

    public void setDescripcionProy(String descripcionProy) {
        this.descripcionProy = descripcionProy;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "FichaTec{" + "idFichaTec=" + idFichaTec + ", nombreProy=" + nombreProy + ", descripcionProy=" + descripcionProy + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
    
}
