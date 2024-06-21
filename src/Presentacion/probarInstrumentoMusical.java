package Presentacion;

import modelo.Bateria;
import modelo.Flauta;
import modelo.Guitarra;
import modelo.InstrumentoMusical;

import javax.sound.midi.Instrument;

public class probarInstrumentoMusical {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("xx","nylon"); //polomorfismo
        InstrumentoMusical bataca = new Bateria("xx",5); //polomorfismo
        InstrumentoMusical ham = new Flauta("xx","madera");//polimorfismo
        InstrumentoMusical[] instrumentos =  new InstrumentoMusical[3];

        instrumentos[0]=guido;
        instrumentos[1]=bataca;
        instrumentos[2]=ham;
        for (InstrumentoMusical elemento : instrumentos){
            System.out.println("... ");
            System.out.println(elemento.getClass());
            System.out.println(elemento.emiteSonido());

        }


    }
}
