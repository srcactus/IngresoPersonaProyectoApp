/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Empresa {
    
    
    private int idEmpresa;
    private String tipoPersona;
    private int numeroTrabajadoresContrato;
    private int nivelVentasAnual;
    private int rutEmpresa;
    private String nombreEmpresa;
    private int idPersonaF;
    private int idDireccionF;
    

    public Empresa() {
    }

    public Empresa(int idEmpresa, String tipoPersona, int numeroTrabajadoresContrato, int nivelVentasAnual, int rutEmpresa, String nombreEmpresa, int idPersonaF, int idDireccionF) {
        this.setIdEmpresa(idEmpresa);
        this.setTipoPersona(tipoPersona);
        this.setNumeroTrabajadoresContrato(numeroTrabajadoresContrato);
        this.setNivelVentasAnual(nivelVentasAnual);
        this.setRutEmpresa(rutEmpresa);
        this.setNombreEmpresa(nombreEmpresa);
        this.setIdPersonaF(idPersonaF);
        this.setIdDireccionF(idDireccionF);
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public int getNumeroTrabajadoresContrato() {
        return numeroTrabajadoresContrato;
    }

    public void setNumeroTrabajadoresContrato(int numeroTrabajadoresContrato) {
        this.numeroTrabajadoresContrato = numeroTrabajadoresContrato;
    }

    public int getNivelVentasAnual() {
        return nivelVentasAnual;
    }

    public void setNivelVentasAnual(int nivelVentasAnual) {
        this.nivelVentasAnual = nivelVentasAnual;
    }

    public int getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(int rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    public int getIdDireccionF() {
        return idDireccionF;
    }

    public void setIdDireccionF(int idDireccionF) {
        this.idDireccionF = idDireccionF;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", tipoPersona=" + tipoPersona + ", numeroTrabajadoresContrato=" + numeroTrabajadoresContrato + ", nivelVentasAnual=" + nivelVentasAnual + ", rutEmpresa=" + rutEmpresa + ", nombreEmpresa=" + nombreEmpresa + ", idPersonaF=" + idPersonaF + ", idDireccionF=" + idDireccionF + '}';
    }

    

    

    
    
    
    
}
