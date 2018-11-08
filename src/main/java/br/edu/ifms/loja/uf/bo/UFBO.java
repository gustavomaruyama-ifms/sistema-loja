/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.uf.bo;

import br.edu.ifms.loja.app.bo.GenericBO;
import br.edu.ifms.loja.uf.dao.UFDAO;
import br.edu.ifms.loja.uf.datamodel.UF;

/**
 *
 * @author Gustavo
 */
public class UFBO extends GenericBO<UF>{ 
    public UFBO() {
        super(UF.class);
    }
}
