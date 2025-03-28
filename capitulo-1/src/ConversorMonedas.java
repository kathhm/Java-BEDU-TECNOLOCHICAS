/*
* Programa que pida por pantalla introducir una cantidad en euros y devuelva la conversión en US.
* El mensaje del resultado será: *** euros equivalen a *** US dólares
* */

import java.util.Scanner;

public class ConversorMonedas {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese por favor la cantidad en euros que quiere convertir a dólares: ");
        double euros = scanner.nextDouble();

        double dolarEq = 1.08;
        double conversion = euros * dolarEq;

        System.out.println(euros + " euros equivalen a " + conversion + " dólares USD.");







    }


}
