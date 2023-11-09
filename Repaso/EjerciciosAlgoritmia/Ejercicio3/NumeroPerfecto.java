package EjerciciosAlgoritmia.Ejercicio3;

import javax.swing.*;

public class NumeroPerfecto {

    public int numero() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        while (n < 0) {
            //JOptionPane.showInputDialog("Introduce un número");
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        return n;
    }


    public String esPerfecto(int n) {
        int suma = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) suma += i;
        }

        if (suma == n) JOptionPane.showConfirmDialog(null, "ES PERFECTO");
        else JOptionPane.showConfirmDialog(null, "NO ES PERFECTO");

        return null;
    }



    public int imprimir(int n) {
        System.out.println(n);
        return n;
    }

}
