package Formulario;
import Control.*;
import Entidad.*;
import Util.*;
import java.awt.Color;
import java.awt.Image;
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
public class GestionarPersonal extends javax.swing.JDialog {

    String estadoAccion="";
   //variables globales para validacion
    MultipleFiltro mf;
    ArrayList<MultipleFiltro> lista;
    Validacion v;
    
    public GestionarPersonal(java.awt.Frame parent, boolean modal) throws Exception {
         super(parent, modal);
        initComponents();
       //limitar el numero de caracteres de los campos
        txtCodigo.setDocument(new LimiteJTextField(5));
        
        
        
        this.setLocationRelativeTo(null);
        mostrarListadoPersonal();
        llenarACombo();
        cargarImagenFotoNull();
    }
   private void restaurarValoresDiseno(){
         Color colorbg=new Color(58,58,58);
         Color colortext=new Color(204,204,204);
         
          txtCodigo.setBackground(colorbg);
          txtCodigo.setForeground(colortext);
          txtApellidoPaterno.setBackground(colorbg);
          txtApellidoPaterno.setForeground(colortext);
          txtApellidoMaterno.setBackground(colorbg);
          txtApellidoMaterno.setForeground(colortext);
          txtDni.setBackground(colorbg);
          txtDni.setForeground(colortext);
          txtCorreo.setBackground(colorbg);
          txtCorreo.setForeground(colortext);
          
           
    }
    private boolean camposNulos(String cod,String apP,String apM,String nombre,String dni,String correo){
        boolean ver=false;
         Color color=new Color(250,128,114);
         
         if(cod.trim().equals("")){
           txtCodigo.setBackground(color);
           txtCodigo.setForeground(Color.black);
           ver=true;
         }
            
         if(apP.trim().equals("")){
           txtApellidoPaterno.setBackground(color);
           txtApellidoPaterno.setForeground(Color.black);
           ver=true;
         }
         if(apM.trim().equals("")){
           txtApellidoMaterno.setBackground(color);
           txtApellidoMaterno.setForeground(Color.black);
           ver=true;
         }
           if(dni.trim().equals("")){
           txtDni.setBackground(color);
           txtDni.setForeground(Color.black);
           ver=true;
         }
           if(correo.trim().equals("")){
           txtCorreo.setBackground(color);
           txtCorreo.setForeground(Color.black);
           ver=true;
         }
           return ver;
    }
    DefaultTableModel modelo;
    String estado="";
//    ArrayList<E_Personal> list;
//    String[] titulos = {"IdPersonal", "Codigo", "Apellido Paterno", "Apellido Materno", "Nombre"};

    void mostrarListadoPersonal() {
        try {
           
            C_Personal ctrl = new C_Personal();
            modelo = ctrl.listarPersonal();

            //llenartable(list);
       // modelo=;
            //   modelo=ctrl.listarPersonal();
            tablePersonal.setModel(modelo);

            //Ocultar columna IDPersonal
            tablePersonal.getColumnModel().getColumn(0).setMaxWidth(0);
            tablePersonal.getColumnModel().getColumn(0).setMinWidth(0);
            tablePersonal.getColumnModel().getColumn(0).setPreferredWidth(0);

         //   AutoCompleteDecorator.decorate(txtTextoBusqueda, list, true);

        } catch (Exception ex) {
        }
    }
    void cargarImagenFotoNull() {
        Image foto = getToolkit().getImage("C:/Users/Chistopher/Desktop/PROGRAMAS PROYECTO RAMOS/Version-MPPR-RAMOS/MPPR/src/Imagenes/UserNull.JPG");
        foto = foto.getScaledInstance(imgPersonal.getWidth(), imgPersonal.getHeight(), Image.SCALE_DEFAULT);
        imgPersonal.setIcon(new ImageIcon(foto));
    }

    void llenartable(ArrayList<E_Personal> list) {
        E_Personal obj = new E_Personal();
        for (E_Personal valor : list) {    
            Object[] objs = {valor.getIdTrabajador(), valor.getCodigo(), valor.getApellidoP(), valor.getApellidoM(), valor.getNombre()};
            modelo.addRow(objs);

        }

    }
    
    
    int getComboMes(String cadena) {
        int valor = 0;
        switch (cadena) {
            case "Enero":
                valor = 1;
            case "Febrero":
                valor = 2;
            case "Marzo":
                valor = 3;
            case "Abril":
                valor = 4;
            case "Mayo":
                valor = 5;
            case "Junio":
                valor = 6;
            case "Julio":
                valor = 7;
            case "Agosto":
                valor = 8;
            case "Septiembre":
                valor = 9;
            case "Octubre":
                valor = 10;
            case "Noviembre":
                valor = 11;
            case "Diciembre":
                valor = 12;
        }
        return valor;
    }
    void llenarACombo() {

        Date fecha2 = new Date();
        String anyo2 = new SimpleDateFormat("yyyy").format(fecha2);

        int a = Integer.parseInt(anyo2);

        comboAnoNacimiento.addItem("Año");
        for (int i = a; i >= 1920; i--) {
            comboAnoNacimiento.addItem(i);
        }

    }
    private class Meses{
        private int id;
        private String nombre;

        Meses(int id, String nombre)
        {
            this.id = id;
            this.nombre = nombre;
        }
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return the nombre
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * @param nombre the nombre to set
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
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
        tablePersonal = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTextoBusqueda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        lblAccion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        checkTrabajando = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTelefonoCasa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dtFechaIngreso = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        imgPersonal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInformacionAdicional = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnCambiarImagen1 = new javax.swing.JButton();
        comboMesNacimiento = new javax.swing.JComboBox();
        comboAnoNacimiento = new javax.swing.JComboBox();
        comboDiaNacimiento = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        btnCambiarImagen2 = new javax.swing.JButton();
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

        labelHeader1.setText("Personal de la PPR");
        labelHeader1.setColor(new java.awt.Color(0, 51, 255));
        labelHeader1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(labelHeader1);
        labelHeader1.setBounds(-10, 0, 1070, 37);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1220, 210, 287, 111);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Personal_-56-64.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 60, 60);

        tablePersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Apellido Paterno", "Apellido Materno", "Nombres"
            }
        ));
        tablePersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePersonalMouseClicked(evt);
            }
        });
        tablePersonal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablePersonalFocusGained(evt);
            }
        });
        tablePersonal.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tablePersonalCaretPositionChanged(evt);
            }
        });
        tablePersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablePersonalKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablePersonalKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablePersonal);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 430, 370);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Buscar Personal:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 30, 90, 50);

        txtTextoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoBusquedaActionPerformed(evt);
            }
        });
        txtTextoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTextoBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTextoBusquedaKeyTyped(evt);
            }
        });
        jPanel1.add(txtTextoBusqueda);
        txtTextoBusqueda.setBounds(170, 40, 270, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 450, 520);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(null);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(290, 480, 115, 25);

        lblAccion.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblAccion);
        lblAccion.setBounds(50, -10, 230, 50);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodigo);
        txtCodigo.setBounds(110, 40, 110, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Apellido paterno:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(-10, 70, 110, 50);

        txtApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoActionPerformed(evt);
            }
        });
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellidoPaterno);
        txtApellidoPaterno.setBounds(110, 80, 170, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Apellido materno:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(-10, 110, 110, 50);

        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellidoMaterno);
        txtApellidoMaterno.setBounds(110, 120, 170, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Direccion:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(-10, 190, 110, 50);

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });
        jPanel2.add(txtRuta);
        txtRuta.setBounds(110, 440, 150, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Titulo:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(250, 30, 110, 50);

        txtTitulo.setName(""); // NOI18N
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        jPanel2.add(txtTitulo);
        txtTitulo.setBounds(370, 40, 110, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(280, 290, 100, 30);

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        jPanel2.add(txtCorreo);
        txtCorreo.setBounds(370, 80, 110, 30);

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel2.add(txtDni);
        txtDni.setBounds(370, 120, 110, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("DNI:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(250, 110, 110, 50);

        checkTrabajando.setText("Esta trabajando?");
        checkTrabajando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTrabajandoActionPerformed(evt);
            }
        });
        jPanel2.add(checkTrabajando);
        checkTrabajando.setBounds(110, 240, 130, 23);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre);
        txtNombre.setBounds(110, 160, 170, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Nombres:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(-10, 150, 110, 50);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Tlf. de casa:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(250, 150, 110, 50);

        txtTelefonoCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCasaActionPerformed(evt);
            }
        });
        txtTelefonoCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoCasaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoCasaKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefonoCasa);
        txtTelefonoCasa.setBounds(370, 160, 110, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Correo:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(250, 70, 110, 50);

        dtFechaIngreso.setDateFormatString("dd/MM/yyy");
        jPanel2.add(dtFechaIngreso);
        dtFechaIngreso.setBounds(370, 250, 110, 30);

        jScrollPane2.setViewportView(imgPersonal);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(110, 300, 150, 130);

        jLabel3.setText("Informacion adicional de personal");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(290, 350, 190, 14);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(410, 480, 115, 25);

        txtInformacionAdicional.setColumns(20);
        txtInformacionAdicional.setRows(5);
        jScrollPane3.setViewportView(txtInformacionAdicional);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(290, 370, 260, 100);

        jLabel4.setText("Foto de perfil");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 280, 80, 14);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Fecha de ingreso:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(260, 240, 110, 50);

        btnCambiarImagen1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCambiarImagen1.setText("Cambiar Imagen");
        btnCambiarImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarImagen1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCambiarImagen1);
        btnCambiarImagen1.setBounds(120, 480, 130, 25);

        comboMesNacimiento.setMaximumRowCount(10);
        comboMesNacimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMesNacimiento.setToolTipText("");
        jPanel2.add(comboMesNacimiento);
        comboMesNacimiento.setBounds(370, 320, 70, 20);

        comboAnoNacimiento.setMaximumRowCount(10);
        jPanel2.add(comboAnoNacimiento);
        comboAnoNacimiento.setBounds(450, 320, 70, 20);

        comboDiaNacimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(comboDiaNacimiento);
        comboDiaNacimiento.setBounds(290, 320, 70, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Tlf. Celular:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(250, 190, 110, 50);

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel2.add(txtCelular);
        txtCelular.setBounds(370, 200, 110, 30);

        txtDireccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion1ActionPerformed(evt);
            }
        });
        txtDireccion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccion1KeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion1);
        txtDireccion1.setBounds(110, 200, 170, 30);

        btnCambiarImagen2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCambiarImagen2.setText("Nuevo");
        btnCambiarImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarImagen2MouseClicked(evt);
            }
        });
        btnCambiarImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarImagen2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCambiarImagen2);
        btnCambiarImagen2.setBounds(10, 250, 90, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Codigo:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(-10, 30, 110, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(470, 50, 570, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePersonalMouseClicked
        try {
            int indexRow = tablePersonal.getSelectedRow();
            int idPersonal = Integer.parseInt(tablePersonal.getValueAt(indexRow, 0).toString());
            //MOSTRAR TODOS LOS DATOS...
            E_Personal objPersonal;
            C_Personal ctrl = new C_Personal();
            objPersonal = ctrl.consultarPersonalXid(idPersonal);

            txtCodigo.setText(objPersonal.getCodigo() + "");
            txtApellidoPaterno.setText(objPersonal.getApellidoP());
            txtApellidoMaterno.setText(objPersonal.getApellidoM());
            txtNombre.setText(objPersonal.getNombre());
            txtDireccion1.setText(objPersonal.getDireccion());
            txtDni.setText(objPersonal.getDni() + "");
            txtTelefonoCasa.setText(objPersonal.getTelefonoCasa() + "");
            if (!objPersonal.getUrlImagen().equals("") || objPersonal.getUrlImagen() != null) {
                Image foto = getToolkit().getImage(objPersonal.getUrlImagen());
                foto = foto.getScaledInstance(imgPersonal.getWidth(), imgPersonal.getHeight(), Image.SCALE_DEFAULT);
                imgPersonal.setIcon(new ImageIcon(foto));
            }
            else {
                cargarImagenFotoNull();
            }
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_tablePersonalMouseClicked

    private void tablePersonalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablePersonalFocusGained

    }//GEN-LAST:event_tablePersonalFocusGained

    private void tablePersonalCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablePersonalCaretPositionChanged

    }//GEN-LAST:event_tablePersonalCaretPositionChanged

    private void tablePersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePersonalKeyTyped

    }//GEN-LAST:event_tablePersonalKeyTyped

    private void tablePersonalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePersonalKeyPressed
        try {
            int codigoKey = evt.getKeyCode();
            int indexRow = tablePersonal.getSelectedRow();
            if (codigoKey == 40 || codigoKey == 38) {

                if (codigoKey == 40)//abajo
                {
                    indexRow = indexRow + 1;
                } else if (codigoKey == 38)//arriba
                {
                    indexRow = indexRow - 1;
                }

                int idPersonal = Integer.parseInt(tablePersonal.getValueAt(indexRow, 0).toString());
                //MOSTRAR TODOS LOS DATOS...
                E_Personal objPersonal;
                C_Personal ctrl = new C_Personal();
                objPersonal = ctrl.consultarPersonalXid(idPersonal);

                txtCodigo.setText(objPersonal.getCodigo() + "");
                txtApellidoPaterno.setText(objPersonal.getApellidoP());
                txtApellidoMaterno.setText(objPersonal.getApellidoM());
                txtNombre.setText(objPersonal.getNombre());
                txtDireccion1.setText(objPersonal.getDireccion());
                txtDni.setText(objPersonal.getDni() + "");
                txtTelefonoCasa.setText(objPersonal.getTelefonoCasa() + "");

                //mostrar imagen personal
                if (!objPersonal.getUrlImagen().equals("") || objPersonal.getUrlImagen() != null) {
                    Image foto = getToolkit().getImage(objPersonal.getUrlImagen());
                    foto = foto.getScaledInstance(imgPersonal.getWidth(), imgPersonal.getHeight(), Image.SCALE_DEFAULT);
                    imgPersonal.setIcon(new ImageIcon(foto));
                }
                else
                {
                    cargarImagenFotoNull();
                }

            } else if (codigoKey == 10) {//enter, SE CORRE un escalon
                if (tablePersonal.getRowCount() == indexRow + 1) {
                    indexRow = 0;
                } else {
                    indexRow = indexRow + 1;
                }
                int idPersonal = Integer.parseInt(tablePersonal.getValueAt(indexRow, 0).toString());
                //MOSTRAR TODOS LOS DATOS...
                E_Personal objPersonal;
                C_Personal ctrl = new C_Personal();
                objPersonal = ctrl.consultarPersonalXid(idPersonal);

                txtCodigo.setText(objPersonal.getCodigo() + "");
                txtApellidoPaterno.setText(objPersonal.getApellidoP());
                txtApellidoMaterno.setText(objPersonal.getApellidoM());
                txtNombre.setText(objPersonal.getNombre());
                txtDireccion1.setText(objPersonal.getDireccion());
                txtDni.setText(objPersonal.getDni() + "");
                txtTelefonoCasa.setText(objPersonal.getTelefonoCasa() + "");
                //MOSTRAR IMAGEN

                //mostrar imagen personal
                if (!objPersonal.getUrlImagen().equals("") || objPersonal.getUrlImagen() != null) {
                    Image foto = getToolkit().getImage(objPersonal.getUrlImagen());
                    foto = foto.getScaledInstance(imgPersonal.getWidth(), imgPersonal.getHeight(), Image.SCALE_DEFAULT);
                    imgPersonal.setIcon(new ImageIcon(foto));
                }
                else
                {
                    cargarImagenFotoNull();
                }
            }
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_tablePersonalKeyPressed

    private void txtTextoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoBusquedaActionPerformed

    private void txtTextoBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoBusquedaKeyPressed

        char car = evt.getKeyChar();
        String cadena = ",-_{}[¨*+´!°#$%&/()=?¡.;;><"; // Caracterens no validos
        char s = '"';
        boolean ver=false;
        for (int i = 0; i < cadena.length(); i++) {
            if (car == cadena.charAt(i) || car == s) {
                evt.consume();
                ver=true;
            }

        }
        if(!ver){
            TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(modelo);
            tablePersonal.setRowSorter(elQueOrdena);
            String text = txtTextoBusqueda.getText().trim();
            elQueOrdena.setRowFilter(RowFilter.regexFilter("(?i)"+text));
        }

    }//GEN-LAST:event_txtTextoBusquedaKeyPressed

    private void txtTextoBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoBusquedaKeyTyped

    }//GEN-LAST:event_txtTextoBusquedaKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        E_Personal obj = new E_Personal();
        try {
            restaurarValoresDiseno();
            if(camposNulos(txtCodigo.getText(),txtApellidoPaterno.getText(),txtApellidoMaterno.getText(),
                txtNombre.getText(),txtDni.getText(),txtCorreo.getText())){
            JOptionPane.showMessageDialog(this,"Ingrese los campos obligatorios", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
        }
        else{
            ////        v=new Validacion();
            ////        lista=new ArrayList();
            ////
            ////        mf=new MultipleFiltro(v.metodSoloNumero(),"123213","Solo se permite numeros");
            ////        lista.add(mf);
            ////        mf=new MultipleFiltro(v.metodSoloLetra(),"","Solo se permite letras");
            ////         lista.add(mf);
            ////        mf=new MultipleFiltro(v.metodSoloNumeroTamano(),"887895","Solo numeros, maxmo 6 digitos","6");//entrada,mensaje,extra
            ////        lista.add(mf);
            ////
            ////        String validacion=v.validarCamposMultiples(lista);
            ////
            //
            //            if (estadoAccion == "Registrar") {
                //
                //                obj.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
                //        //IdEspecialidad
                //                //IdPerfil
                //
                //                obj.setTitulo(txtTitulo.getText().trim());
                //                obj.setApellid;;w.M(txtApellidoMaterno.getText().trim());
                //                obj.setDni(Integer.parseInt(txtDni.getText().trim()));
                //                obj.setNombre(txtNombre.getText().trim());
                //                obj.setDireccion(txtDireccion1.getText().trim());
                //                obj.setTelefonoCasa(txtTelefonoCasa.getText().trim());
                //                obj.setCelular(txtCelular.getText().trim());
                //                obj.setFechaIngreso(dtFechaIngreso.getDate());
                //                obj.setCorreo(txtCorreo.getText().trim());
                //                obj.setDireccion(txtDireccion1.getText().trim());
                //                obj.setInfoAdicional(txtInformacionAdicional.getText().trim());
                //
                //                if (comboDiaNacimiento.getSelectedItem() != "Dia"
                    //                        && comboMesNacimiento.getSelectedItem() != "Mes"
                    //                        && comboAnoNacimiento.getSelectedItem() != "Año") {
                    //                    obj.setDiaNacimiento(Integer.parseInt(comboDiaNacimiento.getSelectedItem().toString()));
                    //                    obj.setMesNacimiento(getComboMes(comboMesNacimiento.getSelectedItem().toString()));
                    //                    obj.setAnoNacimiento(Integer.parseInt(comboAnoNacimiento.getSelectedItem().toString()));
                    //                }
                //                C_Personal ctrl = new C_Personal();
                //                int idRegistro = ctrl.registrarPersonal(obj);
                //
                //                String path = txtRuta.getText().trim();
                ////
                //                Constantes cts = new Constantes();
                //                if (!path.equals("")) {
                    //                    String ext = path.substring(path.lastIndexOf(".") + 1);
                    //                    Ficheros objFicheros = new Ficheros();
                    //                    objFicheros.copyFile(path, cts.getRutaPersonal() + idRegistro + "." + ext);
                    //                    ctrl.actualizarTrabajador(idRegistro, cts.getRutaPersonal() + idRegistro + "." + ext);
                    //                }
                //                mostrarListadoPersonal();
                //            }
            //            }
        }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code==17||code==86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

    private void txtApellidoPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyPressed

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        try {

            int tamano=txtApellidoPaterno.getText().length();
            int limite=50;
            char c = evt.getKeyChar();
            if (!Character.isLetter(c) && c != ' ' && !Character.isISOControl(c)||tamano>=limite) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void txtApellidoMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyPressed

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        try {
            int tamano=txtApellidoMaterno.getText().length();
            int limite=50;
            char c = evt.getKeyChar();
            if (!Character.isLetter(c) && c != ' ' && !Character.isISOControl(c)||tamano>=limite) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        try {
            int tamano=txtCodigo.getText().length();
            int limite=8;
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && !Character.isISOControl(c)||tamano>=limite) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void checkTrabajandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTrabajandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTrabajandoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        try {
            int tamano=txtNombre.getText().length();
            int limite=50;
            char c = evt.getKeyChar();
            if (!Character.isLetter(c) && c != ' ' && !Character.isISOControl(c)||tamano>=limite) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoCasaActionPerformed

    private void txtTelefonoCasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoCasaKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtTelefonoCasaKeyPressed

    private void txtTelefonoCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoCasaKeyTyped
        try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtTelefonoCasaKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCambiarImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarImagen1ActionPerformed
        // TODO add your handling code here:

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Extensiones *.JPG, *.PNG, *.BMP, *.JPEG, *.GIF, *.JP2, *.WMP ", "jpg", "png", "bmp", "jpeg","gif","jp2","wmp");
        JFileChooser archivo=new JFileChooser();
        //archivo.setFileFilter(filter);
        archivo.addChoosableFileFilter(filter);
        archivo.setDialogTitle("Imagen del Personal");
        int ventana=archivo.showOpenDialog(null);
        String ruta="";
        if(ventana == JFileChooser.APPROVE_OPTION)
        {
            File file=archivo.getSelectedFile();
            ruta=String.valueOf(file);
            txtRuta.setText(ruta);

            Image foto=getToolkit().getImage(ruta);
            foto=foto.getScaledInstance(imgPersonal.getWidth(),imgPersonal.getHeight(),Image.SCALE_DEFAULT);
            imgPersonal.setIcon(new ImageIcon(foto));
        }

    }//GEN-LAST:event_btnCambiarImagen1ActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        try {
            int code = evt.getKeyCode();
            if (code == 17 || code == 86) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtDireccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion1ActionPerformed

    private void txtDireccion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccion1KeyTyped
        try {
            int tamano=txtDireccion1.getText().length();
            int limite=100;
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && !Character.isLetter(c) && c != ' '&& c != '.' && !Character.isISOControl(c)||tamano>=limite) {
                getToolkit().beep(); //sonido
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtDireccion1KeyTyped

    private void btnCambiarImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarImagen2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarImagen2MouseClicked

    private void btnCambiarImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarImagen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarImagen2ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                GestionarPersonal dialog = null;
                try {
                    dialog = new GestionarPersonal(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(GestionarPersonal.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnCambiarImagen1;
    private javax.swing.JButton btnCambiarImagen2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox checkTrabajando;
    private javax.swing.JComboBox comboAnoNacimiento;
    private javax.swing.JComboBox comboDiaNacimiento;
    private javax.swing.JComboBox comboMesNacimiento;
    private com.toedter.calendar.JDateChooser dtFechaIngreso;
    private javax.swing.JLabel imgPersonal;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JTable tablePersonal;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextArea txtInformacionAdicional;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTelefonoCasa;
    private javax.swing.JTextField txtTextoBusqueda;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
