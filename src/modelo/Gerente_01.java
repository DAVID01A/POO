package modelo;

public class Gerente_01 extends Empleado_01  {
    private double bono;
    // metodos

    public double calcularNomina() {
        return (sueldo+bono)* porcentaje;
    }
    //constructor
    public Gerente_01() {
    }

    public Gerente_01(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }
    //getters y setters

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
