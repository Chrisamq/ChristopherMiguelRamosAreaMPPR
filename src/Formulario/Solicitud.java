package Formulario;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Solicitud extends javax.swing.JDialog {

    public Solicitud(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
      public Solicitud(){
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
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox14 = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jComboBox19 = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jComboBox17 = new javax.swing.JComboBox();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 590));
        getContentPane().setLayout(null);

        labelHeader1.setText("Solicitud");
        labelHeader1.setColor(new java.awt.Color(0, 51, 255));
        labelHeader1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(labelHeader1);
        labelHeader1.setBounds(-10, 0, 1070, 37);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1220, 210, 287, 111);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de OTG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mechanic_Man-64.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 60, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OTG", "OTM", "Fecha de Solicitud", "Solicitante", "Tipo de intervencion", "Equipo/Instrumento", "clave", "Quien Entrega?", "Quien Recibe?", "Fecha de entrega"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 430, 510);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("<html><p>Usted puede realizar la buscar orden de trabajo generadas (OTG) con los parametros que se muestran en la parte derecha de esta pantalla.</p></html>");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 30, 320, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-derecha.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 70, 50, 40);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 450, 630);

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

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel11.setLayout(null);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("<html><p>OTG:</p></html>");
        jPanel11.add(jLabel35);
        jLabel35.setBounds(30, 30, 30, 20);

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel11.add(jTextField7);
        jTextField7.setBounds(100, 50, 130, 30);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane16.setViewportView(jTextArea3);

        jPanel11.add(jScrollPane16);
        jScrollPane16.setBounds(30, 180, 520, 80);

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel11.add(jTextField8);
        jTextField8.setBounds(30, 50, 60, 30);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Nombre del Solicitante:");
        jPanel11.add(jLabel37);
        jLabel37.setBounds(240, 30, 130, 20);

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox12);
        jComboBox12.setBounds(240, 50, 150, 30);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Nombre del operador:");
        jPanel11.add(jLabel38);
        jLabel38.setBounds(400, 30, 130, 20);

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox13);
        jComboBox13.setBounds(400, 50, 150, 30);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("3.- ¿Que trabajo ahi que hacer?");
        jPanel11.add(jLabel39);
        jLabel39.setBounds(380, 150, 170, 20);

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox15);
        jComboBox15.setBounds(200, 110, 170, 30);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Modalidad:");
        jPanel11.add(jLabel40);
        jLabel40.setBounds(200, 90, 130, 20);

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox16);
        jComboBox16.setBounds(380, 110, 170, 30);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Riesgos:");
        jPanel11.add(jLabel41);
        jLabel41.setBounds(380, 90, 130, 20);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Tipo de intervencion:");
        jPanel11.add(jLabel42);
        jLabel42.setBounds(30, 90, 130, 20);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("1.- ¿Que se ha malogrado?");
        jPanel11.add(jLabel43);
        jLabel43.setBounds(30, 150, 150, 20);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("2.- ¿Afecta a la produccion?");
        jPanel11.add(jLabel44);
        jLabel44.setBounds(200, 150, 150, 20);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Fecha Solicitada:");
        jPanel11.add(jLabel45);
        jLabel45.setBounds(100, 30, 90, 20);

        jPanel3.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("¿Quien entrega?");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(360, 70, 110, 20);

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 153, 153));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9);
        jTextField9.setBounds(10, 30, 90, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OTM", "Sistema", "Sub sistema"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 80, 230, 210);

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox14);
        jComboBox14.setBounds(360, 90, 140, 30);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("OTM:");
        jPanel3.add(jLabel47);
        jLabel47.setBounds(10, 10, 40, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("<html><p>Puede seleccionar OTM dentro del Listado:</p></html>");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(110, 10, 130, 60);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Grupo Id:");
        jPanel3.add(jLabel46);
        jLabel46.setBounds(250, 70, 60, 20);

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox18);
        jComboBox18.setBounds(250, 90, 90, 30);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Fecha de entrega");
        jPanel3.add(jLabel48);
        jLabel48.setBounds(250, 190, 110, 20);

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jTextField10);
        jTextField10.setBounds(250, 150, 90, 30);

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox19);
        jComboBox19.setBounds(250, 260, 140, 30);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("¿Quien entrega?");
        jPanel3.add(jLabel49);
        jLabel49.setBounds(360, 130, 110, 20);
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(250, 210, 140, 30);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Condicion del equipo:");
        jPanel3.add(jLabel50);
        jLabel50.setBounds(250, 240, 130, 20);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("Identidad:");
        jPanel3.add(jLabel51);
        jLabel51.setBounds(250, 130, 80, 20);

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox20);
        jComboBox20.setBounds(360, 150, 140, 30);

        jTabbedPane1.addTab("Entrega del trabajo terminado", jPanel3);

        jPanel4.setLayout(null);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane3.setViewportView(jTextArea4);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 490, 290);

        jTabbedPane1.addTab("Descripcion del tranbajo efectuado", jPanel4);

        jPanel11.add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 280, 520, 340);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Guardar");
        jPanel11.add(jButton6);
        jButton6.setBounds(470, 270, 77, 25);

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox17);
        jComboBox17.setBounds(30, 110, 160, 30);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(470, 50, 570, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Solicitud dialog = null;
                try {
                    dialog = new Solicitud(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(Solicitud.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    // End of variables declaration//GEN-END:variables
}
