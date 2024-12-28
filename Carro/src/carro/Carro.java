package carro;
public class Carro {
    public static void main(String[] args) {
        Molde cars1 = new Molde();
       cars1.color ="rojo";
       cars1 .nombre="Rayo McQueen";
        System.out.println("Hola soy" + cars1.nombre);
        System.out.println("Soy de color: "+ cars1.color);
        cars1.encender();
        cars1.avanzar();
        cars1.frenar();
        System.out.println("===================");
        
        Molde cars2 = new Molde();
        cars2.color="naranja oxido";
        cars2.nombre="Mate";
        System.out.println("\nHola soy "+ cars2.nombre);
        System.out.println("Soy de color: "+cars2.nombre);
        cars2.encender();
        cars2.apagar();
        System.out.println("===================");
        
        Molde vocho = new Molde();
        vocho.color="verde";
        vocho.nombre="Escarabajo";
        System.out.println("\nHols soy "+ vocho.nombre);
        System.out.println("Soy de color: "+vocho.color);
        vocho.encender();
        vocho.gasolina();
    }
    
}
