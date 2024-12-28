package calculadora_visual;

public class Calculadora_Visual extends javax.swing.JFrame {
    
    String Mem1, Mem2, Operador;
    String Resulta;
    
    
    public Calculadora_Visual() {
        initComponents();
        
    }
    
    public String Calcula(String m1, String m2, String Op){
        Double Resultado = 0.0;
        if (Op.equals("+")){
            Resultado = Double.parseDouble(m1) + Double.parseDouble(m2);
        }
        else if (Op.equals("-")){
            Resultado = Double.parseDouble(m1) - Double.parseDouble(m2);
        }
        else if (Op.equals("*")){
            Resultado = Double.parseDouble(m1) * Double.parseDouble(m2);
        }
        else if (Op.equals("/")){
            try{
            Resultado = Double.parseDouble(m1) / Double.parseDouble(m2);
            }catch (ArithmeticException execption){
                Pantalla.setText("Error de división entre 0");
            }
        }
                Resulta = Resultado.toString();
        return Resulta;}
    
    
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JTextField();
        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();
        Divi = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multi = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Limpieza = new javax.swing.JButton();
        masmenos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pantalla.setBackground(new java.awt.Color(204, 204, 204));
        Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(153, 153, 153));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(153, 153, 153));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(153, 153, 153));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(153, 153, 153));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(153, 153, 153));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(153, 153, 153));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(153, 153, 153));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(153, 153, 153));
        b7.setText("8");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(153, 153, 153));
        b8.setText("7");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(153, 153, 153));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bPunto.setBackground(new java.awt.Color(0, 102, 102));
        bPunto.setText(".");
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });

        Divi.setBackground(new java.awt.Color(0, 102, 102));
        Divi.setText("/");
        Divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiviActionPerformed(evt);
            }
        });

        Resta.setBackground(new java.awt.Color(0, 102, 102));
        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Multi.setBackground(new java.awt.Color(0, 102, 102));
        Multi.setText("x");
        Multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiActionPerformed(evt);
            }
        });

        Suma.setBackground(new java.awt.Color(0, 102, 102));
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Igual.setBackground(new java.awt.Color(255, 102, 51));
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Limpieza.setBackground(new java.awt.Color(255, 102, 51));
        Limpieza.setText("AC");
        Limpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiezaActionPerformed(evt);
            }
        });

        masmenos.setBackground(new java.awt.Color(0, 102, 102));
        masmenos.setText("+/-");
        masmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masmenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(masmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Limpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Divi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(masmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Limpieza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Divi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaActionPerformed
        if (!Pantalla.getText().equals("")){
        Mem1 = Pantalla.getText();
        Pantalla.setText("");}
    }//GEN-LAST:event_PantallaActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        Pantalla.setText(Pantalla.getText()+"5");

    }//GEN-LAST:event_b5ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        Pantalla.setText(Pantalla.getText()+"0");
    }//GEN-LAST:event_b0ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        Pantalla.setText(Pantalla.getText()+"6");

    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        Pantalla.setText(Pantalla.getText()+"7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        Pantalla.setText(Pantalla.getText()+"8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        Pantalla.setText(Pantalla.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed
        if(!Pantalla.getText().contains(".")) {
            Pantalla.setText(Pantalla.getText()+".");
            bPunto.setEnabled(false);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(true);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_bPuntoActionPerformed

    private void DiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiviActionPerformed
         if (!Pantalla.getText().equals("")){
        Mem1 = Pantalla.getText();
        Operador = "/";
        Pantalla.setText("");}
         
        if(!Pantalla.getText().contains(".")) {
            bPunto.setEnabled(true);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(false);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_DiviActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
         if (!Pantalla.getText().equals("")){
        Mem1 = Pantalla.getText();
        Operador = "-";
        Pantalla.setText("");
         }
         
        if(!Pantalla.getText().contains(".")) {
            bPunto.setEnabled(true);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(false);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_RestaActionPerformed

    private void MultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiActionPerformed
         if (!Pantalla.getText().equals("")){
        Mem1 = Pantalla.getText();
        Operador = "*";
        Pantalla.setText("");}
         
        if(!Pantalla.getText().contains(".")) {
            bPunto.setEnabled(true);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(false);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_MultiActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
         if (!Pantalla.getText().equals("")){
        Mem1 = Pantalla.getText();
        Operador = "+";
        Pantalla.setText("");}
         
        if(!Pantalla.getText().contains(".")) {
            bPunto.setEnabled(true);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(false);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_SumaActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        String Resulta;
         if (!Pantalla.getText().equals("")){
        Mem2 = Pantalla.getText();
        Resulta = Calcula (Mem1, Mem2, Operador);
        Pantalla.setText(Resulta);}
         
    }//GEN-LAST:event_IgualActionPerformed

    private void LimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiezaActionPerformed
        Mem1 = "";
        Mem2 = "";
        Pantalla.setText("");
        
        if(!Pantalla.getText().contains(".")) {
            bPunto.setEnabled(true);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(false);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_LimpiezaActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Pantalla.setText(Pantalla.getText()+"1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Pantalla.setText(Pantalla.getText()+"2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Pantalla.setText(Pantalla.getText()+"3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        Pantalla.setText(Pantalla.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void masmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masmenosActionPerformed
       String Resta;
        if(Pantalla.getText().contains(".")){
            Double me1;
            me1 = Double.parseDouble(Pantalla.getText()) *-1; 
            Resta = me1.toString();            
        } else {
            Integer me1;
            me1 = Integer.parseInt(Pantalla.getText()) *-1;
            Resta = me1.toString();
        }
            Pantalla.setText(Resta);
            
        if(!Pantalla.getText().contains(".")) {
            Pantalla.setText(Pantalla.getText()+".");
            bPunto.setEnabled(false);
        }
        if (Pantalla.getText().contains(".")){
            Pantalla.setEnabled(true);
            Pantalla.setText(Pantalla.getText());
        }
    }//GEN-LAST:event_masmenosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Divi;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Limpieza;
    private javax.swing.JButton Multi;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bPunto;
    private javax.swing.JButton masmenos;
    // End of variables declaration//GEN-END:variables
}
