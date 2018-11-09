/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Contrato;
import net.TipoServicio;
/**
 *
 * @author Kathy
 */
public class OrdenServicio {
    private int IdOrdenServicio;
    private Contrato Contrato;
    private TipoServicio TipoServicio;
    private String Fecha;

    public int getIdOrdenServicio() {
        return IdOrdenServicio;
    }

    public void setIdOrdenServicio(int IdOrdenServicio) {
        this.IdOrdenServicio = IdOrdenServicio;
    }

    public Contrato getContrato() {
        return Contrato;
    }

    public void setContrato(Contrato Contrato) {
        this.Contrato = Contrato;
    }

    public TipoServicio getTipoServicio() {
        return TipoServicio;
    }

    public void setTipoServicio(TipoServicio TipoServicio) {
        this.TipoServicio = TipoServicio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public OrdenServicio(){
        this.Contrato = new Contrato();
        this.TipoServicio = new TipoServicio();
    }
}
