/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Equipo;
/**
 *
 * @author Kathy
 */
public class OrdenServicioDetalle {
    
    private int IdOrdenServicio;
    private Equipo Equipo;
    private String Observaciones;

    public int getIdOrdenServicio() {
        return IdOrdenServicio;
    }

    public void setIdOrdenServicio(int IdOrdenServicio) {
        this.IdOrdenServicio = IdOrdenServicio;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    public OrdenServicioDetalle(){
        this.Equipo = new Equipo();
    }
}
