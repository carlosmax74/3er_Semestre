package club3;

import java.util.Scanner;

public class Socio {
    private String nombre;
    private int TarifNat, TarifDis, TarifGym, tp,th, hn, hd, hg;
    
    public Socio (String nombre, int TarifNat, int TarifDis, int TarifGym){
        this.nombre = nombre;
        this.TarifNat = TarifNat;
        this.TarifDis = TarifDis;
        this.TarifGym = TarifGym;
    }
    
    public void PedirDatos(){
        Scanner ent = new Scanner(System.in);
        System.out.println("\nCaptura de horas en el club del Socio: "+this.nombre);
        System.out.println("Dame las horas de natación: ");
        hn = ent.nextInt();
        System.out.println("Dame las horas de otra Disciplina");
        hd = ent.nextInt();
        System.out.println("Dame las horas de GYM");
        hg = ent.nextInt();
        th = hn+hd+hg;
        tp = hn*this.TarifNat + hd * this.TarifDis + hg * this.TarifGym;
        System.out.println("El total a pagar del socio es:" + tp);
    }
    
    public void Descto(){
    if (th>=0 && th<=11)
        System.out.println("De acuerdo al total de horas, el socio no tiene descuento :( ");
    if (th>=12 && th>=19)
            System.out.println("De acuerdo al total de horas, el socio tiene un descuento del 5%");
    if (th>=20 && th<=30)
            System.out.println("De aucerdo al total de horas, el socio tiene un descuento del 10%");
    if (th>=31 && th<=44)
            System.out.println("De aucerdo al total de horas, el socio tiene un descuento del 20%");
    if (th>=45 && th<=59)
            System.out.println("De aucerdo al total de horas, el socio tiene un descuento del 30%");
    if (th>=60)
            System.out.println("De aucerdo al total de horas, el socio tiene un descuento del 50%");
    }
    
    public int RetornarHoras(){
    return th;}
}
