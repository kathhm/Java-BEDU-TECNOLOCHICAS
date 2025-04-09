public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaDeKat = new CuentaBancaria();
        cuentaDeKat.titular = "Katherine Hinojosa";
        cuentaDeKat.tipoDeCuenta = "nómina";
        cuentaDeKat.saldo = 25_000;

        System.out.println(cuentaDeKat.titular + " tiene una cuenta de " + cuentaDeKat.tipoDeCuenta + " con $" + cuentaDeKat.saldo);

        cuentaDeKat.sacarDinero(500);
        System.out.println("Retiro exitoso. La cuenta de Kat tiene ahora: " + cuentaDeKat.saldo);

        cuentaDeKat.ingresarDinero(800);
        System.out.println("Depósito exitoso. La cuenta de Kat tiene ahora: " + cuentaDeKat.saldo);

        cuentaDeKat.cambiarTipoDeCuenta("ahorro");
        System.out.println("La cuenta de Kat ahora es de tipo: " + cuentaDeKat.tipoDeCuenta);

        double saldo = cuentaDeKat.obtenerSaldo();

        System.out.println("El saldo de Kat es: " + saldo);


    }
}