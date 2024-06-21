package modelo;

public class Cuadrado extends Figura{
    private double lado;
    // metodos

    @Override
    public double calculArarea() {
        return lado*lado ;
    }
    //cosntructor

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    //getters y setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

