package grafico4;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grafico4 extends JFrame {
private JPanel contentPane;
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Grafico4 frame = new Grafico4();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public Grafico4() {
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
Toolkit t = Toolkit.getDefaultToolkit ();
Image imagen = t.getImage ("Piolin.png");
g.drawImage (imagen, 0, 0, this);
}
}