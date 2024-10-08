
package Clases;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de " + monto + " realizado. Saldo actual: " + saldo);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
