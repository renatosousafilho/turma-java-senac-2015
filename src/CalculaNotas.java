
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author senac
 */
public class CalculaNotas {
    public static void main(String[] args) {
        double aux, soma =0;
        double nota1, nota2, nota3, media;
        for (int i = 0; i < 3; i++) {
            aux = Double.parseDouble(JOptionPane.showInputDialog("Entre com a "+(i+1)+"ª nota"));
            soma = soma + aux;
        }
        
        if (soma/3>=7) {
            System.out.println("Aprovado");
        } else {
            if (soma/3>=3 && soma/3<7) {
                System.out.println("media final");
            } else {
                System.out.println("reprovado");
            }
        }
//        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a primeira nota"));
//        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a segunda nota"));
//        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a terceira nota"));
    }
}
