/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author miguel
 */
public class E_Componente {
    
private int IdComponente;

private String NombreComponente;
private String Codigo;
private String Marca;
private String TipoDeMolde;
private String Ubicacion;
private String Serie;
private String Caracteristicas;

private int idfiltro;//Nuevo atributo
private int idclave;//Nuevo atributo

    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigol the Codigol to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the IdComponente
     */
    public int getIdComponente() {
        return IdComponente;
    }

    /**
     * @param IdComponente the IdComponente to set
     */
    public void setIdComponente(int IdComponente) {
        this.IdComponente = IdComponente;
    }

    /**
     * @return the TipoDeMolde
     */
    public String getTipoDeMolde() {
        return TipoDeMolde;
    }

    /**
     * @param TipoDeMolde the TipoDeMolde to set
     */
    public void setTipoDeMolde(String TipoDeMolde) {
        this.TipoDeMolde = TipoDeMolde;
    }

    /**
     * @return the Ubicacion
     */
    public String getUbicacion() {
        return Ubicacion;
    }

    /**
     * @param Ubicacion the Ubicacion to set
     */
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    /**
     * @return the Serie
     */
    public String getSerie() {
        return Serie;
    }

    /**
     * @param Serie the Serie to set
     */
    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    /**
     * @return the Caracteristicas
     */
    public String getCaracteristicas() {
        return Caracteristicas;
    }

    /**
     * @param Caracteristicas the Caracteristicas to set
     */
    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    /**
     * @return the NombreComponente
     */
    public String getNombreComponente() {
        return NombreComponente;
    }

    /**
     * @param NombreComponente the NombreComponente to set
     */
    public void setNombreComponente(String NombreComponente) {
        this.NombreComponente = NombreComponente;
    }

    /**
     * @return the idfiltro
     */
    public int getIdfiltro() {
        return idfiltro;
    }

    /**
     * @param idfiltro the idfiltro to set
     */
    public void setIdfiltro(int idfiltro) {
        this.idfiltro = idfiltro;
    }

    /**
     * @return the idclave
     */
    public int getIdclave() {
        return idclave;
    }

    /**
     * @param idclave the idclave to set
     */
    public void setIdclave(int idclave) {
        this.idclave = idclave;
    }

 
    
}
