/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formula;
import java.util.Scanner;
public class Formula {

    public static void main(String[] args) {
        Scanner A = new Scanner (System.in);
     
     System.out.println ("Ingrese el valor de A: ");
     
     double AA = A.nextDouble();
     double B = 9*((AA+5)/(5))+(AA)*5;
     
    System.out.println("El resultado es: "+B);
    }  
}
