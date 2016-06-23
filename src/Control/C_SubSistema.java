package Control;

import Dao.*;
import javax.swing.table.DefaultTableModel;
import Entidad.*;
import java.util.ArrayList;

public class C_SubSistema {
    
    D_SubSistema dao = new D_SubSistema();

    public DefaultTableModel listarSubSistema() {

        return dao.listarSubSistema();
    }

    public ArrayList<E_Sub_Sistema> listarSubSistemaXX() {

        return dao.listarSubSistemaXX();
    }

    public E_Sub_Sistema consultarSubSistemaXid(int IdSubSistema) {
        return dao.consultarSubSistemaXid(IdSubSistema);
    }
    
 public int  registrarSubSistema(E_Sub_Sistema obj) {
        return dao.registrarSubSistema(obj);
    }
 
  public void  actualizarSubSistema(int IdSubSistema) {
         dao.actualizarSubSistema(IdSubSistema);
    }
}
