/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Ventana_Eliminar_Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Eliminar_Empleados
     */
    public Ventana_Eliminar_Empleados() {
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

        Eliminar_Cliente_Eliminar = new javax.swing.JButton();
        Eliminar_Cliente_Cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(637, 243));
        setMinimumSize(new java.awt.Dimension(637, 243));
        setPreferredSize(new java.awt.Dimension(637, 243));
        getContentPane().setLayout(null);

        Eliminar_Cliente_Eliminar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Eliminar_Cliente_Eliminar.setText("ELIMINAR");
        Eliminar_Cliente_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_Cliente_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_Cliente_Eliminar);
        Eliminar_Cliente_Eliminar.setBounds(380, 130, 150, 30);

        Eliminar_Cliente_Cancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Eliminar_Cliente_Cancelar.setText("CANCELAR");
        Eliminar_Cliente_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_Cliente_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_Cliente_Cancelar);
        Eliminar_Cliente_Cancelar.setBounds(500, 10, 100, 23);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inserte RFC de Empleado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 74, 297, 35);

        jTextField1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(317, 74, 280, 34);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel12.setText("Eliminar empleado");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(4, -6, 460, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 970, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar_Empleados.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-320, -40, 1010, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Eliminar_Cliente_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_Cliente_EliminarActionPerformed
        MySQL db = new MySQL();
        try {
            db.MySQLConnection("root", "", "agencia");
            db.deleteRegistroEmpleados("empleados", jTextField1.getText());
            db.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Eliminar_Autos.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.dispose();
    }//GEN-LAST:event_Eliminar_Cliente_EliminarActionPerformed

    private void Eliminar_Cliente_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_Cliente_CancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_Eliminar_Cliente_CancelarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana_Eliminar_Empleados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar_Cliente_Cancelar;
    private javax.swing.JButton Eliminar_Cliente_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
