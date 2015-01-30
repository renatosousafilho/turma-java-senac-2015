/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaaula;

import java.util.Scanner;



/**
 *
 * @author AlunoTrans
 */
public class EntradaComScanner {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println(nome);
        
        int idade;
        System.out.println("Digite sua idade");
        try {
            idade = sc.nextInt();
            System.out.println(idade);    
        } catch (Exception e){
            System.out.println("Idade inválida");
        } 
    }
}
