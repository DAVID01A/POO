package Presentacion;

import modelo.Gerente;

public class ProbarGerente {
    public static void main(String[] args) {
        Gerente g1= new Gerente();
        g1.setSueldo(1500.00);
        System.out.println("Nomina --> " + g1.calcularNomina());

        Gerente g2 = new Gerente(1,"Ana Flores",
                "123456D ",3000.00,10,1000.00,"Ventas");
        System.out.println("Nomina --> " + g2.calcularNomina());
    }
}
