package arbol;
import java.util.Scanner;
public class Arbol {
    String tipo;
    String fruto;
    
    public Arbol (String ti){
        tipo = ti;
    }
    
    public Arbol (String ti, String fru){
        tipo = ti;
        fruto = fru;
    }
    
    public void imprime (){
        System.out.println("El tipo de arbol es: "+tipo);
        System.out.println("El fruto es: "+fruto);
    }
    public static void main (String[] args){
        String tipo;
     
        Scanner ent = new Scanner (System.in);
        System.out.println("Dame el tipo de arbol");
        tipo = ent.next();
    
    
        Arbol ar1 = new Arbol (tipo);
        ar1.imprime();
    
        Arbol ar2 = new Arbol ("NARANJO", "NARANJA");
        ar2.imprime();
    
    }
}
