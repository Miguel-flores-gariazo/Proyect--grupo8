
package Clases;

public class CuentaCorriente extends CuentaBancaria {
   private double limiteCredito;

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteCredito) {
        super(numeroCuenta, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo + limiteCredito) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Supera el límite de crédito permitido");
        }  
}
}
