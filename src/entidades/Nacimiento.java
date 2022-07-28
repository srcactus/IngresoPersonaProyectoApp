/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Nacimiento {
    
    private int idNacimiento;
    private String lugarNacimiento;
    private String fechaNacimiento;
    private String genero;

    public Nacimiento() {
    }

    public Nacimiento(int idNacimiento, String lugarNacimiento, String fechaNacimiento, String genero) {
        this.setIdNacimiento(idNacimiento);
        this.setLugarNacimiento(lugarNacimiento);
        this.setFechaNacimiento(fechaNacimiento);
        this.setGenero(genero);
    }

    public int getIdNacimiento() {
        return idNacimiento;
    }

    public void setIdNacimiento(int idNacimiento) {
        this.idNacimiento = idNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nacimiento{" + "idNacimiento=" + idNacimiento + ", lugarNacimiento=" + lugarNacimiento + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }

    

    

    
    
    
    
}
