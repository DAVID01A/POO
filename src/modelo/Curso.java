package modelo;

public class Curso {
    // 1. atributos
    private String nombre;
    private String contenido;
    private String requisitos;
    private float duracion;
    private double precio;
    private int idCurso;
    private String modalidad;
    private String tipoCurso;

    // ,metodos,
    public Curso[] mostrarCurso(String tipoCurso, String modalidad){
        return  new Curso[6];
    }
    public void solicitarCriterioBusqueda(){
        System.out.println("Mandamos llamar a la capa presentacion");
    }

    public String mostrarInformacion(){
        return "id Curso: " + idCurso + " Nombre: " +nombre+
                " Contenido: " +contenido+ " Requisitos: " +requisitos+
                " Duracion: " +duracion+ " Precios: "+precio+ " Modalidad: " +modalidad+
                " Tipo Curso: " +tipoCurso;
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

    public void setIdCurso(int idCurso){
        this.idCurso= idCurso;
    }
    public  void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setRequisitos (String requisitos){
        this.requisitos=requisitos;
    }
    public void setContenido (String contenido){
        this.contenido=contenido;
    }
    public void setDuracion(float duracion){
        this.duracion=duracion;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setModalidad(String modalidad){
        this.modalidad=modalidad;
    }
    public void setTipoCurso(String tipoCurso){
        this.tipoCurso=tipoCurso;
    }
    //getters
     public int getIdCurso(){
        return idCurso;
     }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public float getDuracion() {
        return duracion;
    }
    public String getRequisitos() {
        return requisitos;
    }
    public String getContenido() {
        return contenido;
    }
    public String getModalidad() {
        return modalidad;
    }
    public String getTipoCurso() {
        return tipoCurso;
    }

}

