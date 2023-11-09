package EjerciciosAlgoritmia.EjerciciosPropuestos;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicios {

    public int[] array = {1, 5, 2, 76, 5};
    public int[] array2 = {4, 6, 2, 1, 54};

    // Desarrollar un programa que determine el elemento mayor y menor de un array
    // de enteros.
    public int mayor(int[] array) {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) mayor = array[i];
        }

        return imprimirN(mayor);
    }

    public int menor(int[] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) menor = array[i];
        }

        return imprimirN(menor);
    }

    // Desarrollar un programa que, dado un número entero, busque dicho número
    // en un array.
    public int buscarN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return imprimirN(i);
        }

        return n;
    }

    // Desarrollar un programa que busque elementos comunes en dos arrays de
    // enteros.
    public int[] elementosComunesArrays(int[] array, int[] array2) {
        int[] resultado = new int[(array.length + array2.length) / 2];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    resultado[contador] = array[i];
                    contador++;
                    break;
                }
            }
        }

        return imprimirArrayInt(resultado);
    }




    // Hacer un programa que calcule las raíces de una ecuación cuadrática. ax2 +
    // bx + c = 0.
    public String ecuacionCuadratica() {
        float a = 4, b = 2, c = 1;

        float discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            float ecuacion1 = (float) ((-b + Math.sqrt(discriminante)) / (2 * a));
            float ecuacion2 = (float) ((-b - Math.sqrt(discriminante)) / (2 * a));
            return imprimirString("Raíz 1: " + ecuacion1 + ", Raíz 2: " + ecuacion2);
        } else {
            float raiz = -b / (2 * a);
            return imprimirString("Raíz única: " + raiz);
        }
    }

    // Hacer un programa que, dado el número de un mes, presente el nombre del mes y
    // determine la cantidad de días que tiene.
    public String mesCantidadDias() {
        String mes = "";
        int nDiasMes = 0;
        int nMes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " +
                "del mes del año"));

        switch (nMes) {
            case 1:
                mes = "Enero";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 2:
                mes = "Febrero";
                nDiasMes = 28;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 3:
                mes = "Marzo";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 4:
                mes = "Abril";
                nDiasMes = 30;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 5:
                mes = "Mayo";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 6:
                mes = "Junio";
                nDiasMes = 30;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 7:
                mes = "Julio";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 8:
                mes = "Agosto";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 9:
                mes = "Septiembre";
                nDiasMes = 30;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 10:
                mes = "Octubre";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 11:
                mes = "Noviembre";
                nDiasMes = 30;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            case 12:
                mes = "Diciembre";
                nDiasMes = 31;
                JOptionPane.showConfirmDialog(null, "El mes " +
                        "de " + mes + " tiene " + nDiasMes + " días");
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Introduce " +
                        "un número de mes válido");
        }
        return null;
    }

    // Hacer un programa que determine si un año es bisiesto o no.
    public boolean esBisiesto() {
        int anyo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
        boolean anyoBisiesto = false;
        if (anyo % 4 == 0) anyoBisiesto = true;
        if (anyo % 4 == 0 && anyo % 100 != 0) anyoBisiesto = true;
        else if (anyo % 100 == 0 && anyo % 400 != 0) anyoBisiesto = false;
        else if (anyo % 100 == 0 && anyo % 400 == 0) anyoBisiesto = true;

        if (anyoBisiesto) JOptionPane.showConfirmDialog(null,
                "El año " + anyo + " es bisiesto");
        else JOptionPane.showConfirmDialog(null, "El año " +
                anyo + " no es bisiesto");

        return false;
    }




    // Escribir un programa que dado un número entero positivo n, calcule la suma de la
    // siguiente serie: 1 + 1/2 + 1/3 + 1/4 + 1/5 + … + 1/n.





    // Escribir un programa que calcule los primeros n números de Fibonacci. Los
    // números de Fibonacci comienzan con 0 y 1, y cada término siguiente es la suma
    // de los anteriores: 0, 1, 2, 3, 5, 8, 13, 21, …
    public int[] nFibonacci() { // ***TENGO QUE QUITAR EL 1 QUE ME SACA DE MÁS
        int n_tope = 10;
        int n1 = 0;
        int n2 = 1;
        int suma;
        int nAnterior = 0;
        int[] numerosFibonacci = new int[n_tope];
        int contador = 0;

        /*for (int j = 1; j < n_tope; j++) {
            for (int i = j-1; i < n_tope; i++) {
                numerosFibonacci[1] = n2;
                suma = numerosFibonacci[j] + numerosFibonacci[i];
                numerosFibonacci[j] = suma;
            }
        }*/

        while (contador < n_tope) {
            suma = n1 + n2;
            if (contador == 0) {
                n1 = 0;
            } else {
                n1 = n2;
            }
            n2 = suma;
            numerosFibonacci[contador] = n1;
            contador++;

            for (int i = 0; i < numerosFibonacci.length; i++) {
                for (int j = i + 1; j < numerosFibonacci.length; j++) {
                    if (numerosFibonacci[i] == numerosFibonacci[j]) {
                        // TENGO QUE MIRAR QUE PONER
                    }
                }
            }
        }
        return imprimirArrayInt(numerosFibonacci);
    }



    // Escribir un programa que, dado un número, determine cuántos dígitos tiene.
    public int digitosDeN() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        String nAString = String.valueOf(n);

        int nDigitos = 0;

        nDigitos = nAString.length();

        return JOptionPane.showConfirmDialog(null,
                "El número " + n + " tiene " + nDigitos + " dígitos");
    }

    // Escribir un programa que, dadas 5 notas finales, determine cuántas notas
    // fueron mayores o iguales a 3.0.
    public int notasMayoresIgualesATres() {
        double n = 0;
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog("Introduce " +
                    "la nota " + i));

            if (n >= 3.0) {
                contador += 1;
            }
        }

        return Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(
                null, "Hay " + contador + " números iguales " +
                        "o mayores a 3")));
    }



    // Desarrollar un programa que calcule el factorial de un número entero
    // positivo. El factorial de un número es el producto de todos los números
    // enteros positivos desde 1 hasta el número en cuestión.
    public double factorialDeN() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce " +
                "un número para sacar su factorial"));
        double factorial = 1;


        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return JOptionPane.showConfirmDialog(null, "El " +
                "factorial de " + n + " es " + factorial);
    }

    // Desarrollar un programa de determine el máximo común divisor y el mínimo
    // común múltiplo de un número.
    public int minimoComunMultiplo() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " +
                "1 para mcm")); // 180
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " +
                "2 para mcm")); // 324
        int n1_mcm = 1;
        int n2_mcm = 1;
        int[] n1_productos = new int[10];
        int[] n2_productos = new int[10];

        int[] n_final = new int[10];

        String[] n1_mcm_String = new String[5];
        String[] n2_mcm_String = new String[5];

        int contador = 0;

        JOptionPane.showConfirmDialog(null, "Factorial del " +
                "número " + n1);

        for (int i = 2; i <= n1; i++) {
            while (n1 % i == 0) {
                System.out.println(n1 + " | " + i);
                /*JOptionPane.showConfirmDialog(null, n1 +
                        " | " + i);*/
                n1 = n1 / i;
                n1_mcm *= i;


                if (n1 == 1) {
                    /*JOptionPane.showConfirmDialog(null,
                            n1 + " | ");*/
                    System.out.println(n1 + " | ");

                }

                for (int j = contador; j < n1_productos.length; j++) {
                    n1_productos[contador] = i;
                    contador++;
                    break;
                }

                //System.out.print(Arrays.toString(n1_productos));
                //System.out.println(Arrays.toString(n2_productos));

            }

            int temp = 0;
            for (int j = contador; j < n1_productos.length; j++) {
                for (int k = j+1; k < n1_productos.length; k++) {
                    for (int l = 0; l < n1_productos.length; l++) {
                        temp = j;
                        if (n1_productos[j] == n1_productos[k]) {
                            n1_mcm_String[l] = i + " ²";
                            break;
                        }
                        if (n1_productos[j] != n1_productos[k]) {
                            n1_mcm_String[l] = i + "";
                            break;
                        }
                    }
                }
                break;
            }

            //


        }
        System.out.println(Arrays.toString(n1_mcm_String));
        JOptionPane.showConfirmDialog(null, Arrays.toString(n1_productos));



        imprimir();


        contador = 0;
        JOptionPane.showConfirmDialog(null, "Factorial " +
                "del número " + n2);

        for (int i = 2; i <= n2; i++) {
            while (n2 % i == 0) {
                System.out.println(n2 + " | " + i);
                /*JOptionPane.showConfirmDialog(null, n2 +
                        " | " + i);*/
                n2 = n2 / i;
                n2_mcm *= i;

                if (n2 == 1) {
                    /*JOptionPane.showConfirmDialog(null,
                            n2 + " | ");*/
                    System.out.println(n2 + " | ");

                }

                for (int j = contador; j < n2_productos.length; j++) {
                    n2_productos[contador] = i;
                    contador++;
                    break;
                }
            }

            for (int j = contador; j < n2_productos.length; j++) {
                for (int k = j+1; k < n2_productos.length; k++) {
                    for (int l = 0; l < n1_productos.length; l++) {
                        if (n2_productos[j] == n2_productos[k]) {
                            n2_mcm_String[l] = i + " ²";
                            break;
                            //imprimirArrayString(n1_mcm_String[l] + " ");
                        }
                    }
                }
                break;
            }

        }
        System.out.println(Arrays.toString(n2_productos));
        JOptionPane.showConfirmDialog(null, Arrays.toString(n2_productos));

        return 0;
    }





    public int imprimirN(int n) {
        System.out.println(n);
        return n;
    }

    public float imprimirNFloat(float n) {
        System.out.println(n);
        return n;
    }

    public String imprimir() {
        System.out.println();
        return null;
    }

    public int[] imprimirArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public String[] imprimirArrayString(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        return s;
    }

    public String imprimirString(String s) {
        System.out.println(s);
        return null;
    }

}
