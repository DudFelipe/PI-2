package br.senac.LojaEletronicos.Telas;

import br.senac.LojaEletronicos.Modelos.Cliente;
import br.senac.LojaEletronicos.Servico.ServicoCliente;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduar
 */
public class JAlterarExcluirCliente extends javax.swing.JFrame {

    public JAlterarExcluirCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBusca = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Clientes");

        btnExcluir.setText("Excluir");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        panelContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lblTelefone.setText("Telefone Fixo");

        txtTelefone.setEnabled(false);

        txtCelular.setEnabled(false);

        lblCelular.setText("Celular");

        txtEmail.setEnabled(false);

        lblEmail.setText("Email");

        lblPreferencia.setText("Preferência de contato");

        rbtTelefone.setText("Telefone Fixo");
        rbtTelefone.setEnabled(false);

        rbtCelular.setText("Celular");
        rbtCelular.setEnabled(false);

        rbtEmail.setText("Email");
        rbtEmail.setEnabled(false);

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

        txtEndereco.setEnabled(false);

        lblNumero.setText("Número");

        txtNumero.setEnabled(false);

        txtCEP.setEnabled(false);

        lblCEP.setText("CEP");

        txtBairro.setEnabled(false);

        lblBairro.setText("Bairro");

        txtComplemento.setEnabled(false);

        lblComplemento.setText("Complemento");

        lblCidade.setText("Cidade");

        comboCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE...", "SÃO PAULO", "RIO DE JANEIRO" }));
        comboCidade.setEnabled(false);

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

        txtNome.setEnabled(false);

        lblSexo.setText("Sexo");

        txtRG.setEnabled(false);

        lblRG.setText("RG");

        lblNascimento.setText("Data de nascimento");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE...", "MASCULINO", "FEMININO" }));
        comboSexo.setEnabled(false);

        lblCPF.setText("CPF");

        txtCPF.setEnabled(false);

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE...", "SOLTEIRO(A)", "CASADO(A)", "VIÚVO(A)" }));
        comboEstadoCivil.setEnabled(false);

        lblSexo1.setText("Estado Civil");

        txtFmtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtFmtNascimento.setEnabled(false);

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
                            .addComponent(comboSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addGap(12, 12, 12)
                .addGroup(panelInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFmtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF))
                    .addGroup(panelInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lblSexo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEstadoCivil, 0, 128, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelInfoPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelInfoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(7, 7, 7)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(panelInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelInfoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone Fixo", "Celular", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaResultados);

        jLabel1.setText("Busca por");

        comboBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));
        comboBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBusca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResultadosMouseClicked
        if (evt.getClickCount() == 2) {
            liberarCampos(); //Libera os campos para edição
            preencherCampos(); //Preenche os campos com os dados atuais do cliente, antes de serem alterados
        }
    }//GEN-LAST:event_tabelaResultadosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void preencherCampos(){
        int row = tabelaResultados.getSelectedRow();

        Integer id = (Integer) tabelaResultados.getValueAt(row, 0);

        Cliente c = ServicoCliente.obterCliente(id);

        if (c != null) {
            txtNome.setText(c.getNome());

            txtFmtNascimento.setText(c.getDataNascimento().toString());
            comboSexo.setSelectedItem(c.getSexo());
            txtCPF.setText(c.getCPF());
            txtRG.setText(c.getRG());
            comboEstadoCivil.setSelectedItem(c.getEstadoCivil());
            txtEndereco.setText(c.getEndereco());
            txtNumero.setText(c.getNumero() + "");
            txtCEP.setText(c.getCEP());
            txtBairro.setText(c.getBairro());
            txtComplemento.setText(c.getComplemento());
            comboCidade.setSelectedItem(c.getCidade());
            txtTelefone.setText(c.getTelefoneFixo());
            txtCelular.setText(c.getCelular());
            txtEmail.setText(c.getEmail());

            if (c.getPrefContato() == 1) {
                rbtTelefone.setSelected(true);
            } else {
                if (c.getPrefContato() == 2) {
                    rbtCelular.setSelected(true);
                } else {
                    if (c.getPrefContato() == 3) {
                        rbtEmail.setSelected(true);
                    }
                }
            }
        }
    }
    
    private void alterar() {
        int row = tabelaResultados.getSelectedRow();

        Integer id = (Integer) tabelaResultados.getValueAt(row, 0);

        Cliente c = ServicoCliente.obterCliente(id);

        if (c != null) {
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

            if (rbtTelefone.isSelected()) {
                c.setPrefContato(1);
            } else {
                if (rbtCelular.isSelected()) {
                    c.setPrefContato(2);
                } else {
                    if (rbtEmail.isSelected()) {
                        c.setPrefContato(3);
                    }
                }
            }

            List<String> msgs = ServicoCliente.atualizarCliente(c);

            if (msgs == null) {
                JOptionPane.showMessageDialog(rootPane,
                        "Cliente inserido com sucesso",
                        "Cadastro efetuado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, msgs, "Erro!", 0);
            }
        }
        limparCampos();
        bloquearCampos();
    }
    
    private void pesquisar() {
        int tipoPesquisa = comboBusca.getSelectedIndex();

        List<Cliente> resultado = ServicoCliente.procurarCliente(txtBusca.getText().toUpperCase(), tipoPesquisa);

        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        model.setRowCount(0);

        if (resultado != null && resultado.size() > 0) {
            for (int i = 0; i < resultado.size(); i++) {
                Cliente cli = resultado.get(i);

                if (cli != null) {
                    Object[] row = new Object[6];

                    row[0] = cli.getId();
                    row[1] = cli.getNome();
                    row[2] = cli.getCPF();
                    row[3] = cli.getTelefoneFixo();
                    row[4] = cli.getCelular();
                    row[5] = cli.getEmail();

                    model.addRow(row);
                }
            }
        }
    }
    
        private void limparCampos(){
        txtNome.setText("");
        txtFmtNascimento.setText("");
        comboSexo.setSelectedIndex(0);
        txtCPF.setText("");
        txtRG.setText("");
        comboEstadoCivil.setSelectedIndex(0);
        txtEndereco.setText("");
        txtNumero.setText("");
        txtCEP.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        comboCidade.setSelectedIndex(0);
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        
        txtNome.setFocusable(true);
    }
    
        private void liberarCampos() {
        txtNome.setEnabled(true);
        txtFmtNascimento.setEnabled(true);
        comboSexo.setEnabled(true);
        txtCPF.setEnabled(true);
        txtRG.setEnabled(true);
        comboEstadoCivil.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNumero.setEnabled(true);
        txtCEP.setEnabled(true);
        txtBairro.setEnabled(true);
        txtComplemento.setEnabled(true);
        comboCidade.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);
        rbtCelular.setEnabled(true);
        rbtEmail.setEnabled(true);
        rbtTelefone.setEnabled(true);
    }
    
    private void bloquearCampos() {
        txtNome.setEnabled(false);
        txtFmtNascimento.setEnabled(false);
        comboSexo.setEnabled(false);
        txtCPF.setEnabled(false);
        txtRG.setEnabled(false);
        comboEstadoCivil.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtCEP.setEnabled(false);
        txtBairro.setEnabled(false);
        txtComplemento.setEnabled(false);
        comboCidade.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
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
            java.util.logging.Logger.getLogger(JAlterarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAlterarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAlterarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAlterarExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAlterarExcluirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> comboBusca;
    private javax.swing.JComboBox<String> comboCidade;
    private javax.swing.JComboBox<String> comboEstadoCivil;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable tabelaResultados;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
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
