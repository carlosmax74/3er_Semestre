package banco;
public class BANCO {
    
    String Saludo;
    private CLIENTE cliente1, cliente2, cliente3;
    
    public BANCO(){
    cliente1 = new CLIENTE("Juan");
    cliente2 = new CLIENTE("Ana");
    cliente3 = new CLIENTE("Pedro");
    }
    
    public void Operar(){
    cliente1.Depositar(100);
    cliente2.Depositar(150);
    cliente3.Depositar(200);
    cliente3.Depositar(150);
    }
    
    public void DepositosTotales(){
    int t=cliente1.RetornarMonto()+cliente2.RetornarMonto()+cliente3.RetornarMonto();
        System.out.println("El total del dinero en el banco es: " + t);
    cliente1.Imprimir();
    cliente2.Imprimir();
    cliente3.Imprimir();
    }
    
    public static void main(String[] args) {
        
            BANCO banco1 = new BANCO();
            banco1.Operar();
            banco1.DepositosTotales();
      
    }
    
}
