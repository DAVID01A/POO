package Presentacion;

import modelo.Cuadrado;
import modelo.Figura;
import modelo.Triangulo;

public class TesFigura {
    public static void main(String[] args) {
       //instanciar
        Cuadrado cPeque = new Cuadrado(5,5,7);
        Figura cMediano= new Cuadrado(2,2,5);
        Triangulo tPeque= new Triangulo();
        tPeque.setAltura(3);
        tPeque.setBase(5);
        tPeque.setX(2);
        tPeque.setY(3);
        Figura tMediano =new Triangulo(3,2,5,7);

        Figura[] objeto1 = new Figura[4];
        objeto1[0]= cPeque;
        objeto1[1]=cMediano;
        objeto1[2]=tPeque;
        objeto1[3]=tMediano;

        for (Figura i : objeto1){
            System.out.println(i.calculArarea());
            System.out.println(i.mostrarPocision());
        }
    }
}
