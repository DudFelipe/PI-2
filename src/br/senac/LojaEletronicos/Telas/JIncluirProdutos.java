/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Telas;

import br.senac.LojaEletronicos.Modelos.Cliente;
import br.senac.LojaEletronicos.Modelos.Produto;
import br.senac.LojaEletronicos.Servico.ServicoCliente;
import br.senac.LojaEletronicos.Servico.ServicoProduto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vyvis
 */
public class JIncluirProdutos extends javax.swing.JDialog {

    Produto p = new Produto();

    public JIncluirProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    public Produto selecionar() {
        return p;
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLBusca = new javax.swing.JLabel();
        jOpçoes = new javax.swing.JComboBox<>();
        JTextBusca = new javax.swing.JTextField();
        jButBuscar = new javax.swing.JButton();
        jButAdicionar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabelaProdutos = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLBusca.setText("Busca por");

        jOpçoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Fabricante", "Preço" }));
        jOpçoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpçoesActionPerformed(evt);
            }
        });

        JTextBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextBuscaActionPerformed(evt);
            }
        });

        jButBuscar.setText("Buscar");
        jButBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButBuscarActionPerformed(evt);
            }
        });

        jButAdicionar.setText("Adicionar");
        jButAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAdicionarActionPerformed(evt);
            }
        });

        jButCancelar.setText("Cancelar");
        jButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancelarActionPerformed(evt);
            }
        });

        jTabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cód.Barras", "Nome", "Fabricante", "Preço", "Modelo", "Dimensões", "Qtde"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabelaProdutos);
        if (jTabelaProdutos.getColumnModel().getColumnCount() > 0) {
            jTabelaProdutos.getColumnModel().getColumn(0).setMinWidth(0);
            jTabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTabelaProdutos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTextBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jLBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jOpçoes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButBuscar)
                    .addComponent(JTextBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButAdicionar)
                    .addComponent(jButCancelar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jOpçoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLBusca))
                    .addContainerGap(310, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOpçoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpçoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpçoesActionPerformed

    private void JTextBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextBuscaActionPerformed
      
    }//GEN-LAST:event_JTextBuscaActionPerformed

    
    
    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButCancelarActionPerformed

    private void jButAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAdicionarActionPerformed
        // TODO add your handling code here:
        int row = jTabelaProdutos.getSelectedRow();
        Integer id = (Integer) jTabelaProdutos.getValueAt(row, 0);
        p = ServicoProduto.obterProduto(id);
        
        if(row>=0){
            

        }else{
            Object msgs = "Por favor, selecione um produto.";
            JOptionPane.showMessageDialog(null, msgs, "Produto não selecionado.", 0);
        }
        dispose();
        
        
    }//GEN-LAST:event_jButAdicionarActionPerformed

    private void jTabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaProdutosMouseClicked

    }//GEN-LAST:event_jTabelaProdutosMouseClicked

    private void jButBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButBuscarActionPerformed
        // TODO add your handling code here:
        pesquisar();
    }//GEN-LAST:event_jButBuscarActionPerformed

    private void pesquisar() {
        int tipoPesquisa = jOpçoes.getSelectedIndex(); // Verifica qual opcao de pesquisa deve ser feita

        //Realiza a busca utilizando o conteúdo existente em txtBusca e o tipo de pesquisa selecionada
        List<Produto> resultado = ServicoProduto.procurarProduto(JTextBusca.getText().toUpperCase(), tipoPesquisa);

        //Armazena o modelo de tabela atual
        DefaultTableModel model = (DefaultTableModel) jTabelaProdutos.getModel();
        model.setRowCount(0); //Garantindo que não haverá nenhum dado na tabela antes da preparação dos dados

        if (resultado != null && resultado.size() > 0) {//Verifica se há algum dado retornado da busca
            for (int i = 0; i < resultado.size(); i++) {//Loop para resgatarmos todos os dados retornados
                Produto p = resultado.get(i); // Cria um produto

                System.out.println(p.getNome());

                if (p != null) {
                    Object[] row = new Object[8]; //Cria um vetor de 7 linhas para a tabela

                    //Popula as colunas com dados do produto atual
                    row[0] = p.getId();
                    row[1] = p.getCodBarras();
                    row[2] = p.getNome();
                    row[3] = p.getFabricante();
                    row[4] = p.getModelo();
                    row[5] = p.getPreco();
                    row[6] = p.getDimensoes();
                    row[7] = p.getQuantidade();

                    model.addRow(row); // Adiciona a linha com todos os dados na tabela da interface
                }

            }

        }
    }

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
            java.util.logging.Logger.getLogger(JIncluirProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JIncluirProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JIncluirProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JIncluirProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JIncluirProdutos dialog = new JIncluirProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextBusca;
    private javax.swing.JButton jButAdicionar;
    private javax.swing.JButton jButBuscar;
    private javax.swing.JButton jButCancelar;
    private javax.swing.JLabel jLBusca;
    private javax.swing.JComboBox<String> jOpçoes;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
