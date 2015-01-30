/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartaaula;

import javax.swing.JOptionPane;

/**
 *
 * @author senac
 */
public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Entre com um número"));
        for (int i = numero;i>=1;i--){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
