/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;

/**
 *
 * @author Kathy
 */
public class EstadoEquipo {
   private int IdEstadoEquipo;
   private String Nombre;
   private String Descripcion;

    public int getIdEstadoEquipo() {
        return IdEstadoEquipo;
    }

    public void setIdEstadoEquipo(int IdEstadoEquipo) {
        this.IdEstadoEquipo = IdEstadoEquipo;
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
   
}
