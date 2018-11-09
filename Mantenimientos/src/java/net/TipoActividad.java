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
public class TipoActividad {
    
   private int IdTipoActividad;
   private String Nombre;
   private String Descripcion;

    public int getIdTipoActividad() {
        return IdTipoActividad;
    }

    public void setIdTipoActividad(int IdTipoActividad) {
        this.IdTipoActividad = IdTipoActividad;
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
