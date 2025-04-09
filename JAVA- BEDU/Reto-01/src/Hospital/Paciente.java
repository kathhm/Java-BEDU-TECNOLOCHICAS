package Hospital;


public class Paciente {

    String nombre;
    int edad;
    String numExpediente;


    public void mostrarInformacion() {
        System.out.println("El nombre de la paciente es: " + nombre+ ", su edad es " + edad + " años y su número de expediente es: " + numExpediente);
    }
}