/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Persona {
    
    
    private int idPersona;
    private int rut;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String concurso;
    private String horarioVideo;
    private String nivelEducacional;
    private String etniaIndigena;
    private String jefeHogar;
    private int personasDependiente;
    private String estadoCivil;
    private int idDiscapacidadF;
    private int idDatosContactoF;
    private int idUsoInternoF;
    private int idNacimientoF;
    private int idDireccionF;
    private int idCorpF;
    

    public Persona() {
    }

    public Persona(int idPersona, int rut, String nombres, String apellidoPaterno, String apellidoMaterno, String concurso, String horarioVideo, String nivelEducacional, String etniaIndigena, String jefeHogar, int personasDependiente, String estadoCivil, int idDiscapacidadF, int idDatosContactoF, int idUsoInternoF, int idNacimientoF, int idDireccionF, int idCorpF) {
        this.setIdPersona(idPersona);
        this.setRut(rut);
        this.setNombres(nombres);
        this.setApellidoPaterno(apellidoPaterno);
        this.setApellidoMaterno(apellidoMaterno);
        this.setConcurso(concurso);
        this.setHorarioVideo(horarioVideo);
        this.setNivelEducacional(nivelEducacional);
        this.setEtniaIndigena(etniaIndigena);
        this.setJefeHogar(jefeHogar);
        this.setPersonasDependiente(personasDependiente);
        this.setEstadoCivil(estadoCivil);
        this.setIdDiscapacidadF(idDiscapacidadF);
        this.setIdDatosContactoF(idDatosContactoF);
        this.setIdUsoInternoF(idUsoInternoF);
        this.setIdNacimientoF(idNacimientoF);
        this.setIdDireccionF(idDireccionF);
        this.setIdCorpF(idCorpF);
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getConcurso() {
        return concurso;
    }

    public void setConcurso(String concurso) {
        this.concurso = concurso;
    }

    public String getHorarioVideo() {
        return horarioVideo;
    }

    public void setHorarioVideo(String horarioVideo) {
        this.horarioVideo = horarioVideo;
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
    }

    public String getEtniaIndigena() {
        return etniaIndigena;
    }

    public void setEtniaIndigena(String etniaIndigena) {
        this.etniaIndigena = etniaIndigena;
    }

    public String getJefeHogar() {
        return jefeHogar;
    }

    public void setJefeHogar(String jefeHogar) {
        this.jefeHogar = jefeHogar;
    }

    public int getPersonasDependiente() {
        return personasDependiente;
    }

    public void setPersonasDependiente(int personasDependiente) {
        this.personasDependiente = personasDependiente;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getIdDiscapacidadF() {
        return idDiscapacidadF;
    }

    public void setIdDiscapacidadF(int idDiscapacidadF) {
        this.idDiscapacidadF = idDiscapacidadF;
    }

    public int getIdDatosContactoF() {
        return idDatosContactoF;
    }

    public void setIdDatosContactoF(int idDatosContactoF) {
        this.idDatosContactoF = idDatosContactoF;
    }

    public int getIdUsoInternoF() {
        return idUsoInternoF;
    }

    public void setIdUsoInternoF(int idUsoInternoF) {
        this.idUsoInternoF = idUsoInternoF;
    }

    public int getIdNacimientoF() {
        return idNacimientoF;
    }

    public void setIdNacimientoF(int idNacimientoF) {
        this.idNacimientoF = idNacimientoF;
    }

    public int getIdDireccionF() {
        return idDireccionF;
    }

    public void setIdDireccionF(int idDireccionF) {
        this.idDireccionF = idDireccionF;
    }

    public int getIdCorpF() {
        return idCorpF;
    }

    public void setIdCorpF(int idCorpF) {
        this.idCorpF = idCorpF;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", rut=" + rut + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", concurso=" + concurso + ", horarioVideo=" + horarioVideo + ", nivelEducacional=" + nivelEducacional + ", etniaIndigena=" + etniaIndigena + ", jefeHogar=" + jefeHogar + ", personasDependiente=" + personasDependiente + ", estadoCivil=" + estadoCivil + ", idDiscapacidadF=" + idDiscapacidadF + ", idDatosContactoF=" + idDatosContactoF + ", idUsoInternoF=" + idUsoInternoF + ", idNacimientoF=" + idNacimientoF + ", idDireccionF=" + idDireccionF + ", idCorpF=" + idCorpF + '}';
    }

    

    

    

    

}
