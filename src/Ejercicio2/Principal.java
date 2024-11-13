
package Ejercicio2;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de compras: ");
        int numCompras = scanner.nextInt();

        Compra compras = new Compra(numCompras);

        for (int i = 0; i < numCompras; i++) {
            System.out.print("Ingrese el valor de la compra " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            compras.setCompra(i, valor);
        }

        System.out.println("El total de las compras es: " + compras.getTotal());
        System.out.println("El promedio de las compras es: " + compras.getPromedio());
        System.out.println("La compra mayor es: " + compras.getMayor());
        System.out.println("La compra menor es: " + compras.getMenor());
    } 
}
