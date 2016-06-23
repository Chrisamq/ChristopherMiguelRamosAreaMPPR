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
public class E_Sistema {
    
private int IdSistema;

private int  NombreSistema;
private String Descripcion;
private String  Identificacion;

    /**
     * @return the IdSistema
     */
    public int getIdSistema() {
        return IdSistema;
    }

    /**
     * @param IdSistema the IdSistema to set
     */
    public void setIdSistema(int IdSistema) {
        this.IdSistema = IdSistema;
    }

    /**
     * @return the NombreSistema
     */
    public int getNombreSistema() {
        return NombreSistema;
    }

    /**
     * @param NombreSistema the NombreSistema to set
     */
    public void setNombreSistema(int NombreSistema) {
        this.NombreSistema = NombreSistema;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Identificacion
     */
    public String getIdentificacion() {
        return Identificacion;
    }

    /**
     * @param Identificacion the Identificacion to set
     */
    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

  
    
}
