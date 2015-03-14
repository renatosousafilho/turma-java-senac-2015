/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.List;



/**
 *
 * @author renato
 */
public abstract class DAOGenerico {
    public abstract void salvar(Object object);
    public abstract void editar(Object object);
    public abstract void remover(Object object);
    public abstract List getLista();
}
