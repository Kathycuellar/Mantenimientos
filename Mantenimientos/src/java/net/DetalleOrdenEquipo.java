/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Equipo;
import net.OrdenServicio;
/**
 *
 * @author Kathy
 */
public class DetalleOrdenEquipo {
   private int IdDetalleOrdenEquipo;
   private Equipo Equipo;
   private OrdenServicio OrdenServicio;

    public int getIdDetalleOrdenEquipo() {
        return IdDetalleOrdenEquipo;
    }

    public void setIdDetalleOrdenEquipo(int IdDetalleOrdenEquipo) {
        this.IdDetalleOrdenEquipo = IdDetalleOrdenEquipo;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public OrdenServicio getOrdenServicio() {
        return OrdenServicio;
    }

    public void setOrdenServicio(OrdenServicio OrdenServicio) {
        this.OrdenServicio = OrdenServicio;
    }
    
    public DetalleOrdenEquipo(){
        this.Equipo = new Equipo();
        this.OrdenServicio = new OrdenServicio();
    }
}
