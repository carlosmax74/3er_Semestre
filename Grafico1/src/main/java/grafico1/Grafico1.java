package grafico1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class Grafico1 extends JFrame {
private JPanel contentPane;
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Grafico1 frame = new Grafico1();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public Grafico1() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
setBounds(0,0,800,600);
}
public void paint (Graphics g)
{
super.paint(g);
g.setColor (Color.black);
g.drawLine (0, 70, 100, 70);
g.drawRect (150, 70, 50, 70);
g.drawRoundRect (250, 70, 50, 70, 6, 6);
g.drawOval (350, 70, 50, 70);
int [] vx1 = {500, 550, 450};
int [] vy1 = {70, 120, 120};
g.drawPolygon (vx1, vy1, 3);
g.setColor (Color.black);
g.fillRect (150, 270, 50, 70);
g.fillRoundRect (250, 270, 50, 70, 6, 6);
g.fillOval (350, 270, 50, 70);
int [] vx2 = {500, 550, 450};
int [] vy2 = {270, 320, 320};
g.fillPolygon (vx2, vy2, 3);
}
}