/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Usuario {
    
    int idUsuario;
    String nameUsuario;
    String passUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nameUsuario, String passUsuario) {
        this.setIdUsuario(idUsuario);
        this.setNameUsuario(nameUsuario);
        this.setPassUsuario(passUsuario);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + ", nameUsuario=" + nameUsuario + ", passUsuario=" + passUsuario + '}';
    }
    
    
    
}
