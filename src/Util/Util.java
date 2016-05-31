package Util;

import static javax.management.Query.lt;

public class Util {
    public void clearForm(Object panel) {
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
        } else if (nombre_clase.equals("javax.swing.JComboBox")) {
// Es un JComboBox asi que ponemos el primer elemento
            ((javax.swing.JComboBox) comp).setSelectedIndex(0);
        } else if (nombre_clase.equals("javax.swing.JTextArea")) {
// Es un JTextArea asi que lo ponemos en blanco
            ((javax.swing.JTextArea) comp).setText("");
        } else if (nombre_clase.equals("javax.swing.JPanel")) {
// Es un JPanel asi que llamamos a clearPanel
            clearPanel((javax.swing.JPanel) comp);
        } else if (nombre_clase.equals("javax.swing.JScrollPane")) {
// Es un JScrollPane asi que llamamos a clearScrollPane
            clearScrollPane((javax.swing.JScrollPane) comp);
        }
    }


    
}
