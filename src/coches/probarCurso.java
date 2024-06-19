package coches;


import modelo.Curso;

public class probarCurso {
    public static void main(String[] args) {
        //instanciar
        Curso c1= new Curso(1,"programacion en java",1_500,60f);
        System.out.println(c1.mostrarInformacion());
    }
}
