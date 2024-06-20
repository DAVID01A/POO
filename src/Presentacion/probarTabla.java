package Presentacion;

public class probarTabla {
}



///EJERCICIO 5
//Construir una aplicación que imprima por pantalla las tablas de multiplicar. Debe
//contar con un constructor que indica la tabla que se va a mostrar. Debe contar con un
//método que dé como resultado un string para mostrar diez línea de la tabla del
//número dado en el constructor.
//EJERCICIO 6
//Construir una aplicación que muestre por pantalla el nombre de alumno y su nota final.
//Para ello construir una clase Alumno que contenga:
// Un campo que sea una matriz para almacenar las calificaciones de los parciales.
// El constructor deberá inicializar las variables de NombreCompleto y dimensionar
//el array de Parciales.
// Una propiedad de escritura para asignar los valores de los parciales.
// Un método para calcular el promedio de los parciales.
// Un método para mostrar las calificaciones de los parciales.
//EJERCICIO 7
//Realizar la clase Dado su objetivo será lanzar un dado, mostrando el resultado por
//pantalla. Se aconseja estructurar el programa de la siguiente forma. En el main se
//invoca a los métodos de la clase dado. Una clase dado, que dispondrá de: Un
//constructor que usa el método random de Math multiplicado por (6-1)+1.
//La llamada a Math.random() devuelve un número aleatorio entre 0.0 y 1.0, excluido
//este último valor, es decir, puede devolver 0.346442, 0.2344234, 0.98345,....
//En muchas de nuestras aplicaciones no nos servirá este rango de valores. Por ejemplo,
//si queremos simular una tirada de dado, queremos números entre 1 y 6 sin decimales.
//Debemos echar unas cuentas para obtener lo deseado.
//En primer lugar, miramos cuántos valores queremos. En nuestro caso del dado son 6
//valores, del 1 al 6 ambos incluido. Debemos entonces multiplicar Math.random() por 6
//(que es (maximo-minimimo)+1, es decir, (6-1)+1)Los métodos serán: Seis para
//dibujar por pantalla la imagen de los números. Otro para lanzar(), que generará un
//número aleatorio entre 1 y 6, invocará al método dibujar que le corresponda.