/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class MenuJefe extends javax.swing.JFrame {

    /**
     * Creates new form MenuJefe
     */
    public MenuJefe() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        tabcopiar = new javax.swing.JMenuItem();
        tabcortar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        tabCambiarFecha = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        tabEquipos = new javax.swing.JMenuItem();
        tabPersonal = new javax.swing.JMenuItem();
        tabImprimir = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        tabManteminientoPreventivo = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin-48.png"))); // NOI18N
        jMenu4.setText("Administracion");
        jMenu4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        tabcopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        tabcopiar.setText("Copiar");
        tabcopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabcopiarActionPerformed(evt);
            }
        });
        jMenu4.add(tabcopiar);

        tabcortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        tabcortar.setText("Cortar");
        jMenu4.add(tabcortar);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Pegar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_Personal(evt);
            }
        });
        jMenu4.add(jMenuItem4);
        jMenu4.add(jSeparator2);

        jMenu9.setText("Programcion");

        tabCambiarFecha.setText("Cambiar Fecha");
        tabCambiarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCambiarFechaActionPerformed(evt);
            }
        });
        jMenu9.add(tabCambiarFecha);

        jMenuItem10.setText("Correr programa");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenu4.add(jMenu9);

        tabEquipos.setText("Equipos");
        tabEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabEquiposActionPerformed(evt);
            }
        });
        jMenu4.add(tabEquipos);

        tabPersonal.setText("Personal");
        tabPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPersonalActionPerformed(evt);
            }
        });
        jMenu4.add(tabPersonal);

        tabImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        tabImprimir.setText("Imprimir");
        jMenu4.add(tabImprimir);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Preventivo-48.png"))); // NOI18N
        jMenu6.setText("Preventivo");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        tabManteminientoPreventivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        tabManteminientoPreventivo.setText("Plan Mant. Preventivo");
        tabManteminientoPreventivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabManteminientoPreventivoActionPerformed(evt);
            }
        });
        jMenu6.add(tabManteminientoPreventivo);

        jMenuItem14.setText("Programacion");
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Generacion de Trabajador");
        jMenu6.add(jMenuItem15);
        jMenu6.add(jSeparator1);

        jMenuItem16.setText("Ejecuta");
        jMenu6.add(jMenuItem16);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reparacion-48.png"))); // NOI18N
        jMenu7.setText("Predictivo");
        jMenu7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Plan predictivo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem11.setText("Cambio de filtros");
        jMenu7.add(jMenuItem11);

        jMenuBar1.add(jMenu7);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administracion-48.png"))); // NOI18N
        jMenu5.setText("Correctivo");
        jMenu5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Solicitud");
        jMenu5.add(jMenuItem13);

        jMenuItem5.setText("Pendientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem12.setText("Terminado");
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Correctivo-48.png"))); // NOI18N
        jMenu8.setText("Consultas");
        jMenu8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem8.setText("Preventivos entregados");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem17.setText("Reparaciones entregados");
        jMenu8.add(jMenuItem17);

        jMenuItem18.setText("Trabajos d/p Terceros");
        jMenu8.add(jMenuItem18);
        jMenu8.add(jSeparator3);

        jMenuItem19.setText("Codificacion de equipos");
        jMenu8.add(jMenuItem19);

        jMenuItem20.setText("Siglas utilizadas");
        jMenu8.add(jMenuItem20);
        jMenu8.add(jSeparator4);

        jMenuItem21.setText("Especificaciones tecnicas");
        jMenu8.add(jMenuItem21);

        jMenuItem22.setText("Planos y documentos antiguos");
        jMenu8.add(jMenuItem22);
        jMenu8.add(jSeparator5);

        jMenuItem23.setText("Calibracion");
        jMenu8.add(jMenuItem23);

        jMenuItem24.setText("Registros");
        jMenu8.add(jMenuItem24);

        jMenuBar1.add(jMenu8);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estadisticas-48.png"))); // NOI18N
        jMenu2.setText("Reportes");
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem9.setText("Repostes Basico");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda-48.png"))); // NOI18N
        jMenu3.setText("Ayuda");
        jMenu3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jMenuItem3.setText("Informacion del Sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit-48.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Cerrar Seción");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

//        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tab_Personal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_Personal

//        try {
//            JFTrabajador trabajador = new JFTrabajador();
//            limpiarEscritorio();
//            escritorio.add(trabajador);
//            trabajador.setVisible(true);
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error de Coneccion");
//        }
    }//GEN-LAST:event_tab_Personal

    private void tabManteminientoPreventivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabManteminientoPreventivoActionPerformed
 try {
        
        PlanMantenimientoPreventivo BGesPer = new PlanMantenimientoPreventivo();
        BGesPer.setLocationRelativeTo(null);
        BGesPer.setVisible(true);        
        
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de Coneccion");
        } 
//        try {
//            JFAlmacen almacen = new JFAlmacen();
//            limpiarEscritorio();
//            escritorio.add(almacen);
//            almacen.setVisible(true);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error de Coneccion");
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tabManteminientoPreventivoActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

//        try {
//            JFProductos productos = new JFProductos();
//            limpiarEscritorio();
//            escritorio.add(productos);
//            productos.setVisible(true);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error de Coneccion");
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

//        try {
//            JFCategoriaProducto catProductos = new JFCategoriaProducto();
//            limpiarEscritorio();
//            escritorio.add(catProductos);
//            catProductos.setVisible(true);
//        } catch (Exception e) {
//            JOptionPane.showInternalMessageDialog(this, "Error de Coneccion");
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

//        try {
//            JFRegistroProductosAlmacen regP = new JFRegistroProductosAlmacen();
//            regP.setLocationRelativeTo(null);
//            regP.setVisible(true);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error de Coneccion");
//        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//        JDInformacionSistema info = new JDInformacionSistema(this, true);
//        info.setLocationRelativeTo(null);
//        info.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tabcopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabcopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabcopiarActionPerformed

    private void tabCambiarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCambiarFechaActionPerformed
       
        try {
        
        BorrarProgramacion BPro = new BorrarProgramacion(this,true);
        BPro.setLocationRelativeTo(null);
        BPro.setVisible(true);        
        
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de Coneccion");
        }
    }//GEN-LAST:event_tabCambiarFechaActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         try {
        
        IniciarProgramacion IniPro = new IniciarProgramacion(this,true);
        IniPro.setLocationRelativeTo(null);
        IniPro.setVisible(true);        
        
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de Coneccion");
        } // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void tabEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabEquiposActionPerformed

 try {
        
        GestionarSistema BPro = new GestionarSistema();
        BPro.setLocationRelativeTo(null);
        BPro.setVisible(true);        
        
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de Coneccion");
        } 
    }//GEN-LAST:event_tabEquiposActionPerformed

    private void tabPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPersonalActionPerformed
        // TODO add your handling code here:
        try {
        
        GestionarPersonal BGesPer = new GestionarPersonal(this,true);
        BGesPer.setLocationRelativeTo(null);
        BGesPer.setVisible(true);        
        
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de Coneccion");
        } 
        
    }//GEN-LAST:event_tabPersonalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJefe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem tabCambiarFecha;
    private javax.swing.JMenuItem tabEquipos;
    private javax.swing.JMenuItem tabImprimir;
    private javax.swing.JMenuItem tabManteminientoPreventivo;
    private javax.swing.JMenuItem tabPersonal;
    private javax.swing.JMenuItem tabcopiar;
    private javax.swing.JMenuItem tabcortar;
    // End of variables declaration//GEN-END:variables
}
