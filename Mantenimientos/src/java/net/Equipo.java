/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;
import net.TipoEquipo;
import net.Modelo;
import net.ActaRecepcion;
import net.EstadoEquipo;
/**
 *
 * @author Kathy
 */
public class Equipo {
    private int IdEquipo;
    private TipoEquipo TipoEquipo;
    private Modelo Modelo;
    private ActaRecepcion ActaRecepcion;
    private EstadoEquipo EstadoEquipo;
    private String CodigoActivoFijo;
    private String Descripcion;
    private String NoSerie;
    private double Precio;
    private int Garantia;

    public int getIdEquipo() {
        return IdEquipo;
    }

    public void setIdEquipo(int IdEquipo) {
        this.IdEquipo = IdEquipo;
    }

    public TipoEquipo getTipoEquipo() {
        return TipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo TipoEquipo) {
        this.TipoEquipo = TipoEquipo;
    }

    public Modelo getModelo() {
        return Modelo;
    }

    public void setModelo(Modelo Modelo) {
        this.Modelo = Modelo;
    }

    public ActaRecepcion getActaRecepcion() {
        return ActaRecepcion;
    }

    public void setActaRecepcion(ActaRecepcion ActaRecepcion) {
        this.ActaRecepcion = ActaRecepcion;
    }

    public EstadoEquipo getEstadoEquipo() {
        return EstadoEquipo;
    }

    public void setEstadoEquipo(EstadoEquipo EstadoEquipo) {
        this.EstadoEquipo = EstadoEquipo;
    }

    public String getCodigoActivoFijo() {
        return CodigoActivoFijo;
    }

    public void setCodigoActivoFijo(String CodigoActivoFijo) {
        this.CodigoActivoFijo = CodigoActivoFijo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNoSerie() {
        return NoSerie;
    }

    public void setNoSerie(String NoSerie) {
        this.NoSerie = NoSerie;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }
    
    public Equipo(){
        this.TipoEquipo = new TipoEquipo();
        this.Modelo = new Modelo();
        this.ActaRecepcion = new ActaRecepcion();
        this.EstadoEquipo = new EstadoEquipo();
        
    }
}
