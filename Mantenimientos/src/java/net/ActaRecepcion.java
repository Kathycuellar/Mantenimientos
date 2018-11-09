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
public class ActaRecepcion {
    private int IdActaRecepcion;
    private Contrato Contrato;
    private String Numero;
    private String Encabezado;
    private String Pie;
    private String FechaRegistro;
    private String FechaRecepcion;

    public int getIdActaRecepcion() {
        return IdActaRecepcion;
    }

    public void setIdActaRecepcion(int IdActaRecepcion) {
        this.IdActaRecepcion = IdActaRecepcion;
    }

    public Contrato getContrato() {
        return Contrato;
    }

    public void setContrato(Contrato Contrato) {
        this.Contrato = Contrato;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getEncabezado() {
        return Encabezado;
    }

    public void setEncabezado(String Encabezado) {
        this.Encabezado = Encabezado;
    }

    public String getPie() {
        return Pie;
    }

    public void setPie(String Pie) {
        this.Pie = Pie;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getFechaRecepcion() {
        return FechaRecepcion;
    }

    public void setFechaRecepcion(String FechaRecepcion) {
        this.FechaRecepcion = FechaRecepcion;
    }
    
    public ActaRecepcion(){
        this.Contrato = new Contrato();
    }
    
}
