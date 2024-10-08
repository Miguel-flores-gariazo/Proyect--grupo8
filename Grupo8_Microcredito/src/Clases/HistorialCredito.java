
package Clases;

public class HistorialCredito {
    private final Credito[] registroCredito;  // sin arrayList
    private int contador;  // Lleva la cuenta de los créditos agregados

    public HistorialCredito(int maxCreditos) {
        registroCredito = new Credito[maxCreditos];
        contador = 0;
    }

    public void agregarCredito(Credito credito) {
        if (contador < registroCredito.length) {
            registroCredito[contador] = credito;
            contador++;
            System.out.println("Nuevo crédito agregado al historial.");
        } else {
            System.out.println("No se pueden agregar más créditos al historial.");
        }
    }

    public int calcularPuntaje() {
        int puntaje = 0;
        for (int i = 0; i < contador; i++) {
            if (registroCredito[i].getEstado().equals("pagado")) {
                puntaje += 10;
            } else {
                puntaje -= 5;
            }
        }
        return puntaje;
    }
}