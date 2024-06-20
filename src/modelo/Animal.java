package modelo;

public class Animal {
    //atributos
    private String tipo;
    private int numExtremidades;
    private boolean vuela;
    private float tamaño;
    //metodos
    public String Moverse(){
        return switch (tipo){
            case "perro "-> "camina";
            case "pez "-> "nadar ";
            case "cocodrilo "-> "se arrastra";
            default->"";
        };
    }
    public String Comer() {
        return switch (tipo) {
            case "perro "-> "carne";
            case "pez "-> "carne ";
            case "cocodrilo "-> "carne";
            default -> "";
        };
    }
    public String Sonido() {
        return switch (tipo) {
            case "perro "-> "ladra";
            case "pez"-> "glup";
            case "cocodrilo"-> "Grrr";
            default -> "";
        };
    }
    //constructores


    public Animal() {
    }

    public Animal(String tipo, int numExtremidades, boolean vuela, float tamaño) {
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.vuela = vuela;
        this.tamaño = tamaño;
    }
    //getters y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
}
