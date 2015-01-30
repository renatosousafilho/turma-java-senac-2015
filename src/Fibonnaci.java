/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author senac
 */
public class Fibonnaci {
    public static void main(String[] args) {
        int anterior=0, atual=1, proximo;
        for (int i = 0; i < 10; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            System.out.println(proximo);
        }
    }
}
