/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Provincia {
    
    private int idProvinciaEmp;
    private int idProvincia;
    private String nombreProvincia;
    private String nombreProvinciaEmp;
    private int idRegionFEmp;
    private int idRegionF;
    

    public Provincia() {
    }

    public Provincia(int idProvinciaEmp, int idProvincia, String nombreProvincia, String nombreProvinciaEmp, int idRegionFEmp, int idRegionF) {
        this.setIdProvinciaEmp(idProvinciaEmp);
        this.setIdProvincia(idProvincia);
        this.setNombreProvincia(nombreProvincia);
        this.setNombreProvinciaEmp(nombreProvinciaEmp);
        this.setIdRegionFEmp(idRegionFEmp);
        this.setIdRegionF(idRegionF);
    }

    public int getIdProvinciaEmp() {
        return idProvinciaEmp;
    }

    public void setIdProvinciaEmp(int idProvinciaEmp) {
        this.idProvinciaEmp = idProvinciaEmp;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getNombreProvinciaEmp() {
        return nombreProvinciaEmp;
    }

    public void setNombreProvinciaEmp(String nombreProvinciaEmp) {
        this.nombreProvinciaEmp = nombreProvinciaEmp;
    }

    public int getIdRegionFEmp() {
        return idRegionFEmp;
    }

    public void setIdRegionFEmp(int idRegionFEmp) {
        this.idRegionFEmp = idRegionFEmp;
    }

    public int getIdRegionF() {
        return idRegionF;
    }

    public void setIdRegionF(int idRegionF) {
        this.idRegionF = idRegionF;
    }

    @Override
    public String toString() {
        return "Provincia{" + "idProvinciaEmp=" + idProvinciaEmp + ", idProvincia=" + idProvincia + ", nombreProvincia=" + nombreProvincia + ", nombreProvinciaEmp=" + nombreProvinciaEmp + ", idRegionFEmp=" + idRegionFEmp + ", idRegionF=" + idRegionF + '}';
    }


    
}
