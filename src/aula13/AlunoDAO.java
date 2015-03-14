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
public class AlunoDAO extends DAOGenerico{
    private List<Aluno> lista;

    public AlunoDAO() {
        lista = new ArrayList<Aluno>();
    }
    
    @Override
    public void salvar(Object object) {
        Aluno aluno = (Aluno) object;
        lista.add(aluno);
    }

    @Override
    public void editar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Object object) {
        Aluno aluno = (Aluno) object;
        lista.remove(aluno);
    }

    @Override
    public List getLista() {
        return lista;
    }
    
    public int getQuantidade(){
        return lista.size();
    }
    
    public void mostraLista(){
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }
    }
    
    public Aluno pesquisar(String nome){
        for (Aluno aluno : lista) {
            if (aluno.getNome().equals(nome)){
                return aluno;
            }
        }
        return null;
    }
    
    
}
