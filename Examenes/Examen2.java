public class Examen2 {

    /*

    1- Calcula els nombres primers menors d’un nombre donat emprant el sedaç d’Erastótenes. El
    mètode ens ha de retornar una matriu amb tots els nombres primers menors del nombre donat.
    ( 3 punts )

    2- Calcula la descomposició factorial d’un nombre donat. ( 3 punts )

    3- Programa un mètode static que donats un text i un subtext ens retorni una versió del text
    eliminant les aparicions del subtext. El mètode ha de retornar un string amb el text
    eliminades les aparicions del subtext. Has de tractar els strings de forma matricial,
    l’únic mètode de la classe String que pots emprar és length() i charAt(index). ( 4 punts )

     */


    // 1- Calcula els nombres primers menors d’un nombre donat emprant el sedaç d’Erastótenes. El
    // mètode ens ha de retornar una matriu amb tots els nombres primers menors del nombre donat.
    // ( 3 punts )
    public static boolean esPrimo(int n) {
        int contador = 2;
        boolean primo = true;

        while (contador != n) {
            if (n % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    public static int[] nPrimerosDeN(int n) {
        int contador = 1;
        int num = 3;
        int[] nPrimos = new int[n];
        nPrimos[0] = 2;

        while (contador < n) {
            int contador2 = 0;
            while (contador2 < nPrimos.length) {
                if (nPrimos[contador2] != 0 && num % nPrimos[contador2] == 0) {
                    num++;
                    contador2 = 0;
                    continue;
                }
                contador2++;
            }
            nPrimos[contador++] = num++;
        }

        return imprimirArray(nPrimos);
    }


    // 2- Calcula la descomposició factorial d’un nombre donat. ( 3 punts )
    public static String factorialDeN(int n) {
        int contador = 2;
        while (n != 1) {
            if (n % contador == 0) {
                imprimirString(n + " | " + contador);
                n = n / contador;
            } else {
                contador++;
            }
        }

        if (n == 1) {
            imprimirString(1 + " | ");
        }
        return "";
    }


    // 3- Programa un mètode static que donats un text i un subtext ens retorni una versió del
    // text eliminant les aparicions del subtext. El mètode ha de retornar un string amb el text
    // eliminades les aparicions del subtext. Has de tractar els strings de forma matricial,
    // l’únic mètode de la classe String que pots emprar és length() i charAt(index). ( 4 punts )
    public static String quitarSubtextoDeTexto(String texto, String subtexto) {
        String nuevoTexto = "";
        int i = 0;
        int posicionLetra = texto.length() - subtexto.length();

        while (i < texto.length()) {
            boolean esSubtexto = false;

            if (i <= posicionLetra) {

                for (int m = 0; m < subtexto.length(); m++) {
                    if (texto.charAt(i + m) != subtexto.charAt(m)) {
                        esSubtexto = false;
                        break;
                    } else {
                        esSubtexto = true;
                    }
                }

            }

            if (esSubtexto) {
                i += subtexto.length();
            } else {
                nuevoTexto += texto.charAt(i);
                i++;
            }




        //char[] subtextoChar = new char[subtexto.length()];

            /* QUITARLO
            for (int k = 0; k < subtexto.length(); k++) {
                subtextoChar[k] = subtexto.charAt(k);
            }
            imprimirArrayChar(subtextoChar);
            imprimirString("");*/

            /*

            for (int m = 0; m < subtextoChar.length; m++) {
                    if (texto.charAt(i) == subtextoChar[0]) {
                        esSubtexto = true;
                        //esOcurrencia = true;
                    } else {
                        esSubtexto = false;
                    }

            }

             */
            
            
            /*if (!esSubtexto) {
                nuevoTexto += texto.charAt(i);
            }*/

        }

        return imprimirString(nuevoTexto);

    }




    private static int[] imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static String imprimirString(String s) {
        System.out.println(s);
        return s;
    }

    private static char[] imprimirArrayChar(char[] arrayChar) {
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + " ");
        }
        return arrayChar;
    }

}
