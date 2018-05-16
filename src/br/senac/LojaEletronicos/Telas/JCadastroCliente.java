
package br.senac.LojaEletronicos.Telas;

import br.senac.LojaEletronicos.BLL.ClienteBLL;
import br.senac.LojaEletronicos.Mock.MockCliente;
import br.senac.LojaEletronicos.Modelos.Cliente;
import br.senac.LojaEletronicos.Servico.ServicoCliente;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class JCadastroCliente extends javax.swing.JFrame {

    private Cliente c = null;
    
    public JCadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupPreferencia = new javax.swing.ButtonGroup();
        btnCadastrar = new javax.swing.JButton();
        panelContato = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPreferencia = new javax.swing.JLabel();
        rbtTelefone = new javax.swing.JRadioButton();
        rbtCelular = new javax.swing.JRadioButton();
        rbtEmail = new javax.swing.JRadioButton();
        panelInfoEndereco = new javax.swing.JPanel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        comboCidade = new javax.swing.JComboBox<>();
        panelInfoPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        comboEstadoCivil = new javax.swing.JComboBox<>();
        lblSexo1 = new javax.swing.JLabel();
        txtFmtNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        panelContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lblTelefone.setText("Telefone Fixo");

        lblCelular.setText("Celular");

        lblEmail.setText("Email");

        lblPreferencia.setText("Preferência de contato");

        groupPreferencia.add(rbtTelefone);
        rbtTelefone.setText("Telefone Fixo");

        groupPreferencia.add(rbtCelular);
        rbtCelular.setText("Celular");

        groupPreferencia.add(rbtEmail);
        rbtEmail.setText("Email");

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContatoLayout.createSequentialGroup()
                        .addComponent(lblPreferencia)
                        .addGap(18, 18, 18)
                        .addComponent(rbtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(panelContatoLayout.createSequentialGroup()
                        .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(panelContatoLayout.createSequentialGroup()
                                .addComponent(txtTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(lblCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular)))))
                .addContainerGap())
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreferencia)
                    .addComponent(rbtTelefone)
                    .addComponent(rbtCelular)
                    .addComponent(rbtEmail)))
        );

        panelInfoEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Endereço"));

        lblEndereco.setText("Endereço");

        lblNumero.setText("Número");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumero.setText("0");

        lblCEP.setText("CEP");

        lblBairro.setText("Bairro");

        lblComplemento.setText("Complemento");

        lblCidade.setText("Cidade");

        comboCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE...", "SÃO PAULO", "RIO DE JANEIRO" }));

        javax.swing.GroupLayout panelInfoEnderecoLayout = new javax.swing.GroupLayout(panelInfoEndereco);
        panelInfoEndereco.setLayout(panelInfoEnderecoLayout);
        panelInfoEnderecoLayout.setHorizontalGroup(
            panelInfoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoEnderecoLayout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfoEnderecoLayout.createSequentialGroup()
                        .addComponent(lblCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro))
                    .addGroup(panelInfoEnderecoLayout.createSequentialGroup()
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInfoEnderecoLayout.setVerticalGroup(
            panelInfoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(comboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfoPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblRG.setText("RG");

        lblNascimento.setText("Data de nascimento");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE...", "MASCULINO", "FEMININO" }));

        lblCPF.setText("CPF");

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE...", "SOLTEIRO(A)", "CASADO(A)", "VIÚVO(A)" }));

        lblSexo1.setText("Estado Civil");

        txtFmtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout panelInfoPessoaisLayout = new javax.swing.GroupLayout(panelInfoPessoais);
        panelInfoPessoais.setLayout(panelInfoPessoaisLayout);
        panelInfoPessoaisLayout.setHorizontalGroup(
            panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRG)
                    .addComponent(lblSexo)
                    .addComponent(lblNome))
                .addGap(5, 5, 5)
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addGap(12, 12, 12)
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFmtNascimento))
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF))
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lblSexo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        panelInfoPessoaisLayout.setVerticalGroup(
            panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento)
                    .addComponent(txtFmtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo1)
                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelInfoPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelInfoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        c = new Cliente(); //Cria um novo cliente
        
        //Armazena todos os dados do cliente
        c.setNome(txtNome.getText().toUpperCase());
        
        Date dataConvertida = (Date) txtFmtNascimento.getValue();
        c.setDataNascimento(dataConvertida);

        c.setSexo(comboSexo.getSelectedItem().toString().toUpperCase());
        c.setCPF(txtCPF.getText());
        c.setRG(txtRG.getText());
        c.setEstadoCivil(comboEstadoCivil.getSelectedItem().toString().toUpperCase());
        c.setEndereco(txtEndereco.getText().toUpperCase());
        c.setNumero(Integer.parseInt(txtNumero.getText()));
        c.setCEP(txtCEP.getText());
        c.setBairro(txtBairro.getText().toUpperCase());
        c.setComplemento(txtComplemento.getText().toUpperCase());
        c.setCidade(comboCidade.getSelectedItem().toString().toUpperCase());
        c.setTelefoneFixo(txtTelefone.getText());
        c.setCelular(txtCelular.getText());
        c.setEmail(txtEmail.getText().toUpperCase());
        
        if(rbtTelefone.isSelected()){
            c.setPrefContato(1);
        }
        else{
            if(rbtCelular.isSelected()){
                c.setPrefContato(2);
            }
            else{
                if(rbtEmail.isSelected()){
                    c.setPrefContato(3);
                }
            }
        }
        
        List<String> msgs = ServicoCliente.cadastrarCliente(c); //Cadastra o cliente
        
        if(msgs == null){ //Caso não exista nenhuma mensagem, o cliente foi cadastrado com sucesso
            JOptionPane.showMessageDialog(rootPane,
                        "Cliente inserido com sucesso",
                        "Cadastro efetuado",
                        JOptionPane.INFORMATION_MESSAGE);
            c = null;
            limparCampos(); //Limpa os campos para que seja possível realizar uma nova inserção
        }else{ //Caso contrário, mostra todas as mensagens de erro de uma só vez
            JOptionPane.showMessageDialog(null, msgs, "Erro!", 0);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void limparCampos(){
        txtNome.setText("");
        txtFmtNascimento.setText("");
        comboSexo.setSelectedIndex(0);
        txtCPF.setText("");
        txtRG.setText("");
        comboEstadoCivil.setSelectedIndex(0);
        txtEndereco.setText("");
        txtNumero.setText("0");
        txtCEP.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        comboCidade.setSelectedIndex(0);
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uipanelInfoPessoaisookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> comboCidade;
    private javax.swing.JComboBox<String> comboEstadoCivil;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.ButtonGroup groupPreferencia;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPreferencia;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelInfoEndereco;
    private javax.swing.JPanel panelInfoPessoais;
    private javax.swing.JRadioButton rbtCelular;
    private javax.swing.JRadioButton rbtEmail;
    private javax.swing.JRadioButton rbtTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFmtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
