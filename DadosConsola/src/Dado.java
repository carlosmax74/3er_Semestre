
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*  En esta clase "Dado" se le asigna un tamaño a la imagen de la cara del 
    dado con 2 variables "int" y despúes cargan las imagenes de las caras 
    del dado y el gif del dado girando utilizando la variable "ImageIcon".
*/
public class Dado extends JLabel{
    private int valor;
    private int ancho=240;
    private int alto=240;
    private ImageIcon cara1 = new ImageIcon(getClass().getResource("/images/Cara1.jpg"));
    private ImageIcon cara2 = new ImageIcon(getClass().getResource("/images/Cara2.jpg"));
    private ImageIcon cara3 = new ImageIcon(getClass().getResource("/images/Cara3.jpg"));
    private ImageIcon cara4 = new ImageIcon(getClass().getResource("/images/Cara4.jpg"));
    private ImageIcon cara5 = new ImageIcon(getClass().getResource("/images/Cara5.jpg"));
    private ImageIcon cara6 = new ImageIcon(getClass().getResource("/images/Cara6.jpg"));
    private ImageIcon agitar = new ImageIcon(getClass().getResource("/images/Dadogirando.gif"));

    
/*
    Se crea el objeto "Dado" con base a las variables "ancho" y "ancho" y
    esto hace que el dado sea visible en la interfaz.
*/    
    public Dado(){
        super();
         Dimension d = new Dimension(ancho,alto);
         setSize( d );
         setPreferredSize( d );
         setText("");                
         setVisible(true);  
         
         }
    
/*
    Se crea el metodo "tirar" el cual nos va a servir para simular el que gira
    el dado y crear o elegir algun valor aleatorio entre el 1 y el 6.
*/    
    public void agitar(){
        valor=1+(int)(Math.random()*6);
        setIcon(agitar);
    }

/*  Se crea el metodo "imprimir" el cual nos sirve para presentar en la
    interfaz la cara del dado que salio, apoyandonos de la variable "valor"
    antes declara.
*/    
    public void imprimir(){
       switch (valor) {
           case 1:
               setIcon( cara1 );
               break;
           case 2:
               setIcon( cara2 );
               break;
           case 3:
               setIcon( cara3 );
               break;
           case 4:
               setIcon( cara4 );
               break;
           case 5:
               setIcon( cara5 );
               break;
            case 6:
               setIcon( cara6 );
               break;
       }
            
    }

/*  
    El metodo "retornarValor" nos sirve para retornar del dado que obtuvimos
*/     
    public int retornarValor(){
        return valor;
    }
    
}
