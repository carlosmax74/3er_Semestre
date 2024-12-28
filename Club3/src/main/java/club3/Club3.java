package club3;
public class Club3 {
    private Socio s1, s2, s3;
    
    public Club3(){
        s1 = new Socio("Juan", 80, 40, 30);
        s2 = new Socio("Maria", 80, 40, 30);
        s3 = new Socio("Pedro", 80, 40, 30);
    }
    
    public void Operar(){
        s1.PedirDatos();
        s1.Descto();
        System.out.println("El total de horas del socio es de "+s1.RetornarHoras());
    
        s2.PedirDatos();
        s2.Descto();
        System.out.println("El total de horas del socio 1 es de "+s2.RetornarHoras());
        
    
        if (s2.RetornarHoras()>s2.RetornarHoras() && s1.RetornarHoras()>s3.RetornarHoras())
            System.out.println("Felicidades al socio3 que tuvo el mayor numero de horas en el club");
        else 
            if (s2.RetornarHoras()>s3.RetornarHoras())
                System.out.println("Felicidades al socio2 que tuvo el mayor numero de horas en el club ");
            else 
                System.out.println("Felicidades al socio3 que tuvo mayo numero de horas en el club");
    }
    

    public static void main(String[] args) {
        Club3 c1 = new Club3();
        c1.Operar();
    }
}
