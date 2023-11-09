import java.util.Arrays;
import java.util.Scanner;

public class prueba {

    public static void valorIntMajor() {
        int x = 5;
        int y = 7;
        if (x > y) System.out.println("La x és major que y");
        else if (y > x) System.out.println("La y és major que x");
    }

    public static void prova() {
        int x = 50, y = 0;

        y = (x > 10) ? 5 : 27;
        System.out.println(y);

        int zz = 5;
        switch (zz) {
            case 5:
                System.out.println("zz is equal to 5");
                break;
            case 6:
            case 7:
                System.out.println("zz is equal to 6 or 7");
                // See that we can combine multiple cases in one block.
                break;
            default:
                System.out.println("Default covers anything not covered by a case!");
        }


    }

    public static void nomsConcatenats() {
        String s1 = "Joan";
        String s2 = "Miquel";
        String s3 = s1.concat(" " + s2);
        System.out.println(s3);
    }

    public static void longitudCadena() {
        String cadena = "Real Club Deportiu Mallorca";
        int longitudCadena = cadena.length();
        System.out.println(longitudCadena);
    }


    public static void posicioLletraI(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') System.out.println("La posició de la lletra 'i' és: " + i);
        }
    }


    public static void segonaOcurrenciaDeA(String s) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && contador == 0) {
                contador++;
            } else if (contador == 1 && s.charAt(i) == 'a') {
                System.out.println("La posició de la segona lletra 'a' és: " + i);
                break;
            }
        }
    }


    public static void darreraOcurrenciaDeLittle(String texto, String subtexto) {
        int contador = 0;
        String palabra = "";
        int ultimaPosicion = -1; // Inicializa la última posición como -1
        for (int i = 0; i < texto.length() - subtexto.length() + 1; i++) {
            boolean esSubtexto = false;
            if (texto.substring(i, i + subtexto.length()).equals(subtexto)) {
                esSubtexto = true;
                palabra = subtexto;
                ultimaPosicion = i; // Actualiza la última posición cuando se encuentra la palabra
            }

            if (esSubtexto && palabra.equals(subtexto)) {
                contador += 1;
            }
        }
        if (ultimaPosicion != -1) {
            System.out.println("La última aparición de '" + subtexto + "' comienza en la posición: " + ultimaPosicion);
        } else {
            System.out.println("La palabra '" + subtexto + "' no se encuentra en el texto.");
        }
    }


    public static void sustituirOcurrenciasDeLittle(String texto, String subtexto, String palabraNueva) {
        /*  HACER EL EJERCICIO  */
        int contador = 0;
        String palabra = "";
        String textoNuevo = "";
        int ultimaPosicion = -1; // Inicializa la última posición como -1
        for (int i = 0; i < texto.length() - subtexto.length() + 1; i++) {
            boolean esSubtexto = false;
            if (texto.substring(i, i + subtexto.length()).equals(subtexto)) {
                esSubtexto = true;
                palabra = subtexto;
                ultimaPosicion = i; // Actualiza la última posición cuando se encuentra la palabra
            }

            if (esSubtexto && palabra.equals(subtexto)) {
                contador += 1;
            }
        }
        if (ultimaPosicion != -1) {
            System.out.println("La última aparición de '" + subtexto + "' comienza en la posición: " + ultimaPosicion);
        } else {
            System.out.println("La palabra '" + subtexto + "' no se encuentra en el texto.");
        }
    }


    // AQUÍ EL EJERCICIO 10
    /**/


    public static void indicativoZonaTelefono(String telefono) {
        int n_indicativo = 3;
        String indicativoZona = "";
        String restoDeNumeros = "";
        String a = telefono.replace("-", "");
        telefono = a;

        for (int i = 0; i < n_indicativo; i++) {
            indicativoZona += telefono.charAt(i);
        }

        for (int i = n_indicativo; i < telefono.length(); i++) {
            restoDeNumeros += telefono.charAt(i);
        }

        System.out.println("L’indicatiu de la zona es: " + indicativoZona);
        System.out.println("La resta de números son: " + restoDeNumeros);
    }


    public static void quitarEspaciosCadena(String cadena) {
        String cadenaSinEspacios = cadena.trim();

        System.out.println(cadenaSinEspacios + "X");
    }


    public static void quitarCaracteresExtras(String cadena) {
        String cadenaSinCaracteresExtras = cadena.replace(">", "").replace("<", "");

        System.out.println(cadenaSinCaracteresExtras);
    }


    public static void arrayStrings() {
        String[] array = new String[10];
        String[] palabras = {"Mary", "had", "a", "little", "lamb"};

        int contador = 0;

        if (contador < 5) {
            for (int j = 0; j < palabras.length; j++) {
                array[contador] = palabras[j];
                contador++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void longitudArrayStrings() {
        String[] palabras = {"Mary", "had", "a", "little", "lamb"};

        System.out.println(palabras.length);
    }

    public static void longitudArrayInt() {
        int[] array = new int[0];

        System.out.println(array.length);
    }

    public static void arrayCopy() {
        int[] intArray01 = new int[]{10, 11, 12, 13, 14};
        int[] intArray02 = Arrays.copyOf(intArray01, intArray01.length);

        System.out.println(Arrays.toString(intArray02));
    }

    public static void arrayEquals() {
        int[] intArray01 = new int[]{10, 11, 12, 13, 14};
        int[] intArray02 = Arrays.copyOf(intArray01, intArray01.length);

        System.out.println(Arrays.equals(intArray01, intArray02));
    }

    public static void arrayCopyOfRange() {
        int[] intArray01 = new int[]{55, 747, 15000, 89, 2333};
        int[] intArray02 = Arrays.copyOfRange(intArray01, 0, 3);

        System.out.println(intArray02.length);
        System.out.println(Arrays.toString(intArray02));
    }


    public static void acortaArray() {
        int[] intArray01 = new int[]{55, 747, 15000, 89, 2333};
        intArray01 = Arrays.copyOfRange(intArray01, 0, 3);

        System.out.println(Arrays.toString(intArray01));
        System.out.println(intArray01.length);
    }

    public static void incrementaArray() {
        int[] intArray01 = new int[]{55, 747, 15000, 89, 2333};
        intArray01 = Arrays.copyOf(intArray01, 10);

        System.out.println(Arrays.toString(intArray01));
        System.out.println(intArray01.length);
    }

    public static void incrementaArray2() {
        int[] intArray01 = {17, 42, 43, 8, 23};
        int longitudInicial = intArray01.length;
        intArray01 = Arrays.copyOf(intArray01, 10);

        intArray01[longitudInicial] = 57;
        intArray01[longitudInicial + 1] = 84;

        System.out.println(Arrays.toString(intArray01));
        System.out.println(intArray01.length);
    }

    public static void modificaArray() {
        int[] intArray01 = {55, 747, 15000, 89, 2333};
        intArray01 = Arrays.copyOf(intArray01, 10);

        for (int i = 0; i < intArray01.length; i++) {
            switch (i) {
                case 0:
                    intArray01[i] = 15000;
                    break;
                case 1:
                    intArray01[i] = 89;
                    break;
                case 2:
                    intArray01[i] = 2333;
                    break;
                default:
                    intArray01[i] = 0;
            }
        }
        intArray01 = Arrays.copyOfRange(intArray01, 0, 3);

        System.out.println(Arrays.toString(intArray01));
        System.out.println(intArray01.length);
    }

    public static void invertirArray() {
        int[] array = {5, 65, 23, 54, 21, 2, 12};
        int[] arrayInvertido = new int[array.length];
        int contador = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            arrayInvertido[contador] = array[i];
            contador++;
        }

        System.out.println(Arrays.toString(arrayInvertido));
    }


    public static void ordenarArrayDescendente() {
        int[] array = {23, 21, 65, 32, 2, 34};
        int[] arrayOrdenadoDescendente = new int[array.length];
        int contador = 0;
        int mayor = array[0];
        int menor = array[0];
        int temp = 0;
        int temp2 = 0;


        // ESTA ES LA MANERA SENCILLA
        int contador2 = 0;
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrayOrdenadoDescendente.length; j++) {
                arrayOrdenadoDescendente[contador2] = array[i];
                contador2++;
                break;
            }
        }
        System.out.println(Arrays.toString(arrayOrdenadoDescendente));


        // SIN USAR EL MÉTODO SORT NO ME FUNCIONA
        /*for (int i = 0; i < array.length; i++) {
            if (array[i] == mayor) {
                temp = i;
                temp2 = array[i];
            }

            if (array[i] >= mayor) {
                mayor = array[i];
                arrayOrdenadoDescendente[temp] = mayor;
                contador++;
            } else {
                menor = array[i];
                arrayOrdenadoDescendente[contador] = menor;
                contador++;
            }
        }

        System.out.println(Arrays.toString(arrayOrdenadoDescendente));*/

    }


    /* PIEDRA, PAPEL Y TIJERA */
    public static String bienvenida() {
        return "Bienvenido al juego de Piedra, Papel y Tijera!";
    }

    public static String hasGanado() {
        return "Has ganado";
    }

    public static String hasPerdido() {
        return "Has perdido";
    }

    public static String empate() {
        return "Empate";
    }

    public static String opcionNoValida() {
        return "Opción no válida";
    }

    public static String finJuegoYNPartidasGanadas(int ganaJugador, int contador) {
        return "Has ganado " + ganaJugador + " de " + contador + " partidas. " + "Gracias por jugar!";
    }

    public static void elecciones() {
        String[] opciones = {"piedra", "papel", "tijera"};

        Scanner jugador = new Scanner(System.in);
        int contador = 0;
        int ganaJugador = 0;

        imprimirStringLn(bienvenida());

        while (contador < 3) {
            imprimirString("Introduce tu elección: ");
            String eleccionJugador = jugador.next();
            String eleccionMaquina = "";

            eleccionMaquina = opciones[(int) (Math.random() * opciones.length)];

            if (eleccionJugador.equals("piedra") || eleccionJugador.equals("papel") || eleccionJugador.equals("tijera")) {
                imprimirStringLn("El ordenador elige: " + eleccionMaquina);
                if (eleccionJugador.equals("piedra")) {
                    if (eleccionMaquina.equals("tijera")) {
                        imprimirStringLn(hasGanado());
                        ganaJugador += 1;
                    } else if (eleccionMaquina.equals("papel")) {
                        imprimirStringLn(hasGanado());
                        ganaJugador += 1;
                    } else if (eleccionMaquina.equals("piedra")) {
                        imprimirStringLn(empate());
                    }
                } else if (eleccionJugador.equals("papel")) {
                    if (eleccionMaquina.equals("tijera")) {
                        imprimirStringLn(hasPerdido());
                    } else if (eleccionMaquina.equals("piedra")) {
                        imprimirStringLn(hasGanado());
                        ganaJugador += 1;
                    } else if (eleccionMaquina.equals("papel")) {
                        imprimirStringLn(empate());
                    }
                } else if (eleccionJugador.equals("tijera")) {
                    if (eleccionMaquina.equals("papel")) {
                        imprimirStringLn(hasGanado());
                        ganaJugador += 1;
                    } else if (eleccionMaquina.equals("piedra")) {
                        imprimirStringLn(hasPerdido());
                    } else if (eleccionMaquina.equals("tijera")) {
                        imprimirStringLn(empate());
                    }
                }
                contador++;
            } else {
                imprimirStringLn(opcionNoValida());
            }


            if (contador == 3) {
                imprimirStringLn("");
                imprimirStringLn(finJuegoYNPartidasGanadas(ganaJugador, contador));
            }
        }
    }



    /* GESTOR DE BIBLIOTECA */
    public static void biblioteca() {
        String[] arrayLibros = {};

        imprimirStringLn("-------- GESTIÓN DE BIBLIOTECA --------");
        imprimirStringLn("1. Añadir libro");
        imprimirStringLn("2. Listar libros");
        imprimirStringLn("3. Buscar libro por autor");
        imprimirStringLn("4. Buscar libro por título");
        imprimirStringLn("5. Eliminar libro");
        imprimirStringLn("6. Salir");
        imprimirStringLn("");

        while (true) {
            Scanner opcion = new Scanner(System.in);
            imprimirString("Introduce la opción: ");
            int opcionUsuario = opcion.nextInt();

            if (opcionUsuario == 1) imprimirStringLn(anadirLibro());
            else if (opcionUsuario == 2) imprimirStringLn(listarLibros());
            else if (opcionUsuario == 3) imprimirStringLn(buscarLibroPorAutor());
            else if (opcionUsuario == 4) imprimirStringLn(buscarLibroPorTitulo());
            else if (opcionUsuario == 5) imprimirStringLn(eliminarLibro());
            else if (opcionUsuario == 6) break;
            else imprimirStringLn("Opción no válida, selecciona una correcta");
        }
    }

    public static String[][] anadirLibro() {
        Scanner anadirLibro = new Scanner(System.in);
        imprimirString("Introduce el título: ");

        String[][] infoLibros = {
                {},
                {},
                {}
        };

        infoLibros[0][0] = anadirLibro.nextLine();
        //String titulo = anadirLibro.nextLine();

        imprimirString("Introduce el autor: ");
        String autor = anadirLibro.nextLine();

        imprimirString("Introduce su número de páginas: ");
        int nPaginas = anadirLibro.nextInt();


        //return titulo + ", " + autor + ", " + nPaginas;
        return infoLibros;
    }

    public static String listarLibros() {


        return "";
    }

    public static String buscarLibroPorAutor() {

        return "";
    }

    public static String buscarLibroPorTitulo() {

        return "";
    }

    public static String eliminarLibro() {

        return "";
    }




    public static String imprimirString(String s) {
        System.out.print(s);
        return s;
    }

    public static String imprimirStringLn(String s) {
        System.out.println(s);
        return s;
    }

    public static String[][] imprimirStringArrayBi(String[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                
            }
        }
        return s;
    }




    public static void main(String[] args) {
        darreraOcurrenciaDeLittle("Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow", "little");
        sustituirOcurrenciasDeLittle("Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow", "little", "big big");
        indicativoZonaTelefono("111-222-3333");
        quitarEspaciosCadena("          com estàs?          ");
        quitarCaracteresExtras(">>>>>>com estàs?<<<<<<");


        arrayStrings();
        longitudArrayStrings();

        /*int[] intArray01 = new int[]{10, 11, 12, 13, 14};
        System.out.printf("%d\n", intArray01[4]);

        longitudArrayInt();
        arrayCopy();
        arrayEquals();
        arrayCopyOfRange();
        acortaArray();
        incrementaArray();
        incrementaArray2();
        modificaArray();
        invertirArray();
        ordenarArrayDescendente();*/


        /* PIEDRA PAPEL TIJERA */
        //elecciones();

        biblioteca();
    }
}
