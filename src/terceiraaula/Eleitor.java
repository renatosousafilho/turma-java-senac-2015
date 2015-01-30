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
public class Eleitor {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        if (idade>=18 && idade<=60){
            System.out.println("Voto obrigatório");
        } else if (idade>=16 || idade>60) {
                System.out.println("Voto facultativo");
        } else {
                System.out.println("Nâo pode votar");
        }
        
    }
}
