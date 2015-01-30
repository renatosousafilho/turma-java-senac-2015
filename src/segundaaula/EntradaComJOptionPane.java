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
public class EntradaComJOptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Olá, "+nome);
    }
}
