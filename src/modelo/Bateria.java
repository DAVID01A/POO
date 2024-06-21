package modelo;

public class Bateria extends InstrumentoMusical {
    private int noplatillos;

    @Override
    public String emiteSonido() {
        return "pom pom";
    }
    //constructor

    public Bateria() {
    }

    public Bateria(String marca, int noplatillos) {
        super(marca);
        this.noplatillos = noplatillos;
    }
    // getters y getters

    public int getNoplatillos() {
        return noplatillos;
    }

    public void setNoplatillos(int noplatillos) {
        this.noplatillos = noplatillos;
    }
}
