/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import javax.persistence.EntityManager;

/**
 *
 * @author Gustavo
 */
public class CidadeDAO extends GenericDAO<Cidade> {

    private EntityManager em;

    public CidadeDAO() {
        super(Cidade.class);
        em = getEntityManager();
    }

}
