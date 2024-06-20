package Presentacion;

import modelo.Campos;

public class pruebaCampos {
    public static void main(String[] args) {
        Campos numero = new Campos(55) {};
        System.out.println(numero.muestra());
        System.out.println(numero.incrementa());
    }
}
