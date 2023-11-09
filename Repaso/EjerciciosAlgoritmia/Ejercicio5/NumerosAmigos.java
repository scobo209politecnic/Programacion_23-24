package EjerciciosAlgoritmia.Ejercicio5;

import javax.swing.*;

public class NumerosAmigos {

    public int numero1() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 1"));

        while (n1 < 0) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 1"));
        }

        return n1;
    }

    public int numero2() {
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 2"));

        while (n2 < 0) {
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 2"));
        }

        return n2;
    }

    public String sonAmigos(int n1, int n2) {
        int sumaN1 = 0;
        int sumaN2 = 0;

        for (int i = 1; i <= n1 / 2; i++) {
            if (n1 % i == 0) sumaN1 += i;
        }

        for (int i = 1; i <= n2 / 2; i++) {
            if (n2 % i == 0) sumaN2 += i;
        }

        if (sumaN1 == n2 && sumaN2 == n1) JOptionPane.showConfirmDialog(null, "SON AMIGOS");
        else JOptionPane.showConfirmDialog(null, "NO SON AMIGOS");

        return null;
    }


}
