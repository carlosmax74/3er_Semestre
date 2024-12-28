package clubdeportivo;

import java.util.Scanner;

public class ClubDeportivo {
    Scanner E = new Scanner (System.in);
    double Natacion, Otra_disciplina, GYM;
    String Nom;
    
    public String Nombre (){
        System.out.println("Bienvenido al Club Deportivo");
        System.out.println("Ingrese su nombre: ");
        Nom = E.nextLine();
        return null;
    }
     
    public double Clases (){
        Natacion = 80;
        Otra_disciplina = 40;
        GYM = 30;
        return 0;
    }
    

    public static void main(String[] args) {
        
        ClubDeportivo N = new ClubDeportivo();
        Socio M = new Socio();
        N.Nombre();
        M.HE();
        System.out.println("Hola, Bienvenid@ "+N.Nom+" (gracias por su preferencia),"
                + " esperamos que haya disfrutado de los servicios que brinda nuestro Club Deportivo.\nProcedemos a darles sus estadísticas :\n");
        System.out.println("Pago por horas de natación: "+M.HN*80+"\n");
        System.out.println("Pago por horas en el GYM: "+M.HG*30+"\n");
        System.out.println("Pago por horas en otras disciplinas: "+M.HOD*40+"\n");
        M.HT();
        M.HD();

    }
}
