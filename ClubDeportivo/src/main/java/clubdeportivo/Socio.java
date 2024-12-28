
package clubdeportivo;

import java.util.Scanner;

public class Socio {
    
    Scanner E = new Scanner (System.in);
    public double HN, HOD, HG, HT, HD, HP;
    
    public double HE (){
        System.out.println("Ingrese las horas que realizo en natación (AL MES): ");
        HN = E.nextDouble();
        System.out.println("Ingrese las horas que realizo en el GYM(AL MES): ");
        HG = E.nextDouble();
        System.out.println("Ingrese las horas que realizo en alguna otra disciplina(AL MES): ");
        HOD = E.nextDouble();
        System.out.println("=========================================================\n");
        return 0;
    }
    
    public double HT (){
        ClubDeportivo M = new ClubDeportivo();
        HT = HN+HG+HOD;
        HP = (HN*80) + (HG * 30) + (HOD * 40);
        System.out.println("Horas en total del mes que se realizo actividad: "+ HT);
        System.out.println("Pago por horas que se realizo actividad al mes: "+HP);
        return HT;
    }
    
    public double HD (){
        
        if (HT >= 0 && HT <= 11){
            System.out.println("Usted no tiene descuento por este mes :)");
        
        }else if (HT >= 12 && HT <= 19){
            HD = HP / (100) * (5);
            System.out.println("El descuento de este mes es de: "+HD);
        
        }else if (HT >= 20 && HT <= 30){
            HD = HP * (.1);
            System.out.println("El descuento de este mes es de: "+HD);
        
        }else if (HT >=31 && HT <= 44){
            HD = HP * (.2);
            System.out.println("El descuento de este mes es de: "+HD);
        
        }else if (HT >= 45 && HT <= 59){
            HD = HP * (.3);
            System.out.println("El descuento de este mes es de: "+HD);
            
        }else if (HT >= 60){
            HD = HP * (.5);
            System.out.println("El descuento de este mes es de: "+HD);
        }
        return HD;
    }
}
