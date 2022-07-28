/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Discapacidad {
    
    
    private int idDiscapacidad;
    private String situacionDiscapacidad;
    private String credencialDiscapacidad;

    public Discapacidad() {
    }

    public Discapacidad(int idDiscapacidad, String situacionDiscapacidad, String credencialDiscapacidad) {
        this.setIdDiscapacidad(idDiscapacidad);
        this.setSituacionDiscapacidad(situacionDiscapacidad);
        this.setCredencialDiscapacidad(credencialDiscapacidad);
        
        
    }

    public int getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(int idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    public String getSituacionDiscapacidad() {
        return situacionDiscapacidad;
    }

    public void setSituacionDiscapacidad(String situacionDiscapacidad) {
        this.situacionDiscapacidad = situacionDiscapacidad;
    }

    public String getCredencialDiscapacidad() {
        return credencialDiscapacidad;
    }

    public void setCredencialDiscapacidad(String credencialDiscapacidad) {
        this.credencialDiscapacidad = credencialDiscapacidad;
    }

    @Override
    public String toString() {
        return "Discapacidad{" + "idDiscapacidad=" + idDiscapacidad + ", situacionDiscapacidad=" + situacionDiscapacidad + ", credencialDiscapacidad=" + credencialDiscapacidad + '}';
    }

    

    

    
    
    
    
}
