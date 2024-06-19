package coches;


import modelo.Curso;
import modelo.Usuario;

public class probarCurso {
    public static void main(String[] args) {
        //instanciar
        Curso c1 = new Curso(1, "Programacion en java ", 1_500, 60f);
        System.out.println(c1.mostrarInformacion());
        c1.setRequisitos("ESO ");
        c1.setModalidad("Presencial ");
        c1.setTipoCurso("Informatica");
        System.out.println(c1.mostrarInformacion());


        ///usuario

    }
}
