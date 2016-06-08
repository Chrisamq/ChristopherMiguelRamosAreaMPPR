
package Dao;

import Entidad.*;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class D_Especialidad {
    
    ResultSet rs;
    private Conexion con =new Conexion(); 
    private Connection cn=con.conexion();
    

    public DefaultComboBoxModel llenarComboEspecialidad() {     //CONSULTA DE UNA TABLA
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        int cont=0;
        try {
            CallableStatement csta = cn.prepareCall("{ call Especialidad_Listar}");
            rs = csta.executeQuery();
            while (rs.next()) {
                if(cont==0)modelo.addElement(new E_Especialidad(0,"---Seleccionar---"));
                modelo.addElement(new E_Especialidad(rs.getInt("IdEspecialidad"), rs.getString("Nombre")));
            cont++;
            }
            return modelo;
        } catch (Exception e) {

            return null;
        }
    }


        
        
}
