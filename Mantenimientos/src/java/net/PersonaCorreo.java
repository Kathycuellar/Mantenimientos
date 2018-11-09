/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Persona;
/**
 *
 * @author Kathy
 */
public class PersonaCorreo {
    private int IdPersonaCorreo;
    private Persona Persona;
    private String Correo;
    private String FechaAsignacion;
    private String FechaActualizacion;
    private boolean Activo;

    public int getIdPersonaCorreo() {
        return IdPersonaCorreo;
    }

    public void setIdPersonaCorreo(int IdPersonaCorreo) {
        this.IdPersonaCorreo = IdPersonaCorreo;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFechaAsignacion() {
        return FechaAsignacion;
    }

    public void setFechaAsignacion(String FechaAsignacion) {
        this.FechaAsignacion = FechaAsignacion;
    }

    public String getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(String FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
    public PersonaCorreo(){
        this.Persona = new Persona();
    }
}
