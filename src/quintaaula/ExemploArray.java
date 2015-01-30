/*
 * Este algoritmo serve para ler der números
 */
package quintaaula;

import javax.swing.JOptionPane;

/**
 *
 * @author renato
 */
public class ExemploArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
        }
        
        
    }
}
