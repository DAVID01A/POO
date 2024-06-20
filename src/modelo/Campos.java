package modelo;

public class Campos {
    //atributos
    private  int x;

    //metodos

    public int muestra() {
        return x;
    }
    public int incrementa(){
        return ++x;
    }
    //constructor
    public Campos(int x) {
        this.x = x;
    }
}
