
package Ejercicios;

public class Empleado {
    private double sueldoBase;
    private double otrosIngresos;
    private double gastos;

    // Constructor ejemplo
   // public Empleado(double sueldoBase, double otrosIngresos, double gastos) {
   //     this.sueldoBase = sueldoBase;
  //      this.otrosIngresos = otrosIngresos;
  //      this.gastos = gastos;
  //  }
    

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

     public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }


    public double getGastos() {
        return gastos;
    }


    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    

    // Métodos para obtener y establecer valores
    // ... (getters y setters para cada atributo)

    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return getSueldoBase() + getOtrosIngresos() - getGastos();
    }

    // Método para calcular el ahorro semestral (asumiendo 6 meses)
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }

    // Método para calcular el ahorro anual
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }

    
}
