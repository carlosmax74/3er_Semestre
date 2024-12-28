package calcularpagoquemasconvengaaltrabajador;
import java.util.Scanner;
public class Calcularpagoquemasconvengaaltrabajador {

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        
        double BS = 0;
        double BA = 0;
        
        System.out.println("Ingrese la antigüedad: ");
        int A = E.nextInt();
        
        System.out.println("Ingrese el sueldo: ");
        double S = E.nextDouble();
        
        if (S < 100){
         BS = S / 100 *25;
            }else if((S > 1000) && (S <= 3500)){
                BS = S / 100 * 15;}else if (S > 3500){
                      BS = S / 100 * 10;}
        
        if ((A > 2) && (A < 5)){
            BA = S / 100 * 20;}else if (A >= 5){
                BA = S / 100 * 30;}
        
        if (BA > BS){
        System.out.println("El bono es: "+BA );}else {
            System.out.println("El bono es: "+BS);}
    }
}
