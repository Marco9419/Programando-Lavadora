package ejemplo_lavadora;

import libreria.Ejemplo_Lavadora;
import java.util.Scanner;

public class lavadora_1 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digita 1.-  si tu ropa es blanca o 2.-   si tu ropa es de color.");
        int TipoDeRopa = entrada.nextInt();

        System.out.println("Ingresa los kilos de ropa.");
        int kilos = entrada.nextInt();

        Ejemplo_Lavadora mensajero = new Ejemplo_Lavadora(kilos, TipoDeRopa);

        mensajero.CicloFinalizado();

    }

}
