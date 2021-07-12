package libreria;

public class Ejemplo_Lavadora {
    
    private int kilos = 0, TipoDeRopa = 0, LlenadoCompleto = 0, SecadoCompletado = 0, LavadoCompleto = 0 ; 
    
    //Creamos constructor que sera el que recibira los parametros de kilos y tipo de ropa
    public Ejemplo_Lavadora(int kilos, int TipoDeRopa){
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    
    //Creamos metodo para el lavado
    private void Llenado(){
        if(kilos <= 15){
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
            LlenadoCompleto = 1;
        }else {
            System.out.println("El cargamento es muy pesado, disminuya el peso e intente de nuevo.");
        }
    }
    
    //Metodo para el lavado de la ropa
    private void Lavado(){
        Llenado();
        if(LlenadoCompleto == 1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado ligero.");
                System.out.println("Lavando....");
                System.out.println("Lavado finalizado.");
                LavadoCompleto = 1;
            }else if(TipoDeRopa == 2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                System.out.println("Lavado finalizado.");
                LavadoCompleto = 1;
            }
        }
    }
    
    // Metodo para el secado 
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando...");
            System.out.println("Secado finaizado.");
            SecadoCompletado = 1;
        }
        
    }
    
    public void CicloFinalizado(){
        
        Secado();
        if(SecadoCompletado == 1){
            System.out.println("¡Tu ropa está lista y limpia!");
        }
    }

}
