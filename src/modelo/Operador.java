package modelo;

public class Operador extends Empleado_01 {
    private int piezas;
    private double incentivo=0.15;

    //metodos
    public double calcularNomina() {
        return ((piezas*incentivo)+sueldo);
    }
    //constructores
    public Operador() {
    }

    public Operador(String nombre, double sueldo, int piezas) {
        super(nombre, sueldo);
        this.piezas = piezas;
    }

    //setters y getters

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

}
