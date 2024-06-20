package Presentacion;

import modelo.Areas;

import javax.crypto.Cipher;
import java.awt.geom.Area;

public class probarAreas {
    public static void main(String[] args) {
        //isntanciar
        Areas circulo = new Areas();
        System.out.println("el area del circulo es "+ circulo.areaCirculo());
        Areas rectangulo = new Areas();
        System.out.println("el area de un rectangulo es "+ rectangulo.areaRectangulo());

    }

}
