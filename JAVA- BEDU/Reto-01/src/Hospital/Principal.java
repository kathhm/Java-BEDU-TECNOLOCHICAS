package Hospital;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        paciente1.nombre = sc.nextLine();
        System.out.print("Ingresa la edad del paciente: ");
        paciente1.edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el número de expediente del paciente: ");
        paciente1.numExpediente = sc.nextLine();

        paciente1.mostrarInformacion();

    }
}
