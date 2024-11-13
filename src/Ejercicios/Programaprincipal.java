
package Ejercicios;
import java.util.Scanner;
public class Programaprincipal {
    public static void main(String[] args) {
        double sueldoBase,otrosIngresos,gastos;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el sueldo base: ");
        sueldoBase = lectura.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingrese los gastos: ");
        gastos = lectura.nextDouble();
        Empleado objempleado=new Empleado();
        objempleado.setSueldoBase(sueldoBase);
        objempleado.setOtrosIngresos(otrosIngresos);
        objempleado.setGastos(gastos);
      
        System.out.println("Ahorro mensual: " + objempleado.calcularAhorroMensual());
        System.out.println("Ahorro semestral: " + objempleado.calcularAhorroSemestral());
        System.out.println("Ahorro anual: " + objempleado.calcularAhorroAnual());
    } 
}
