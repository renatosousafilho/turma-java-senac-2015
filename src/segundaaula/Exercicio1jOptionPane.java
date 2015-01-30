/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaaula;

import javax.swing.JOptionPane;

/**
 *
 * @author AlunoTrans
 */
public class Exercicio1jOptionPane {
    public static void main(String[] args) {
        float base, altura;
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        JOptionPane.showMessageDialog(null, "àrea igual a"+ ((base*altura)/2));
    }
}
