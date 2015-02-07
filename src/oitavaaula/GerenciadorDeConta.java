/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oitavaaula;

import javax.swing.JOptionPane;

/**
 *
 * @author renato
 */
public class GerenciadorDeConta {
    public static void efetuarDeposito(Conta conta){
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Entre com o valor a ser depositado"));
        conta.depositar(deposito);
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
    }
    
    
    public static void efetuarSaque(Conta conta){
        double saque = Double.parseDouble(
                JOptionPane.showInputDialog("Entre com o valor a ser sacado"));
        boolean efetuado = conta.sacar(saque);
        if (efetuado){
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso");
        } else{
            JOptionPane.showMessageDialog(null,"Saque não realizado. Valor não disponivel");
        }
    }
    
    public static void mostrarSaldo(Conta conta){
        JOptionPane.showMessageDialog(null, conta);
    }
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        int opcao=0;
        
        String menu = "1 - Depositar \n 2 - Sacar \n 3 - Emprestar \n "
                + "4 - Ver saldo \n 5- Sair";
        while (opcao!=5){
            try {
               opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
               switch(opcao) {
                    case 1: efetuarDeposito(conta); break;
                    case 2: efetuarSaque(conta); break;
                    case 3: ;
                    case 4: mostrarSaldo(conta); break;
                    case 5: break;
                    default: JOptionPane.showMessageDialog(null, "Opção invalida");
                } // fim do switch
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Opção invalida");
            } // fim do try-catch
            
        } // fim do while
    }// fim do metodo main
} // fim do class
