package Formulario;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TrabajoDeReparacionesEntregados extends javax.swing.JDialog {

    public TrabajoDeReparacionesEntregados(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
      public TrabajoDeReparacionesEntregados(){
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jTextField15 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        btnBuscarTPrevenEntregados = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 590));
        getContentPane().setLayout(null);

        labelHeader1.setText("Reparaciones entregados");
        labelHeader1.setColor(new java.awt.Color(0, 51, 255));
        labelHeader1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(labelHeader1);
        labelHeader1.setBounds(-10, 0, 1070, 37);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1220, 210, 287, 111);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trabajos de reparaciones entregados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OTM", "OTG", "Key", "DnI", "Fechas", "Solicita", "Recibe", "Fecha de entrega", "entrega"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 70, 730, 310);

        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Guardar");
        jPanel2.add(jButton2);
        jButton2.setBounds(300, 450, 115, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("<html><p>OTG:</p></html>");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 10, 30, 20);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField3);
        jTextField3.setBounds(100, 30, 130, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Fecha Solicitada:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(100, 10, 90, 20);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Cancelar");
        jPanel2.add(jButton3);
        jButton3.setBounds(430, 450, 115, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane14.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane14);
        jScrollPane14.setBounds(40, 180, 400, 110);

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField4);
        jTextField4.setBounds(30, 30, 60, 30);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Nombre del Solicitante:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(240, 10, 130, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox6);
        jComboBox6.setBounds(240, 30, 150, 30);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Nombre del operador");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(400, 10, 130, 20);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox7);
        jComboBox7.setBounds(400, 30, 150, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Nombre del Solicitante:");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(30, 70, 130, 20);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox8);
        jComboBox8.setBounds(30, 90, 150, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jTextField15);
        jTextField15.setBounds(390, 20, 70, 30);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Cantidad entregada");
        jPanel1.add(jLabel46);
        jLabel46.setBounds(280, 20, 110, 20);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("OTM");
        jPanel1.add(jLabel47);
        jLabel47.setBounds(30, 30, 40, 20);

        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jTextField18);
        jTextField18.setBounds(30, 50, 90, 30);

        jTextField19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jTextField19);
        jTextField19.setBounds(30, 250, 180, 30);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("Persona que recibe");
        jPanel1.add(jLabel62);
        jLabel62.setBounds(30, 290, 130, 20);

        jTextField20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jTextField20);
        jTextField20.setBounds(130, 50, 80, 30);

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("Listado de trabajos de reparaciones entregados");
        jPanel1.add(jLabel63);
        jLabel63.setBounds(480, 20, 380, 20);

        jTextField21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jTextField21);
        jTextField21.setBounds(30, 310, 180, 30);
        jPanel1.add(jDateChooser3);
        jDateChooser3.setBounds(80, 130, 130, 30);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setText("Por fecha ");
        jPanel1.add(jLabel64);
        jLabel64.setBounds(30, 100, 70, 20);

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel65.setText("Desde");
        jPanel1.add(jLabel65);
        jLabel65.setBounds(30, 130, 40, 20);
        jPanel1.add(jDateChooser4);
        jDateChooser4.setBounds(80, 180, 130, 30);

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel66.setText("Persona que entrega");
        jPanel1.add(jLabel66);
        jLabel66.setBounds(30, 230, 130, 20);

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel67.setText("Hasta");
        jPanel1.add(jLabel67);
        jLabel67.setBounds(40, 180, 40, 20);

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel68.setText("OTG");
        jPanel1.add(jLabel68);
        jLabel68.setBounds(130, 30, 30, 20);

        btnBuscarTPrevenEntregados.setText("Buscar");
        jPanel1.add(btnBuscarTPrevenEntregados);
        btnBuscarTPrevenEntregados.setBounds(150, 360, 65, 23);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(230, 30, 40, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 1030, 400);

        jPanel9.setLayout(null);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Guardar");
        jPanel9.add(jButton4);
        jButton4.setBounds(300, 450, 115, 25);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("<html><p>OTG:</p></html>");
        jPanel9.add(jLabel30);
        jLabel30.setBounds(30, 10, 30, 20);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel9.add(jTextField5);
        jTextField5.setBounds(100, 30, 130, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Fecha Solicitada:");
        jPanel9.add(jLabel31);
        jLabel31.setBounds(100, 10, 90, 20);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Cancelar");
        jPanel9.add(jButton5);
        jButton5.setBounds(430, 450, 115, 25);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane15.setViewportView(jTextArea2);

        jPanel9.add(jScrollPane15);
        jScrollPane15.setBounds(40, 180, 400, 110);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel9.add(jTextField6);
        jTextField6.setBounds(30, 30, 60, 30);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Nombre del Solicitante:");
        jPanel9.add(jLabel32);
        jLabel32.setBounds(240, 10, 130, 20);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox9);
        jComboBox9.setBounds(240, 30, 150, 30);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Nombre del operador");
        jPanel9.add(jLabel33);
        jLabel33.setBounds(400, 10, 130, 20);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox10);
        jComboBox10.setBounds(400, 30, 150, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Nombre del Solicitante:");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(30, 70, 130, 20);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox11);
        jComboBox11.setBounds(30, 90, 150, 30);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 0, 0);

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
            java.util.logging.Logger.getLogger(TrabajoDeReparacionesEntregados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabajoDeReparacionesEntregados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabajoDeReparacionesEntregados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabajoDeReparacionesEntregados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                TrabajoDeReparacionesEntregados dialog = null;
                try {
                    dialog = new TrabajoDeReparacionesEntregados(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(TrabajoDeReparacionesEntregados.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnBuscarTPrevenEntregados;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    // End of variables declaration//GEN-END:variables
}
