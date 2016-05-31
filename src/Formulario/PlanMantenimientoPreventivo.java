package Formulario;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PlanMantenimientoPreventivo extends javax.swing.JDialog {

    public PlanMantenimientoPreventivo(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
      public PlanMantenimientoPreventivo(){
      initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReferencias = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPrecauciones = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        lblTitletabEquipo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTitleTabMecanico = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtSecuenciaMecanico = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtResultadoMecanico = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtLimitesMecanico = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTitleTabElectrico = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtSecuenciaElectrico = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtResultadoElectrico = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtLimitesElectrico = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblTitletabElectronico = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLimitesElectronico = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSecuenciaElectronico = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtResultadoElectronico = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 590));
        getContentPane().setLayout(null);

        labelHeader1.setText("Plan de mantenimiento preventivo");
        labelHeader1.setColor(new java.awt.Color(0, 51, 255));
        labelHeader1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(labelHeader1);
        labelHeader1.setBounds(-10, 0, 1070, 37);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1220, 210, 287, 111);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de OTM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mechanic_Man-64.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 60, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OTM", "Sistema", "Sub sistema"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 430, 350);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("<html><p>Usted puede realizar la buscar orden de trabajo de mantenimiento (OTM) con los parametros que se muestran en la parte derecha de esta pantalla.</p></html>");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 30, 320, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-derecha.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 70, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 450, 490);

        jTabbedPane2.setToolTipText("");

        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Guardar");
        jPanel2.add(jButton2);
        jButton2.setBounds(300, 450, 115, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("<html><p>Orden de trabajo de mantenimiento (OTM):</p></html>");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 20, 130, 60);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField3);
        jTextField3.setBounds(150, 30, 130, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Sistema:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(-10, 70, 110, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Sub sistema:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(-10, 110, 110, 50);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Componentes:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(-10, 140, 110, 50);
        jPanel2.add(jTextField9);
        jTextField9.setBounds(190, 350, 100, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("<html><p>Frecuencia de mantenimiento preventivo:</p></html>");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 330, 160, 50);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Clave:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(-10, 290, 110, 50);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("<html><p>Frecuencia de mantenimiento total (Overhaul):</p></html>");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 380, 170, 50);
        jPanel2.add(jTextField11);
        jTextField11.setBounds(190, 390, 100, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Cancelar");
        jPanel2.add(jButton3);
        jButton3.setBounds(430, 450, 115, 25);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(110, 300, 80, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(null);

        jCheckBox1.setText("Mecanico (M)");
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(20, 20, 90, 23);

        jCheckBox2.setText("Electrico (E)");
        jPanel3.add(jCheckBox2);
        jCheckBox2.setBounds(20, 40, 100, 23);

        jCheckBox3.setText("Electronico (N)");
        jPanel3.add(jCheckBox3);
        jCheckBox3.setBounds(20, 60, 95, 23);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(390, 330, 150, 90);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(110, 120, 400, 30);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox5);
        jComboBox5.setBounds(110, 80, 170, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane14.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane14);
        jScrollPane14.setBounds(110, 170, 400, 110);

        jTabbedPane2.addTab("Datos de OTM", jPanel2);

        jPanel4.setLayout(null);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inagen de equipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel8.setLayout(null);

        jPanel10.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-128.png"))); // NOI18N
        jPanel10.add(jLabel3);
        jLabel3.setBounds(0, 0, 200, 190);

        jPanel8.add(jPanel10);
        jPanel10.setBounds(10, 20, 200, 190);

        jPanel4.add(jPanel8);
        jPanel8.setBounds(20, 40, 220, 220);

        txtReferencias.setColumns(20);
        txtReferencias.setRows(5);
        jScrollPane2.setViewportView(txtReferencias);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(260, 270, 300, 190);

        jLabel4.setText("Referencias");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(260, 250, 80, 14);

        txtPrecauciones.setColumns(20);
        txtPrecauciones.setRows(5);
        jScrollPane3.setViewportView(txtPrecauciones);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(260, 50, 300, 190);

        jLabel6.setText("Precauciones");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(260, 30, 80, 14);

        lblTitletabEquipo.setText("Caja de Guantes S-32,Produccion");
        jPanel4.add(lblTitletabEquipo);
        lblTitletabEquipo.setBounds(20, 10, 170, 14);

        jTabbedPane2.addTab("Equipos", jPanel4);

        jPanel5.setLayout(null);

        lblTitleTabMecanico.setText("Caja de Guantes S-32,Produccion");
        jPanel5.add(lblTitleTabMecanico);
        lblTitleTabMecanico.setBounds(20, 10, 170, 14);

        jLabel23.setText("Secuancia de actividades");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(20, 50, 140, 14);

        txtSecuenciaMecanico.setColumns(20);
        txtSecuenciaMecanico.setRows(5);
        jScrollPane11.setViewportView(txtSecuenciaMecanico);

        jPanel5.add(jScrollPane11);
        jScrollPane11.setBounds(20, 70, 530, 150);

        jLabel24.setText("Resultados esperados");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(20, 230, 150, 14);

        txtResultadoMecanico.setColumns(20);
        txtResultadoMecanico.setRows(5);
        jScrollPane12.setViewportView(txtResultadoMecanico);

        jPanel5.add(jScrollPane12);
        jScrollPane12.setBounds(20, 250, 410, 70);

        jLabel25.setText("Limites de aceptacion");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(20, 330, 130, 14);

        txtLimitesMecanico.setColumns(20);
        txtLimitesMecanico.setRows(5);
        jScrollPane13.setViewportView(txtLimitesMecanico);

        jPanel5.add(jScrollPane13);
        jScrollPane13.setBounds(20, 350, 410, 70);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construction_worker-128.png"))); // NOI18N
        jPanel5.add(jLabel26);
        jLabel26.setBounds(430, 290, 120, 130);

        jTabbedPane2.addTab("Mecanico", jPanel5);

        jPanel6.setLayout(null);

        lblTitleTabElectrico.setText("Caja de Guantes S-32,Produccion");
        jPanel6.add(lblTitleTabElectrico);
        lblTitleTabElectrico.setBounds(20, 10, 170, 14);

        jLabel19.setText("Secuancia de actividades");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(20, 50, 140, 14);

        txtSecuenciaElectrico.setColumns(20);
        txtSecuenciaElectrico.setRows(5);
        jScrollPane7.setViewportView(txtSecuenciaElectrico);

        jPanel6.add(jScrollPane7);
        jScrollPane7.setBounds(20, 70, 530, 150);

        jLabel20.setText("Resultados esperados");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(20, 230, 150, 14);

        txtResultadoElectrico.setColumns(20);
        txtResultadoElectrico.setRows(5);
        jScrollPane9.setViewportView(txtResultadoElectrico);

        jPanel6.add(jScrollPane9);
        jScrollPane9.setBounds(20, 250, 410, 70);

        jLabel21.setText("Limites de aceptacion");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(20, 330, 130, 14);

        txtLimitesElectrico.setColumns(20);
        txtLimitesElectrico.setRows(5);
        jScrollPane10.setViewportView(txtLimitesElectrico);

        jPanel6.add(jScrollPane10);
        jScrollPane10.setBounds(20, 350, 410, 70);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construction_worker-128.png"))); // NOI18N
        jPanel6.add(jLabel22);
        jLabel22.setBounds(430, 290, 120, 130);

        jTabbedPane2.addTab("Electrico", jPanel6);

        jPanel7.setLayout(null);

        lblTitletabElectronico.setText("Caja de Guantes S-32,Produccion");
        jPanel7.add(lblTitletabElectronico);
        lblTitletabElectronico.setBounds(20, 10, 170, 14);

        txtLimitesElectronico.setColumns(20);
        txtLimitesElectronico.setRows(5);
        jScrollPane5.setViewportView(txtLimitesElectronico);

        jPanel7.add(jScrollPane5);
        jScrollPane5.setBounds(20, 350, 410, 70);

        txtSecuenciaElectronico.setColumns(20);
        txtSecuenciaElectronico.setRows(5);
        jScrollPane6.setViewportView(txtSecuenciaElectronico);

        jPanel7.add(jScrollPane6);
        jScrollPane6.setBounds(20, 70, 530, 150);

        txtResultadoElectronico.setColumns(20);
        txtResultadoElectronico.setRows(5);
        jScrollPane8.setViewportView(txtResultadoElectronico);

        jPanel7.add(jScrollPane8);
        jScrollPane8.setBounds(20, 250, 410, 70);

        jLabel12.setText("Secuancia de actividades");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(20, 50, 140, 14);

        jLabel13.setText("Resultados esperados");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(20, 230, 150, 14);

        jLabel17.setText("Limites de aceptacion");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(20, 330, 130, 14);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construction_worker-128.png"))); // NOI18N
        jPanel7.add(jLabel18);
        jLabel18.setBounds(430, 290, 120, 130);

        jTabbedPane2.addTab("Electronico", jPanel7);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(470, 40, 580, 500);

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
            java.util.logging.Logger.getLogger(PlanMantenimientoPreventivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanMantenimientoPreventivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanMantenimientoPreventivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanMantenimientoPreventivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanMantenimientoPreventivo dialog = null;
                try {
                    dialog = new PlanMantenimientoPreventivo(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(PlanMantenimientoPreventivo.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private javax.swing.JLabel lblTitleTabElectrico;
    private javax.swing.JLabel lblTitleTabMecanico;
    private javax.swing.JLabel lblTitletabElectronico;
    private javax.swing.JLabel lblTitletabEquipo;
    private javax.swing.JTextArea txtLimitesElectrico;
    private javax.swing.JTextArea txtLimitesElectronico;
    private javax.swing.JTextArea txtLimitesMecanico;
    private javax.swing.JTextArea txtPrecauciones;
    private javax.swing.JTextArea txtReferencias;
    private javax.swing.JTextArea txtResultadoElectrico;
    private javax.swing.JTextArea txtResultadoElectronico;
    private javax.swing.JTextArea txtResultadoMecanico;
    private javax.swing.JTextArea txtSecuenciaElectrico;
    private javax.swing.JTextArea txtSecuenciaElectronico;
    private javax.swing.JTextArea txtSecuenciaMecanico;
    // End of variables declaration//GEN-END:variables
}
