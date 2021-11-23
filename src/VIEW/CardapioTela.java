package VIEW;

import MODEL.CardapioBeans;
import Controller.ControllerCardapio;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class CardapioTela extends javax.swing.JInternalFrame {
    
    MaskFormatter FormatoTel;
    CardapioBeans CardapioB;
    ControllerCardapio CardC;
    DefaultTableModel Modelo;
    
    public CardapioTela() {
        initComponents();
        novoCadastro();
        habilitarCampos(false);
        
        CardapioB = new CardapioBeans();
        CardC = new ControllerCardapio();
        Modelo = (DefaultTableModel) tbItem.getModel();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItem = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 157), 3, true));
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Cardápio");
        setFont(new java.awt.Font("Algerian", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        txtCod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Valor");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Buscar");

        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        tbItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Tipo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbItemMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbItem);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/adicionar.png"))); // NOI18N
        btNovo.setContentAreaFilled(false);
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar-arquivo.png"))); // NOI18N
        btCadastrar.setContentAreaFilled(false);
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setPreferredSize(new java.awt.Dimension(61, 23));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/editar.png"))); // NOI18N
        btEditar.setContentAreaFilled(false);
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEditar.setPreferredSize(new java.awt.Dimension(61, 23));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Item", "Lanche", "Pastel", "Pizza", "Refrigerante", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator3))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(400, 50, 497, 441);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        popularCardapioBeans();
        boolean retorno = CardC.verificarDados(CardapioB);
        if (retorno) {
            LimparCampos();
            novoCadastro();
        }
        //habilitarCampos(false);
        //LimparCampos();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tbItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbItemMousePressed
        habilitarCampos(true);
        CardapioB = CardC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tbItem.getSelectedRow(), 0).toString()));
        txtCod.setText(CardapioB.getCodigo() + "");
        txtDescricao.setText(CardapioB.getDescricao());
        cbTipo.setSelectedItem(CardapioB.getTipo());
        txtValor.setText(CardapioB.getValor() + "");
        btEditar.setEnabled(true);
    }//GEN-LAST:event_tbItemMousePressed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        popularCardapioBeans();
        CardC.verificarDadosEditar(CardapioB);
        //LimparCampos();
        txtBusca.setText("");
        habilitarCampos(false);
        novoCadastro();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarCampos(true);
        CardC.controleDeCodigo();
        txtCod.setText(CardC.controleDeCodigo());
        txtValor.setText("0");
        txtDescricao.setText("");
        cbTipo.setSelectedIndex(0);
        btCadastrar.setEnabled(true);
        btEditar.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        Modelo.setNumRows(0);
        CardC.controlePesquisa(txtBusca.getText(), Modelo);
    }//GEN-LAST:event_txtBuscaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbItem;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {
        
        txtDescricao.setEnabled(valor);
        cbTipo.setEnabled(valor);
        txtValor.setEnabled(valor);
        
    }
    
    final void popularCardapioBeans() {
        CardapioB.setDescricao(txtDescricao.getText());
        CardapioB.setTipo(cbTipo.getSelectedItem().toString());
        CardapioB.setValor(Double.parseDouble(txtValor.getText()));
    }
    
    final void LimparCampos() {
        txtCod.setText("");
        txtDescricao.setText("");
        txtValor.setText("");
        cbTipo.setSelectedIndex(0);
    }
    
    final void novoCadastro() {
        btCadastrar.setEnabled(false);
        btEditar.setEnabled(false);
        btNovo.setEnabled(true);
        
    }
    
}
