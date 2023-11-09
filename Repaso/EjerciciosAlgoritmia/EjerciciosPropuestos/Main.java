package EjerciciosAlgoritmia.EjerciciosPropuestos;

public class Main {

    /*

    Ejercicios propuestos

    - Desarrollar un programa que determine el elemento mayor y menor de un array de enteros. OK
    - Desarrollar un programa que, dado un número entero, busque dicho número en un array. OK
    - Desarrollar un programa que busque elementos comunes en dos arrays de enteros. OK


    - Hacer un programa que calcule las raíces de una ecuación cuadrática. ax2 + bx + c = 0. OK
    - Hacer un programa que, dado el número de un mes, presente el nombre del mes y determine la
      cantidad de días que tiene. OK
    - Hacer un programa que determine si un año es bisiesto o no. OK

    - Escribir un programa que dado un número entero positivo n, calcule la suma de la siguiente
      serie: 1 + 1/2 + 1/3 + 1/4 + 1/5 + … + 1/n.
    - Escribir un programa que calcule los primeros n números de Fibonacci. Los números de Fibonacci
      comienzan con 0 y 1, y cada término siguiente es la suma de los anteriores: 0, 1, 2, 3, 5, 8,
      13, 21, …

    - Escribir un programa que, dado un número, determine cuántos dígitos tiene.
    - Escribir un programa que, dadas 5 notas finales, determine cuántas notas fueron mayores o
      iguales a 3.0.


    - Desarrollar un programa que calcule el factorial de un número entero positivo. El factorial de
      un número es el producto de todos los números enteros positivos desde 1 hasta el número en cuestión.
    - Desarrollar un programa de determine el máximo común divisor y el mínimo común múltiplo de un número.

     */

    public static void main(String[] args) {
        Ejercicios ejercicio1 = new Ejercicios();
        ejercicio1.imprimirArrayInt(ejercicio1.array);
        ejercicio1.imprimir();
        ejercicio1.mayor(ejercicio1.array);
        ejercicio1.menor(ejercicio1.array);

        Ejercicios ejercicio2 = new Ejercicios();
        ejercicio2.buscarN(ejercicio2.array, 1);

        Ejercicios ejercicio3 = new Ejercicios();
        ejercicio3.elementosComunesArrays(ejercicio3.array, ejercicio3.array2);


        Ejercicios ecuacionCuadratica = new Ejercicios();
        ejercicio1.imprimir();
        ecuacionCuadratica.ecuacionCuadratica();


        Ejercicios mesCantidadDias = new Ejercicios();
        //mesCantidadDias.mesCantidadDias();

        Ejercicios anyoBisiesto = new Ejercicios();
        //anyoBisiesto.esBisiesto();

        ////

        Ejercicios nFibonacci = new Ejercicios();
        //nFibonacci.nFibonacci();


        ejercicio1.imprimir();

        Ejercicios digitosN = new Ejercicios();
        //digitosN.digitosDeN();

        Ejercicios notas = new Ejercicios();
        //notas.notasMayoresIgualesATres();


        Ejercicios factorial = new Ejercicios();
        //factorial.factorialDeN();

        Ejercicios minimoComunMultiplo = new Ejercicios();
        minimoComunMultiplo.minimoComunMultiplo();
    }

}
