package br.senac.LojaEletronicos.Telas;

import br.senac.LojaEletronicos.Modelos.Produto;
import br.senac.LojaEletronicos.Servico.ServicoProduto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author evelyn.mscarmo and giovanebarreira
 */
public class JAlterarExcluirProduto extends javax.swing.JFrame {
    
    public JAlterarExcluirProduto() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaResultados = new javax.swing.JTable();
        lblBusca = new javax.swing.JLabel();
        comboCatBusca = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar produtos");

        jTabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Fabricante", "Modelo", "Preço", "Dimensões", "Qtde"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaResultados);

        lblBusca.setText("Busca por");

        comboCatBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Fabricante", "Preço" }));
        comboCatBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCatBuscaActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        InfosDoProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Produto"));

        lblNomeProd.setText("Nome");

        lblFabricante.setText("Fabricante");

        lblQuantidade.setText("Quantidade");

        lblPreco.setText("Preço");

        lblDimensoes.setText("Dimensões");

        lblModelo.setText("Modelo");

        lblObservacoes.setText("Observações");

        txtObservacoes.setColumns(20);
        txtObservacoes.setLineWrap(true);
        txtObservacoes.setRows(5);
        jScrollPane2.setViewportView(txtObservacoes);

        javax.swing.GroupLayout InfosDoProdutoLayout = new javax.swing.GroupLayout(InfosDoProduto);
        InfosDoProduto.setLayout(InfosDoProdutoLayout);
        InfosDoProdutoLayout.setHorizontalGroup(
            InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                        .addComponent(lblObservacoes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                        .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                                    .addComponent(lblNomeProd)
                                    .addGap(32, 32, 32)
                                    .addComponent(txtNomeProd))
                                .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                                    .addComponent(lblFabricante)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(InfosDoProdutoLayout.createSequentialGroup()
                                .addComponent(lblModelo)
                                .addGap(24, 24, 24)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade)
                            .addComponent(lblDimensoes)
                            .addComponent(lblPreco))
                        .addGap(5, 5, 5)
                        .addGroup(InfosDoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDimensoes, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InfosDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCatBusca, 0, 99, Short.MAX_VALUE))
                        .addGap(136, 136, 136))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCatBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InfosDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCatBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCatBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCatBuscaActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void jTabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaResultadosMouseClicked
        if(evt.getClickCount() == 2){ //Se a linha for clicada 2 vezes
           liberarCamposProdutos(); // libera os campos para edição
           preencherCampos(); // Preenche os campos com os dados atuais do cliente, antes de serem alterados
        }
    }//GEN-LAST:event_jTabelaResultadosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar(); //Altera os dados
        txtBusca.setText(""); //Limpa o campo de busca
        pesquisar(); //Faz a pesquisa sem filtro, trazendo todos os clientes cadastrados
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pesquisar(); // Realiza a pesquisa dos produtos
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void preencherCampos(){
        int row = jTabelaResultados.getSelectedRow(); //Armazena número da linha selecionada

        Integer id = (Integer) jTabelaResultados.getValueAt(row, 0); //Armazena o valor existente no campo ID da tabela (tabela da interface)

        Produto p = ServicoProduto.obterProduto(id); //Obtém o produto que pertence ao ID armazenado

        if (p != null) { //Caso produto não seja nulo
            txtNomeProd.setText(p.getNome()); //Preenche o campo com o nome do produto
            txtFabricante.setText(p.getFabricante()); // Preenche campo fabricante
            txtModelo.setText(p.getModelo());
            txtPreco.setText(Float.toString(p.getPreco()));
            txtQuantidade.setText(p.getQuantidade().toString());
            txtDimensoes.setText(p.getDimensoes());
            txtObservacoes.setText(p.getObservacoes());           
        }
    }
    
    private void alterar(){
        try{
            int row = jTabelaResultados.getSelectedRow(); // Armazena a linha que foi selecionada

            Integer id = (Integer) jTabelaResultados.getValueAt(row, 0); // recupera o id do produto na linha selecionada

            Produto p = ServicoProduto.obterProduto(id); // Obter o produto que possui esse ID.
           
            Produto copiaP = p.getClone();
            
            if(copiaP != null){
                copiaP.setNome(txtNomeProd.getText().toUpperCase()); // Atualiza o nome do produto com o que foi digitado no campo Nome
                copiaP.setFabricante(txtFabricante.getText().toUpperCase()); // atualiza o nome do fabricante
                copiaP.setModelo(txtModelo.getText().toUpperCase()); // atualiza o modelo do produto
                copiaP.setPreco(Float.valueOf(txtPreco.getText())); // atualiza o preco
                copiaP.setQuantidade(Integer.parseInt(txtQuantidade.getText())); // atualiza a quantidade
                copiaP.setDimensoes(txtDimensoes.getText()); // atualiza as dimensões
                copiaP.setObservacoes(txtObservacoes.getText().toUpperCase()); // atualiza o campo observações

            }
            
            List<String> mensagens = ServicoProduto.atualizarProduto(copiaP); // Faz a atualizacao de todos os campos
            if(mensagens == null){ 
                JOptionPane.showMessageDialog(rootPane,
                                               "Produto inserido com sucesso",
                                               "Atualização efetuada", 
                                               JOptionPane.INFORMATION_MESSAGE);

            }else{ // caso contrario, todas as mensagens de erro serão mostradas de uma vez
                JOptionPane.showMessageDialog(null, mensagens, "Erro", 0);
                
            }

           
            limparCamposProduto(); // Limpa o conteudo que foram digitados
            bloquearCamposProdutos(); // Bloqueia os campos novamente
       }catch(Exception e){
           
       }
    }
    
    private void excluir(){
        try{
            int row = jTabelaResultados.getSelectedRow();

            Integer id = (Integer)jTabelaResultados.getValueAt(row, 0);

            Produto p = ServicoProduto.obterProduto(id);

            if(p != null){
                List<String> mensagem = ServicoProduto.excluirProduto(id);

                if(mensagem == null){
                    JOptionPane.showMessageDialog(rootPane,
                                                 "Produto excluido com sucesso!", 
                                                 "Excluir",
                                                 JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, mensagem, "Erro", 0);

                }
            }
        }catch(Exception e){
            
        }    
    }
    
    private void pesquisar(){
        int tipoPesquisa = comboCatBusca.getSelectedIndex(); // Verifica qual opcao de pesquisa deve ser feita
        
        //Realiza a busca utilizando o conteúdo existente em txtBusca e o tipo de pesquisa selecionada
        List<Produto> resultado = ServicoProduto.procurarProduto(txtBusca.getText().toUpperCase(), tipoPesquisa);
        
        //Armazena o modelo de tabela atual
        DefaultTableModel model = (DefaultTableModel) jTabelaResultados.getModel();
        model.setRowCount(0); //Garantindo que não haverá nenhum dado na tabela antes da preparação dos dados
        
        if(resultado != null && resultado.size() > 0){//Verifica se há algum dado retornado da busca
            for(int i = 0; i < resultado.size(); i++){//Loop para resgatarmos todos os dados retornados
                Produto prod = resultado.get(i); // Cria um produto
                
                System.out.println(prod.getNome());
                
                if(prod != null){
                    Object[] row = new Object[7]; //Cria um vetor de 7 linhas para a tabela
                    
                    //Popula as colunas com dados do produto atual
                    
                    row[0] = prod.getIdProduto();
                    row[1] = prod.getNome();
                    row[2] = prod.getFabricante();
                    row[3] = prod.getModelo();
                    row[4] = prod.getPreco();
                    row[5] = prod.getDimensoes();
                    row[6] = prod.getQuantidade();
                    
                    model.addRow(row); // Adiciona a linha com todos os dados na tabela da interface
                }
                
            }
            
        } 
    }
    
      private void limparCamposProduto(){
        txtNomeProd.setText("");
        txtFabricante.setText("");
        txtModelo.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        txtDimensoes.setText("");
        txtObservacoes.setText("");
        
        txtNomeProd.setFocusable(true);
    }
      
      private void liberarCamposProdutos(){ 
        txtNomeProd.setEnabled(true);
        txtFabricante.setEnabled(true);
        txtModelo.setEnabled(true);
        txtPreco.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtDimensoes.setEnabled(true);
        txtObservacoes.setEnabled(true);
      }
      
       private void bloquearCamposProdutos(){ 
        txtNomeProd.setEnabled(false);
        txtFabricante.setEnabled(false);
        txtModelo.setEnabled(false);
        txtPreco.setEnabled(false);
        txtQuantidade.setEnabled(false);
        txtDimensoes.setEnabled(false);
        txtObservacoes.setEnabled(false);
      }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JAlterarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAlterarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAlterarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAlterarExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAlterarExcluirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfosDoProduto;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> comboCatBusca;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabelaResultados;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblDimensoes;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNomeProd;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtDimensoes;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
