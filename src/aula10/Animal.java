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
public class Animal {
    public double peso;
    public double altura;

    public Animal() {
    }

    public Animal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public void falar(){
        
    }

    @Override
    public String toString() {
        return "Peso:"+peso+"\nAltura:"+altura;
    }
    
    
}
