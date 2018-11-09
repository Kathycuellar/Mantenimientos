/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.ActaRecepcion;
/**
 *
 * @author Kathy
 */
public class ActaRecepcionParticipante {
    
    private int IdActaRecepcionParticipante;
    private  ActaRecepcion ActaRecepcion;
    private String Rol;
    private String NombreCompleto;
    private String Cargo;
    private String Organizacion;

    public int getIdActaRecepcionParticipante() {
        return IdActaRecepcionParticipante;
    }

    public void setIdActaRecepcionParticipante(int IdActaRecepcionParticipante) {
        this.IdActaRecepcionParticipante = IdActaRecepcionParticipante;
    }

    public ActaRecepcion getActaRecepcion() {
        return ActaRecepcion;
    }

    public void setActaRecepcion(ActaRecepcion ActaRecepcion) {
        this.ActaRecepcion = ActaRecepcion;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String Organizacion) {
        this.Organizacion = Organizacion;
    }
    
    public ActaRecepcionParticipante() {
        
        this.ActaRecepcion = new ActaRecepcion();
    }
}
