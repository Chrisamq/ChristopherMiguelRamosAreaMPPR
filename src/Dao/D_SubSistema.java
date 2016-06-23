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
public class D_SubSistema {
    
    ResultSet rs;
    private Conexion con =new Conexion(); 
    private Connection cn=con.conexion();
    
        
    public DefaultTableModel listarSubSistema() {     //CONSULTA DE UNA TABLA
        DefaultTableModel modelo;  
        String[] titulos = {"IdSubSistema","Nombre Sub Sistema", "Descripcion "};
        String[] registro = new String[8];

        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement csta = cn.prepareCall("{ call SubSistema_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("IdSubSistema");
                registro[1] = rs.getString("NombreSubSistema");
                registro[2] = rs.getString("Descripcion");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
        public ArrayList<E_Sub_Sistema> listarSubSistemaXX() {     //CONSULTA DE UNA TABLA
        ArrayList<E_Sub_Sistema> lista=new  ArrayList<E_Sub_Sistema> ();  
        E_Sub_Sistema obj;
        
        try {
            CallableStatement csta = cn.prepareCall("{ call SubSistema_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                obj=new E_Sub_Sistema();
                obj.setIdSubSistema(rs.getInt("IdSubSistema"));
                obj.setNombreSubSistema(rs.getString("NombreSubSistema"));
                obj.setDescripcion(rs.getString("Descripcion"));
                
                lista.add(obj);

            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
      public E_Sub_Sistema consultarSubSistemaXid(int IdSubSistema) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        E_Sub_Sistema obj=new E_Sub_Sistema();  
         boolean ver=false;
        try {
            CallableStatement csta = cn.prepareCall("{ call SubSistema_SeleccionarXid (?)}");
            csta.setInt("parIdSubSistema", IdSubSistema);
            rs = csta.executeQuery();
           
            while (rs.next()) {
                obj.setIdSubSistema(rs.getInt("IdSubSistema"));
                obj.setNombreSubSistema(rs.getString("NombreSubSistema"));
                obj.setDescripcion(rs.getString("Descripcion"));
            }
         
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
    public int registrarSubSistema(E_Sub_Sistema obj) {    
        
      int resultado=0;
        try {
            CallableStatement csta = cn.prepareCall("{ call SubSistema_Registrar (?,?,?)}");
           
            csta.setString("parNombreSubSistema", obj.getNombreSubSistema());
            csta.setString("parDescripcion", obj.getDescripcion());
          
           
            csta.registerOutParameter("idInserccion",java.sql.Types.INTEGER);
            
            csta.execute();
            
           resultado=csta.getInt("idInserccion");
           
            System.out.println(resultado);
            
        } catch (SQLException e) {
        }
        return resultado;
    }
    
    public void actualizarSubSistema(int IdSubSistema) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        try {
            CallableStatement csta = cn.prepareCall("{ call SubSistema_Actualizar(?)}");
            csta.setInt("parIdSubSistema", IdSubSistema);
            
            csta.executeQuery();

        } catch (SQLException e) {
            String exp=e.getMessage();
        }
    }
    
    
    
}
