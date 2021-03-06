/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author ricardo
 */
public class FormObras extends javax.swing.JFrame {

    /**
     * Creates new form Empleados
     */
    public FormObras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelObra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNombreObra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescripcionObra = new javax.swing.JTextArea();
        panelEmpleadosAsignados = new javax.swing.JPanel();
        botonAgrega = new javax.swing.JButton();
        comboBoxEmpleadosAsignados = new javax.swing.JComboBox();
        scrollPaneEmpleadosAsignados = new javax.swing.JScrollPane();
        tablaEmpleadosAsignados = new javax.swing.JTable();
        botonCatalogoEmpleados = new javax.swing.JButton();
        botonRemueve = new javax.swing.JButton();
        scrollPaneObras = new javax.swing.JScrollPane();
        tablaObras = new javax.swing.JTable();
        MenuEmpleados = new javax.swing.JMenuBar();
        MenuDatos = new javax.swing.JMenu();
        MenuItemInsertar = new javax.swing.JMenuItem();
        MenuItemModificar = new javax.swing.JMenuItem();
        MenuItemBorrar = new javax.swing.JMenuItem();
        SeparadorDatos = new javax.swing.JPopupMenu.Separator();
        MenuItemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelObra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nombre de la obra");

        textNombreObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreObraActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripción");

        textDescripcionObra.setColumns(20);
        textDescripcionObra.setRows(5);
        jScrollPane2.setViewportView(textDescripcionObra);

        javax.swing.GroupLayout panelObraLayout = new javax.swing.GroupLayout(panelObra);
        panelObra.setLayout(panelObraLayout);
        panelObraLayout.setHorizontalGroup(
            panelObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2)
                    .addComponent(textNombreObra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelObraLayout.setVerticalGroup(
            panelObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelEmpleadosAsignados.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados asignados"));

        botonAgrega.setText(" + ");

        comboBoxEmpleadosAsignados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tablaEmpleadosAsignados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneEmpleadosAsignados.setViewportView(tablaEmpleadosAsignados);

        botonCatalogoEmpleados.setText("...");
        botonCatalogoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCatalogoEmpleadosActionPerformed(evt);
            }
        });

        botonRemueve.setText("-");

        javax.swing.GroupLayout panelEmpleadosAsignadosLayout = new javax.swing.GroupLayout(panelEmpleadosAsignados);
        panelEmpleadosAsignados.setLayout(panelEmpleadosAsignadosLayout);
        panelEmpleadosAsignadosLayout.setHorizontalGroup(
            panelEmpleadosAsignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosAsignadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpleadosAsignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosAsignadosLayout.createSequentialGroup()
                        .addComponent(botonAgrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxEmpleadosAsignados, 0, 250, Short.MAX_VALUE))
                    .addComponent(scrollPaneEmpleadosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadosAsignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCatalogoEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(botonRemueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        panelEmpleadosAsignadosLayout.setVerticalGroup(
            panelEmpleadosAsignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosAsignadosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelEmpleadosAsignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEmpleadosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgrega)
                    .addComponent(botonCatalogoEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadosAsignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneEmpleadosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRemueve))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneObras.setViewportView(tablaObras);

        MenuDatos.setText("Datos");

        MenuItemInsertar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemInsertar.setText("Insertar");
        MenuDatos.add(MenuItemInsertar);

        MenuItemModificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemModificar.setText("Modificar");
        MenuDatos.add(MenuItemModificar);

        MenuItemBorrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemBorrar.setText("Borrar");
        MenuDatos.add(MenuItemBorrar);
        MenuDatos.add(SeparadorDatos);

        MenuItemCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemCerrar.setText("Cerrar");
        MenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCerrarActionPerformed(evt);
            }
        });
        MenuDatos.add(MenuItemCerrar);

        MenuEmpleados.add(MenuDatos);

        setJMenuBar(MenuEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                .addComponent(scrollPaneObras, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEmpleadosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPaneObras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(85, 85, 85)
                .addComponent(panelEmpleadosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_MenuItemCerrarActionPerformed

    private void textNombreObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreObraActionPerformed

    private void botonCatalogoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCatalogoEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCatalogoEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(FormObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormObras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuDatos;
    private javax.swing.JMenuBar MenuEmpleados;
    private javax.swing.JMenuItem MenuItemBorrar;
    private javax.swing.JMenuItem MenuItemCerrar;
    private javax.swing.JMenuItem MenuItemInsertar;
    private javax.swing.JMenuItem MenuItemModificar;
    private javax.swing.JPopupMenu.Separator SeparadorDatos;
    private javax.swing.JButton botonAgrega;
    private javax.swing.JButton botonCatalogoEmpleados;
    private javax.swing.JButton botonRemueve;
    private javax.swing.JComboBox comboBoxEmpleadosAsignados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelEmpleadosAsignados;
    private javax.swing.JPanel panelObra;
    private javax.swing.JScrollPane scrollPaneEmpleadosAsignados;
    private javax.swing.JScrollPane scrollPaneObras;
    private javax.swing.JTable tablaEmpleadosAsignados;
    private javax.swing.JTable tablaObras;
    private javax.swing.JTextArea textDescripcionObra;
    private javax.swing.JTextField textNombreObra;
    // End of variables declaration//GEN-END:variables
}
