package Control;

import Dao.*;
import javax.swing.table.DefaultTableModel;
import Entidad.*;
import java.util.ArrayList;

public class C_Componente {
    
    D_Componente dao = new D_Componente();

    public DefaultTableModel listarComponente() {

        return dao.listarComponente();
    }

    public ArrayList<E_Componente> listarComponenteXX() {

        return dao.listarComponenteXX();
    }

    public E_Componente consultarComponenteXid(int Idcomponente) {
        return dao.consultarComponenteXid(Idcomponente);
    }
    
 public int  registrarComponente(E_Componente obj) {
        return dao.registrarComponente(obj);
    }
 
  public void  actualizarComponente(int Idcomponente) {
         dao.actualizarComponente(Idcomponente);
    }
}
