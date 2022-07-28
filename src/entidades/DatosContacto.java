/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class DatosContacto {
    
    
    private int idDatosContacto;
    private String email;
    private String emailAlternativo;
    private String celular;
    private String telefono;
    

    public DatosContacto() {
    }

    public DatosContacto(int idDatosContacto, String email, String emailAlternativo, String celular, String telefono) {
        this.setIdDatosContacto(idDatosContacto);
        this.setEmail(email);
        this.setEmailAlternativo(emailAlternativo);
        this.setCelular (celular);
        this.setTelefono(telefono);
        
        
    }

    public int getIdDatosContacto() {
        return idDatosContacto;
    }

    public void setIdDatosContacto(int idDatosContacto) {
        this.idDatosContacto = idDatosContacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "DatosContacto{" + "idDatosContacto=" + idDatosContacto + ", email=" + email + ", emailAlternativo=" + emailAlternativo + ", celular=" + celular + ", telefono=" + telefono + '}';
    }

    
    
}
