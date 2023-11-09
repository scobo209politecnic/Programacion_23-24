package EjerciciosAlgoritmia.Ejercicio2;

public class Main {

    /*
    Enunciado: número de Amstrong

    Se quiere desarrollar un programa que determine si un número es un número de Amstrong. Un número de
    Amstrong es aquel que es igual a la suma de sus dígitos elevados a la potencia de su número de cifras.
    Por ejemplo, el número 371 es un número que cumple dicha característica ya que tiene tres cifras y:
    371 = 3³ + 7³ + 1³ = 27 + 343 + 1 = 371
     */

    public static void main(String[] args) {
        NumeroAmstrong numeroAmstrong = new NumeroAmstrong();
        numeroAmstrong.numero();
        numeroAmstrong.esNAmstrong(numeroAmstrong.n);
    }
}
