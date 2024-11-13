
package Ejercicio2;
public class Compra {
  private double[] valoresCompras;
    public Compra(int numCompras) {
        valoresCompras = new double[numCompras];
    }
    public void setCompra(int indice, double valor) {
        valoresCompras[indice] = valor;
    }
    public double getTotal() {
        double total = 0;
        for (double valor : valoresCompras) {
            total += valor;
        }
        return total;
    }

    public double getPromedio() {
        return getTotal() / valoresCompras.length;
    }

    public double getMayor() {
        double mayor = valoresCompras[0];
        for (double valor : valoresCompras) {
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

    public double getMenor() {
        double menor = valoresCompras[0];
        for (double valor : valoresCompras) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }   
}
