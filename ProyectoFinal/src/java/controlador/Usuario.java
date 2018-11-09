/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String primap;
    private String segap;
    private String cumple;
    private String mail;
    private String pass;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    
    public void setPrimap(String primap) {
        this.primap = primap;
    }
    public String getPrimap() {
        return primap;
    }
    
    
     public void setSegap(String segap) {
        this.segap = segap;
    }
    public String getSegap() {
        return segap;
    }

    
     public void setCumple(String cumple) {
        this.cumple = cumple;
    }
    public String getCumple() {
        return cumple;
    }

    
     public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }

    
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getPass() {
        return pass;
    } 
}
