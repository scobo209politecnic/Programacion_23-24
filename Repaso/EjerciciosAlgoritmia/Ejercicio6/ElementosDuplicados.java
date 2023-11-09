package EjerciciosAlgoritmia.Ejercicio6;

import javax.swing.*;
import java.util.Arrays;

public class ElementosDuplicados {

    int[] array = new int[5];

    public int[] generarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
        }
        return imprimirArray(array);
    }

    public int[] numerosRepetidos(int[] array) {
        int contador = 0;
        int[] repetidos = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            boolean estaDuplicado = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    estaDuplicado = true;
                    break;
                }
            }

            if (estaDuplicado) {
                repetidos[contador] = array[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = repetidos[i];
        }

        System.out.println();
        return imprimirArray(resultado);
    }

    public int[] imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public int[] imprimirArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n");
            System.out.print(array[i] + " ");
        }
        return array;
    }

}
