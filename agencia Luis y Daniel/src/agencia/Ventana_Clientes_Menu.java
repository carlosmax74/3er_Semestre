/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author PCxxCC1
 */
public class Ventana_Clientes_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Clientes_Menu
     */
    public Ventana_Clientes_Menu() {
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

        Agregar_Clientes = new javax.swing.JButton();
        Obtener_Clientes = new javax.swing.JButton();
        Eliminar_Clientes = new javax.swing.JButton();
        Regresar_ClientesaPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 512));
        setMinimumSize(new java.awt.Dimension(640, 512));
        setPreferredSize(new java.awt.Dimension(640, 512));
        getContentPane().setLayout(null);

        Agregar_Clientes.setBackground(new java.awt.Color(0, 0, 204));
        Agregar_Clientes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Agregar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_Clientes.setText("Agregar cliente");
        Agregar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_Clientes);
        Agregar_Clientes.setBounds(10, 320, 210, 40);

        Obtener_Clientes.setBackground(new java.awt.Color(0, 0, 204));
        Obtener_Clientes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Obtener_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Obtener_Clientes.setText("Obtener clientes");
        Obtener_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener_ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Obtener_Clientes);
        Obtener_Clientes.setBounds(10, 370, 210, 40);

        Eliminar_Clientes.setBackground(new java.awt.Color(0, 0, 204));
        Eliminar_Clientes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Eliminar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Clientes.setText("Eliminar cliente");
        Eliminar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_Clientes);
        Eliminar_Clientes.setBounds(10, 420, 210, 40);

        Regresar_ClientesaPrincipal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Regresar_ClientesaPrincipal.setText("Regresar");
        Regresar_ClientesaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_ClientesaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar_ClientesaPrincipal);
        Regresar_ClientesaPrincipal.setBounds(509, 10, 100, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel4.setText("Menú clientes");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(4, -6, 460, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 50);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_Clientes.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 790, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ClientesActionPerformed
        Ventana_Agregar_Clientes ventana = new Ventana_Agregar_Clientes();
        ventana.setVisible(true);
    }//GEN-LAST:event_Agregar_ClientesActionPerformed

    private void Obtener_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener_ClientesActionPerformed
        Ventana_Obtener_Clientes ventana = new Ventana_Obtener_Clientes();
        ventana.setVisible(true);
    }//GEN-LAST:event_Obtener_ClientesActionPerformed

    private void Eliminar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_ClientesActionPerformed
       Ventana_Eliminar_Clientes ventana = new Ventana_Eliminar_Clientes();
       ventana.setVisible(true);
    }//GEN-LAST:event_Eliminar_ClientesActionPerformed

    private void Regresar_ClientesaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_ClientesaPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_Regresar_ClientesaPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Clientes_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Clientes_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Clientes;
    private javax.swing.JButton Eliminar_Clientes;
    private javax.swing.JButton Obtener_Clientes;
    private javax.swing.JButton Regresar_ClientesaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
