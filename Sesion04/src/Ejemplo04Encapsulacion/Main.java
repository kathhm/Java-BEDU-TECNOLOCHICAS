package Ejemplo04Encapsulacion;


public class Main {
    public static void main(String[] args) {

        // Creamos un empleado y asignamos datos de forma segura
        Empleado empleado = new Empleado();
        empleado.setNombre("Valeria");
        empleado.setEdad(29);
        empleado.mostrarInfo();

        // Creamos un contrato que no se puede modificar después
        Contrato contrato = new Contrato("Tiempo completo", 25000.00);
        contrato.mostrarInfo();
    }
}