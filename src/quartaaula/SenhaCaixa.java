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
public class SenhaCaixa {
    public static void main(String[] args) {
        String senha = "";
        int contador = 1;
        boolean senhaValida = false;
        String mensagem = "";
        while (senhaValida!=true && contador<=3){
            senha = JOptionPane.showInputDialog("Entre com a senha");
            senhaValida = senha.equals("Java");
            if (senhaValida) break;
            System.out.println("Senha Inválida");
            contador++;
        }
        mensagem = (contador>3) ? "Cartão cancleado" : "Senha válida";
        System.out.println(mensagem);
    }
}
