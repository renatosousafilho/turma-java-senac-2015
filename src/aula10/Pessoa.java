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
public class Pessoa {
    public String nome;
    public String endereco;
    public String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Nome:"+nome+"\nEndereco:"+endereco+"\nTelefone"+telefone;
    }
    
    
}
