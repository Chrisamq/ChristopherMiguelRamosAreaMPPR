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
public class D_Personal {
    
    ResultSet rs;
    private Conexion con =new Conexion(); 
    private Connection cn=con.conexion();
    
        
    public DefaultTableModel listarPersonal() {     //CONSULTA DE UNA TABLA
        DefaultTableModel modelo;  
        String[] titulos = {"IdPersonal","Codigo", "Apellido Paterno","Apellido Materno","Nombre"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement csta = cn.prepareCall("{ call Trabajador_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("IdPersonal");
                registro[1] = rs.getString("Codigo");
                registro[2] = rs.getString("ApellidoP");
                registro[3] = rs.getString("ApellidoM");
                registro[4] = rs.getString("Nombre");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
        public ArrayList<E_Personal> listarPersonalXX() {     //CONSULTA DE UNA TABLA
        ArrayList<E_Personal> lista=new  ArrayList<E_Personal> ();  
        E_Personal obj;
        
        try {
            CallableStatement csta = cn.prepareCall("{ call Trabajador_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                obj=new E_Personal();
                obj.setIdTrabajador(rs.getInt("IdPersonal"));
                obj.setCodigo(rs.getInt("Codigo"));
                obj.setApellidoP(rs.getString("ApellidoP"));
                obj.setApellidoM(rs.getString("ApellidoM"));
                obj.setNombre(rs.getString("Nombre"));
                lista.add(obj);

            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
      public E_Personal consultarPersonalXid(int idPersonal) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        E_Personal obj=new E_Personal();  
         boolean ver=false;
        try {
            CallableStatement csta = cn.prepareCall("{ call Trabajador_SeleccionarXid (?)}");
            csta.setInt("parIdPersonal", idPersonal);
            rs = csta.executeQuery();
           
            while (rs.next()) {
                obj.setIdTrabajador(rs.getInt("IdTrabajador"));
                obj.setCodigo(rs.getInt("Codigo"));
                obj.setIdEspecialidad(rs.getInt("IdEspecialidad"));
                obj.setIdPerfil(rs.getInt("IdPerfil"));
                obj.setNombre(rs.getString("Nombre"));
                obj.setApellidoP(rs.getString("ApellidoP"));
                obj.setApellidoM(rs.getString("ApellidoM"));
                obj.setDni(rs.getInt("Dni"));
                obj.setTelefonoCasa(rs.getString("TelefonoCasa"));
                obj.setCelular(rs.getString("Celular"));
                
                obj.setDireccion(rs.getString("Direccion"));
                obj.setCorreo(rs.getString("Correo"));
                obj.setDiaNacimiento(rs.getInt("DiaNacimiento"));
                obj.setMesNacimiento(rs.getInt("MesNacimiento"));
                obj.setAnoNacimiento(rs.getInt("AnoNacimiento"));
                obj.setUrlImagen(rs.getString("UrlImagen"));
                
               
            }
         
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
    public int registrarPersonal(E_Personal obj) {    
        
      int resultado=0;
        try {
            CallableStatement csta = cn.prepareCall("{ call Trabajador_Registrar (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            csta.setInt("parIdEspecialidad", 1);
            csta.setInt("parIdPerfil", 1);
            csta.setInt("parCodigo", obj.getCodigo());
            csta.setString("parTitulo", obj.getTitulo());
            csta.setString("parNombre", obj.getNombre());
            csta.setString("parApellidoP", obj.getApellidoP());
            csta.setString("parApellidoM", obj.getApellidoM());
            csta.setInt("parDni", obj.getDni());
            csta.setString("parTelefonoCasa", obj.getTelefonoCasa());
            csta.setString("parCelular", obj.getCelular());
            csta.setString("parDireccion", obj.getDireccion());
            csta.setString("parCorreo", obj.getCorreo());
            
            
            java.sql.Date sqlDate = new java.sql.Date(obj.getFechaIngreso().getTime());
            
            csta.setDate("parFechaIngreso",sqlDate);
            csta.setString("parInfoAdicional", obj.getInfoAdicional());
            csta.setInt("parDiaNacimiento", obj.getDiaNacimiento());
            csta.setInt("parMesNacimiento", obj.getMesNacimiento());
            csta.setInt("parAnoNacimiento", obj.getAnoNacimiento());
            
            csta.registerOutParameter("idInserccion",java.sql.Types.INTEGER);
            
            csta.execute();
            
           resultado=csta.getInt("idInserccion");
           
            System.out.println(resultado);
            
        } catch (SQLException e) {
        }
        return resultado;
    }
    
    public void actualizarTrabajador(int idTrabajador,String ruta) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        try {
            CallableStatement csta = cn.prepareCall("{ call Trabajador_ActualizarFoto(?,?)}");
            csta.setInt("parIdTrabajador", idTrabajador);
            csta.setString("parRuta", ruta);
            csta.executeQuery();

        } catch (SQLException e) {
            String exp=e.getMessage();
        }
    }
    
    
    
}
