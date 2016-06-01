package Control;

import Dao.*;
import javax.swing.table.DefaultTableModel;
import Entidad.*;
import java.util.ArrayList;

public class C_Personal {
    
    D_Personal dao = new D_Personal();

    public DefaultTableModel listarPersonal() {

        return dao.listarPersonal();
    }

    public ArrayList<E_Personal> listarPersonalXX() {

        return dao.listarPersonalXX();
    }

    public E_Personal consultarPersonalXid(int idPersonal) {
        return dao.consultarPersonalXid(idPersonal);
    }
    
 public int  registrarPersonal(E_Personal obj) {
        return dao.registrarPersonal(obj);
    }
 
  public void  actualizarTrabajador(int idTrabajador,String ruta) {
         dao.actualizarTrabajador(idTrabajador,ruta);
    }
}
