package EjerciciosAlgoritmia.Ejercicio3;

public class Main {

    /*
    Enunciado: número perfecto

    Se quiere desarrollar un programa que determine si un número es un número perfecto. Un número
    perfecto es aquel que es igual a la suma de sus divisores positivos.
    Por ejemplo, el número 28 es un número perfecto ya que sus divisores son: 1, 2, 4, 7 y 14, y
    la suma de estos números es 28.
     */

    public static void main(String[] args) {
        NumeroPerfecto numeroPerfecto = new NumeroPerfecto();
        
        numeroPerfecto.esPerfecto(numeroPerfecto.numero());
    }
}
