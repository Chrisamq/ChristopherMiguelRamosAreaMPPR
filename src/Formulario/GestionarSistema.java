
package Formulario;

import Control.*;
import Entidad.*;
import Util.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class GestionarSistema extends javax.swing.JFrame {

   String estadoAccion="";
   //variables globales para validacion
    MultipleFiltro mf;
    ArrayList<MultipleFiltro> lista;
    Validacion v;
    public GestionarSistema() {
        initComponents();
    }
   private boolean camposNulos(String NombreSubSistema){
        boolean ver=false;
         Color color=new Color(250,128,114);
         
         if(NombreSubSistema.trim().equals("")){
           TxtNombreSubSistema.setBackground(color);
           TxtNombreSubSistema.setForeground(Color.black);
           ver=true;
         }
       
         return ver;
    }
 private boolean camposNulos(String AreaReferencias,String AreaPrecauciones){
        boolean ver=false;
         Color color=new Color(250,128,114);
         
         if(AreaReferencias.trim().equals("")){
           TxtAreaReferencias.setBackground(color);
           TxtAreaReferencias.setForeground(Color.black);
           ver=true;
         }
            
         if(AreaPrecauciones.trim().equals("")){
           TxtAreaPrecauciones.setBackground(color);
           TxtAreaPrecauciones.setForeground(Color.black);
           ver=true;
         }
         return ver;
    }
 
  private boolean camposNulos(String SecuenciaMecanico,String ResultadoMecanico,String LimitesMecanico){
        boolean ver=false;
         Color color=new Color(250,128,114);
         
         if(SecuenciaMecanico.trim().equals("")){
           txtSecuenciaMecanico.setBackground(color);
           txtSecuenciaMecanico.setForeground(Color.black);
           ver=true;
         }
            
         if(ResultadoMecanico.trim().equals("")){
           txtResultadoMecanico.setBackground(color);
           txtResultadoMecanico.setForeground(Color.black);
           ver=true;
         }
         if(LimitesMecanico.trim().equals("")){
           txtLimitesMecanico.setBackground(color);
           txtLimitesMecanico.setForeground(Color.black);
           ver=true;
         }
         return ver;
    }
       private boolean camposNulos(String NombreComponente,String Marca,String TipoDeMolde,String Ubicacion,String Serie){
        boolean ver=false;
         Color color=new Color(250,128,114);
         
         if(NombreComponente.trim().equals("")){
           txtNombreComponente.setBackground(color);
           txtNombreComponente.setForeground(Color.black);
           ver=true;
         }
            

         if(Marca.trim().equals("")){
           txtMarcaComponente.setBackground(color);
           txtMarcaComponente.setForeground(Color.black);
           ver=true;
         }
           if(TipoDeMolde.trim().equals("")){
           txtTipoMoldeComponente.setBackground(color);
           txtTipoMoldeComponente.setForeground(Color.black);
           ver=true;
         }
           if(TipoDeMolde.trim().equals("")){
           txtUbicacionComponente.setBackground(color);
           txtUbicacionComponente.setForeground(Color.black);
           ver=true;
         }
           if(Serie.trim().equals("")){
           txtSerieComponente.setBackground(color);
           txtSerieComponente.setForeground(Color.black);
           ver=true;
         }
           return ver;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton25 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtReferencias9 = new javax.swing.JTextArea();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jTextField20 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        PanelTabComponente = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtNombreComponente = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtAreaCaracteristicasComponentes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        btnNuevoComponente = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        ftiltrosComponentes = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtSerieComponente = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtTipoMoldeComponente = new javax.swing.JTextField();
        txtUbicacionComponente = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        CmbClaveComponente = new javax.swing.JComboBox();
        jLabel85 = new javax.swing.JLabel();
        txtMarcaComponente = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel69 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        TxtUbicacionFiltro = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        TxtFiltroCaja = new javax.swing.JTextField();
        TxtSistema = new javax.swing.JTextField();
        txtSubSistema = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtComponenteBuscar = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        ChkPlaca = new javax.swing.JCheckBox();
        txtCajaFiltro = new javax.swing.JTextField();
        TxtClaseFiltro = new javax.swing.JTextField();
        TxtTipoMoldeFiltro = new javax.swing.JTextField();
        TxtFrecuenciaFiltro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField24 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        TxtSerieFiltro = new javax.swing.JTextField();
        TxtMarcaFiltro = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtAreaEETT = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnActualizarFiltro = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnNuevoFiltro = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        TxtSistemaFiltroBuscar = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        TxtFiltroBuscar = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        btnBuscarListadoFiltro = new javax.swing.JButton();
        PanelSubSistema = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        TxtNombreSubSistema = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TxtAreaDescripcionSubSistema = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnNuevoSubsistema = new javax.swing.JButton();
        btnActualizarSubSistema = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        PanelEquipoSubsitema = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        ImgEquipotabSusbsistema = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAreaReferencias = new javax.swing.JTextArea();
        jLabel70 = new javax.swing.JLabel();
        btnEquipoDatos = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        lblTitletabEquipo = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TxtAreaPrecauciones = new javax.swing.JList();
        panelMecanicoSubSistema = new javax.swing.JPanel();
        lblTitleTabMecanico = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtSecuenciaMecanico = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtResultadoMecanico = new javax.swing.JTextArea();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtLimitesMecanico = new javax.swing.JTextArea();
        jLabel75 = new javax.swing.JLabel();
        btnGuardardatosMecanico = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        PanelElectricoSubSistema = new javax.swing.JPanel();
        lblTitleTabMecanico1 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtSecuenciaElectrico = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtResultadoElectrico = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtLimitesElectrico = new javax.swing.JTextArea();
        btnGuardardatosMecanico1 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        PanelElectronicoSubSistema = new javax.swing.JPanel();
        lblTitleTabMecanico2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txtSecuenciaElectronico = new javax.swing.JTextArea();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        txtResultadoElectronico = new javax.swing.JTextArea();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        txtLimitesElectronico = new javax.swing.JTextArea();
        btnGuardardatosElectronico = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHeader1.setText("Gestionar sistema");
        labelHeader1.setColor(new java.awt.Color(0, 51, 255));
        labelHeader1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jTabbedPane2.setToolTipText("");

        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Guardar");
        jPanel2.add(jButton2);
        jButton2.setBounds(400, 420, 115, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Sistema:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 60, 110, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Sub sistema:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 110, 110, 50);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Descripcion");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(520, 240, 110, 50);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laboratorios", "Recintos                   ", "Sistema de Ventilación ", "Servicios                  " }));
        jPanel2.add(jComboBox5);
        jComboBox5.setBounds(120, 70, 170, 30);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CQ23PR", "Del DP08JP al DP16JP, DP28JP al DP55JP y varios"},
                {"CQ16PR  ", "Recinto  Loc.36."},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(570, 80, 450, 150);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-derecha.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(470, 90, 50, 40);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("<html><p>Usted puede realizar la busqueda de sistemas, susbsistemas, componentes y subcomponentes con los parametros que se muestran en la parte derecha de esta pantalla.</p></html>");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(320, 10, 210, 80);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Controles y tarjetas.\nEquipos críticos: CA08AC, Calibrador isotópico \nCAPINTEC, CRC120R, SERIE 13106, Loc.36\n");
        jScrollPane1.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(570, 280, 450, 160);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Componentes:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(540, 40, 110, 50);

        jLabel3.setText("Asignar Subcomponente a sistema");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 420, 170, 20);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cromatologia Liquida", "asas"}
            },
            new String [] {
                "Subsistema", "Descripcion"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jPanel2.add(jScrollPane7);
        jScrollPane7.setBounds(120, 130, 400, 280);

        jTabbedPane2.addTab("Sistema", jPanel2);

        jPanel3.setLayout(null);

        jLabel38.setText("Buscar Sub sistema");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(330, 20, 140, 14);
        jPanel3.add(jTextField11);
        jTextField11.setBounds(330, 40, 160, 20);

        jLabel41.setText("Descripcion");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(20, 90, 80, 14);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cromatologia Liquida", "asas", null}
            },
            new String [] {
                "Sistema", "Descripcion", "Eliminar"
            }
        ));
        jScrollPane10.setViewportView(jTable9);

        jPanel3.add(jScrollPane10);
        jScrollPane10.setBounds(20, 290, 290, 180);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Listado de Sistemas");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(90, 270, 110, 16);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cromatologia Liquida", "asas", null}
            },
            new String [] {
                "Subsistema", "Descripcion", "Eliminar"
            }
        ));
        jScrollPane11.setViewportView(jTable10);

        jPanel3.add(jScrollPane11);
        jScrollPane11.setBounds(330, 150, 290, 320);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addthis-24.png"))); // NOI18N
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton21.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setMargin(new java.awt.Insets(2, 1, 2, 15));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21);
        jButton21.setBounds(180, 230, 30, 30);

        jLabel26.setText("Nuevo");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(140, 240, 40, 14);

        jLabel27.setText("Actualizar");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(220, 240, 50, 14);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setMargin(new java.awt.Insets(2, 1, 2, 35));
        jPanel3.add(jButton22);
        jButton22.setBounds(280, 230, 30, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("<html><p>Asignarle sub sistemas </p></html>");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(190, 70, 110, 40);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-derecha.png"))); // NOI18N
        jPanel3.add(jLabel43);
        jLabel43.setBounds(260, 70, 50, 40);

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox2.setText("Listado de sub sistemas");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox2);
        jCheckBox2.setBounds(330, 120, 160, 23);

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox3.setText("Sub Sistemas asignados a un sistema");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox3);
        jCheckBox3.setBounds(330, 100, 250, 25);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asigna.png"))); // NOI18N
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton25.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setMargin(new java.awt.Insets(2, 1, 2, 15));
        jPanel3.add(jButton25);
        jButton25.setBounds(330, 70, 30, 30);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Asignar Sub sistema a sistema");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(370, 80, 180, 16);

        txtReferencias9.setColumns(20);
        txtReferencias9.setRows(5);
        jScrollPane22.setViewportView(txtReferencias9);

        jPanel3.add(jScrollPane22);
        jScrollPane22.setBounds(20, 110, 290, 110);
        jPanel3.add(jTextField12);
        jTextField12.setBounds(20, 40, 190, 20);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sistema", "Sub Sistema", "Componoente", "Eliminar"
            }
        ));
        jScrollPane12.setViewportView(jTable11);

        jPanel3.add(jScrollPane12);
        jScrollPane12.setBounds(640, 150, 380, 320);
        jPanel3.add(jTextField20);
        jTextField20.setBounds(640, 40, 220, 20);

        jLabel60.setText("Buscar componente");
        jPanel3.add(jLabel60);
        jLabel60.setBounds(640, 20, 140, 14);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("<html><p>Asignar Componente a Subsistema</p></html>");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(680, 70, 200, 30);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asigna.png"))); // NOI18N
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton27.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setMargin(new java.awt.Insets(2, 1, 2, 15));
        jPanel3.add(jButton27);
        jButton27.setBounds(640, 70, 30, 30);

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox4.setText("Componentes asignados un Sub sistema");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox4);
        jCheckBox4.setBounds(640, 100, 250, 25);

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox5.setText("Listado de sub Componentes");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox5);
        jCheckBox5.setBounds(640, 120, 190, 23);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("<html><p>Asignarle componentes</p></html>");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(500, 10, 90, 80);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-derecha.png"))); // NOI18N
        jPanel3.add(jLabel64);
        jLabel64.setBounds(580, 30, 50, 40);

        jLabel40.setText("Nombre de Sistema");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(20, 20, 140, 14);

        jTabbedPane2.addTab("Sistemas y subsistemas", jPanel3);

        PanelTabComponente.setLayout(null);

        jLabel34.setText("Nombre de Componente");
        PanelTabComponente.add(jLabel34);
        jLabel34.setBounds(20, 30, 140, 14);

        txtNombreComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreComponenteActionPerformed(evt);
            }
        });
        txtNombreComponente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreComponenteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreComponenteKeyTyped(evt);
            }
        });
        PanelTabComponente.add(txtNombreComponente);
        txtNombreComponente.setBounds(20, 50, 260, 20);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Listado de Componentes");
        PanelTabComponente.add(jLabel35);
        jLabel35.setBounds(640, 30, 180, 20);

        jLabel36.setText("Caracteristicas");
        PanelTabComponente.add(jLabel36);
        jLabel36.setBounds(20, 230, 80, 14);

        txtAreaCaracteristicasComponentes.setColumns(20);
        txtAreaCaracteristicasComponentes.setRows(5);
        jScrollPane19.setViewportView(txtAreaCaracteristicasComponentes);

        PanelTabComponente.add(jScrollPane19);
        jScrollPane19.setBounds(20, 260, 420, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Component.png"))); // NOI18N
        PanelTabComponente.add(jLabel2);
        jLabel2.setBounds(950, 10, 70, 70);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CQ22PR", "Lab. 20", "Equipos criticos:  Equipos con identificación y/o del proceso:  Epirradiador, Calefactor agitador, Horno sublimación, Calibrador de dosis, Registrador de actividad, Cámara de calibración.     ", null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Eliminar"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        PanelTabComponente.add(jScrollPane8);
        jScrollPane8.setBounds(460, 60, 560, 360);

        btnNuevoComponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addthis-24.png"))); // NOI18N
        btnNuevoComponente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoComponente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnNuevoComponente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoComponente.setMargin(new java.awt.Insets(2, 1, 2, 15));
        btnNuevoComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoComponenteActionPerformed(evt);
            }
        });
        PanelTabComponente.add(btnNuevoComponente);
        btnNuevoComponente.setBounds(310, 430, 30, 30);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setMargin(new java.awt.Insets(2, 1, 2, 35));
        PanelTabComponente.add(jButton18);
        jButton18.setBounds(410, 430, 30, 30);

        ftiltrosComponentes.setText("Filtros");
        ftiltrosComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftiltrosComponentesActionPerformed(evt);
            }
        });
        PanelTabComponente.add(ftiltrosComponentes);
        ftiltrosComponentes.setBounds(220, 100, 60, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDeTrabajo.png"))); // NOI18N
        PanelTabComponente.add(jLabel5);
        jLabel5.setBounds(370, 20, 70, 80);

        jLabel14.setText("Nuevo");
        PanelTabComponente.add(jLabel14);
        jLabel14.setBounds(270, 440, 40, 14);

        jLabel15.setText("Actualizar");
        PanelTabComponente.add(jLabel15);
        jLabel15.setBounds(350, 440, 50, 14);

        jLabel59.setText("Serie:");
        PanelTabComponente.add(jLabel59);
        jLabel59.setBounds(20, 180, 40, 14);

        txtSerieComponente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSerieComponenteKeyPressed(evt);
            }
        });
        PanelTabComponente.add(txtSerieComponente);
        txtSerieComponente.setBounds(20, 200, 100, 20);

        jLabel67.setText("Tipo de molde:");
        PanelTabComponente.add(jLabel67);
        jLabel67.setBounds(130, 130, 80, 14);

        txtTipoMoldeComponente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoMoldeComponenteKeyPressed(evt);
            }
        });
        PanelTabComponente.add(txtTipoMoldeComponente);
        txtTipoMoldeComponente.setBounds(130, 150, 170, 20);

        txtUbicacionComponente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUbicacionComponenteKeyPressed(evt);
            }
        });
        PanelTabComponente.add(txtUbicacionComponente);
        txtUbicacionComponente.setBounds(310, 150, 130, 20);

        jLabel68.setText("Clave:");
        PanelTabComponente.add(jLabel68);
        jLabel68.setBounds(130, 180, 60, 14);

        jLabel84.setText("Ubicacion:");
        PanelTabComponente.add(jLabel84);
        jLabel84.setBounds(310, 130, 60, 14);

        CmbClaveComponente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PanelTabComponente.add(CmbClaveComponente);
        CmbClaveComponente.setBounds(130, 200, 170, 20);

        jLabel85.setText("Marca:");
        PanelTabComponente.add(jLabel85);
        jLabel85.setBounds(20, 130, 40, 14);

        txtMarcaComponente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaComponenteKeyPressed(evt);
            }
        });
        PanelTabComponente.add(txtMarcaComponente);
        txtMarcaComponente.setBounds(20, 150, 100, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PanelTabComponente.add(jComboBox3);
        jComboBox3.setBounds(20, 100, 40, 20);

        jLabel69.setText("Identificacion");
        PanelTabComponente.add(jLabel69);
        jLabel69.setBounds(20, 80, 140, 14);
        PanelTabComponente.add(jTextField30);
        jTextField30.setBounds(70, 100, 40, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PanelTabComponente.add(jComboBox4);
        jComboBox4.setBounds(120, 100, 40, 20);

        jTabbedPane2.addTab("Componentes", PanelTabComponente);

        jPanel5.setLayout(null);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CF04T", null, null, null, "Filtro Rotation, inyection", "Se instalaron 04 filtros absolutos MArca: AIRGUARD Modelo: VAriplus ", null}
            },
            new String [] {
                "Codigo Filtro", "Sistema", "Sub Sistema", "Componoente", "Nombre ", "Descripcion", "Eliminar"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        jPanel5.add(jScrollPane9);
        jScrollPane9.setBounds(20, 320, 450, 150);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Listado de Filtros");
        jPanel5.add(jLabel42);
        jLabel42.setBounds(170, 250, 130, 20);

        jLabel44.setText("Filtro Caja:");
        jPanel5.add(jLabel44);
        jLabel44.setBounds(40, 70, 60, 14);

        jLabel45.setText("Clase:");
        jPanel5.add(jLabel45);
        jLabel45.setBounds(210, 100, 30, 14);
        jPanel5.add(TxtUbicacionFiltro);
        TxtUbicacionFiltro.setBounds(370, 70, 70, 20);

        jLabel46.setText("Sistema:");
        jPanel5.add(jLabel46);
        jLabel46.setBounds(180, 40, 41, 14);
        jPanel5.add(TxtFiltroCaja);
        TxtFiltroCaja.setBounds(100, 70, 210, 20);
        jPanel5.add(TxtSistema);
        TxtSistema.setBounds(230, 40, 180, 20);
        jPanel5.add(txtSubSistema);
        txtSubSistema.setBounds(490, 40, 210, 20);

        jLabel47.setText("Sub Sistema:");
        jPanel5.add(jLabel47);
        jLabel47.setBounds(420, 40, 70, 14);

        jLabel48.setText("Componentes:");
        jPanel5.add(jLabel48);
        jLabel48.setBounds(710, 40, 70, 14);

        txtComponenteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComponenteBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(txtComponenteBuscar);
        txtComponenteBuscar.setBounds(790, 40, 200, 20);

        jLabel49.setText("Caja de Filtro:");
        jPanel5.add(jLabel49);
        jLabel49.setBounds(30, 40, 80, 14);

        jLabel50.setText("Ubicacion:");
        jPanel5.add(jLabel50);
        jLabel50.setBounds(320, 70, 60, 14);

        jLabel52.setText("Tipo de molde:");
        jPanel5.add(jLabel52);
        jLabel52.setBounds(590, 70, 80, 14);

        jLabel53.setText("Serie:");
        jPanel5.add(jLabel53);
        jLabel53.setBounds(880, 70, 50, 14);

        jLabel54.setText("EETT(Especificaciones tecnicas):");
        jPanel5.add(jLabel54);
        jLabel54.setBounds(20, 130, 170, 14);

        ChkPlaca.setText("Placa");
        jPanel5.add(ChkPlaca);
        ChkPlaca.setBounds(350, 100, 60, 23);
        jPanel5.add(txtCajaFiltro);
        txtCajaFiltro.setBounds(100, 40, 70, 20);
        jPanel5.add(TxtClaseFiltro);
        TxtClaseFiltro.setBounds(250, 100, 90, 20);
        jPanel5.add(TxtTipoMoldeFiltro);
        TxtTipoMoldeFiltro.setBounds(660, 70, 210, 20);
        jPanel5.add(TxtFrecuenciaFiltro);
        TxtFrecuenciaFiltro.setBounds(100, 100, 90, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Datos De Filtro");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(420, 10, 100, 16);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adiconales"));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/New_document-32.png"))); // NOI18N
        jButton1.setBorder(null);
        jPanel6.add(jButton1);
        jButton1.setBounds(160, 270, 40, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_disk-32.png"))); // NOI18N
        jPanel6.add(jButton3);
        jButton3.setBounds(200, 270, 40, 40);

        jLabel51.setText("hr- H:");
        jPanel6.add(jLabel51);
        jLabel51.setBounds(20, 50, 40, 14);
        jPanel6.add(jLabel56);
        jLabel56.setBounds(20, 80, 210, 0);
        jPanel6.add(jDateChooser1);
        jDateChooser1.setBounds(70, 20, 160, 20);
        jPanel6.add(jTextField24);
        jTextField24.setBounds(70, 50, 110, 20);

        jLabel57.setText("Fecha:");
        jPanel6.add(jLabel57);
        jLabel57.setBounds(20, 20, 40, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("AIRGUARD, Mod.: 6HCB YTS, Auto Roll , 65 6/8\" x 65' x 2 1/2\"");
        jScrollPane3.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(20, 120, 220, 120);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("<html><p>Usted puede realizar la busqueda de sistemas, susbsistemas, componentes y subcomponentes con los parametros que se muestran en la parte derecha de esta pantalla.</p></html>");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(320, 10, 210, 80);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("<html><p>Descripcion (Numero de filtros cambiados o trabajos importantes efectuados):</p></html>");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(20, 70, 230, 50);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(480, 150, 260, 320);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado y Graficos"));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(null);

        jLabel8.setText("Concurrencia de cambio de filtro");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(20, 20, 160, 14);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("<html><p>Presiona si desear cambiar o ver la imagen del filtro:</p></html>");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(20, 260, 140, 50);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Picture_-64.png"))); // NOI18N
        jPanel8.add(jButton7);
        jButton7.setBounds(160, 250, 80, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"28/16/88", "1.5"},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "hr- H"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel8.add(jScrollPane4);
        jScrollPane4.setBounds(20, 50, 220, 190);

        jPanel5.add(jPanel8);
        jPanel8.setBounds(760, 150, 260, 320);

        jLabel55.setText("Marca:");
        jPanel5.add(jLabel55);
        jLabel55.setBounds(450, 70, 40, 14);
        jPanel5.add(TxtSerieFiltro);
        TxtSerieFiltro.setBounds(910, 70, 110, 20);
        jPanel5.add(TxtMarcaFiltro);
        TxtMarcaFiltro.setBounds(490, 70, 90, 20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jPanel5.add(jButton5);
        jButton5.setBounds(1000, 40, 20, 20);

        TxtAreaEETT.setColumns(20);
        TxtAreaEETT.setRows(5);
        jScrollPane5.setViewportView(TxtAreaEETT);

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(20, 150, 450, 90);

        jLabel58.setText("Frecuencia:");
        jPanel5.add(jLabel58);
        jLabel58.setBounds(40, 100, 60, 14);
        jPanel5.add(jLabel12);
        jLabel12.setBounds(410, 100, 50, 0);

        btnActualizarFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        btnActualizarFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarFiltro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizarFiltro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarFiltro.setMargin(new java.awt.Insets(2, 1, 2, 35));
        btnActualizarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarFiltroActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizarFiltro);
        btnActualizarFiltro.setBounds(550, 100, 30, 30);

        jLabel16.setText("Actualizar");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(490, 90, 50, 40);

        btnNuevoFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addthis-24.png"))); // NOI18N
        btnNuevoFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoFiltro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnNuevoFiltro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoFiltro.setMargin(new java.awt.Insets(2, 1, 2, 15));
        jPanel5.add(btnNuevoFiltro);
        btnNuevoFiltro.setBounds(450, 100, 30, 30);

        jLabel23.setText("Nuevo");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(410, 90, 40, 40);

        jLabel33.setText("Sistema");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(20, 280, 37, 14);
        jPanel5.add(TxtSistemaFiltroBuscar);
        TxtSistemaFiltroBuscar.setBounds(70, 280, 80, 20);

        jLabel65.setText("Sistema");
        jPanel5.add(jLabel65);
        jLabel65.setBounds(20, 280, 37, 14);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(70, 280, 6, 20);
        jPanel5.add(TxtFiltroBuscar);
        TxtFiltroBuscar.setBounds(190, 280, 80, 20);

        jLabel66.setText("Filtro");
        jPanel5.add(jLabel66);
        jLabel66.setBounds(160, 280, 24, 14);

        btnBuscarListadoFiltro.setText("Buscar");
        jPanel5.add(btnBuscarListadoFiltro);
        btnBuscarListadoFiltro.setBounds(280, 280, 65, 23);

        jTabbedPane2.addTab("Filtros (componentes)", jPanel5);

        PanelSubSistema.setLayout(null);

        jLabel61.setText("Nombre de Sub sistema");
        PanelSubSistema.add(jLabel61);
        jLabel61.setBounds(20, 30, 140, 14);

        TxtNombreSubSistema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNombreSubSistemaKeyPressed(evt);
            }
        });
        PanelSubSistema.add(TxtNombreSubSistema);
        TxtNombreSubSistema.setBounds(20, 50, 260, 20);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Listado de Componentes");
        PanelSubSistema.add(jLabel62);
        jLabel62.setBounds(90, 220, 180, 20);

        jLabel63.setText("Descripcion");
        PanelSubSistema.add(jLabel63);
        jLabel63.setBounds(20, 80, 80, 14);

        TxtAreaDescripcionSubSistema.setColumns(20);
        TxtAreaDescripcionSubSistema.setRows(5);
        jScrollPane20.setViewportView(TxtAreaDescripcionSubSistema);

        PanelSubSistema.add(jScrollPane20);
        jScrollPane20.setBounds(20, 100, 390, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Component.png"))); // NOI18N
        PanelSubSistema.add(jLabel4);
        jLabel4.setBounds(970, 0, 70, 70);

        btnNuevoSubsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addthis-24.png"))); // NOI18N
        btnNuevoSubsistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoSubsistema.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnNuevoSubsistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoSubsistema.setMargin(new java.awt.Insets(2, 1, 2, 15));
        btnNuevoSubsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoSubsistemaActionPerformed(evt);
            }
        });
        PanelSubSistema.add(btnNuevoSubsistema);
        btnNuevoSubsistema.setBounds(280, 430, 30, 30);

        btnActualizarSubSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        btnActualizarSubSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarSubSistema.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizarSubSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarSubSistema.setMargin(new java.awt.Insets(2, 1, 2, 35));
        PanelSubSistema.add(btnActualizarSubSistema);
        btnActualizarSubSistema.setBounds(380, 430, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDeTrabajo.png"))); // NOI18N
        PanelSubSistema.add(jLabel6);
        jLabel6.setBounds(340, 0, 80, 110);

        jLabel21.setText("Nuevo");
        PanelSubSistema.add(jLabel21);
        jLabel21.setBounds(240, 440, 40, 14);

        jLabel31.setText("Actualizar");
        PanelSubSistema.add(jLabel31);
        jLabel31.setBounds(320, 440, 50, 14);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cromatologia Liquida", "asas", null}
            },
            new String [] {
                "Subsistema", "Descripcion", "Eliminar"
            }
        ));
        jScrollPane13.setViewportView(jTable12);

        PanelSubSistema.add(jScrollPane13);
        jScrollPane13.setBounds(20, 240, 390, 180);

        jTabbedPane3.setToolTipText("");

        PanelEquipoSubsitema.setLayout(null);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Guardar");
        PanelEquipoSubsitema.add(jButton8);
        jButton8.setBounds(120, 270, 115, 25);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Cancelar");
        PanelEquipoSubsitema.add(jButton9);
        jButton9.setBounds(140, 380, 115, 25);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inagen de equipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel12.setLayout(null);

        jPanel13.setLayout(null);

        ImgEquipotabSusbsistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgEquipotabSusbsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-128.png"))); // NOI18N
        jPanel13.add(ImgEquipotabSusbsistema);
        ImgEquipotabSusbsistema.setBounds(0, 0, 200, 190);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(10, 20, 200, 190);

        PanelEquipoSubsitema.add(jPanel12);
        jPanel12.setBounds(20, 40, 220, 220);

        TxtAreaReferencias.setColumns(20);
        TxtAreaReferencias.setRows(5);
        jScrollPane2.setViewportView(TxtAreaReferencias);

        PanelEquipoSubsitema.add(jScrollPane2);
        jScrollPane2.setBounds(260, 270, 300, 130);

        jLabel70.setText("Referencias");
        PanelEquipoSubsitema.add(jLabel70);
        jLabel70.setBounds(260, 250, 80, 14);

        btnEquipoDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEquipoDatos.setText("Guardar");
        btnEquipoDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoDatosActionPerformed(evt);
            }
        });
        PanelEquipoSubsitema.add(btnEquipoDatos);
        btnEquipoDatos.setBounds(20, 380, 115, 25);

        jLabel71.setText("Precauciones");
        PanelEquipoSubsitema.add(jLabel71);
        jLabel71.setBounds(260, 30, 80, 14);

        lblTitletabEquipo.setText("Caja de Guantes S-32,Produccion");
        PanelEquipoSubsitema.add(lblTitletabEquipo);
        lblTitletabEquipo.setBounds(20, 10, 170, 14);

        TxtAreaPrecauciones.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(TxtAreaPrecauciones);

        PanelEquipoSubsitema.add(jScrollPane14);
        jScrollPane14.setBounds(260, 50, 300, 200);

        jTabbedPane3.addTab("Equipos", PanelEquipoSubsitema);

        panelMecanicoSubSistema.setLayout(null);

        lblTitleTabMecanico.setText("Caja de Guantes S-32,Produccion");
        panelMecanicoSubSistema.add(lblTitleTabMecanico);
        lblTitleTabMecanico.setBounds(20, 10, 170, 14);

        jLabel72.setText("Secuencia de actividades");
        panelMecanicoSubSistema.add(jLabel72);
        jLabel72.setBounds(20, 50, 140, 14);

        txtSecuenciaMecanico.setColumns(20);
        txtSecuenciaMecanico.setRows(5);
        jScrollPane16.setViewportView(txtSecuenciaMecanico);

        panelMecanicoSubSistema.add(jScrollPane16);
        jScrollPane16.setBounds(20, 70, 530, 120);

        jLabel73.setText("Resultados esperados");
        panelMecanicoSubSistema.add(jLabel73);
        jLabel73.setBounds(20, 200, 150, 14);

        txtResultadoMecanico.setColumns(20);
        txtResultadoMecanico.setRows(5);
        jScrollPane17.setViewportView(txtResultadoMecanico);

        panelMecanicoSubSistema.add(jScrollPane17);
        jScrollPane17.setBounds(20, 220, 410, 70);

        jLabel74.setText("Limites de aceptacion");
        panelMecanicoSubSistema.add(jLabel74);
        jLabel74.setBounds(20, 300, 130, 14);

        txtLimitesMecanico.setColumns(20);
        txtLimitesMecanico.setRows(5);
        jScrollPane18.setViewportView(txtLimitesMecanico);

        panelMecanicoSubSistema.add(jScrollPane18);
        jScrollPane18.setBounds(20, 320, 410, 50);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construction_worker-128.png"))); // NOI18N
        panelMecanicoSubSistema.add(jLabel75);
        jLabel75.setBounds(430, 240, 120, 130);

        btnGuardardatosMecanico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardardatosMecanico.setText("Guardar");
        btnGuardardatosMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardardatosMecanicoActionPerformed(evt);
            }
        });
        panelMecanicoSubSistema.add(btnGuardardatosMecanico);
        btnGuardardatosMecanico.setBounds(320, 380, 115, 25);

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("Cancelar");
        panelMecanicoSubSistema.add(jButton16);
        jButton16.setBounds(440, 380, 115, 25);

        jTabbedPane3.addTab("Mecanico", panelMecanicoSubSistema);

        PanelElectricoSubSistema.setLayout(null);

        lblTitleTabMecanico1.setText("Caja de Guantes S-32,Produccion");
        PanelElectricoSubSistema.add(lblTitleTabMecanico1);
        lblTitleTabMecanico1.setBounds(20, 10, 170, 14);

        jLabel76.setText("Secuencia de actividades");
        PanelElectricoSubSistema.add(jLabel76);
        jLabel76.setBounds(20, 50, 140, 14);

        txtSecuenciaElectrico.setColumns(20);
        txtSecuenciaElectrico.setRows(5);
        jScrollPane23.setViewportView(txtSecuenciaElectrico);

        PanelElectricoSubSistema.add(jScrollPane23);
        jScrollPane23.setBounds(20, 70, 530, 120);

        jLabel77.setText("Resultados esperados");
        PanelElectricoSubSistema.add(jLabel77);
        jLabel77.setBounds(20, 200, 150, 14);

        txtResultadoElectrico.setColumns(20);
        txtResultadoElectrico.setRows(5);
        jScrollPane24.setViewportView(txtResultadoElectrico);

        PanelElectricoSubSistema.add(jScrollPane24);
        jScrollPane24.setBounds(20, 220, 410, 70);

        jLabel78.setText("Limites de aceptacion");
        PanelElectricoSubSistema.add(jLabel78);
        jLabel78.setBounds(20, 300, 130, 14);

        txtLimitesElectrico.setColumns(20);
        txtLimitesElectrico.setRows(5);
        jScrollPane25.setViewportView(txtLimitesElectrico);

        PanelElectricoSubSistema.add(jScrollPane25);
        jScrollPane25.setBounds(20, 320, 410, 50);

        btnGuardardatosMecanico1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardardatosMecanico1.setText("Guardar");
        btnGuardardatosMecanico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardardatosMecanico1ActionPerformed(evt);
            }
        });
        PanelElectricoSubSistema.add(btnGuardardatosMecanico1);
        btnGuardardatosMecanico1.setBounds(320, 380, 115, 25);

        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton29.setText("Cancelar");
        PanelElectricoSubSistema.add(jButton29);
        jButton29.setBounds(440, 380, 115, 25);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construction_worker-128.png"))); // NOI18N
        PanelElectricoSubSistema.add(jLabel79);
        jLabel79.setBounds(430, 240, 120, 130);

        jTabbedPane3.addTab("Electrico", PanelElectricoSubSistema);

        PanelElectronicoSubSistema.setLayout(null);

        lblTitleTabMecanico2.setText("Caja de Guantes S-32,Produccion");
        PanelElectronicoSubSistema.add(lblTitleTabMecanico2);
        lblTitleTabMecanico2.setBounds(20, 10, 170, 14);

        jLabel80.setText("Secuencia de actividades");
        PanelElectronicoSubSistema.add(jLabel80);
        jLabel80.setBounds(20, 50, 140, 14);

        txtSecuenciaElectronico.setColumns(20);
        txtSecuenciaElectronico.setRows(5);
        jScrollPane26.setViewportView(txtSecuenciaElectronico);

        PanelElectronicoSubSistema.add(jScrollPane26);
        jScrollPane26.setBounds(20, 70, 530, 120);

        jLabel81.setText("Resultados esperados");
        PanelElectronicoSubSistema.add(jLabel81);
        jLabel81.setBounds(20, 200, 150, 14);

        txtResultadoElectronico.setColumns(20);
        txtResultadoElectronico.setRows(5);
        jScrollPane27.setViewportView(txtResultadoElectronico);

        PanelElectronicoSubSistema.add(jScrollPane27);
        jScrollPane27.setBounds(20, 220, 410, 70);

        jLabel82.setText("Limites de aceptacion");
        PanelElectronicoSubSistema.add(jLabel82);
        jLabel82.setBounds(20, 300, 130, 14);

        txtLimitesElectronico.setColumns(20);
        txtLimitesElectronico.setRows(5);
        jScrollPane28.setViewportView(txtLimitesElectronico);

        PanelElectronicoSubSistema.add(jScrollPane28);
        jScrollPane28.setBounds(20, 320, 410, 50);

        btnGuardardatosElectronico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardardatosElectronico.setText("Guardar");
        btnGuardardatosElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardardatosElectronicoActionPerformed(evt);
            }
        });
        PanelElectronicoSubSistema.add(btnGuardardatosElectronico);
        btnGuardardatosElectronico.setBounds(320, 380, 115, 25);

        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton30.setText("Cancelar");
        PanelElectronicoSubSistema.add(jButton30);
        jButton30.setBounds(440, 380, 115, 25);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/construction_worker-128.png"))); // NOI18N
        PanelElectronicoSubSistema.add(jLabel83);
        jLabel83.setBounds(430, 240, 120, 130);

        jTabbedPane3.addTab("Electronico", PanelElectronicoSubSistema);

        PanelSubSistema.add(jTabbedPane3);
        jTabbedPane3.setBounds(440, 10, 580, 450);

        jTabbedPane2.addTab("Sub sistema", PanelSubSistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void txtNombreComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreComponenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreComponenteActionPerformed

    private void txtNombreComponenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComponenteKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code==17||code==86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreComponenteKeyPressed

    private void txtNombreComponenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComponenteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreComponenteKeyTyped

    private void btnNuevoComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoComponenteActionPerformed
        E_Componente objComponente =new E_Componente();
        Util U = new Util();
        try{
            U.RestaurarValorForm(PanelTabComponente);
            if(camposNulos(txtNombreComponente.getText(), txtMarcaComponente.getText(),
                txtTipoMoldeComponente.getText(), txtUbicacionComponente.getText(), txtSerieComponente.getText()))
        {
            JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            objComponente.setNombreComponente(txtNombreComponente.getText().trim());
            //objComponente.setCodigo(txtCodigoComponente.getText().trim());
            objComponente.setMarca(txtMarcaComponente.getText().trim());
            objComponente.setTipoDeMolde(txtTipoMoldeComponente.getText().trim());
            objComponente.setUbicacion(txtUbicacionComponente.getText().trim());
            objComponente.setSerie(txtSerieComponente.getText().trim());
            objComponente.setSerie(txtAreaCaracteristicasComponentes.getText().trim());

            C_Componente ctrl = new C_Componente();
            ctrl.registrarComponente(objComponente);

            ctrl.listarComponente();

        }

        }
        catch(Exception ex)
        {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoComponenteActionPerformed

    private void ftiltrosComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftiltrosComponentesActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ftiltrosComponentesActionPerformed

    private void txtSerieComponenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieComponenteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieComponenteKeyPressed

    private void txtTipoMoldeComponenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoMoldeComponenteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoMoldeComponenteKeyPressed

    private void txtUbicacionComponenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacionComponenteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionComponenteKeyPressed

    private void txtMarcaComponenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaComponenteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaComponenteKeyPressed

    private void txtComponenteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComponenteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComponenteBuscarActionPerformed

    private void btnActualizarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarFiltroActionPerformed

    private void TxtNombreSubSistemaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreSubSistemaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreSubSistemaKeyPressed

    private void btnNuevoSubsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoSubsistemaActionPerformed
        E_Sub_Sistema objSubSistema =new E_Sub_Sistema();
        Util U = new Util();
        try{
            U.RestaurarValorForm(PanelSubSistema);
            if(camposNulos(TxtNombreSubSistema.getText()))
            {
                JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                objSubSistema.setNombreSubSistema(TxtNombreSubSistema.getText().trim());
                objSubSistema.setDescripcion(TxtAreaDescripcionSubSistema.getText().trim());

                C_SubSistema ctrl = new C_SubSistema();
                ctrl.registrarSubSistema(objSubSistema);

                ctrl.listarSubSistema();

            }

        }
        catch(Exception ex)
        {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoSubsistemaActionPerformed

    private void btnEquipoDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoDatosActionPerformed
        E_Sub_Sistema objSubSistema =new E_Sub_Sistema();
        Util U = new Util();
        try{
            U.RestaurarValorForm(PanelEquipoSubsitema);
            if(camposNulos(TxtAreaReferencias.getText()))
            {
                JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
            }
            else
            {

                objSubSistema.setReferencias(TxtAreaReferencias.getText().trim());
               // objSubSistema.setPrecauciones(TxtAreaPrecauciones.getText().trim());

                C_SubSistema ctrl = new C_SubSistema();
                ctrl.registrarSubSistema(objSubSistema);

                ctrl.listarSubSistema();

            }

        }
        catch(Exception ex)
        {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEquipoDatosActionPerformed

    private void btnGuardardatosMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardardatosMecanicoActionPerformed
        E_Sub_Sistema objSubSistema =new E_Sub_Sistema();
        Util U = new Util();
        try{
            U.RestaurarValorForm(panelMecanicoSubSistema);
            if(camposNulos(txtSecuenciaMecanico.getText(),txtResultadoMecanico.getText(),txtLimitesMecanico.getText()))
            {
                JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
            }
            else
            {

                objSubSistema.setSecuenciaMecanico(txtSecuenciaMecanico.getText().trim());
                objSubSistema.setResultadoMecanico(txtResultadoMecanico.getText().trim());
                objSubSistema.setLimitesMecanico(txtLimitesMecanico.getText().trim());

                C_SubSistema ctrl = new C_SubSistema();
                ctrl.registrarSubSistema(objSubSistema);

                ctrl.listarSubSistema();

            }

        }
        catch(Exception ex)
        {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardardatosMecanicoActionPerformed

    private void btnGuardardatosMecanico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardardatosMecanico1ActionPerformed
        E_Sub_Sistema objSubSistema =new E_Sub_Sistema();
        Util U = new Util();
        try{
            U.RestaurarValorForm(PanelElectricoSubSistema);
            if(camposNulos(txtSecuenciaElectrico.getText(),txtResultadoElectrico.getText(),txtLimitesElectrico.getText()))
            {
                JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
            }
            else
            {

                objSubSistema.setSecuenciaElectrico(txtSecuenciaElectrico.getText().trim());
                objSubSistema.setResultadoElectrico(txtResultadoElectrico.getText().trim());
                objSubSistema.setLimitesElectrico(txtLimitesElectrico.getText().trim());

                C_SubSistema ctrl = new C_SubSistema();
                ctrl.registrarSubSistema(objSubSistema);

                ctrl.listarSubSistema();

            }

        }
        catch(Exception ex)
        {

        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardardatosMecanico1ActionPerformed

    private void btnGuardardatosElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardardatosElectronicoActionPerformed
        E_Sub_Sistema objSubSistema =new E_Sub_Sistema();
        Util U = new Util();
        try{
            U.RestaurarValorForm(PanelElectronicoSubSistema);
            if(camposNulos(txtSecuenciaElectronico.getText(),txtResultadoElectronico.getText(),txtLimitesElectronico.getText()))
            {
                JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
            }
            else
            {

                objSubSistema.setSecuenciaElectronico(txtSecuenciaElectronico.getText().trim());
                objSubSistema.setResultadoElectronico(txtResultadoElectronico.getText().trim());
                objSubSistema.setLimitesElectronico(txtLimitesElectronico.getText().trim());

                C_SubSistema ctrl = new C_SubSistema();
                ctrl.registrarSubSistema(objSubSistema);

                ctrl.listarSubSistema();

            }

        }
        catch(Exception ex)
        {

        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardardatosElectronicoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkPlaca;
    private javax.swing.JComboBox CmbClaveComponente;
    private javax.swing.JLabel ImgEquipotabSusbsistema;
    private javax.swing.JPanel PanelElectricoSubSistema;
    private javax.swing.JPanel PanelElectronicoSubSistema;
    private javax.swing.JPanel PanelEquipoSubsitema;
    private javax.swing.JPanel PanelSubSistema;
    private javax.swing.JPanel PanelTabComponente;
    private javax.swing.JTextArea TxtAreaDescripcionSubSistema;
    private javax.swing.JTextArea TxtAreaEETT;
    private javax.swing.JList TxtAreaPrecauciones;
    private javax.swing.JTextArea TxtAreaReferencias;
    private javax.swing.JTextField TxtClaseFiltro;
    private javax.swing.JTextField TxtFiltroBuscar;
    private javax.swing.JTextField TxtFiltroCaja;
    private javax.swing.JTextField TxtFrecuenciaFiltro;
    private javax.swing.JTextField TxtMarcaFiltro;
    private javax.swing.JTextField TxtNombreSubSistema;
    private javax.swing.JTextField TxtSerieFiltro;
    private javax.swing.JTextField TxtSistema;
    private javax.swing.JTextField TxtSistemaFiltroBuscar;
    private javax.swing.JTextField TxtTipoMoldeFiltro;
    private javax.swing.JTextField TxtUbicacionFiltro;
    private javax.swing.JButton btnActualizarFiltro;
    private javax.swing.JButton btnActualizarSubSistema;
    private javax.swing.JButton btnBuscarListadoFiltro;
    private javax.swing.JButton btnEquipoDatos;
    private javax.swing.JButton btnGuardardatosElectronico;
    private javax.swing.JButton btnGuardardatosMecanico;
    private javax.swing.JButton btnGuardardatosMecanico1;
    private javax.swing.JButton btnNuevoComponente;
    private javax.swing.JButton btnNuevoFiltro;
    private javax.swing.JButton btnNuevoSubsistema;
    private javax.swing.JCheckBox ftiltrosComponentes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField30;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private javax.swing.JLabel lblTitleTabMecanico;
    private javax.swing.JLabel lblTitleTabMecanico1;
    private javax.swing.JLabel lblTitleTabMecanico2;
    private javax.swing.JLabel lblTitletabEquipo;
    private javax.swing.JPanel panelMecanicoSubSistema;
    private javax.swing.JTextArea txtAreaCaracteristicasComponentes;
    private javax.swing.JTextField txtCajaFiltro;
    private javax.swing.JTextField txtComponenteBuscar;
    private javax.swing.JTextArea txtLimitesElectrico;
    private javax.swing.JTextArea txtLimitesElectronico;
    private javax.swing.JTextArea txtLimitesMecanico;
    private javax.swing.JTextField txtMarcaComponente;
    private javax.swing.JTextField txtNombreComponente;
    private javax.swing.JTextArea txtReferencias9;
    private javax.swing.JTextArea txtResultadoElectrico;
    private javax.swing.JTextArea txtResultadoElectronico;
    private javax.swing.JTextArea txtResultadoMecanico;
    private javax.swing.JTextArea txtSecuenciaElectrico;
    private javax.swing.JTextArea txtSecuenciaElectronico;
    private javax.swing.JTextArea txtSecuenciaMecanico;
    private javax.swing.JTextField txtSerieComponente;
    private javax.swing.JTextField txtSubSistema;
    private javax.swing.JTextField txtTipoMoldeComponente;
    private javax.swing.JTextField txtUbicacionComponente;
    // End of variables declaration//GEN-END:variables
}
