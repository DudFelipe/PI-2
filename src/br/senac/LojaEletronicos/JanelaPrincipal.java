/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos;

/**
 *
 * @author eduar
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        sMenuCliente = new javax.swing.JMenu();
        opCadastrar = new javax.swing.JMenuItem();
        opAlterarExcluir = new javax.swing.JMenuItem();
        sMenuProduto = new javax.swing.JMenu();
        opCadastrarProd = new javax.swing.JMenuItem();
        opAlterarExcluirProd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Eletrônicos");

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
        sMenuCliente.add(opAlterarExcluir);

        menuCadastros.add(sMenuCliente);

        sMenuProduto.setText("Produtos");

        opCadastrarProd.setText("Cadastrar");
        sMenuProduto.add(opCadastrarProd);

        opAlterarExcluirProd.setText("Alterar / Excluir");
        sMenuProduto.add(opAlterarExcluirProd);

        menuCadastros.add(sMenuProduto);

        jMenuBar1.add(menuCadastros);

        jMenu2.setText("Relatórios");

        jMenuItem4.setText("Cliente");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Produtos");
        jMenu2.add(jMenuItem5);

        jMenuItem3.setText("Vendas");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastrarActionPerformed
        JCadastroCliente c = new JCadastroCliente();
        c.show();
    }//GEN-LAST:event_opCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem opAlterarExcluir;
    private javax.swing.JMenuItem opAlterarExcluirProd;
    private javax.swing.JMenuItem opCadastrar;
    private javax.swing.JMenuItem opCadastrarProd;
    private javax.swing.JMenu sMenuCliente;
    private javax.swing.JMenu sMenuProduto;
    // End of variables declaration//GEN-END:variables
}