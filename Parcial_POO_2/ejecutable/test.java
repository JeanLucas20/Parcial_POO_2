package ejecutable;

import modelo.CuentaCorriente;
import modelo.RetirarDepositar;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {

        // Input
        double x = Integer.parseInt(JOptionPane.showInputDialog("Digite el saldo: "));
        double y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a retirar: "));
        double z = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a Consignar: "));

        // Processing
        CuentaCorriente miCorriente = new CuentaCorriente ( x , y, 0);
        JOptionPane.showMessageDialog(null, "Acaba de retirar "+ miCorriente.RetirarFondosCorriente(), "Retirar Fondos", 1);

        CuentaCorriente miCorriente2 = new CuentaCorriente ( x , 0, z );
        JOptionPane.showMessageDialog(null, "saldo total"+ miCorriente2.RetirarFondosCorriente(), "Depositar Fondos", 1);



        System.exit(0);
        }
}