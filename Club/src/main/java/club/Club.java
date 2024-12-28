package club;
import java.util.Scanner;
public class Club {
    Scanner E = new Scanner (System.in);
    String nom, nom2, nom3;
    
   public String Nombre (){
       
        System.out.println("Ingrese su nombre socio numero 1: ");
        nom = E.nextLine();
        System.out.println("================================");
        
        System.out.println("Ingrese su nombre socio numero 2: ");
        nom2 = E.nextLine();
        System.out.println("================================");
        
        System.out.println("Ingrese su nombre socio numero 3: ");
        nom3 = E.nextLine();
        System.out.println("================================");
        return null;
   }
    public static void main(String[] args) {
       
      Club M = new Club();
      Socio N = new Socio();
      M.Nombre();
      N.Ant();
        System.out.println("================================");
      if (N.ant > N.ant2 && N.ant > N.ant3){
        System.out.println("El socio "+M.nom+" tiene una antiguedad de "+N.ant+" años que es mayor a la de los demas");
        }else if (N.ant2 > N.ant && N.ant2 > N.ant3){
            System.out.println("El socio "+M.nom+" tiene una antiguedad de "+N.ant+" años que es mayor a la de los demas");
                }else{
                    System.out.println("El socio "+M.nom+" tiene una antiguedad de "+N.ant+" años que es mayor a la de los demas");
        }
    }
}

