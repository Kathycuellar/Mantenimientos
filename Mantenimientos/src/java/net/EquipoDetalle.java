/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Equipo;
import net.UnidadMedida;
/**
 *
 * @author Kathy
 */
public class EquipoDetalle {
 private int IdEquipoDetalle;
 private Equipo Equipo;
 private UnidadMedida UnidadMedida; 
 private String Nombre;
 private String Descripcion;
 private int Valor;

    public int getIdEquipoDetalle() {
        return IdEquipoDetalle;
    }

    public void setIdEquipoDetalle(int IdEquipoDetalle) {
        this.IdEquipoDetalle = IdEquipoDetalle;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public UnidadMedida getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(UnidadMedida UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
 
    public EquipoDetalle(){
        this.Equipo = new Equipo();
        this.UnidadMedida = new UnidadMedida();
                
    }
  
}
