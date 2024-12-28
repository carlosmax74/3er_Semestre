package banco;

public class CLIENTE {
    static private String ss;
    private String nombre;
    private int monto;
    
    public CLIENTE (String nom){
    nombre = nom; 
    monto = 0;
    }
    
    public void Depositar (int m){
    monto = monto + m;
    }
    
    public void Extraer (int m){
    monto = monto - m;
    }
    
    public int RetornarMonto(){
        return monto;
    }
    
    public void Imprimir(){
        System.out.println(nombre+ " tiene depositado la suma de: " + monto);}
    
    
}
