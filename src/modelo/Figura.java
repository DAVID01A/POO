package modelo;

public class Figura {
    protected int x;
    protected int y;

    //metodos
    public double calculArarea(){
        return 0;
    }
    public String mostrarPocision() {
        return "Figura {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //constructores
    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //setters y getters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}