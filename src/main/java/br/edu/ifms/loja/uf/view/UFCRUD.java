/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.uf.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.uf.bo.UFBO;
import br.edu.ifms.loja.uf.datamodel.UF;
import java.awt.Frame;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class UFCRUD extends GenericCRUD<UF> {

    private UF uf;
    private UFFormulario formulario;
    private UFBO bo;

    public UFCRUD(Frame parent, boolean modal) {
        super(parent, modal, UF.class, new String[]{"nome","sigla"});
        bo = new UFBO();
        carregarTabela();
    }

    @Override
    protected JPanel criarFormulario() {
        formulario = new UFFormulario();
        return formulario;
    }

    @Override
    protected void camposParaObjeto() {
        uf.setNome(formulario.getCampoNome().getText());
        uf.setSigla(formulario.getCampoSigla().getText());
    }

    @Override
    protected void objetoParaCampos() {
       formulario.getCampoNome().setText(uf.getNome());
       formulario.getCampoSigla().setText(uf.getSigla());
    }

    @Override
    protected void salvar() {
        bo.inserir(uf);
    }

    @Override
    protected void editar() {
       
    }

    @Override
    protected void novo() {
        uf = new UF();
    }

    @Override
    protected void cancelar() {
      
    }

    @Override
    protected void excluir() {
        bo.remover(uf);
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<UF> carregarListaParaTabela() {
        return bo.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(UF itemSelecionado) {
       uf = itemSelecionado;
    }


}
