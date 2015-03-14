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
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario;
        funcionario = new Funcionario("Joao", 5000);
//        System.out.println(funcionario);
        System.out.println(funcionario.getSalarioLiquido());
        funcionario = new Gerente("Pedro", 5000);
//        System.out.println(funcionario);
        System.out.println(funcionario.getSalarioLiquido());
        
    }
}
