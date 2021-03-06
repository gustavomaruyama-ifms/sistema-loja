package br.edu.ifms.loja.app.bo;

import br.edu.ifms.loja.app.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author Gustavo
 * @param <T>
 */
public class GenericBO<T> {

    private GenericDAO<T> dao;

    public GenericBO(Class clazz) {
        dao = new GenericDAO<T>(clazz);
    }   

    public void inserir(T t) {
        dao.inserir(t);
    }

    public void atualizar(T t) {
        dao.atualizar(t);
    }

    public void remover(T t) {
        dao.remover(t);
    }

    public void remover(Long id) {
        dao.remover(id);
    }

    public T buscarPorId(Long id) {
        return dao.buscarPorId(id);
    }

    public List<T> listarTodos() {
        return dao.listarTodos();
    }
}
