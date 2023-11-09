package src;

import javax.swing.*;

public class Cuenta {

    private double saldo = 0.0; // Saldo de la cuenta

    public double operar() {
        while (true) {
            String operacion = JOptionPane.showInputDialog("""
                    Inserta número de la operación:
                    0-Ver saldo y salir
                    1-Hacer ingreso
                    2-Hacer retirada""");
            if (Double.parseDouble(operacion) == 0) {
                JOptionPane.showMessageDialog(null, "SALDO FINAL: " + saldo + "€");
                System.exit(0);
            } else if (Double.parseDouble(operacion) == 1) {
                String ingreso = JOptionPane.showInputDialog("INGRESO");
                double monto = Double.parseDouble(ingreso);
                if (Double.parseDouble(ingreso) < 0) saldo -= monto;
                else saldo += monto;
                JOptionPane.showMessageDialog(null, "Ingreso: " + ingreso + "€" +
                        "\nSALDO ACTUAL: " + saldo + "€");
                if (Double.parseDouble(ingreso) == 0)
                    JOptionPane.showMessageDialog(null, "SALDO FINAL: " + saldo + "€");
            } else if (Double.parseDouble(operacion) == 2) {
                String retirada = JOptionPane.showInputDialog("RETIRADA");
                double monto = Double.parseDouble(retirada);
                if (Double.parseDouble(retirada) > 0) saldo -= monto;
                else saldo -= monto;
                JOptionPane.showMessageDialog(null, "Retirada: " + retirada + "€" +
                        "\nSALDO ACTUAL: " + saldo + "€");
                if (Double.parseDouble(retirada) == 0)
                    JOptionPane.showMessageDialog(null, "SALDO FINAL: " + saldo + "€");
            }
        }
    }

}
