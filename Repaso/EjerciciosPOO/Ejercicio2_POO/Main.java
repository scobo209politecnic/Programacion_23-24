package EjerciciosPOO.Ejercicio2_POO;

public class Main {

    /*

    Enunciado: clase Planeta

    Se requiere un programa que modele el concepto de un planeta del sistema solar. Un planeta tiene los
    siguientes atributos: (HECHO)
    - Un nombre de tipo String con valor inicial de null.
    - Cantidad de satélites de tipo int con valor inicial de cero.
    - Masa en kilogramos de tipo double con valor inicial de cero.
    - Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
    - Diámetro en kilómetros de tipo int con valor inicial de cero.
    - Distancia media al Sol en millones de kilómetros, de tipo int con valor inicial de cero.
    - Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con los siguientes valores posibles: GASEOSO,
      TERRESTRE y ENANO.
    - Observable a simple vista, de tipo booleano con valor inicial false.

    La clase debe incluir los siguientes métodos:
    - La clase debe tener un constructor que inicialice los valores de sus respectivos atributos. OK
    - Definir un método que imprima en pantalla los valores de los atributos de un planeta. OK
    - Calcular la densidad un planeta, como el cociente entre su masa y su volumen. OK
    - Determinar si un planeta del sistema solar se considera exterior. OK
    - Un planeta exterior está situado más allá del cinturón de asteroides. OK
    - El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una unidad astronómica (UA) es la distancia
      entre la Tierra y el Sol= 149 597 870 Km. OK
    - En un método main se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además,
      se debe imprimir la densidad de cada planeta y si el planeta es un planeta exterior del sistema solar. OK

     */


    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", Planeta.satelites("Tierra"), Planeta.masa("Tierra"),
                Planeta.volumen("Tierra"), Planeta.diametroKm("Tierra"), Planeta.distanciaMediaMKmSol("Tierra"),
                Planeta.tipoPlaneta("Tierra"), Planeta.densidad("Tierra"), Planeta.esExterior("Tierra"));

        Planeta marte = new Planeta("Marte", Planeta.satelites("Marte"), Planeta.masa("Marte"),
                Planeta.volumen("Marte"), Planeta.diametroKm("Marte"), Planeta.distanciaMediaMKmSol("Marte"),
                Planeta.tipoPlaneta("Marte"), Planeta.densidad("Marte"), Planeta.esExterior("Marte"));

        Planeta mercurio = new Planeta("Mercurio", Planeta.satelites("Mercurio"),
                Planeta.masa("Mercurio"), Planeta.volumen("Mercurio"), Planeta.diametroKm("Mercurio"),
                Planeta.distanciaMediaMKmSol("Mercurio"), Planeta.tipoPlaneta("Mercurio"), Planeta.densidad("Mercurio"),
                Planeta.esExterior("Mercurio"));

        Planeta venus = new Planeta("Venus", Planeta.satelites("Venus"),
                Planeta.masa("Venus"), Planeta.volumen("Venus"), Planeta.diametroKm("Venus"),
                Planeta.distanciaMediaMKmSol("Venus"), Planeta.tipoPlaneta("Venus"), Planeta.densidad("Mercurio"),
                Planeta.esExterior("Venus"));

        Planeta jupiter = new Planeta("Júpiter", Planeta.satelites("Júpiter"),
                Planeta.masa("Júpiter"), Planeta.volumen("Júpiter"), Planeta.diametroKm("Júpiter"),
                Planeta.distanciaMediaMKmSol("Júpiter"), Planeta.tipoPlaneta("Júpiter"), Planeta.densidad("Júpiter"),
                Planeta.esExterior("Júpiter"));

        Planeta saturno = new Planeta("Saturno", Planeta.satelites("Saturno"),
                Planeta.masa("Saturno"), Planeta.volumen("Saturno"), Planeta.diametroKm("Saturno"),
                Planeta.distanciaMediaMKmSol("Saturno"), Planeta.tipoPlaneta("Saturno"), Planeta.densidad("Saturno"),
                Planeta.esExterior("Saturno"));

        Planeta urano = new Planeta("Urano", Planeta.satelites("Urano"),
                Planeta.masa("Urano"), Planeta.volumen("Urano"), Planeta.diametroKm("Urano"),
                Planeta.distanciaMediaMKmSol("Urano"), Planeta.tipoPlaneta("Urano"), Planeta.densidad("Urano"),
                Planeta.esExterior("Urano"));

        Planeta neptuno = new Planeta("Neptuno", Planeta.satelites("Neptuno"),
                Planeta.masa("Neptuno"), Planeta.volumen("Neptuno"), Planeta.diametroKm("Neptuno"),
                Planeta.distanciaMediaMKmSol("Neptuno"), Planeta.tipoPlaneta("Neptuno"), Planeta.densidad("Neptuno"),
                Planeta.esExterior("Neptuno"));

        Planeta.imprimir("-----------------------------------------");
        tierra.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        marte.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        mercurio.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        venus.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        jupiter.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        saturno.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        urano.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");
        neptuno.informacionPlaneta();
        Planeta.imprimir("-----------------------------------------");

    }

}
