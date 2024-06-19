package modelo;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String direccion;

    //metodos
    public String mostrarInformacion(){
        return "Usuario:  "+usuario+ "Contraseña: "+contraseña+
                "Nombre: "+nombre+ "Direccion: "+direccion;
    }
    //constructores
    public  Usuario(){}

    public  Usuario(String usuario,String contraseña, String nombre, String direccion){
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.nombre=nombre;
        this.direccion=direccion;
    }
    //setter
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    //getter
    public String getUsuario(){
        return usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }

}
