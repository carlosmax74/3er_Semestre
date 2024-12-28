
public class JuegoDeDados extends javax.swing.JFrame {
private Dado dado1=new Dado();
private Dado dado2=new Dado();
private Dado dado3=new Dado();
   
/*
    En este constructor "JuegoDeDados" crea una ventana color gris claro con 
    "getContentPane()" "setBackground" y "java.awt.Color", también agrega 3
    imagenes las cuales las acomoda de forma horizontal e inicializa 4 jLabel
    con un valor booleano en "falso". 
*/
    public JuegoDeDados() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(50, 50, 50));
        this.add(dado1);
        this.add(dado2);
        this.add(dado3);
        dado1.setLocation(20, 40);
        dado2.setLocation(280, 40);
        dado3.setLocation(540, 40);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(140, 174, 227));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("AGITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(140, 174, 227));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("TIRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel1.setText("GANASTE!!!");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setText("SUERTE PARA LA PROXIMA!!!!!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Perdio.gif"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Festejo.gif"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JUEGO DE DADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    En esta parte se declara el "jButton1" y se le asginan funciones las 
    cuales son:
    En cuanto se presione este mismo los 4 jLabel antes mencionados aún se
    mantengan en "falso" y despues utiliza el metodo "agitar" el cual almacena
    la representación de los dados agitandose y el valor aleatorio del 1 al 6.
*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jLabel1.setVisible(false);
       jLabel5.setVisible(false);
       jLabel3.setVisible(false);
       jLabel4.setVisible(false);
        dado1.agitar();
        dado2.agitar();
        dado3.agitar();
    }//GEN-LAST:event_jButton1ActionPerformed

/*
    En esta parte se declara el "jButton2" y se le aseginan sus funciones las
    cuales son:
    En cuanto se presiona se muestran 3 imagenes de 3 caras de 3 dados, las
    cuales van a depender del valor que arrojo el metodo aleatorio "agitar",
    despues se hace una comparacion con un "if" la cual nos sirve para saber
    si las 3 caras son iguales para despues mostrar el mensaje "GANASTE!!!!!"
    y el gif y si no mostrar el mensaje "SUERTE PARA LA PROXIMA!!!!!" junto con
    el gif.  
*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dado1.imprimir();
        dado2.imprimir();
        dado3.imprimir();
        
         if (dado1.retornarValor()==dado2.retornarValor() && dado1.retornarValor()==dado3.retornarValor())
         {    jLabel1.setVisible(true);
              jLabel5.setVisible(true);
              jLabel3.setVisible(false);
              jLabel4.setVisible(false);}
         else
         {  jLabel1.setVisible(false);
            jLabel5.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
         }  
    }//GEN-LAST:event_jButton2ActionPerformed

/*
    Esta parte del código se encarga de incializar una aplicación Java
    que muestra la interfaz respresentada por la clase "JuegoDeDados".
*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoDeDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
