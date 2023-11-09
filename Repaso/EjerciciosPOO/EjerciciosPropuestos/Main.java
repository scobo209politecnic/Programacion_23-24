package EjerciciosPOO.EjerciciosPropuestos;


public class Main {

    /*

    Ejercicios propuestos

    - Agregar dos nuevos atributos a la clase Persona. Un atributo que represente el país de nacimiento de la
    persona (de tipo String) y otro que identifique el género de la persona, el cual debe representarse como un
    char con valores 'H' o 'M'.
    - Modificar el constructor de la clase Persona para que inicialice estos dos nuevos atributos.
    - Modificar el método imprimir de la clase Persona para que muestre en pantalla los valores de los nuevos atributos.

     */

    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel", "Silvestre", "Pardo",
                "34124768R", "18/09/1990", "España", 'M');

        persona1.informacionPersona();
    }

}
