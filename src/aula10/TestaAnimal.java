/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author renato
 */
public class TestaAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(25.0, 0.7);
//        cachorro.peso = 25.0;
//        cachorro.altura = 0.7;
        Gato gato =new Gato(5.0, 0.3,"Vermelho");
//        gato.peso=5.0;
//        gato.altura = 0.3;
        gato.cor="Vermellho";
        Animal animal = new Animal(10,5);
        animal.altura = 20;
        animal.peso=15;
        
        System.out.println("Cachorro");
        System.out.println(cachorro);
        System.out.println("Gato");
        System.out.println(gato);
        System.out.println("Animal");
        System.out.println(animal);
    }
}
