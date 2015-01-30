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
public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        String diaPorExtenso;
        switch (diaDaSemana) {
            case 1: diaPorExtenso = "Domingo"; break;
            case 2: diaPorExtenso = "Segunda"; break;
            case 3: diaPorExtenso = "Terça"; break;
            case 4: diaPorExtenso = "Quarta"; break;
            case 5: diaPorExtenso = "Quinta"; break;
            case 6: diaPorExtenso = "Sexta"; break;
            case 7: diaPorExtenso = "Sábado"; break;
            default: diaPorExtenso = "Dia inválido";
        }
         System.out.println("O dia da semana digitado corresponde a"+diaPorExtenso);
    }
}
