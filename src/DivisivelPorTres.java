
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
public class DivisivelPorTres {
    public static void main(String[] args) {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
        } while (num<1);
        String listaDeNumeros = "";
        for (int i = 0; i < num; i++) {
            if (i%3==0){
                listaDeNumeros = listaDeNumeros + i+",";
            }
        }
        
        JOptionPane.showMessageDialog(null,listaDeNumeros);
    }
}
