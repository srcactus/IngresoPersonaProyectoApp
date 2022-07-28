/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Direccion {
    
    private int idDireccionEmp;
    private int idDireccion;
    private String direccion;
    private String direccionEmp;
    private int idLocalidadFEmp;
    private int idLocalidadF;
    

    public Direccion() {
    }

    public Direccion(int idDireccionEmp, int idDireccion, String direccion, String direccionEmp, int idLocalidadFEmp, int idLocalidadF) {
        this.setIdDireccionEmp(idDireccionEmp);
        this.setIdDireccion(idDireccion);
        this.setDireccion(direccion);
        this.setDireccionEmp(direccionEmp);
        this.setIdLocalidadFEmp(idLocalidadFEmp);
        this.setIdLocalidadF(idLocalidadF);
    }

    public int getIdDireccionEmp() {
        return idDireccionEmp;
    }

    public void setIdDireccionEmp(int idDireccionEmp) {
        this.idDireccionEmp = idDireccionEmp;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionEmp() {
        return direccionEmp;
    }

    public void setDireccionEmp(String direccionEmp) {
        this.direccionEmp = direccionEmp;
    }

    public int getIdLocalidadFEmp() {
        return idLocalidadFEmp;
    }

    public void setIdLocalidadFEmp(int idLocalidadFEmp) {
        this.idLocalidadFEmp = idLocalidadFEmp;
    }

    public int getIdLocalidadF() {
        return idLocalidadF;
    }

    public void setIdLocalidadF(int idLocalidadF) {
        this.idLocalidadF = idLocalidadF;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccionEmp=" + idDireccionEmp + ", idDireccion=" + idDireccion + ", direccion=" + direccion + ", direccionEmp=" + direccionEmp + ", idLocalidadFEmp=" + idLocalidadFEmp + ", idLocalidadF=" + idLocalidadF + '}';
    }

    
}
