
package Control;


import Dao.*;
import javax.swing.table.DefaultTableModel;
import Entidad.*;

public class C_Usuario {
  
    public DefaultTableModel mostrar() {
        D_Usuario dao = new D_Usuario();
        return dao.mostrar();
    }

     public E_Usuario seleccionarUsuario(String Usuario, String Contrasena) {
        D_Usuario dao = new D_Usuario();
        return dao.seleccionarUsuario(Usuario, Contrasena);
    }

}
