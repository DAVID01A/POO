package Presentacion;

import modelo.Empleado_01;
import modelo.Gerente_01;
import modelo.Operador;
import modelo.Vendedor;

public class ProbarEmpleado_01 {
    public static void main(String[] args) {
        Empleado_01 e1 =new Gerente_01("ana",1500.00,300);
        Empleado_01 e2= new Vendedor("marcos",1000.00,500.00,0.30);
        Empleado_01 e3= new Operador("Abel",1100.00,150);

        Empleado_01[] empleados ={e1,e2,e3};
        for (Empleado_01 empleado : empleados ){
            System.out.println("calculo de sueldos ");
            System.out.println(empleado.getClass());
            System.out.println(empleado.calcularNomina());
        }


    }
}
