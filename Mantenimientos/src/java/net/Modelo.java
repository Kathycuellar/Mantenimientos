/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.Marca;
import net.Componente;
/**
 *
 * @author Kathy
 */
public class Modelo {
   private Marca Marca;
   private Componente Componente;
   private int IdModelo;    
   private boolean Activo;
private String Nombre;
private String Abreviatura;

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }

    public Componente getComponente() {
        return Componente;
    }

    public void setComponente(Componente Componente) {
        this.Componente = Componente;
    }

    public int getIdModelo() {
        return IdModelo;
    }

    public void setIdModelo(int IdModelo) {
        this.IdModelo = IdModelo;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAbreviatura() {
        return Abreviatura;
    }

    public void setAbreviatura(String Abreviatura) {
        this.Abreviatura = Abreviatura;
    }

    public Modelo() {
        this.Marca= new Marca();
        this.Componente = new Componente();
    }
		
}
