/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */

public class Comuna {
    
    private int idComunaEmp;
    private int idComuna;
    private int idProvinciaF;
    private int idProvinciaFEmp;
    private String nombreComunaEmp;
    private String nombreComuna;

    public Comuna() {
    }

    public Comuna(int idComunaEmp, int idComuna, int idProvinciaF, int idProvinciaFEmp, String nombreComunaEmp, String nombreComuna) {
        this.setIdComunaEmp(idComunaEmp);
        this.setIdComuna(idComuna);
        this.setIdProvinciaF(idProvinciaF);
        this.setIdProvinciaFEmp(idProvinciaFEmp);
        this.setNombreComunaEmp(nombreComunaEmp);
        this.setNombreComuna(nombreComuna);
    }

    public int getIdComunaEmp() {
        return idComunaEmp;
    }

    public void setIdComunaEmp(int idComunaEmp) {
        this.idComunaEmp = idComunaEmp;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public int getIdProvinciaF() {
        return idProvinciaF;
    }

    public void setIdProvinciaF(int idProvinciaF) {
        this.idProvinciaF = idProvinciaF;
    }

    public int getIdProvinciaFEmp() {
        return idProvinciaFEmp;
    }

    public void setIdProvinciaFEmp(int idProvinciaFEmp) {
        this.idProvinciaFEmp = idProvinciaFEmp;
    }

    public String getNombreComunaEmp() {
        return nombreComunaEmp;
    }

    public void setNombreComunaEmp(String nombreComunaEmp) {
        this.nombreComunaEmp = nombreComunaEmp;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idComunaEmp=" + idComunaEmp + ", idComuna=" + idComuna + ", idProvinciaF=" + idProvinciaF + ", idProvinciaFEmp=" + idProvinciaFEmp + ", nombreComunaEmp=" + nombreComunaEmp + ", nombreComuna=" + nombreComuna + '}';
    }

    

    
    
}
