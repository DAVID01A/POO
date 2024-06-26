package modelo;

public abstract class Empleado_01 {

    protected String nombre;
    protected double sueldo;
    protected final double porcentaje = 0.75;

    public abstract double calcularNomina();
    //constructores

    public Empleado_01() {
    }

    public Empleado_01(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
