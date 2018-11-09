/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.EstadoEquipo;
/**
 *
 * @author Kathy
 */
public class Persona {
   
    private int IdPersona;
    private EstadoEquipo EstadoEquipo;
    private String Nombres;
    private String Apellidos;
    private String NoEmpleado;
    private String Nit;
    private String Dui;

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public EstadoEquipo getEstadoEquipo() {
        return EstadoEquipo;
    }

    public void setEstadoEquipo(EstadoEquipo EstadoEquipo) {
        this.EstadoEquipo = EstadoEquipo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNoEmpleado() {
        return NoEmpleado;
    }

    public void setNoEmpleado(String NoEmpleado) {
        this.NoEmpleado = NoEmpleado;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }
    
    public Persona(){
        this.EstadoEquipo = new EstadoEquipo();
    }

}
