/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ventana_Obtener_Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Obtener_Ventas
     */
    public Ventana_Obtener_Ventas() {
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

        jLabel8 = new javax.swing.JLabel();
        Obtener_Autos_Cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldOVRFC = new javax.swing.JTextField();
        jTextFieldID_Venta = new javax.swing.JTextField();
        jTextFieldOVID_Cliente = new javax.swing.JTextField();
        Obtener_Autos_Buscar = new javax.swing.JButton();
        jTextFieldOVNumero_Serie = new javax.swing.JTextField();
        jTextFieldOVFecha = new javax.swing.JTextField();
        jTextFieldOVPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldOVForma_Pago = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(799, 603));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Forma de pago");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 460, 140, 30);

        Obtener_Autos_Cancelar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Obtener_Autos_Cancelar.setText("Cancelar");
        Obtener_Autos_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener_Autos_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Obtener_Autos_Cancelar);
        Obtener_Autos_Cancelar.setBounds(640, 10, 120, 33);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inserte ID de venta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 67, 220, 35);

        jTextFieldOVRFC.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOVRFC);
        jTextFieldOVRFC.setBounds(100, 140, 242, 29);

        jTextFieldID_Venta.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        getContentPane().add(jTextFieldID_Venta);
        jTextFieldID_Venta.setBounds(290, 70, 110, 35);

        jTextFieldOVID_Cliente.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOVID_Cliente);
        jTextFieldOVID_Cliente.setBounds(160, 210, 81, 29);

        Obtener_Autos_Buscar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Obtener_Autos_Buscar.setText("Buscar");
        Obtener_Autos_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener_Autos_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Obtener_Autos_Buscar);
        Obtener_Autos_Buscar.setBounds(510, 10, 110, 33);

        jTextFieldOVNumero_Serie.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOVNumero_Serie);
        jTextFieldOVNumero_Serie.setBounds(190, 290, 242, 29);

        jTextFieldOVFecha.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOVFecha);
        jTextFieldOVFecha.setBounds(110, 390, 123, 29);

        jTextFieldOVPrecio.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOVPrecio);
        jTextFieldOVPrecio.setBounds(380, 390, 242, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 390, 70, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Precio");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 390, 70, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RFC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 50, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID del Cliente");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 130, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de serie");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 290, 150, 30);

        jTextFieldOVForma_Pago.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOVForma_Pago);
        jTextFieldOVForma_Pago.setBounds(180, 460, 242, 29);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Consultar todos los registros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 520, 220, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel12.setText("Consultar ventas");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(4, -6, 460, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 970, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-azul-181110.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 850, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MySQL db = new MySQL();
        try {
            db.MySQLConnection("root", "", "agencia");
            db.getValuesVentas("ventas");
            db.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Obtener_Autos.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Obtener_Autos_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener_Autos_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_Obtener_Autos_CancelarActionPerformed
public String condicionID_Venta;
    private void Obtener_Autos_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener_Autos_BuscarActionPerformed
        MySQL db = new MySQL();
        try {
            db.MySQLConnection("root", "", "agencia");
            condicionID_Venta = jTextFieldID_Venta.getText();
            String sql = "SELECT RFC, ID_Cliente, Numero_Serie, Fecha, Precio, Forma_Pago FROM ventas WHERE ID_Venta = '"+condicionID_Venta+"'";
            Statement st = MySQL.Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(sql);
            while (resultSet.next()) {
                jTextFieldOVRFC.setText(resultSet.getString("RFC"));
                jTextFieldOVID_Cliente.setText(resultSet.getString("ID_Cliente"));
                jTextFieldOVNumero_Serie.setText(resultSet.getString("Numero_Serie"));
                jTextFieldOVFecha.setText(resultSet.getString("Fecha"));
                jTextFieldOVPrecio.setText(resultSet.getString("Precio"));
                jTextFieldOVForma_Pago.setText(resultSet.getString("Forma_Pago"));   
            }
            db.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Obtener_Ventas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en la consulta de registros, revise que ha introducido un ID de venta existente.");
        }
           
    }//GEN-LAST:event_Obtener_Autos_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Obtener_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Obtener_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Obtener_Autos_Buscar;
    private javax.swing.JButton Obtener_Autos_Cancelar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField jTextFieldID_Venta;
    private javax.swing.JTextField jTextFieldOVFecha;
    private javax.swing.JTextField jTextFieldOVForma_Pago;
    private javax.swing.JTextField jTextFieldOVID_Cliente;
    private javax.swing.JTextField jTextFieldOVNumero_Serie;
    private javax.swing.JTextField jTextFieldOVPrecio;
    private javax.swing.JTextField jTextFieldOVRFC;
    // End of variables declaration//GEN-END:variables
}