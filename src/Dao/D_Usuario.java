
package Dao;

import Entidad.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class D_Usuario {
    
    ResultSet rs;
    private Conexion con =new Conexion(); 
    private Connection cn=con.conexion();
    
    
    public DefaultTableModel mostrar() {     //CONSULTA DE UNA TABLA
        DefaultTableModel modelo;  
        String[] titulos = {"Usuario", "Contrasena"};
        String[] registro = new String[2];

        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement csta = cn.prepareCall("{ call aaa}");
            rs = csta.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("Usuario");
                registro[1] = rs.getString("Contrasena");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
       public E_Usuario seleccionarUsuario(String usuario, String contrasena) {     //CONSULTA UN REGISTRO EN ESPECIFICO
        E_Usuario obj=new E_Usuario();  
         boolean ver=false;
        try {
            CallableStatement csta = cn.prepareCall("{ call seleccionarUsuario (?,?)}");
            csta.setString("parUsuario", usuario);
             csta.setString("parContrasena", contrasena);
            rs = csta.executeQuery();
           
            while (rs.next()) {
                ver=true;
                obj.setUsuario(rs.getString("Usuario"));
                obj.setContrasena(rs.getString("Contrasena"));
            }
            if(!ver) obj=null;
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
   
}
