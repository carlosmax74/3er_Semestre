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
public class Ventana_Agregar_Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Agregar_Empleados
     */
    public Ventana_Agregar_Empleados() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldRFC = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPuesto = new javax.swing.JTextField();
        jTextFieldFechaNacimiento = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldColonia = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(969, 606));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RFC");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 109, 70, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 159, 120, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 210, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puesto");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 270, 100, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 319, 80, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 370, 250, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 429, 120, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Colonia");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 479, 110, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Teléfono");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 539, 120, 30);

        jTextFieldRFC.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldRFC);
        jTextFieldRFC.setBounds(380, 106, 250, 40);

        jTextFieldApellidos.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldApellidos);
        jTextFieldApellidos.setBounds(380, 156, 250, 40);

        jTextFieldNombre.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(380, 210, 250, 40);

        jTextFieldPuesto.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldPuesto);
        jTextFieldPuesto.setBounds(380, 266, 250, 40);

        jTextFieldFechaNacimiento.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jTextFieldFechaNacimiento.setText("AAAA/MM/DD");
        jTextFieldFechaNacimiento.setToolTipText("");
        getContentPane().add(jTextFieldFechaNacimiento);
        jTextFieldFechaNacimiento.setBounds(380, 366, 250, 40);

        jTextFieldDireccion.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldDireccion);
        jTextFieldDireccion.setBounds(380, 426, 390, 40);

        jTextFieldColonia.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldColonia);
        jTextFieldColonia.setBounds(380, 476, 250, 40);

        jTextFieldTel.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldTel);
        jTextFieldTel.setBounds(380, 526, 250, 40);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 10, 110, 31);

        jButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(801, 10, 140, 31);

        jComboBoxSexo.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(jComboBoxSexo);
        jComboBoxSexo.setBounds(380, 318, 170, 40);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel13.setText("Ingreso de empleados");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(4, -6, 460, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 970, 50);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/302661.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-550, -560, 1540, 1180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MySQL db = new MySQL();
        try {
            db.MySQLConnection("root", "", "agencia");
            db.insertDataEmpleados("empleados", jTextFieldRFC.getText(),
                jTextFieldApellidos.getText(),
                jTextFieldNombre.getText(),
                jTextFieldPuesto.getText(),
                jComboBoxSexo.getSelectedItem().toString(),   
                jTextFieldFechaNacimiento.getText(),
                jTextFieldDireccion.getText(),
                jTextFieldColonia.getText(),
                jTextFieldTel.getText());
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
            java.util.logging.Logger.getLogger(Ventana_Agregar_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Agregar_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldColonia;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFechaNacimiento;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPuesto;
    private javax.swing.JTextField jTextFieldRFC;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
