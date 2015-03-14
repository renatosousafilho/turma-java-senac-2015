/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author renato
 */
public class TestaAnimal {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.falar();
        animal = new Cachorro();
        animal.falar();
        
    }
}
