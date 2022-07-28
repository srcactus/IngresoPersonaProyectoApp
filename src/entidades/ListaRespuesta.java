/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class ListaRespuesta {
    
    private String respuesta;

    public ListaRespuesta() {
    }

    public ListaRespuesta(String respuesta) {
        this.setRespuesta(respuesta);
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return respuesta;
    }
    
    
    
}
