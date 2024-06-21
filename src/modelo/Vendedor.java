package modelo;

public class Vendedor extends Empleado_01 {
    private double ventas;
    private double comision;

    //metodos
    public double calcularNomina() {
        return (ventas*comision)+sueldo;
    }
    //costructores

    public Vendedor() {
    }

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    //setters y getters


    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
