package modelo;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    // metodos

    @Override
    public double calculArarea() {
        return (base*altura)/2;
    }
    //constructores

    public Triangulo() {
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    //getters y setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
