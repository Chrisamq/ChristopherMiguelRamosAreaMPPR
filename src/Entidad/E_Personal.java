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
public class E_Personal {
    
private int IdTrabajador;

private int Codigo;
private int IdEspecialidad;
private int IdPerfil;
private String Nombre;
private String ApellidoP;
private String ApellidoM;
private int Dni;
private String TelefonoCasa;
private String Celular;
private String Direccion;
private String Correo;
private int DiaNacimiento;
private int MesNacimiento;
private int AnoNacimiento;
private String UrlImagen;

private Date FechaIngreso;
private String Titulo;
private String InfoAdicional;
    /**
     * @return the IdTrabajador
     */
    public int getIdTrabajador() {
        return IdTrabajador;
    }

    /**
     * @param IdTrabajador the IdTrabajador to set
     */
    public void setIdTrabajador(int IdTrabajador) {
        this.IdTrabajador = IdTrabajador;
    }

    /**
     * @return the IdEspecialidad
     */
    public int getIdEspecialidad() {
        return IdEspecialidad;
    }

    /**
     * @param IdEspecialidad the IdEspecialidad to set
     */
    public void setIdEspecialidad(int IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    /**
     * @return the IdPerfil
     */
    public int getIdPerfil() {
        return IdPerfil;
    }

    /**
     * @param IdPerfil the IdPerfil to set
     */
    public void setIdPerfil(int IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApellidoP
     */
    public String getApellidoP() {
        return ApellidoP;
    }

    /**
     * @param ApellidoP the ApellidoP to set
     */
    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    /**
     * @return the ApellidoM
     */
    public String getApellidoM() {
        return ApellidoM;
    }

    /**
     * @param ApellidoM the ApellidoM to set
     */
    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    /**
     * @return the Dni
     */
    public int getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the TelefonoCasa
     */
    public String getTelefonoCasa() {
        return TelefonoCasa;
    }

    /**
     * @param TelefonoCasa the TelefonoCasa to set
     */
    public void setTelefonoCasa(String TelefonoCasa) {
        this.TelefonoCasa = TelefonoCasa;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the DiaNacimiento
     */
    public int getDiaNacimiento() {
        return DiaNacimiento;
    }

    /**
     * @param DiaNacimiento the DiaNacimiento to set
     */
    public void setDiaNacimiento(int DiaNacimiento) {
        this.DiaNacimiento = DiaNacimiento;
    }

    /**
     * @return the MesNacimiento
     */
    public int getMesNacimiento() {
        return MesNacimiento;
    }

    /**
     * @param MesNacimiento the MesNacimiento to set
     */
    public void setMesNacimiento(int MesNacimiento) {
        this.MesNacimiento = MesNacimiento;
    }

    /**
     * @return the AnoNacimiento
     */
    public int getAnoNacimiento() {
        return AnoNacimiento;
    }

    /**
     * @param AnoNacimiento the AnoNacimiento to set
     */
    public void setAnoNacimiento(int AnoNacimiento) {
        this.AnoNacimiento = AnoNacimiento;
    }


    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigol the Codigol to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the FechaIngreso
     */

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }


    public String getInfoAdicional() {
        return InfoAdicional;
    }

    /**
     * @param InfoAdicional the InfoAdicional to set
     */
    public void setInfoAdicional(String InfoAdicional) {
        this.InfoAdicional = InfoAdicional;
    }

    /**
     * @return the FechaIngreso
     */
    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param FechaIngreso the FechaIngreso to set
     */
    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    /**
     * @return the UrlImagen
     */
    public String getUrlImagen() {
        return UrlImagen;
    }

    /**
     * @param UrlImagen the UrlImagen to set
     */
    public void setUrlImagen(String UrlImagen) {
        this.UrlImagen = UrlImagen;
    }

    
}
