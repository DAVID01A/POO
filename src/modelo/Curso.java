package modelo;

public class Curso {
    // 1. atributos
    public String nombre;
    public String contenido;
    public String requisitos;
    public float duracion;
    public double precio;
    public int idCurso;
    public String modalidad;
    public String tipoCurso;

    // ,metodos,
    public Curso[] mostrarCurso(String tipoCurso, String modalidad){
        return  new Curso[6];
    }
    public void solicitarCriterioBusqueda(){
        System.out.println("Mandamos llamar a la capa presentacion");
    }

    public String mostrarInformacion(){
        return "id Curso: " + idCurso + "nombre: " +nombre+
                "contenido: "+contenido+ "requisitos: "+requisitos+
                "duracion: "+duracion+ "precios: "+precio+"modalidad: "+modalidad+
                "Tipo Curso: "+tipoCurso;
    }
    // constructores,
    //sobrecarga cuando hay clases del mismo nombre
    //constructotres vacios
    public Curso(){}

    // constructor
    public Curso(int idCurso, String nombre, double precio, float duracion ){
        this.idCurso = idCurso;
        this.nombre= nombre;
        this.precio= precio;
        this.duracion=duracion;

    }


    //seters y detters
}
