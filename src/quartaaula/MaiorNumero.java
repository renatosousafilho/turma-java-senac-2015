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
public class MaiorNumero {
     public static void main(String[] args) {
        int aux =0;
        int maior = 0;
        String mensagem = "";
         for (int i = 1; i <= 4; i++) {
             aux = Integer.parseInt(JOptionPane.showInputDialog("Entre com uma idade"));
             if (aux>maior) maior=aux;
             mensagem += aux+",";
         }
         mensagem += "\n Maior idade:"+maior;
         JOptionPane.showMessageDialog(null, mensagem);
    }
     
     
}
