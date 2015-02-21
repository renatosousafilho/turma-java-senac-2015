/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo;

/**
 *
 * @author renato
 */

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    //construtor padrão ou default
    public Produto() {
        preco = 0.0;
        quantidadeEstoque = 0;
    }
    
    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome=nome;
        this.preco = preco;
        this.quantidadeEstoque=quantidadeEstoque;
    }
    
    
    public String toString(){
        return "Nome:"+this.nome+"\nPreço:"+
                this.preco+"\nQuantidade:"+this.quantidadeEstoque;
    }
 
    public void aumentarEstoque(int quantidade){
        this.quantidadeEstoque+=quantidade;
    }
    
    public void diminuirEstoque(int quantidade) {
        if (this.quantidadeEstoque>=quantidade) {
            this.quantidadeEstoque-=quantidade;
        } 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

 
    
   
    
    
    
}


