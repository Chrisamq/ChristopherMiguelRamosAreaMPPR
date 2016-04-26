package Formulario;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.UIManager;

public class RunMain {

   
    public static void main(String[] args) throws Exception {
      UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        Login inicio = new Login();
        inicio.setVisible(true);
    }
    
}
