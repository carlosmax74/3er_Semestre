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
public class Ventana_Agregar_Servicios extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Agregar_Servicios
     */
    public Ventana_Agregar_Servicios() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFecha_Recp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId_Cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFecha_Entre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextFieldId_Servicio = new javax.swing.JTextField();
        jTextFieldRFC = new javax.swing.JTextField();
        jTextFieldNumero_Serie = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldProblm_Gen = new javax.swing.JTextField();
        jComboBoxCambio_Aceite = new javax.swing.JComboBox();
        jComboBoxAfinacion = new javax.swing.JComboBox();
        jComboBoxCambio_Frenos = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(965, 606));
        setMinimumSize(new java.awt.Dimension(965, 606));
        setPreferredSize(new java.awt.Dimension(965, 606));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Servicio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 82, 140, 29);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RFC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 135, 70, 29);

        jTextFieldFecha_Recp.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jTextFieldFecha_Recp.setText("AAAA/MM/DD");
        getContentPane().add(jTextFieldFecha_Recp);
        jTextFieldFecha_Recp.setBounds(321, 291, 180, 36);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de serie");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 188, 210, 29);

        jTextFieldId_Cliente.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldId_Cliente);
        jTextFieldId_Cliente.setBounds(321, 238, 252, 36);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Cliente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(19, 241, 120, 29);

        jTextFieldFecha_Entre.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jTextFieldFecha_Entre.setText("AAAA/MM/DD");
        getContentPane().add(jTextFieldFecha_Entre);
        jTextFieldFecha_Entre.setBounds(321, 348, 180, 36);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de recepción");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 294, 230, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de entrega");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 350, 210, 29);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cambio de aceite");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(19, 401, 210, 29);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Afinación");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(19, 448, 120, 29);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 10, 121, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cambio de frenos");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(19, 493, 210, 29);

        jButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 10, 135, 30);

        jTextFieldId_Servicio.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldId_Servicio);
        jTextFieldId_Servicio.setBounds(321, 79, 90, 36);

        jTextFieldRFC.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldRFC);
        jTextFieldRFC.setBounds(321, 132, 252, 36);

        jTextFieldNumero_Serie.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldNumero_Serie);
        jTextFieldNumero_Serie.setBounds(321, 185, 252, 36);

        jLabel11.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Problemas generales");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(19, 543, 250, 29);

        jTextFieldProblm_Gen.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldProblm_Gen);
        jTextFieldProblm_Gen.setBounds(321, 540, 426, 36);

        jComboBoxCambio_Aceite.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jComboBoxCambio_Aceite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        getContentPane().add(jComboBoxCambio_Aceite);
        jComboBoxCambio_Aceite.setBounds(321, 401, 146, 29);

        jComboBoxAfinacion.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jComboBoxAfinacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        getContentPane().add(jComboBoxAfinacion);
        jComboBoxAfinacion.setBounds(321, 448, 146, 29);

        jComboBoxCambio_Frenos.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jComboBoxCambio_Frenos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        getContentPane().add(jComboBoxCambio_Frenos);
        jComboBoxCambio_Frenos.setBounds(321, 493, 146, 29);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel13.setText("Ingreso de servicios");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(4, -6, 460, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 970, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar_Servicios.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-450, -90, 1420, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MySQL db = new MySQL();
        try {
            db.MySQLConnection("root", "", "agencia");
            db.insertDataServicios("servicios", jTextFieldId_Servicio.getText(),
                jTextFieldRFC.getText(),
                jTextFieldNumero_Serie.getText(),
                jTextFieldId_Cliente.getText(),
                jTextFieldFecha_Recp.getText(),
                jTextFieldFecha_Entre.getText(),
                jComboBoxCambio_Aceite.getSelectedItem().toString(),   
                jComboBoxAfinacion.getSelectedItem().toString(),
                jComboBoxCambio_Frenos.getSelectedItem().toString(),
                jTextFieldProblm_Gen.getText());
        db.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Agregar_Autos.class.getName()).log(Level.SEVERE, null, ex);
        }  
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Agregar_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Agregar_Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBoxAfinacion;
    private javax.swing.JComboBox jComboBoxCambio_Aceite;
    private javax.swing.JComboBox jComboBoxCambio_Frenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldFecha_Entre;
    private javax.swing.JTextField jTextFieldFecha_Recp;
    private javax.swing.JTextField jTextFieldId_Cliente;
    private javax.swing.JTextField jTextFieldId_Servicio;
    private javax.swing.JTextField jTextFieldNumero_Serie;
    private javax.swing.JTextField jTextFieldProblm_Gen;
    private javax.swing.JTextField jTextFieldRFC;
    // End of variables declaration//GEN-END:variables
}