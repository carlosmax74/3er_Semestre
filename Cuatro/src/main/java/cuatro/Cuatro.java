package cuatro;
import java.io.*;
public class Cuatro {
    private static int metodo(){
    int valor = 0;
    try{
    valor = valor + 1;
    valor = valor + Integer.parseInt("W");
        System.out.println("Valor al final del try: " + valor);
    throw new IOException();
    }catch(IOException e){
    valor = valor + Integer.parseInt("42");
        System.out.println("Valor al final del catch: " + valor);
    }
    valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    public static void main(String[] args) {
    try{
        System.out.println(metodo());
    }catch(Exception e){
        System.out.println("Expcion en metodo()");
    e.printStackTrace();}
    }
}
