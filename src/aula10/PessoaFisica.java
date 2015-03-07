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
public class PessoaFisica extends Pessoa {
    public String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String endereco, String telefone) {
        super(nome,endereco,telefone);
    }

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"\nCPF:"+cpf; 
    }
    
    
}
