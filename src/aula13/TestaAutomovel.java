/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author renato
 */
public class TestaAutomovel {
    public static void main(String[] args) {
        Automovel automovel = new Carro();
        automovel.acelerar();
        automovel.frear();
        automovel.acelerar();
    }
}
