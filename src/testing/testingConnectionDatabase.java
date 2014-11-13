/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import quick.dbtable.DBTable;

/**
 *
 * @author ricardo
 */
public class testingConnectionDatabase extends javax.swing.JFrame {

    /**
     * Creates new form testingConnectionDatabase
     */
    public testingConnectionDatabase() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        dBTable1 = new quick.dbtable.DBTable();
        boton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dBTable1.setSortEnabled(true);
        jScrollPane1.setViewportView(dBTable1);

        boton.setText("conectar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jButton1.setText("Inserta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        try {
            // TODO add your handling code here:
            //DBTable dBTable1 = new DBTable();
            // crea los controles para la tabla
            dBTable1.createControlPanel();
            dBTable1.connectDatabase(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://tazachoncha.net/URVE_NOMINA",
                    "ricardo" ,
                    "Aprende34");
            dBTable1.setSelectSql("select * from obra");
            dBTable1.refresh();
        } catch (SQLException ex) {
            Logger.getLogger(testingConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testingConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // para insertar un nuevo registro en la tabla. se pueden pasar procedimientos almacenados
        // 2,3 indica el numero de columna para cada dato empieza por 1 (no es 0)
        dBTable1.addInsertSql("INSERT INTO obra (nombre, descripcion) VALUES (?,?)", "2,3");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(testingConnectionDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testingConnectionDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testingConnectionDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testingConnectionDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testingConnectionDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private quick.dbtable.DBTable dBTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}