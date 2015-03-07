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
public class Gato extends Animal {
    public String cor;
    
    public Gato(){
        
    }
    
    public Gato(double peso, double altura){
        super(peso,altura);
    }
    
    public Gato(double peso, double altura, String cor){
        this(peso,altura);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCor:"+cor;
    }
    
    
}
