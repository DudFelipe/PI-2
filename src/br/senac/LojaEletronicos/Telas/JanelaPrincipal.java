package br.senac.LojaEletronicos.Telas;

import javax.swing.JFrame;

public class JanelaPrincipal extends javax.swing.JFrame {

    JCadastroCliente cadCli = null;
    JAlterarExcluirCliente altExcCli = null;
    JVendas vendas = null;
    JCadastroProduto cadProd = null;
    JAlterarExcluirProduto altExcProd = null;
    JRelatorioVendas relatorio = null;
    
    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        sMenuCliente = new javax.swing.JMenu();
        opCadastrar = new javax.swing.JMenuItem();
        opAlterarExcluir = new javax.swing.JMenuItem();
        sMenuProduto = new javax.swing.JMenu();
        opCadastrarProd = new javax.swing.JMenuItem();
        opAlterarExcluirProd = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Eletrônicos");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Venda", "Situação", "Data", "# Produtos", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Resumo de Vendas");

        menuCadastros.setText("Cadastros");

        sMenuCliente.setText("Clientes");

        opCadastrar.setText("Cadastrar");
        opCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastrarActionPerformed(evt);
            }
        });
        sMenuCliente.add(opCadastrar);

        opAlterarExcluir.setText("Alterar / Excluir");
        opAlterarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAlterarExcluirActionPerformed(evt);
            }
        });
        sMenuCliente.add(opAlterarExcluir);

        menuCadastros.add(sMenuCliente);

        sMenuProduto.setText("Produtos");

        opCadastrarProd.setText("Cadastrar");
        opCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastrarProdActionPerformed(evt);
            }
        });
        sMenuProduto.add(opCadastrarProd);

        opAlterarExcluirProd.setText("Alterar / Excluir");
        opAlterarExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAlterarExcluirProdActionPerformed(evt);
            }
        });
        sMenuProduto.add(opAlterarExcluirProd);

        menuCadastros.add(sMenuProduto);

        jMenuBar1.add(menuCadastros);

        jMenu1.setText("Vendas");

        jMenuItem1.setText("Vender produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        jMenuItem3.setText("Vendas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastrarActionPerformed
        if(cadCli == null || !cadCli.isDisplayable()){
            cadCli = new JCadastroCliente();
            cadCli.pack();
            cadCli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadCli.setLocationRelativeTo(null);
            cadCli.setVisible(true);
        }
        cadCli.toFront();
    }//GEN-LAST:event_opCadastrarActionPerformed

    private void opAlterarExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAlterarExcluirActionPerformed
        if(altExcCli == null || !altExcCli.isDisplayable()){
            altExcCli = new JAlterarExcluirCliente();
            altExcCli.pack();
            altExcCli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            altExcCli.setLocationRelativeTo(null);
            altExcCli.setVisible(true);
        }
        altExcCli.toFront();
    }//GEN-LAST:event_opAlterarExcluirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(vendas == null || !vendas.isDisplayable()){
            vendas = new JVendas();
            vendas.pack();
            vendas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vendas.setLocationRelativeTo(null);
            vendas.setVisible(true);
        }
        vendas.toFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastrarProdActionPerformed
        if(cadProd == null || !cadProd.isDisplayable()){
            cadProd = new JCadastroProduto();
            cadProd.pack();
            cadProd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadProd.setLocationRelativeTo(null);
            cadProd.setVisible(true);
        }
        cadProd.toFront();
    }//GEN-LAST:event_opCadastrarProdActionPerformed

    private void opAlterarExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAlterarExcluirProdActionPerformed
        if(altExcProd == null || !altExcProd.isDisplayable()){
            altExcProd = new JAlterarExcluirProduto();
            altExcProd.pack();
            altExcProd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            altExcProd.setLocationRelativeTo(null);
            altExcProd.setVisible(true);
        }
        altExcProd.toFront();
    }//GEN-LAST:event_opAlterarExcluirProdActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(relatorio == null || !relatorio.isDisplayable()){
            relatorio = new JRelatorioVendas();
            relatorio.pack();
            relatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            relatorio.setLocationRelativeTo(null);
            relatorio.setVisible(true);
        }
        relatorio.toFront();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem opAlterarExcluir;
    private javax.swing.JMenuItem opAlterarExcluirProd;
    private javax.swing.JMenuItem opCadastrar;
    private javax.swing.JMenuItem opCadastrarProd;
    private javax.swing.JMenu sMenuCliente;
    private javax.swing.JMenu sMenuProduto;
    // End of variables declaration//GEN-END:variables
}
