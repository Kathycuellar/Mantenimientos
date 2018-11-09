/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Movimiento;
import net.Equipo;
/**
 *
 * @author Kathy
 */
public class EquipoAsignacion {
    private Movimiento Movimiento;
    private Equipo Equipo;

    public Movimiento getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(Movimiento Movimiento) {
        this.Movimiento = Movimiento;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }
    public EquipoAsignacion(){
        this.Movimiento = new Movimiento();
        this.Equipo = new Equipo();
    }
}
