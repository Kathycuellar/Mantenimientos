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
public class TipoEquipo {
    
    private int IdTipoEquipo;
    private String Nombre;
    private String Descripcion;

    public int getIdTipoEquipo() {
        return IdTipoEquipo;
    }

    public void setIdTipoEquipo(int IdTipoEquipo) {
        this.IdTipoEquipo = IdTipoEquipo;
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
