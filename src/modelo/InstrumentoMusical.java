package modelo;

public abstract class InstrumentoMusical {
    protected String marca;

    public abstract String emiteSonido();
    //cosntructor

    public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
