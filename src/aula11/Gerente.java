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
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double getSalarioLiquido(){
        return this.getSalario() - this.getSalario()*0.1;
    }
}
