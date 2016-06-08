
package Control;


import Dao.*;
import Entidad.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class C_Especialidad {
  
       D_Especialidad dao = new D_Especialidad();
       
  public DefaultComboBoxModel llenarComboEspecialidad() {   
            return dao.llenarComboEspecialidad();
        }
    }

