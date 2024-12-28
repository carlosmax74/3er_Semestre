package bonosg;
import java.util.Scanner;
public class Proceso {
    Scanner E = new Scanner(System.in);
        
        double BS = 0, BA = 0, S;
        int A;
        
        public double getDatos(){
        System.out.println("Ingrese la antigüedad: ");
        this.A = E.nextInt();
        
        System.out.println("Ingrese el sueldo: ");
        this.S = E.nextDouble();
        return 0;}
        
        public double setProceso(){
        if (S < 100){
         BS = S / 100 *25;
            }else if((S > 1000) && (S <= 3500)){
                BS = S / 100 * 15;}else if (S > 3500){
                      BS = S / 100 * 10;
                }
        if ((A > 2) && (A < 5)){
            BA = S / 100 * 20;}else if (A >= 5){
                BA = S / 100 * 30;
            }
        if (BA > BS){
            System.out.println("=======================");
            System.out.println("El bono es: "+BA );
        }
        else {
            System.out.println("=======================");
            System.out.println("El bono es: "+BS);
        }
        return 0;
        } 
}
