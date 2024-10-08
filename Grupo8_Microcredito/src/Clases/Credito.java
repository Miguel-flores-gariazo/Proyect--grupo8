
package Clases;

public class Credito {
    private double monto;
    private String estado;  // Puede ser "pagado" o "pendiente"

    public Credito(double monto, String estado) {
        this.monto = monto;
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
