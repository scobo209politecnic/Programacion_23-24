package EjerciciosPOO.Ejercicio2_POO;

import java.util.Objects;

public class Planeta {
    private String nombre = null;
    private int n_satelites = 0;
    private double vInicial_masaKg = 0;
    private double vInicial_volumenKm3 = 0;
    private int vInicial_diametroKm = 0;
    private int vInicial_distanciaMediaMKm = 0;
    private String tipoPlaneta = null; // de acuerdo a su tamaño, de tipo enumerado.
    private double densidad = 0;
    private boolean exterior = false;

    public Planeta(String nombre, int n_satelites, double vInicial_masaKg, double vInicial_volumenKm3,
                   int vInicial_diametroKm, int vInicial_distanciaMediaMKm, String tipoPlaneta, double densidad,
                   boolean exterior) {
        this.nombre = nombre;
        this.n_satelites = n_satelites;
        this.vInicial_masaKg = vInicial_masaKg;
        this.vInicial_volumenKm3 = vInicial_volumenKm3;
        this.vInicial_diametroKm = vInicial_diametroKm;
        this.vInicial_distanciaMediaMKm = vInicial_distanciaMediaMKm;
        this.tipoPlaneta = tipoPlaneta;
        this.densidad = densidad;
        this.exterior = exterior;
    }

    public String informacionPlaneta() {
        imprimir("Nombre: " + nombre);
        imprimir("Número satélites: " + n_satelites);
        imprimir("Masa en kg: " + vInicial_masaKg);
        imprimir("Volumen en km³: " + vInicial_volumenKm3);
        imprimir("Diámetro en km: " + vInicial_diametroKm);
        imprimir("Distancia Media al Sol en km: " + vInicial_distanciaMediaMKm);
        imprimir("Tipo planeta: " + tipoPlaneta);
        imprimir("Densidad: " + densidad);
        imprimir("Planeta exterior: " + exterior);

        return null;
    }

    public static double densidad(String nombre) {
        if (Objects.equals(nombre, "Tierra") || Objects.equals(nombre, "Marte") ||
                Objects.equals(nombre, "Mercurio") || Objects.equals(nombre, "Venus") ||
                Objects.equals(nombre, "Júpiter") || Objects.equals(nombre, "Saturno") ||
                Objects.equals(nombre, "Urano") || Objects.equals(nombre, "Neptuno")) {
            return masa(nombre) / volumen(nombre);
        }

        // double densidad = this.vInicial_masaKg / this.vInicial_volumenKm3;

        return 0;
    }

    public static double masa(String nombre) {
        if (Objects.equals(nombre, "Tierra")) return 5972190 * Math.pow(10, 18);
        else if (Objects.equals(nombre, "Marte")) return 641693 * Math.pow(10, 18);
        else if (Objects.equals(nombre, "Mercurio")) return 330.104 * Math.pow(10, 18);
        else if (Objects.equals(nombre, "Venus")) return 4.867320 * Math.pow(10, 18);
        else if (Objects.equals(nombre, "Júpiter")) return 1.898130 * Math.pow(10, 21);
        else if (Objects.equals(nombre, "Saturno")) return 568.319 * Math.pow(10, 21);
        else if (Objects.equals(nombre, "Urano")) return 86.810300 * Math.pow(10, 18);
        else if (Objects.equals(nombre, "Neptuno")) return 102.412 * Math.pow(10, 21);

        return 0;
    }

    public static double volumen(String nombre) {
        if (Objects.equals(nombre, "Tierra")) return 1083206916846L;
        else if (Objects.equals(nombre, "Marte")) return 163115609799L;
        else if (Objects.equals(nombre, "Venus")) return 928.415345893;
        else if (Objects.equals(nombre, "Mercurio")) return 60.827208742;
        else if (Objects.equals(nombre, "Júpiter")) return 1.431281810739360;
        else if (Objects.equals(nombre, "Saturno")) return 827.129915150897;
        else if (Objects.equals(nombre, "Urano")) return 68.334355695584;
        else if (Objects.equals(nombre, "Neptuno")) return 62.525703987412;

        return 0;
    }

    public static int satelites(String nombre) {
        if (Objects.equals(nombre, "Tierra")) return 1;
        else if (Objects.equals(nombre, "Marte")) return 2;
        else if (Objects.equals(nombre, "Venus")) return 0;
        else if (Objects.equals(nombre, "Mercurio")) return 0;
        else if (Objects.equals(nombre, "Júpiter")) return 79;
        else if (Objects.equals(nombre, "Saturno")) return 83;
        else if (Objects.equals(nombre, "Urano")) return 27;
        else if (Objects.equals(nombre, "Neptuno")) return 14;

        return 0;
    }

    public static int diametroKm(String nombre) {
        if (Objects.equals(nombre, "Tierra")) return 12742;
        else if (Objects.equals(nombre, "Marte")) return 6779;
        else if (Objects.equals(nombre, "Venus")) return 12104;
        else if (Objects.equals(nombre, "Mercurio")) return (int) 4879.4;
        else if (Objects.equals(nombre, "Júpiter")) return 139820;
        else if (Objects.equals(nombre, "Saturno")) return 116460;
        else if (Objects.equals(nombre, "Urano")) return 50724;
        else if (Objects.equals(nombre, "Neptuno")) return 49244;

        return 0;
    }

    public static int distanciaMediaMKmSol(String nombre) {
        if (Objects.equals(nombre, "Tierra")) return 146600000;
        else if (Objects.equals(nombre, "Marte")) return 227940000 ;
        else if (Objects.equals(nombre, "Venus")) return 108200000;
        else if (Objects.equals(nombre, "Mercurio")) return 57910000;
        else if (Objects.equals(nombre, "Júpiter")) return 778330000;
        else if (Objects.equals(nombre, "Saturno")) return 1429400000;
        else if (Objects.equals(nombre, "Urano")) return (int) 2870990000L;
        else if (Objects.equals(nombre, "Neptuno")) return (int) 4504300000L;

        return 0;
    }

    public static String tipoPlaneta(String nombre) {
        if (Objects.equals(nombre, "Tierra")) return "TERRESTRE";
        else if (Objects.equals(nombre, "Marte")) return "GASEOSO" ;
        else if (Objects.equals(nombre, "Venus")) return "TERRESTRE";
        else if (Objects.equals(nombre, "Mercurio")) return "TERRESTRE";
        else if (Objects.equals(nombre, "Júpiter")) return "GASEOSO";
        else if (Objects.equals(nombre, "Saturno")) return "GASEOSO";
        else if (Objects.equals(nombre, "Urano")) return "GASEOSO";
        else if (Objects.equals(nombre, "Neptuno")) return "GASEOSO";

        return "";
    }

    public static boolean esExterior(String nombre) {
        return Planeta.diametroKm(nombre) > 48000;
    }


    /* AÚN NO SÉ COMO IMPLEMENTARLO */
    public static String nombrePlaneta(double masa, double volumen) {
        if (masa == 5.97219E24 && volumen == 1.083206916846E12) return "Tierra";
        else if (masa == 6.41693E23 && volumen == 1.63115609799E11) return "Marte";
        else if (masa == 3.30104E20 && volumen == 60.827208742) return "Mercurio";
        else if (masa == 4.86732E18 && volumen == 928.415345893) return "Venus";
        else if (masa == 1.8981300000000002E21 && volumen == 1.43128181073936) return "Júpiter";
        else if (masa == 5.68319E23 && volumen == 827.129915150897) return "Saturno";
        else if (masa == 8.68103E19 && volumen == 68.334355695584) return "Urano";
        else if (masa == 1.02412E23 && volumen == 62.525703987412) return "Neptuno";

        return "";
    }


    public static String imprimir(String s) {
        System.out.println(s);
        return s;
    }



}
