package modelo;

public class InstrumentoMusical {
    protected String marca;

    public String emiteSonido(){
        return "" ;
    }
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
