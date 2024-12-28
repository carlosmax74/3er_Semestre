package animal;
public class ANIMAL {
    public static void main(String[] args) {
        
        Perro ani1 = new Perro();
        ani1.nombre = "Solovino";
        ani1.color = "Manchado";
        ani1.tamanio = "Mediano";
        System.out.println("Hola, me llamo "+ani1.nombre+" soy un perro\n"
                +ani1.tamanio+" y "+ani1.color+", al que sus dueños quieren mucho");
        ani1.pasear();
        ani1.jugar();
        ani1.descanso();
        
        Perro ani2 = new Perro();
        ani2.nombre = "Luci";
        ani2.color = "Negro";
        ani2.tamanio = "Grande";
        System.out.println("\nHola, me llamo "+ani2.nombre+" soy un perro\n"
                +ani2.tamanio+" y de color "+ani2.color+", al que sus dueños quieren mucho");
        ani2.pasear();
        ani2.orinar();
        ani2.heces();
        
        Perro ani3 = new Perro();
        ani3.nombre = "Sultan";
        ani3.color = "Miel";
        ani3.tamanio = "Pequeño";
        System.out.println("\nHola, me llamo "+ani3.nombre+" soy un perro\n"
                +ani3.tamanio+" y de color "+ani3.color+", al que sus dueños quieren mucho");
        ani3.jugar();
        ani3.comer();
        ani3.agua();
        
        
    }
    
}
