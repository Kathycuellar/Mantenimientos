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
public class TipoServicio {
    
    private int IdTipoServicio;
    private String Nombre;
    private String Descripcion;

    public int getIdTipoServicio() {
        return IdTipoServicio;
    }

    public void setIdTipoServicio(int IdTipoServicio) {
        this.IdTipoServicio = IdTipoServicio;
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
