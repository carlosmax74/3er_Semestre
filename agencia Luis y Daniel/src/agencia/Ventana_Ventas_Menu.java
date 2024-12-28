/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author Luis
 */
public class Ventana_Ventas_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Ventas_Menu
     */
    public Ventana_Ventas_Menu() {
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

        Agregar_Empleados = new javax.swing.JButton();
        Obtener_Empleados = new javax.swing.JButton();
        Eliminar_Empleados = new javax.swing.JButton();
        Regresar_VentasaPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 512));
        getContentPane().setLayout(null);

        Agregar_Empleados.setBackground(new java.awt.Color(0, 0, 204));
        Agregar_Empleados.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Agregar_Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_Empleados.setText("Agregar venta");
        Agregar_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_EmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_Empleados);
        Agregar_Empleados.setBounds(20, 70, 160, 30);

        Obtener_Empleados.setBackground(new java.awt.Color(0, 0, 204));
        Obtener_Empleados.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Obtener_Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Obtener_Empleados.setText("Obtener ventas");
        Obtener_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener_EmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(Obtener_Empleados);
        Obtener_Empleados.setBounds(20, 120, 160, 30);

        Eliminar_Empleados.setBackground(new java.awt.Color(0, 0, 204));
        Eliminar_Empleados.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Eliminar_Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Empleados.setText("Eliminar venta");
        Eliminar_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_EmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_Empleados);
        Eliminar_Empleados.setBounds(20, 170, 160, 30);

        Regresar_VentasaPrincipal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Regresar_VentasaPrincipal.setText("Regresar");
        Regresar_VentasaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_VentasaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar_VentasaPrincipal);
        Regresar_VentasaPrincipal.setBounds(520, 10, 100, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel4.setText("Menú ventas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(4, -6, 460, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_Ventas.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 670, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_EmpleadosActionPerformed
        Ventana_Agregar_Ventas ventana = new Ventana_Agregar_Ventas();
        ventana.setVisible(true);
    }//GEN-LAST:event_Agregar_EmpleadosActionPerformed

    private void Obtener_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener_EmpleadosActionPerformed
        Ventana_Obtener_Ventas ventana = new Ventana_Obtener_Ventas();
        ventana.setVisible(true);
    }//GEN-LAST:event_Obtener_EmpleadosActionPerformed

    private void Eliminar_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_EmpleadosActionPerformed
        Ventana_Eliminar_Venta ventana = new Ventana_Eliminar_Venta();
        ventana.setVisible(true);
    }//GEN-LAST:event_Eliminar_EmpleadosActionPerformed

    private void Regresar_VentasaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_VentasaPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_Regresar_VentasaPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Ventas_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Ventas_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Empleados;
    private javax.swing.JButton Eliminar_Empleados;
    private javax.swing.JButton Obtener_Empleados;
    private javax.swing.JButton Regresar_VentasaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}