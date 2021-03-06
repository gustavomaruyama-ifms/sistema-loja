/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.view;

import br.edu.ifms.loja.uf.datamodel.UF;
import com.towel.combo.swing.ObjectComboBoxModel;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class CidadeFormulario extends javax.swing.JPanel {

    private ObjectComboBoxModel<UF> model;

    /**
     * Creates new form CidadeFormulario
     */
    public CidadeFormulario() {
        initComponents();
        model = new ObjectComboBoxModel<UF>();
        comboBoxUF.setModel(model);
    }

    public void carregarComboBoxUF(List<UF> ufs) {
        model.setData(ufs);
    }

    public UF getUFSelecionada() {
        return model.getSelectedObject();
    }

    public void setUFSelectionada(UF uf) {
        model.setSelectedObject(uf);
        comboBoxUF.setModel(model);
        comboBoxUF.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxUF = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        jLabel1.setText("Nome:");

        jLabel3.setText("UF:");

        comboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxUF, 0, 345, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCidade;
    private javax.swing.JComboBox<String> comboBoxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getCampoCidade() {
        return campoCidade;
    }

    public void setCampoCidade(javax.swing.JTextField campoCidade) {
        this.campoCidade = campoCidade;
    }

    public javax.swing.JComboBox<String> getComboBoxUF() {
        return comboBoxUF;
    }

    public void setComboBoxUF(javax.swing.JComboBox<String> comboBoxUF) {
        this.comboBoxUF = comboBoxUF;
    }
}
