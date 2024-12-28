package articulossg;
import java.util.Scanner;
public class Pedirdatos_y_proceso {
    Scanner E = new Scanner (System.in);
        int A = 0, PZS, TotPZS = 0;
        double SubArt = 0, SubT = 0, Total = 0, Envio = 0, Adi = 0, P;
        
        public double setProceso(){
        while (A < 5){
        A += 1;
        
            System.out.println("   Ingrese el precio del Articulo "+A  );
            System.out.println("=======================================");
            System.out.println("Ingrese el precio ");
        this.P = E.nextDouble();
        
            System.out.println("Ingrese la cantidad de piezas");
        this.PZS = E.nextInt();
        TotPZS += PZS;
        
        if (PZS > 5) {
            SubArt = PZS * P * 0.20;
        }
        else {
            SubArt = PZS * P;
        }
        if (SubArt > 500){
            Adi = SubArt * .10;
            SubT = SubArt +Adi;
        }
        else{
        this.SubT = SubArt;
        }
        
            System.out.println("El Subtotal del Articulo " +A+ " : "+SubT);
            System.out.println("=======================================");
        Total += SubT;
        
         if (Total > 1000){
         Total = Total;
         }
         else if (Total <= 1000){
         Total = Total + 100;}
        }
            System.out.println("El Total es : "+Total);
            System.out.println("El costo por envío es: "+A+" : "+ Envio);
            System.out.println("El Total de Piezas es : "+ TotPZS);
        return 0;
    }
}

