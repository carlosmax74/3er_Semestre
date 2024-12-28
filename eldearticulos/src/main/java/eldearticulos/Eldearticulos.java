package eldearticulos;
import java.util.Scanner;
public class Eldearticulos {
    public static void main(String[] args) {
        Scanner E = new Scanner (System.in);
        
        int A = 0; 
        int PZS;
        double SubArt = 0;
        double SubT = 0;
        double Total = 0;
        double Envio = 0;
        double Adi = 0;
        int TotPZS = 0;
        
        while (A < 5){
        A += 1;
        
        System.out.println("Ingrese el precio del Articulo "+A+" : ");
        double P = E.nextDouble();
        
        System.out.println("Ingrese la cantidad de piezas");
        PZS = E.nextInt();
        TotPZS += PZS;
        
        if (PZS > 5) {
            SubArt = PZS * P * 0.20;
                }else {
                    SubArt = PZS * P;}
        
        if (SubArt > 500){
            Adi = SubArt * .10;
            SubT = SubArt +Adi;
        }else {
        SubT = SubArt;}
        
        System.out.println("El Subtotal del Articulo " +A+ " : "+SubT);
        Total += SubT;
         if (Total > 1000){
         Total = Total;}else if (Total <= 1000){
         Total = Total + 100;}
        }
        System.out.println("El Total es : "+Total);
        System.out.println("El costo por envío es: "+A+" : "+ Envio);
        System.out.println("El Total de Piezas es : "+ TotPZS);
    }
}

