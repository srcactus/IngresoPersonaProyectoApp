/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Localidad {
    
    private int idLocalidadEmp;
    private int idLocalidad;
    private int idComunaF;
    private int idComunaFEmp;
    private String nombreLocalidadEmp;
    private String nombreLocalidad;
    

    public Localidad() {
    }

    public Localidad(int idLocalidadEmp, int idLocalidad, int idComunaF, int idComunaFEmp, String nombreLocalidadEmp, String nombreLocalidad) {
        this.setIdLocalidadEmp(idLocalidadEmp);
        this.setIdLocalidad(idLocalidad);
        this.setIdComunaF(idComunaF);
        this.setIdComunaFEmp(idComunaFEmp);
        this.setNombreLocalidadEmp(nombreLocalidadEmp);
        this.setNombreLocalidad(nombreLocalidad);
    }

    public int getIdLocalidadEmp() {
        return idLocalidadEmp;
    }

    public void setIdLocalidadEmp(int idLocalidadEmp) {
        this.idLocalidadEmp = idLocalidadEmp;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public int getIdComunaF() {
        return idComunaF;
    }

    public void setIdComunaF(int idComunaF) {
        this.idComunaF = idComunaF;
    }

    public int getIdComunaFEmp() {
        return idComunaFEmp;
    }

    public void setIdComunaFEmp(int idComunaFEmp) {
        this.idComunaFEmp = idComunaFEmp;
    }

    public String getNombreLocalidadEmp() {
        return nombreLocalidadEmp;
    }

    public void setNombreLocalidadEmp(String nombreLocalidadEmp) {
        this.nombreLocalidadEmp = nombreLocalidadEmp;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    @Override
    public String toString() {
        return "Localidad{" + "idLocalidadEmp=" + idLocalidadEmp + ", idLocalidad=" + idLocalidad + ", idComunaF=" + idComunaF + ", idComunaFEmp=" + idComunaFEmp + ", nombreLocalidadEmp=" + nombreLocalidadEmp + ", nombreLocalidad=" + nombreLocalidad + '}';
    }

    

    
}
