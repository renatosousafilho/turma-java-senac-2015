/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartaaula;

/**
 *
 * @author senac
 */
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 5;
        int fatorial = 1;
        while(contador>1) {
            fatorial = fatorial*contador;
            contador--;
        }
        System.out.println(fatorial);
        
        contador = 1;
        int soma = 0;
        do {
            soma = soma + contador;
            contador++;
        } while(contador<=10);
        System.out.println(soma);
    }
}
