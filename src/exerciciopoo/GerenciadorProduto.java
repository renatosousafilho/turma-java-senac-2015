/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo;

import javax.swing.JOptionPane;

/**
 *
 * @author renato
 */
public class GerenciadorProduto {
  
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook",1000, 0);
        ProdutoGUI gui = new ProdutoGUI(produto1);
        String menu = "1 - Aumentar estoque\n"+
                "2 - Diminuir estoque\n" +
                "3 - Mudar nome\n"+
                "4 - Mudar preço\n"+
                "5 - Visualizar\n" +
                "6 - Sair";
        String opcaoSelecionada = "";
        while (!opcaoSelecionada.equals("6")) {
            opcaoSelecionada = JOptionPane.showInputDialog(menu);
            switch(opcaoSelecionada) {
                case "1": gui.gerarTelaParaAumentarQuantidade();break;
                case "2": gui.gerarTelaParaDiminuirEstoque(); break;
                case "3": gui.gerarTelaParaMudarNome(); break;
                case "4": gui.gerarTelaParaMudarPreco();break;
                case "5": gui.mostrarProduto(); break;
                case "6": break;
                        
                default: JOptionPane.showMessageDialog(null,"Opçao invalida");
            }
        }
        
    }
}
