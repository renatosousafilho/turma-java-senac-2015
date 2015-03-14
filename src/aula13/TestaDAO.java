/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renato
 */
public class TestaDAO {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", "001.555,432-22");
        Aluno aluno2 = new Aluno("Joao", "001.555,432-11");
        AlunoDAO dao = new AlunoDAO();
        dao.salvar(aluno1);
        dao.salvar(aluno2);
        dao.mostraLista();
        System.out.println("---------------------------");
        Aluno aluno3 = new Aluno("Renato", "1111111111");
        dao.salvar(aluno3);
        dao.mostraLista();
        System.out.println("---------------------------");
        dao.remover(aluno2);
        dao.mostraLista();
        System.out.println("---------------------------");
        Aluno alunoEncontrado = dao.pesquisar("Joao");
        System.out.println(alunoEncontrado);
    }
    
}
