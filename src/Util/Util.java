package Util;

import java.awt.Color;
import static javax.management.Query.lt;

public class Util {
    
//LIMPIAR LOS CONTROLES DE UN PANEL Y UN JSCROLLPANEL
    
    public void limpiarContenedor(Object panel) {
// Obtenemos el nombre de la clase
        String nombre_clase = panel.getClass().getName();
        if (nombre_clase.equals("javax.swing.JPanel")) {
// Estamos en el caso de un JPanel
            clearPanel((javax.swing.JPanel) panel);
        } else if (nombre_clase.equals("javax.swing.JScrollPane")) {
// Estamos en el caso de un JScrollPane
            clearScrollPane((javax.swing.JScrollPane) panel);
        }
    }

    private void clearScrollPane(javax.swing.JScrollPane panel) {
        java.awt.Component[] componentes = panel.getViewport().getComponents();
        for (int i = 0; i < componentes.length; i++) {
            clearComponent(componentes[i]);
        }
    }

    private void clearPanel(javax.swing.JPanel panel) {
// Obtenemos todos los componentes que cuelgan del panel
        java.awt.Component[] componentes = panel.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            clearComponent(componentes[i]);
        }
    }

    private void clearComponent(java.awt.Component comp) {
// Nombre de la clase del componente
        String nombre_clase = comp.getClass().getName();
        if (nombre_clase.equals("javax.swing.JTextField")) {
// Es un JTextField asi que lo ponemos en blanco
            ((javax.swing.JTextField) comp).setText("");
        } 
        else if (nombre_clase.equals("javax.swing.JComboBox")) {
// Es un JComboBox asi que ponemos el primer elemento
            ((javax.swing.JComboBox) comp).setSelectedIndex(0);
        } 
        else if (nombre_clase.equals("javax.swing.JTextArea")) {
// Es un JTextArea asi que lo ponemos en blanco
            ((javax.swing.JTextArea) comp).setText("");
        } 
          else if (nombre_clase.equals("javax.swing.JCheckBox")) {
// Es un JPanel asi que llamamos a clearPanel
               ((javax.swing.JCheckBox) comp).setSelected(false);
        }
          
        else if (nombre_clase.equals("javax.swing.JPanel")) {
// Es un JPanel asi que llamamos a clearPanel
            clearPanel((javax.swing.JPanel) comp);
        }
        
        else if (nombre_clase.equals("javax.swing.JScrollPane")) {
// Es un JScrollPane asi que llamamos a clearScrollPane
            clearScrollPane((javax.swing.JScrollPane) comp);
        }
    }
    
//DESHABILITAR LOS CAMPOS, EXCEPTO BOTONES
    
   public void deshabilitarContenedor(Object panel) {
// Obtenemos el nombre de la clase
        String nombre_clase = panel.getClass().getName();
        if (nombre_clase.equals("javax.swing.JPanel")) {
            deshabilitarCampos((javax.swing.JPanel) panel);
        }
    }
   
       private void deshabilitarCampos(javax.swing.JPanel panel) {
// Obtenemos todos los componentes que cuelgan del panel
        java.awt.Component[] componentes = panel.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            deshabilitarControles(componentes[i]);
        }
    }
        private void deshabilitarControles(java.awt.Component comp) {
// Nombre de la clase del componente
        String nombre_clase = comp.getClass().getName();
        if (nombre_clase.equals("javax.swing.JTextField")) {
// Es un JTextField asi que lo ponemos en blanco
            ((javax.swing.JTextField) comp).enable(false);
        } else if (nombre_clase.equals("javax.swing.JTextArea")) {
// Es un JTextArea asi que lo ponemos en blanco
            ((javax.swing.JTextArea) comp).enable(false);
        } 
        else if (nombre_clase.equals("javax.swing.JPanel")) {
// Es un JPanel asi que llamamos a clearPanel
            deshabilitarCampos((javax.swing.JPanel) comp);
        }
    }
//Habilitar LOS CAMPOS, EXCEPTO BOTONES 
    
   public void habilitarContenedor(Object panel) {
// Obtenemos el nombre de la clase
        String nombre_clase = panel.getClass().getName();
        if (nombre_clase.equals("javax.swing.JPanel")) {
            habilitarCampos((javax.swing.JPanel) panel);
        }
    }
      private void habilitarCampos(javax.swing.JPanel panel) {
// Obtenemos todos los componentes que cuelgan del panel
        java.awt.Component[] componentes = panel.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            habilitarControles(componentes[i]);
        }
    }
      private void habilitarControles(java.awt.Component comp) {
// Nombre de la clase del componente
        String nombre_clase = comp.getClass().getName();
        if (nombre_clase.equals("javax.swing.JTextField")) {
// Es un JTextField asi que lo ponemos en blanco
            ((javax.swing.JTextField) comp).enable(true);
        } else if (nombre_clase.equals("javax.swing.JTextArea")) {
// Es un JTextArea asi que lo ponemos en blanco
            ((javax.swing.JTextArea) comp).enable(true);
        } 
        else if (nombre_clase.equals("javax.swing.JPanel")) {
// Es un JPanel asi que llamamos a clearPanel
            habilitarCampos((javax.swing.JPanel) comp);
        }
    }
 
        public void RestaurarValorForm(Object panel) {
// Obtenemos el nombre de la clase
        String nombre_clase = panel.getClass().getName();
        if (nombre_clase.equals("javax.swing.JPanel")) {
// Estamos en el caso de un JPanel
            RestaurarValorPanel((javax.swing.JPanel) panel);
        }
    }


 private void RestaurarValorPanel(javax.swing.JPanel panel) {
// Obtenemos todos los componentes que cuelgan del panel
        java.awt.Component[] componentes = panel.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            PintarComponent(componentes[i]);
        }
    }



  private void PintarComponent(java.awt.Component comp) {
// Nombre de la clase del componente
      
        Color colorbg=new Color(58,58,58);
        Color colortext=new Color(204,204,204);
         
      
        String nombre_clase = comp.getClass().getName();
        if (nombre_clase.equals("javax.swing.JTextField")) {
            // Es un JTextField asi que lo ponemos en blanco
            ((javax.swing.JTextField) comp).setBackground(colorbg);
            ((javax.swing.JTextField) comp).setForeground(colortext);
        } else if (nombre_clase.equals("javax.swing.JTextArea")) {
            // Es un JTextArea asi que lo ponemos en blanco
            ((javax.swing.JTextArea) comp).setBackground(colorbg);
            ((javax.swing.JTextArea) comp).setForeground(colortext);
        } else if (nombre_clase.equals("javax.swing.JPanel")) {
            // Es un JPanel asi que llamamos a clearPanel
            clearPanel((javax.swing.JPanel) comp);
        } 
    }

}
