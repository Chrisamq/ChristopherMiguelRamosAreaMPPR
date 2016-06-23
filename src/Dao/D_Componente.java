/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author miguel
 */
public class D_Componente {
    
    ResultSet rs;
    private Conexion con =new Conexion(); 
    private Connection cn=con.conexion();
    
        
    public DefaultTableModel listarComponente() {     //CONSULTA DE UNA TABLA
        DefaultTableModel modelo;  
        String[] titulos = {"Idcomponente","Nombre Componente", "Codigo ","Marca","Tipo de molde","Ubicacion","Serie","Caracteristica"};
        String[] registro = new String[8];

        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement csta = cn.prepareCall("{ call Componentes_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("Idcomponente");
                registro[1] = rs.getString("NombreComponente");
                registro[2] = rs.getString("Codigo");
                registro[3] = rs.getString("Marca");
                registro[4] = rs.getString("TipoDeMolde");
                registro[5] = rs.getString("Ubicacion");
                registro[6] = rs.getString("Serie");
                registro[7] = rs.getString("Caracteristicas");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
        public ArrayList<E_Componente> listarComponenteXX() {     //CONSULTA DE UNA TABLA
        ArrayList<E_Componente> lista=new  ArrayList<E_Componente> ();  
        E_Componente obj;
        
        try {
            CallableStatement csta = cn.prepareCall("{ call Componentes_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                obj=new E_Componente();
                obj.setIdComponente(rs.getInt("Idcomponente"));
                obj.setNombreComponente(rs.getString("NombreComponente"));
                obj.setCodigo(rs.getString("Codigo"));
                obj.setMarca(rs.getString("Marca"));
                obj.setTipoDeMolde(rs.getString("TipoDeMolde"));
                obj.setUbicacion(rs.getString("Ubicacion"));
                obj.setSerie(rs.getString("Serie"));
                obj.setCaracteristicas(rs.getString("Caracteristicas"));
                lista.add(obj);

            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
      public E_Componente consultarComponenteXid(int Idcomponente) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        E_Componente obj=new E_Componente();  
         boolean ver=false;
        try {
            CallableStatement csta = cn.prepareCall("{ call Componente_SeleccionarXid (?)}");
            csta.setInt("parIdcomponente", Idcomponente);
            rs = csta.executeQuery();
           
            while (rs.next()) {
                obj.setIdComponente(rs.getInt("Idcomponente"));
                obj.setCodigo(rs.getString("Codigo"));
                obj.setNombreComponente(rs.getString("NombreComponente"));
                obj.setCaracteristicas(rs.getString("Caracteristica"));
                obj.setTipoDeMolde(rs.getString("TipoDeMolde"));
                obj.setUbicacion(rs.getString("Ubicacion"));
                obj.setSerie(rs.getString("Serie"));
                obj.setMarca(rs.getString("Marca "));
                obj.setCaracteristicas(rs.getString("Caracteristicas"));
            }
         
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
    public int registrarComponente(E_Componente obj) {    
        
      int resultado=0;
        try {
            CallableStatement csta = cn.prepareCall("{ call Componente_Registrar (?,?,?,?,?,?,?)}");
           
            csta.setString("parNombreComponente", obj.getNombreComponente());
            csta.setString("parCodigo", obj.getCodigo());
            csta.setString("parMarca", obj.getMarca());
            csta.setString("parTipoDeMolde", obj.getTipoDeMolde());
            csta.setString("parUbicacion", obj.getUbicacion());
            csta.setString("parSerie", obj.getSerie());
            csta.setString("parCaracteristica", obj.getCaracteristicas());
          
           
            csta.registerOutParameter("idInserccion",java.sql.Types.INTEGER);
            
            csta.execute();
            
           resultado=csta.getInt("idInserccion");
           
            System.out.println(resultado);
            
        } catch (SQLException e) {
        }
        return resultado;
    }
    
    public void actualizarComponente(int Idcomponente) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        try {
            CallableStatement csta = cn.prepareCall("{ call Componente_Actualizar(?)}");
            csta.setInt("parIdcomponente", Idcomponente);
            
            csta.executeQuery();

        } catch (SQLException e) {
            String exp=e.getMessage();
        }
    }
    
    
    
}
