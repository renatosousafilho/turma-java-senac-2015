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
public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook",1200.0,10);
        Produto produto2 = new Produto("Tablet",1500.0,20);
        Produto produto3 = new Produto("Smartphone", 800.0, 40);
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        produto1.aumentarEstoque(10);
        produto2.diminuirEstoque(12);
        produto3.diminuirEstoque(60);
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        produto1.setNome("Notebook HP");
        
        
                
    }
}
