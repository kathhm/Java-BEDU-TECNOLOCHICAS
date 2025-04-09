public class CuentaBancaria {
    String titular;
    String tipoDeCuenta;
    double saldo;


    //métodos
    void sacarDinero(double cantidad){
        saldo -= cantidad;
    }

    void ingresarDinero(double cantidad){
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(String nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo(){
        return saldo;
    }

}
