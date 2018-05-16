/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Telas;

import br.senac.LojaEletronicos.BLL.ProdutoBLL;
import br.senac.LojaEletronicos.Mock.MockProduto;
import br.senac.LojaEletronicos.Modelos.Produto;
import br.senac.LojaEletronicos.Servico.ServicoProduto;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author evelyn.mscarmo and giovanebarreira
 */
public class JCadastroProduto extends javax.swing.JFrame {

    private Produto p = null;
    
    public JCadastroProduto() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfosDoProduto = new javax.swing.JPanel();
        lblNomeProd = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtDimensoes = new javax.swing.JTextField();
        lblDimensoes = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar produtos");

        InfosDoProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Produto"));

        lblNomeProd.setText("Nome");

        lblFabricante.setText("Fabricante");

        lblQuantidade.setText("Quantidade");

        lblPreco.setText("Preço");

        txtDimensoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDimensoesActionPerformed(evt);
            }
        });

        lblDimensoes.setText("Dimensões");

        lblModelo.setText("Modelo");

        lblObservacoes.setText("Observações");

        txtObservacoes.setColumns(20);
        txtObservacoes.setLineWrap(true);
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        javax.swing.GroupLayout InfosDoProdutoLayout = new javax.swing.GroupLayout(InfosDoProduto);
        InfosDoProduto.setLayout(InfosDoProdutoLayout);
        InfosDoProdutoLayout.setHorizontalGroup(
            InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                        .addComponent(lblObservacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                        .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFabricante)
                                    .addComponent(lblNomeProd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                                .addComponent(lblModelo)
                                .addGap(24, 24, 24)
                                .addComponent(txtModelo)))
                        .addGap(20, 20, 20)
                        .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDimensoes)
                            .addComponent(lblQuantidade)
                            .addComponent(lblPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDimensoes, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txtPreco)
                            .addComponent(txtQuantidade))))
                .addContainerGap())
        );
        InfosDoProdutoLayout.setVerticalGroup(
            InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProd)
                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQuantidade))
                    .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFabricante)
                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDimensoes)
                    .addComponent(txtDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfosDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfosDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       p = new Produto(); // cria um novo produto
       
       //Armazenar todos os dados do produto
       p.setNome(txtNomeProd.getText().toUpperCase());
       p.setFabricante(txtFabricante.getText().toUpperCase());
       p.setModelo(txtModelo.getText().toUpperCase());
       
       try{
           p.setPreco(Float.valueOf(txtPreco.getText()));
       }catch(Exception e){
           
       }
       
       try{
           p.setQuantidade(Integer.parseInt(txtQuantidade.getText().toUpperCase()));
       }catch(Exception e){
           
       }
       
       
       
       p.setDimensoes(txtDimensoes.getText().toUpperCase());
       p.setObservacoes(txtObservacoes.getText().toUpperCase());
       
       List<String> mensagens = ServicoProduto.casdastrarProduto(p);
       
       if(mensagens == null){ //Caso não exista nenhuma mensagem de erro, o produto foi cadastrado com sucesso
           JOptionPane.showMessageDialog(rootPane, "Produto inserido com sucesso", 
                                                    "Cadastro de produto efetuado", 
                                                    JOptionPane.INFORMATION_MESSAGE );
           
            // Limpa os campos para que seja possível realizr um novo cadastro
            p = null;
            limparCamposProduto();
       }else{ // Caso contrário, mostra todas as mensagens de erro de uma só vez
           JOptionPane.showMessageDialog(null, mensagens, "Erro", 0);
           
       }
 
      
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void limparCamposProduto(){
        txtNomeProd.setText("");
        txtFabricante.setText("");
        txtModelo.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        txtDimensoes.setText("");
        txtObservacoes.setText("");
    }
    
    private void txtDimensoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDimensoesActionPerformed

    
    }//GEN-LAST:event_txtDimensoesActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfosDoProduto;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDimensoes;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNomeProd;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTextField txtDimensoes;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
