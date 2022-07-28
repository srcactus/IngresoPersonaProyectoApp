/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class UsoInterno {
    
    
    private int idUsoInterno;
    private String correo;
    private String clave;
    private String usuarioSercotec;
    private String claveSercotec;

    public UsoInterno() {
    }

    public UsoInterno(int idUsoInterno, String correo, String clave, String usuarioSercotec, String claveSercotec) {
        this.setIdUsoInterno(idUsoInterno);
        this.setCorreo(correo);
        this.setClave(clave);
        this.setUsuarioSercotec(usuarioSercotec);
        this.setClaveSercotec(claveSercotec);
    }

    public int getIdUsoInterno() {
        return idUsoInterno;
    }

    public void setIdUsoInterno(int idUsoInterno) {
        this.idUsoInterno = idUsoInterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuarioSercotec() {
        return usuarioSercotec;
    }

    public void setUsuarioSercotec(String usuarioSercotec) {
        this.usuarioSercotec = usuarioSercotec;
    }

    public String getClaveSercotec() {
        return claveSercotec;
    }

    public void setClaveSercotec(String claveSercotec) {
        this.claveSercotec = claveSercotec;
    }

    @Override
    public String toString() {
        return "UsoInterno{" + "idUsoInterno=" + idUsoInterno + ", correo=" + correo + ", clave=" + clave + ", usuarioSercotec=" + usuarioSercotec + ", claveSercotec=" + claveSercotec + '}';
    }

    

       
    
}
