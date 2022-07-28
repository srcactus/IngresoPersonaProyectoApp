/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Region {
    
    private int idRegionEmp;
    private int idRegion;
    private String nombreRegion;
    private String nombreRegionEmp;

    public Region() {
    }

    public Region(int idRegionEmp, int idRegion, String nombreRegion, String nombreRegionEmp) {
        this.setIdRegionEmp(idRegionEmp);
        this.setIdRegion(idRegion);
        this.setNombreRegion(nombreRegion);
        this.setNombreRegionEmp(nombreRegionEmp);
    }

    public int getIdRegionEmp() {
        return idRegionEmp;
    }

    public void setIdRegionEmp(int idRegionEmp) {
        this.idRegionEmp = idRegionEmp;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getNombreRegionEmp() {
        return nombreRegionEmp;
    }

    public void setNombreRegionEmp(String nombreRegionEmp) {
        this.nombreRegionEmp = nombreRegionEmp;
    }

    @Override
    public String toString() {
        return "Region{" + "idRegionEmp=" + idRegionEmp + ", idRegion=" + idRegion + ", nombreRegion=" + nombreRegion + ", nombreRegionEmp=" + nombreRegionEmp + '}';
    }

    

    

  
}
