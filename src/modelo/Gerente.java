package modelo;

public class Gerente  extends Empleado{
    private int numPersonasCargo;
    private double bono;
    private String departamento;

    //sobreescritura

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + bono ;
    }

    // contructores
    //constructores no se heredan
    //sobrecarga


    public Gerente() {
    }

    public Gerente(int idEmpleado, String nombre, String dNi, Double sueldo,
                   int numPersonasCargo, double bono, String departamento) {
        super(idEmpleado, nombre, dNi, sueldo);
        this.numPersonasCargo = numPersonasCargo;
        this.bono = bono;
        this.departamento = departamento;
        // seter getter

    }

    public int getNumPersonasCargo() {
        return numPersonasCargo;
    }

    public void setNumPersonasCargo(int numPersonasCargo) {
        this.numPersonasCargo = numPersonasCargo;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
