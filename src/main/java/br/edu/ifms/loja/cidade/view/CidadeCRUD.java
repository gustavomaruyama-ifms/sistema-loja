/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.cidade.bo.CidadeBO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.uf.bo.UFBO;
import br.edu.ifms.loja.uf.datamodel.UF;
import java.awt.Frame;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class CidadeCRUD extends GenericCRUD<Cidade>{

    private Cidade cidade;
    private CidadeBO cidadeBO;
    private UFBO ufBO;
    private CidadeFormulario formulario;
    
    public CidadeCRUD(Frame parent, boolean modal) {
        super(parent, modal, Cidade.class, new String[]{"id", "nome", "uf.nome"});
        cidadeBO = new CidadeBO();
        ufBO = new UFBO();
        carregarTabela();
        carregarComboBoxUF();
    }
    
    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }
    
    private void carregarComboBoxUF(){
        List<UF> ufs = ufBO.listarTodos();
        formulario.carregarComboBoxUF(ufs);
    }
    

    @Override
    protected JPanel criarFormulario() {
        formulario = new CidadeFormulario();
        return formulario;
    }

    @Override
    protected void camposParaObjeto() {
        cidade.setNome(formulario.getCampoCidade().getText());
        cidade.setUf(formulario.getUFSelecionada());
    }

    @Override
    protected void objetoParaCampos() {
        formulario.getCampoCidade().setText(cidade.getNome());
        formulario.setUFSelectionada(cidade.getUf());
    }

    @Override
    protected void salvar() {
        cidadeBO.inserir(cidade);
    }

    @Override
    protected void editar() {
       
    }

    @Override
    protected void novo() {
        cidade = new Cidade();
    }

    @Override
    protected void cancelar() {
        
    }

    @Override
    protected void excluir() {
        cidadeBO.remover(cidade);
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Cidade> carregarListaParaTabela() {
        carregarComboBoxUF();
        return cidadeBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Cidade itemSelecionado) {
        cidade = itemSelecionado;
    }
    
}
