/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaula;

/**
 *
 * @author AlunoTrans
 */
public class ExemploOperadorAritimetico {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int soma = a +b;
        System.out.println("A soma de "+a+" e "+b+" é igual a:" + soma);
        
        a = 5;
        System.out.println(a/2);
        System.out.println(a%2);
        
        a += 5;
        System.out.println(a);
        
        b -= 3;
        System.out.println(b);
        
        a *= 2;
        System.out.println(a);
        
        a++;
        System.out.println(a);
        
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
    }
}
