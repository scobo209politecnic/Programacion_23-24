import java.util.Arrays;

public class Examen1 {

    /*
    Programa una classe amb la finalitat de servir d’ajuda en el maneig de matrius unidimensionals de nombres sencers.
    Concretament has de programar els següents mètodes estàtics:

    1- Mètode estàtic que retorni la mitja aritmètica dels valors continguts dins la matriu. ( 0.5 p.)
    2- Mètode estàtic que retorni el valor mínim dels valors continguts dins la matriu. ( 0,5 p.)
    3- Mètode estàtic que retorni l’índex on hi ha el valor mínim dels valors de la matriu. ( 0,5 p.)
    4- Mètode estàtic que retorni el valor màxim dels valors continguts dins la matriu. ( 0,5 p.)
    5- Mètode estàtic que retorni l’índex on hi ha el valor màxim dels valors continguts dins la matriu. ( 0,5 p.)
    6- Mètode estàtic que retorni true si la matriu està ordenada de forma ascendent i false en cas contrari. ( 0,5 p.)
    7- Mètode estàtic que retorni true si la matriu té els elements d’índex senar ordenats de forma descendent i false
    en cas contrari. ( 0,5 p.)
    8- Mètode estàtic que retorni una nova matriu amb els mateixos valors però posicionats en ordre invers, el que hi
    havia al primer lloc que estigui al darrer lloc de la nova matriu, etc. ( 1 p.)
    9- Mètode estàtic que ens cerqui l’índex on es doni la primera ocurrència, el primer lloc on apareix, un nombre
    donat o el valor -1 en cas que aquest nombre no estigui dins la matriu. ( 0.5 p.)
    10- Mètode estàtic que ens retorni el valor més proper de la mirja aritmètica dels valors continguts dins la
    matriu unidimensional. ( 1 p.)
    11- Mètode estàtic que donada una posició de la matriu cerqui el valor major de la part de la matriu que comença
    per aquesta posició fins al principi i l’intercanvii amb el valor de la posició donada. ( 2 p.)
    Exemple: posicio = 3 matriu = { 5 , 6 , 3 , 5 , 3 , 8 , 1 , 5 } ha de retornar { 5 , 5 , 3 , 6 , 3 , 8 , 1 , 5 }
    12- Mètode estàtic, que emprant el mètode anterior, ens retorni la matriu ordenada. ( 2 p.)

    Atenció: També heu d’incloure una classe test on es provin tots els mètodes.
     */


    int[] array = {1,8,34,78,31,45};

    // 1- Mètode estàtic que retorni la mitja aritmètica dels valors continguts dins la matriu. ( 0.5 p.)
    public static float media(int[] array) {
        float suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return imprimirFloat(suma / array.length);
    }

    // 2- Mètode estàtic que retorni el valor mínim dels valors continguts dins la matriu. ( 0,5 p.)
    public static int valorMinimoArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return imprimirInt(min);
    }

    // 3- Mètode estàtic que retorni l’índex on hi ha el valor mínim dels valors de la matriu. ( 0,5 p.)
    public static int valorMinimoIndiceArray(int[] array) {
        int iMinimo = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                iMinimo = i;
            }
        }
        return imprimirInt(iMinimo);
    }

    // 4- Mètode estàtic que retorni el valor màxim dels valors continguts dins la matriu. ( 0,5 p.)
    public static int valorMaximoArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return imprimirInt(max);
    }

    // 5- Mètode estàtic que retorni l’índex on hi ha el valor màxim dels valors continguts dins la matriu. ( 0,5 p.)
    public static int valorMaximoIndiceArray(int[] array) {
        int iMaximo = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                iMaximo = i;
            }
        }
        return imprimirInt(iMaximo);
    }

    // 6- Mètode estàtic que retorni true si la matriu està ordenada de forma ascendent i false en cas contrari.
    // ( 0,5 p.)
    public static boolean ordenadoAscendente(int[] array) {
        boolean ordenado = true;
        int indice = 0;
        for (int i = indice; i < array.length - 1; i++) {
            if ((array[i] < array[i+1]) || (array[i] == array[i+1])) {
                indice++;
            } else {
                ordenado = false;
            }
        }
        return imprimirBoolean(ordenado);
    }

    // 7- Mètode estàtic que retorni true si la matriu té els elements d’índex senar ordenats de forma descendent
    // i false en cas contrari. ( 0,5 p.)
    public static boolean iImparesOrdenadosDesc(int[] array) {
        boolean ordenadoImparesDesc = true;
        int indiceImpar = 1;
        for (int i = indiceImpar; i < array.length - 2; i+=2) {
            if ((array[i] > array[i+2]) || (array[i] == array[i+2])) {
                indiceImpar+=2;
            }
            else ordenadoImparesDesc = false;
        }
        return imprimirBoolean(ordenadoImparesDesc);
    }

    // 8- Mètode estàtic que retorni una nova matriu amb els mateixos valors però posicionats en ordre invers, el
    // que hi havia al primer lloc que estigui al darrer lloc de la nova matriu, etc. ( 1 p.)
    public static int[] arrayInvertido(int[] array) {
        int[] arrayNuevo = new int[array.length];
        int contador = 0;

        for (int i = arrayNuevo.length - 1; i >= 0; i--) {
            arrayNuevo[contador] = array[i];
            contador++;
        }
        return imprimirArray(arrayNuevo);
    }

    // 9- Mètode estàtic que ens cerqui l’índex on es doni la primera ocurrència, el primer lloc on apareix, un nombre
    // donat o el valor -1 en cas que aquest nombre no estigui dins la matriu. ( 0.5 p.)
    public static int indicePrimeraOcurrencia(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return imprimirInt(i);
        }
        return imprimirInt(-1);
    }


    // 10- Mètode estàtic que ens retorni el valor més proper de la mitja aritmètica dels valors continguts dins la
    // matriu unidimensional. ( 1 p.)
    public static int valorMasCercanoMedia(int[] array) { //REVISAR, NO FUNCIONA EN ALGUNOS CASOS
        float[] cercano = new float[array.length];
        int contador = 0;
        float media = 0;
        float suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            media = suma / array.length;
        }

        //cálculo cercanía cada n a la media
        for (int i = 0; i < array.length; i++) {
            cercano[contador] = media - array[i];
            contador++;
        }

        float menorMasCercano = cercano[0];
        int contador2 = 0;
        for (int j = 0; j < array.length; j++) {
            if (cercano[j] < 0) cercano[j] = Math.abs(cercano[j]);
            if (cercano[j] < menorMasCercano) {
                menorMasCercano = cercano[j];
                contador2 = j;
            }
        }
        menorMasCercano = array[contador2];

        return imprimirInt((int) menorMasCercano);
    }


    // 11- Mètode estàtic que donada una posició de la matriu cerqui el valor major de la part de la matriu que
    // comença per aquesta posició fins al principi i l’intercanvii amb el valor de la posició donada. ( 2 p.)
    // Exemple: posicio = 3 matriu = { 5 , 6 , 3 , 5 , 3 , 8 , 1 , 5 } ha de retornar { 5 , 5 , 3 , 6 , 3 , 8 , 1 , 5 }
    public static int[] arrayIntercambioPosicion(int[] array, int posicion) {
        int mayor = array[0];
        int menor = array[1];
        int temp = 0;
        int temp2 = 0;
        int temp3 = 0;
        int[] arrayNuevo = new int[array.length];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == posicion) {
                temp2 = array[posicion];
                for (int j = posicion; j >= 0; j--) {
                    if (array[j] > mayor) {
                        // poner posicion n mayor en posicion n indicada
                        mayor = array[j];
                        temp3 = j;
                    }
                }
                //poner n posicion indicada en posicion n mayor
                temp = array[temp3];
                array[posicion] = mayor;
                array[temp3] = temp2;

                for (int j = 0; j < array.length; j++) {
                    arrayNuevo[contador] = array[j];
                    contador++;
                }

            }
        }
        return imprimirArray(arrayNuevo);
    }


    // 12- Mètode estàtic, que emprant el mètode anterior, ens retorni la matriu ordenada. ( 2 p.)
    public static int[] arrayOrdenado(int[] array) {
        int menor = 0;
        int mayor = 0;
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            Arrays.sort(array); //buscar como hacer sin metodo sort
        }
        return imprimirArray(array);
    }





    private static float imprimirFloat(float n) {
        System.out.println(n);
        return 0;
    }

    private static int imprimirInt(int n) {
        System.out.println(n);
        return 0;
    }

    private static boolean imprimirBoolean(boolean i) {
        System.out.println(i);
        return i;
    }

    private static int[] imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static float[] imprimirArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static String imprimirString(String s) {
        System.out.println(s);
        return s;
    }

}
