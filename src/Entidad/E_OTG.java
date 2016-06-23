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
public class E_OTG {
    
private int IdOtg;

private int  IdPlanXOtm;
private String Descripcion;
private int  IdSolicitud;

    /**
     * @return the IdOtg
     */
    public int getIdOtg() {
        return IdOtg;
    }

    /**
     * @param IdOtg the IdOtg to set
     */
    public void setIdOtg(int IdOtg) {
        this.IdOtg = IdOtg;
    }

    /**
     * @return the IdPlanXOtm
     */
    public int getIdPlanXOtm() {
        return IdPlanXOtm;
    }

    /**
     * @param IdPlanXOtm the IdPlanXOtm to set
     */
    public void setIdPlanXOtm(int IdPlanXOtm) {
        this.IdPlanXOtm = IdPlanXOtm;
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
     * @return the IdSolicitud
     */
    public int getIdSolicitud() {
        return IdSolicitud;
    }

    /**
     * @param IdSolicitud the IdSolicitud to set
     */
    public void setIdSolicitud(int IdSolicitud) {
        this.IdSolicitud = IdSolicitud;
    }
  
    
}
