package modelo;

public class Areas {
    private double radio = 3;
    private double base = 4;
    private double altura = 7;

    //metodos
    public double areaCirculo (){
        return Math.PI*Math.pow(radio,2);
    }
    public double areaRectangulo(){
        return base*altura;
    }
    //constructores

    public Areas() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

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


