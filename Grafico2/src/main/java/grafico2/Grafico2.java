package grafico2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class Grafico2 extends JFrame {
private JPanel contentPane;
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Grafico2 frame = new Grafico2();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public Grafico2() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
contentPane.setLayout(new BorderLayout(0, 0));
setContentPane(contentPane);
setBounds(0,0,800,600);
}

public void paint (Graphics g)
{
super.paint(g);
g.setColor (Color.blue);
g.drawString("Primer linea",10,200);
g.drawString("Segunda linea",10,300);
}
}