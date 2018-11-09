/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.TipoMovimiento;
import net.Persona;
/**
 *
 * @author Kathy
 */
public class Movimiento {
    
    private int IdMovimiento;
    private TipoMovimiento TipoMovimiento;
    private String Fecha;
    private Persona Persona;
    private String Codigo;
    private boolean Finalizado;

    public int getIdMovimiento() {
        return IdMovimiento;
    }

    public void setIdMovimiento(int IdMovimiento) {
        this.IdMovimiento = IdMovimiento;
    }

    public TipoMovimiento getTipoMovimiento() {
        return TipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public boolean isFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(boolean Finalizado) {
        this.Finalizado = Finalizado;
    }
    
    public Movimiento(){
        this.TipoMovimiento = new TipoMovimiento();
        this.Persona = new Persona();
    }
}
