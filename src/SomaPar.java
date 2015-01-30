
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author senac
 */
public class SomaPar {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
        int soma = num1+num2;
        if (soma%2==0) {
            System.out.println("numero par");
        } else {
            System.out.println("soma impar");
        }
    }
}
