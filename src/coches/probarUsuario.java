package coches;

import modelo.Usuario;

public class probarUsuario {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        Usuario u2= new Usuario("DFG ","1234 ","Nombre ","Calle X 2");
        System.out.println(u1.mostrarInformacion());
        System.out.println(u2.mostrarInformacion());
        u1.setUsuario("starcream");
        u1.setContraseña("123456");
        u1.setNombre("mateo");
        u1.setDireccion("su casa");
        System.out.println(u1.mostrarInformacion());
        System.out.println(u2.getUsuario() + u2.getContraseña() + u2.getNombre() + u2.getDireccion());
    }
}
