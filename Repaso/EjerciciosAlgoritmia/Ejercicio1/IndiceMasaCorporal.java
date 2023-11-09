package EjerciciosAlgoritmia.Ejercicio1;

import javax.swing.*;
import java.util.Scanner;

public class IndiceMasaCorporal {

    public float indice () {
        while (true) {

            String persona = JOptionPane.showInputDialog("Introduce el nombre de la persona");
            while (persona.isEmpty()) {
                JOptionPane.showConfirmDialog(null, "Vuelve a introducir el nombre");
                persona = JOptionPane.showInputDialog("Introduce el nombre de la persona");
            }
            persona = persona.substring(0,1).toUpperCase() + persona.substring(1).toLowerCase();

            float peso = Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso de " + persona));
            while (peso == 0 || peso < 0) {
                JOptionPane.showConfirmDialog(null, "Vuelve a introducir el peso");
                peso = Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso de " + persona));
            }

            float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura de " + persona));
            while (altura == 0 || altura < 0) {
                JOptionPane.showConfirmDialog(null, "Vuelve a introducir la altura");
                altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura de " + persona));
            }

            /*Scanner datos = new Scanner(System.in);
            imprimir("Introduce el peso de la persona: ");
            float peso = datos.nextFloat();

            imprimir("Introduce la estatura de la persona: ");
            float altura = datos.nextFloat();*/

            float IMC = (float) (peso / Math.pow(altura, 2));

            JOptionPane.showConfirmDialog(null, "El IMC de " + persona + "es " + IMC);

            if (IMC < 16) JOptionPane.showConfirmDialog(null, persona + " tiene delgadez " +
                    "severa");
            else if (IMC >= 16 && IMC < 17) JOptionPane.showConfirmDialog(null, persona +
                    " tiene delgadez moderada");
            else if (IMC >= 17 && IMC < 18.5) JOptionPane.showConfirmDialog(null, persona +
                    " tiene delgadez leve");
            else if (IMC >= 18.5 && IMC < 25) JOptionPane.showConfirmDialog(null, persona +
                    " tiene peso normal");
            else if (IMC >= 25 && IMC < 30) JOptionPane.showConfirmDialog(null, persona +
                    " tiene sobrepeso");
            else if (IMC >= 30 && IMC < 35) JOptionPane.showConfirmDialog(null, persona +
                    " tiene obesidad leve");
            else if (IMC >= 35 && IMC < 40) JOptionPane.showConfirmDialog(null, persona +
                    " tiene obesidad moderada");
            else JOptionPane.showConfirmDialog(null, "La persona tiene obesidad mórbida");


            System.exit(0);
        }
    }

    public void imprimir(String s) {
        System.out.print(s);
    }

    public double imprimir(double n) {
        System.out.print(n);
        return n;
    }

}
