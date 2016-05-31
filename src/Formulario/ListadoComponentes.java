package Formulario;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ListadoComponentes extends javax.swing.JDialog {

    public ListadoComponentes(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(528, 340));
        getContentPane().setLayout(null);

        labelHeader1.setText("Listado de componentes con filtros");
        labelHeader1.setColor(new java.awt.Color(0, 51, 255));
        labelHeader1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(labelHeader1);
        labelHeader1.setBounds(-10, 0, 650, 37);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1220, 210, 287, 111);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CQ22PR", "Lab. 20", "Equipos criticos:  Equipos con identificación y/o del proceso:  Epirradiador, Calefactor agitador, Horno sublimación, Calibrador de dosis, Registrador de actividad, Cámara de calibración.     "},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion"
            }
        ));
        jScrollPane11.setViewportView(jTable10);

        getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(20, 90, 600, 260);

        jButton3.setText("Seleccionar");
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 360, 90, 23);

        jButton4.setText("Cancelar");
        getContentPane().add(jButton4);
        jButton4.setBounds(540, 360, 80, 23);

        jLabel2.setText("Buscar:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 50, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 50, 150, 20);

        jToggleButton1.setText("Buscar");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(230, 50, 70, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoComponentes dialog = null;
                try {
                    dialog = new ListadoComponentes(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(ListadoComponentes.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable jTable10;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    // End of variables declaration//GEN-END:variables
}
