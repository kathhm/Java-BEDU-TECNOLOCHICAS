public class PasoPorReferencia {
    public static void main(String[] args){

        int variable1 = 25;
        int variable2 = variable1;

        System.out.println("El valor de variable 1 es " + variable1 );
        System.out.println("El valor de variable 2 es " + variable2 );

        variable2 = 78;
        System.out.println("El valor de variable 1 es " + variable1 );
        System.out.println("El valor de variable 2 es " + variable2 );

        CuentaBancaria cuentaDeKat = new CuentaBancaria();
        cuentaDeKat.saldo = 18_000;

        CuentaBancaria cuentaDeCanela = cuentaDeKat;
        cuentaDeCanela.saldo = 10_000;

        System.out.println("Saldo Kat: " + cuentaDeKat.saldo);
        System.out.println("Saldo Cane: " + cuentaDeCanela.saldo);

    }
}
