package EjerciciosPOO.Ejercicio1_POO;

public class Main {

    /*

    Enunciado: clase Persona

    Se requiere un programa que modele el concepto de una persona. Una persona posee nombre, apellido, número de
    documento de identidad y año de nacimiento. La clase debe tener un constructor que inicialice los valores de
    sus respectivos atributos.
    La clase debe incluir los siguientes métodos:
    - Definir un método que imprima en pantalla los valores de los atributos del objeto.
    - En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.

     */

    public static void main(String[] args) {
        Persona persona1 = new Persona("Paco", "Tous", "García", "34565345S",
                "12/01/2000");

        Persona persona2 = new Persona("Maria de los Ángeles", "Martínez", "Bordiu",
                "21342655D", "01/04/1960");

        persona1.informacionPersona();
        System.out.println("--------------------------------");
        persona2.informacionPersona();
    }

}
