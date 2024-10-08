
package Clases;


public class CuentaAhorros extends CuentaBancaria {
private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void calcularInteres() {
        double interes = saldo * tasaInteres;
        depositar(interes);
        System.out.println("Interés de " + interes + " calculado y añadido.");
    }
}
    

