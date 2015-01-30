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
public class ExemploEstruturaCondicional {
    public static void main(String[] args) {
        int num;
        try {
            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um número"));
    //        boolean ehPar = num%2==0;
            if (num%2==0) { 
                System.out.println("Número par"); 
            } else {
                System.out.println("Número ímpar");
            }
        } catch (Exception e){
            System.out.println("numero invaido");
        }
    }
}
