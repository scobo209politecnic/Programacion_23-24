package EjerciciosAlgoritmia.Ejercicio2;

import javax.swing.*;
import java.awt.*;

public class NumeroAmstrong {

    int n;

    public int numero () {
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        return JOptionPane.showConfirmDialog(null, "El número es " + n);
    }

    public boolean esNAmstrong (int n) { // OK
        boolean esAmstrong = false;
        int total = 0;
        String nAString = String.valueOf(n);


        /*String p1 = String.valueOf(nAString.charAt(0));
        String p2 = String.valueOf(nAString.charAt(1));
        String p3 = String.valueOf(nAString.charAt(2));

        int pp1 = Integer.parseInt(p1);
        int pp2 = Integer.parseInt(p2);
        int pp3 = Integer.parseInt(p3);*/


        for (int i = 0; i < nAString.length(); i++) {
            String parte = String.valueOf(nAString.charAt(i));
            int parteAInt = Integer.parseInt(parte);
            total += (int) Math.pow(parteAInt, nAString.length());
        }

        if (total == n) {
            esAmstrong = true;
            JOptionPane.showConfirmDialog(null, n + " ES UN NÚMERO " +
                    "AMSTRONG");
        } else JOptionPane.showConfirmDialog(null, n + " NO ES UN NÚMERO " +
                "AMSTRONG");
        return esAmstrong;
    }

    public boolean imprimir (boolean n) {
        System.out.print(n);
        return n;
    }

    public int imprimirN (int n) {
        System.out.println(n);
        return n;
    }

}
