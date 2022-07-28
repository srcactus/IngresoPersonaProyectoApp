/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class TipoPregunta {
    
    private int idTipoPregunta;
    private String nombreTipoPregunta;

    public TipoPregunta() {
    }

    public TipoPregunta(int idTipoPregunta, String nombreTipoPregunta) {
        this.setIdTipoPregunta(idTipoPregunta);
        this.setNombreTipoPregunta(nombreTipoPregunta);
    }

    public int getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(int idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    public String getNombreTipoPregunta() {
        return nombreTipoPregunta;
    }

    public void setNombreTipoPregunta(String nombreTipoPregunta) {
        this.nombreTipoPregunta = nombreTipoPregunta;
    }

    @Override
    public String toString() {
        return "TipoPregunta{" + "idTipoPregunta=" + idTipoPregunta + ", nombreTipoPregunta=" + nombreTipoPregunta + '}';
    }

    
    
    
    
}
