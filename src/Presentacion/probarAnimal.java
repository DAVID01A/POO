package Presentacion;

import modelo.Animal;

public class probarAnimal {
    public static void main(String[] args) {
        Animal pez= new Animal( "pez",4,false,25);
        Animal cocodrilo = new Animal("cocodrilo ",5,false,50);
        Animal perro = new Animal("perro ",4,false,80);
        System.out.println("el pez hace sonido ? :" + pez.Sonido());
        System.out.println("Que come el cocodrilo ?:" + cocodrilo.Comer());
        System.out.println("el perro vuela ?: " + perro.Moverse());
    }
}
