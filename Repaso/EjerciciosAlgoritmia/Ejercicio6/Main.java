package EjerciciosAlgoritmia.Ejercicio6;

public class Main {

    /*

    Enunciado: elementos duplicados
    Se desea desarrollar un programa que, dado un array de números enteros, determine cuáles son sus elementos que
    se encuentran duplicados.

     */

    public static void main(String[] args) {
        ElementosDuplicados elementosDuplicados = new ElementosDuplicados();

        elementosDuplicados.generarArray(elementosDuplicados.array);
        elementosDuplicados.numerosRepetidos(elementosDuplicados.array);
    }
}
