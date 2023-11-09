package EjerciciosAlgoritmia.Ejercicio5;

public class Main {

    /*

    Enunciado: números amigos

    Se quiere desarrollar un programa que determine si dos números son amigos. Dos números enteros positivos se
    consideran amigos si la suma de los divisores de uno es igual al otro número y viceversa.
    Por ejemplo, los números 220 y 284 son amigos. Los divisores del número 220 son: 1, 2, 4, 5, 10, 11, 20, 22,
    44, 55 y 110, y suman 284. Los divisores de 284 son: 1, 2, 4, 71 y 142, que suman 220.

     */

    public static void main(String[] args) {
        NumerosAmigos numerosAmigos = new NumerosAmigos();

        numerosAmigos.sonAmigos(numerosAmigos.numero1(), numerosAmigos.numero2());
    }

}
