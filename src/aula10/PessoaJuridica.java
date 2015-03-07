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
public class PessoaJuridica extends Pessoa {
    public String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nCNPJ:"+cnpj; 
    }
    
    
}
