/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author PCxxCC1
 */
public class Ventana_Obtener_Autos extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Obtener_Autos
     */
    public Ventana_Obtener_Autos() {
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
        jTextField1 = new javax.swing.JTextField();
        Obtener_Autos_Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOAMarca = new javax.swing.JTextField();
        jTextFieldOAModelo = new javax.swing.JTextField();
        jTextFieldOAAnio = new javax.swing.JTextField();
        jTextFieldOATipo = new javax.swing.JTextField();
        jTextFieldOAColor = new javax.swing.JTextField();
        jTextFieldOAConfig_Motor = new javax.swing.JTextField();
        jTextFieldOATransmision = new javax.swing.JTextField();
        jTextFieldOAEquipamiento = new javax.swing.JTextField();
        Obtener_Autos_Cancelar = new javax.swing.JButton();
        Buscar_Todos_Registros = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(799, 603));
        setMinimumSize(new java.awt.Dimension(799, 603));
        setPreferredSize(new java.awt.Dimension(799, 603));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inserte Número de Serie:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 280, 35);

        jTextField1.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(320, 60, 278, 36);

        Obtener_Autos_Buscar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Obtener_Autos_Buscar.setText("Consultar");
        Obtener_Autos_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener_Autos_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Obtener_Autos_Buscar);
        Obtener_Autos_Buscar.setBounds(520, 10, 120, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 60, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 70, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 280, 40, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 230, 40, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Color");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 330, 60, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Configuración del motor");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 430, 210, 22);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Transmisión");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 380, 107, 22);

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Equipamiento");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 490, 119, 22);

        jTextFieldOAMarca.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOAMarca);
        jTextFieldOAMarca.setBounds(110, 120, 130, 29);

        jTextFieldOAModelo.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOAModelo);
        jTextFieldOAModelo.setBounds(100, 180, 140, 29);

        jTextFieldOAAnio.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOAAnio);
        jTextFieldOAAnio.setBounds(100, 280, 100, 29);

        jTextFieldOATipo.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jTextFieldOATipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOATipoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldOATipo);
        jTextFieldOATipo.setBounds(100, 230, 181, 29);

        jTextFieldOAColor.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOAColor);
        jTextFieldOAColor.setBounds(100, 330, 181, 29);

        jTextFieldOAConfig_Motor.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOAConfig_Motor);
        jTextFieldOAConfig_Motor.setBounds(230, 430, 225, 29);

        jTextFieldOATransmision.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOATransmision);
        jTextFieldOATransmision.setBounds(130, 380, 180, 29);

        jTextFieldOAEquipamiento.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        getContentPane().add(jTextFieldOAEquipamiento);
        jTextFieldOAEquipamiento.setBounds(140, 490, 410, 29);

        Obtener_Autos_Cancelar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Obtener_Autos_Cancelar.setText("Cancelar");
        Obtener_Autos_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener_Autos_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Obtener_Autos_Cancelar);
        Obtener_Autos_Cancelar.setBounds(650, 10, 135, 30);

        Buscar_Todos_Registros.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Buscar_Todos_Registros.setText("Consultar todos los registros");
        Buscar_Todos_Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_Todos_RegistrosActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar_Todos_Registros);
        Buscar_Todos_Registros.setBounds(560, 540, 217, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel12.setText("Consultar automóviles");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(4, -6, 460, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 970, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Obtener_Autos.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(799, 603));
        jLabel1.setMinimumSize(new java.awt.Dimension(799, 603));
        jLabel1.setPreferredSize(new java.awt.Dimension(799, 603));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-170, -160, 980, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String condicionNumero_Serie;
    private void Obtener_Autos_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener_Autos_BuscarActionPerformed
        try {
            MySQL db = new MySQL();
            db.MySQLConnection("root", "", "agencia");
            condicionNumero_Serie = jTextField1.getText();
            String sql = "SELECT Marca, Modelo, Anio, Tipo, Color, Configuracion_Motor, Transmision, Equipamiento FROM autos WHERE Numero_Serie = '"+condicionNumero_Serie+"'";
            Statement st = MySQL.Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(sql);
            while (resultSet.next()) {
                jTextFieldOAMarca.setText(resultSet.getString("Marca"));
                jTextFieldOAModelo.setText(resultSet.getString("Modelo"));
                jTextFieldOAAnio.setText(resultSet.getString("Anio"));
                jTextFieldOATipo.setText(resultSet.getString("Tipo"));
                jTextFieldOAColor.setText(resultSet.getString("Color"));
                jTextFieldOAConfig_Motor.setText(resultSet.getString("Configuracion_Motor"));
                jTextFieldOATransmision.setText(resultSet.getString("Transmision"));
                jTextFieldOAEquipamiento.setText(resultSet.getString("Equipamiento"));    
            }
            db.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Obtener_Autos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en la consulta de registros, revise que ha introducido un número de serie existente.");
        }
    }//GEN-LAST:event_Obtener_Autos_BuscarActionPerformed

    private void Buscar_Todos_RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_Todos_RegistrosActionPerformed
       MySQL db = new MySQL();
        try {
            db.MySQLConnection("root", "", "agencia");
            db.getValuesAutos("autos");
            db.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Obtener_Autos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_Buscar_Todos_RegistrosActionPerformed

    private void Obtener_Autos_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener_Autos_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_Obtener_Autos_CancelarActionPerformed

    private void jTextFieldOATipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOATipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOATipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Ventana_Obtener_Autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Obtener_Autos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_Todos_Registros;
    private javax.swing.JButton Obtener_Autos_Buscar;
    private javax.swing.JButton Obtener_Autos_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldOAAnio;
    private javax.swing.JTextField jTextFieldOAColor;
    private javax.swing.JTextField jTextFieldOAConfig_Motor;
    private javax.swing.JTextField jTextFieldOAEquipamiento;
    private javax.swing.JTextField jTextFieldOAMarca;
    private javax.swing.JTextField jTextFieldOAModelo;
    private javax.swing.JTextField jTextFieldOATipo;
    private javax.swing.JTextField jTextFieldOATransmision;
    // End of variables declaration//GEN-END:variables
}