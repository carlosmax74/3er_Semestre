package club;
import java.util.Scanner;
public class Socio {
    public Scanner E = new Scanner (System.in);
     public int ant, ant2, ant3;
    
    public int Ant (){
        System.out.println("Ingrese los años de antigüedad socio 1: ");
        ant= E.nextInt();
        System.out.println("================================");
        
        
        System.out.println("Ingrese los años de antigüedad socio 2: ");
        ant2= E.nextInt();
        System.out.println("================================");
        
        System.out.println("Ingrese los años de antigüedad socio 3: ");
        ant3= E.nextInt();
        System.out.println("================================");
        return 0;
    }
}