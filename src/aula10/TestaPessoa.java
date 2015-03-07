/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import javax.swing.JOptionPane;

/**
 *
 * @author renato
 */
public class TestaPessoa {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = new PessoaFisica("Antonio Barbosa","Av Higino Cunha","3220-2020","43383834611");
        pessoaFisica1.nome = "Antonio Barbosa";
        pessoaFisica1.endereco = "Av Higino Cunha";
        pessoaFisica1.telefone ="3220-2020";
        pessoaFisica1.cpf = "43383834611";
        
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.nome = "Fabrica de Software S/A";
        pessoaJuridica1.endereco = "Av Miguel Rosa";
        pessoaJuridica1.telefone="3210-7090";
        pessoaJuridica1.cnpj="77470887000106";
        
        System.out.println(pessoaFisica1);
        System.out.println(pessoaJuridica1);
        
                
    }
}
