/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oitavaaula;

/**
 *
 * @author renato
 */
public class TestaConta {
    public static void main(String[] args) {
        System.out.println("Antes de emprestar");
        Conta conta1 = new Conta(1,"Francisco",500.0);
        System.out.println(conta1);
        Conta conta2 = new Conta(2, "Pedro", 400);
        System.out.println(conta2);
        System.out.println("Depois de emprestar");
        boolean emprestar = conta1.emprestar(conta2, 300);
        System.out.println(conta1);
        System.out.println(conta2);
        
        
        
    }
    
}
