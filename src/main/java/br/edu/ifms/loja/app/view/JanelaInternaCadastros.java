/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.view;

import br.edu.ifms.loja.cidade.view.CidadeCRUD;
import br.edu.ifms.loja.cliente.view.ClienteCRUD;
import br.edu.ifms.loja.fornecedor.view.FornecedorCRUD;
import br.edu.ifms.loja.uf.view.UFCRUD;
import br.ifms.edu.lpii.app.utils.ImagemUtils;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class JanelaInternaCadastros extends javax.swing.JInternalFrame {

    private final String CAMINHO_ICONES = "img\\icons";
    private final String ICONE_CLIENTES = "network.png";
    private final String ICONE_PRODUTOS = "packing-3.png";
    private final String ICONE_USUARIOS = "id-card.png";
    private final String ICONE_FORNECEDORES = "trucking.png";
    private final String ICONE_UF = "map.png";
    private final String ICONE_CIDADE = "cityscape.png";

    public static JanelaInternaCadastros janelaInternaVendas;

    private JanelaInternaCadastros() {
        initComponents();
        setTitle("Cadastros");
        setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        setClosable(true);
        carregarIcones();
    }

    public static JanelaInternaCadastros getInstance() {
        if (janelaInternaVendas == null) {
            janelaInternaVendas = new JanelaInternaCadastros();
        }
        return janelaInternaVendas;
    }

    private void carregarIcones() {
        try {
            ImageIcon clientes = new ImageIcon(ImagemUtils.loadImage(CAMINHO_ICONES + "\\" + ICONE_CLIENTES));
            botaoClientes.setIcon(clientes);

            ImageIcon fornecedores = new ImageIcon(ImagemUtils.loadImage(CAMINHO_ICONES + "\\" + ICONE_FORNECEDORES));
            botaoFornecedores.setIcon(fornecedores);

            ImageIcon produtos = new ImageIcon(ImagemUtils.loadImage(CAMINHO_ICONES + "\\" + ICONE_PRODUTOS));
            botaoProdutos.setIcon(produtos);

            ImageIcon usuarios = new ImageIcon(ImagemUtils.loadImage(CAMINHO_ICONES + "\\" + ICONE_USUARIOS));
            botaoUsuarios.setIcon(usuarios);
            
            ImageIcon cidades = new ImageIcon(ImagemUtils.loadImage(CAMINHO_ICONES + "\\" + ICONE_CIDADE));
            botaoCidades.setIcon(cidades);
            
            ImageIcon ufs = new ImageIcon(ImagemUtils.loadImage(CAMINHO_ICONES + "\\" + ICONE_UF));
            botaoUFs.setIcon(ufs);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Impossível carregar icones de botões!", "Problema", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoProdutos = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoUsuarios = new javax.swing.JButton();
        botaoFornecedores = new javax.swing.JButton();
        botaoUFs = new javax.swing.JButton();
        botaoCidades = new javax.swing.JButton();

        botaoProdutos.setText("Produtos");
        botaoProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botaoClientes.setText("Clientes");
        botaoClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });

        botaoUsuarios.setText("Usuarios");
        botaoUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botaoFornecedores.setText("Fornecedores");
        botaoFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoFornecedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFornecedoresActionPerformed(evt);
            }
        });

        botaoUFs.setText("UFs");
        botaoUFs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoUFs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoUFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUFsActionPerformed(evt);
            }
        });

        botaoCidades.setText("Cidades");
        botaoCidades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCidades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoUFs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoUFs, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        ClienteCRUD cadastroCliente = new ClienteCRUD(null, true);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void botaoFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFornecedoresActionPerformed
        FornecedorCRUD cadastroFornecedor = new FornecedorCRUD(null, true);
        cadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_botaoFornecedoresActionPerformed

    private void botaoUFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUFsActionPerformed
        UFCRUD ufcrud = new UFCRUD(null, true);
        ufcrud.setVisible(true);
    }//GEN-LAST:event_botaoUFsActionPerformed

    private void botaoCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCidadesActionPerformed
        CidadeCRUD cidadeCRUD = new CidadeCRUD(null, true);
        cidadeCRUD.setVisible(true);
    }//GEN-LAST:event_botaoCidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCidades;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoFornecedores;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoUFs;
    private javax.swing.JButton botaoUsuarios;
    // End of variables declaration//GEN-END:variables
}
