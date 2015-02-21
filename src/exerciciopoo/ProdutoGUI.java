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
public class ProdutoGUI {
    // encapsulando o atribututo produto
    private Produto produto;
    
    public ProdutoGUI() {
    }
    
    public ProdutoGUI(Produto produto){
        this.produto = produto;
    }
    
    public void gerarTelaParaAumentarQuantidade(Produto produto){
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade"));
        produto.aumentarEstoque(quantidade);
    }
      
//  Este metodo chama o metodo acima passando o atributo produto
//  como parametro
    public void gerarTelaParaAumentarQuantidade(){
        this.gerarTelaParaAumentarQuantidade(this.produto);
    }
    
    public void gerarTelaParaDiminuirEstoque(Produto produto){
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade"));
        produto.diminuirEstoque(quantidade);
    }
    
    
    public void gerarTelaParaMudarNome(){
        String nome = JOptionPane.showInputDialog("Entre com um nome");
        produto.setNome(nome);
    }
    
    public void gerarTelaParaMudarPreco(){
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Entre com o preço"));
        produto.setPreco(preco);
    }
    
//  Este metodo chama o metodo acima passando o atributo produto
//  como parametro    
    public void gerarTelaParaDiminuirEstoque(){
        this.gerarTelaParaDiminuirEstoque(this.produto);
    }

    public void mostrarProduto(Produto produto){
        JOptionPane.showMessageDialog(null,produto);
    }
    
    //  Este metodo chama o metodo acima passando o atributo produto
    //  como parametro
    public void mostrarProduto(){
        this.mostrarProduto(produto);
    }
    
    
}
