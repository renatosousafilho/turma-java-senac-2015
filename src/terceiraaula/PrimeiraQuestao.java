/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiraaula;

import javax.swing.JOptionPane;

/**
 *
 * @author AlunoTrans
 */
public class PrimeiraQuestao {
    public static void main(String[] args) {
        int codigo; 
        float valorTotal, valorComDesconto, valorDescontado, desconto = 0;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("eNTRE COM O CODIGO DO PRODUTO"));
        valorTotal = Float.parseFloat(JOptionPane.showInputDialog("eNTRE COM O VALOR DO PRODUTO"));
        boolean ehInvalido = false;
        switch (codigo) {
            case 1: desconto = 5; break;
            case 2: desconto = 10; break;
            case 3: desconto = 20; break;
            case 4: desconto = 50; break;
            default: ehInvalido = true;
        }
        if (ehInvalido) {
            System.out.println("Valor invalido");
        } else {
            System.out.println(desconto);
            valorDescontado = valorTotal * (desconto/100);
            System.out.println(valorDescontado);
            valorComDesconto = valorTotal - valorDescontado;
            System.out.println(valorComDesconto);
        }
               
    
    }
}
