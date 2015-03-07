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
//Esta classe não pode ser herdada
public final class Funcionario extends PessoaFisica {
    public double salario;
    public String cargo;

    public Funcionario(double salario, String cargo, String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.salario = salario;
        this.cargo = cargo;
    }

     

    
     
    
}
