//package Presentacion;
//
//import modelo.Empleado;
//import modelo.Gerente;
//
//public class ProbarGerente {
//    public static void main(String[] args) {
//        Gerente g1= new Gerente();
//        g1.setSueldo(1500.00);
//        System.out.println("Nomina --> " + g1.calcularNomina());
//
//        Gerente g2 = new Gerente(1,"Ana Flores",
//                "123456D ",3000.00,10,1000.00,"Ventas");
//        System.out.println("Nomina --> " + g2.calcularNomina());
//        //polimormisfo
//        //UpCasting
//        Empleado ePolimorfismo= new Gerente(2,"Juan Lopez","123456D",300.00,
//                4,1000.00,"Admin");
//
//        Gerente g3 = new Gerente(1,"Ana Flores",
//                "123456D ",3000.00,10,1000.00,"Ventas");
//        //Upcasting
//        Empleado ePolimorfismo2 = g3;
//        //DownCasting
//        Gerente g4 = (Gerente) ePolimorfismo;
//
//        System.out.println(ePolimorfismo.getIdEmpleado());
//        System.out.println(ePolimorfismo.calcularNomina());
//        //Arrays de empleado
//        Empleado[] empleados = new Empleado[3];
//        empleados[0]=ePolimorfismo;
//        empleados[1]= new Empleado(1,"Jorge Ruiz","1234D",1000.00);
//        empleados[2]= new Empleado(2,"Maria Rosa","1234E",1000.00);
//        // bucle
//        for (Empleado elementos : empleados){
//            System.out.println("calculando la nomina adecuada -----");
//            System.out.println(elementos.getClass());
//            System.out.println(elementos.calcularNomina());
//        }
//    }
//}
