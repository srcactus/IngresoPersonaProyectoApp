/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Pregunta {
    
    private int idPregunta;
    private int idTipoPregunta;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, int idTipoPregunta) {
        this.setIdPregunta(idPregunta);
        this.setIdTipoPregunta(idTipoPregunta);
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(int idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "idPregunta=" + idPregunta + ", idTipoPregunta=" + idTipoPregunta + '}';
    }

    

   
    
    
    
}
