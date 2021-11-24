package VIEW;

import MODEL.ModelFuncionario;
import Controller.ControllerFuncionario;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class FrmFuncionario extends javax.swing.JInternalFrame {

    MaskFormatter FormatoTel;
    SimpleDateFormat FormatoData;
    Date DataAtual;
    ModelFuncionario ModelFuncionario;
    ControllerFuncionario ControllerFuncionario;
    DefaultTableModel Modelo;

    public FrmFuncionario() {
        initComponents();
        habilitarCampos(false);

        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        ModelFuncionario = new ModelFuncionario();
        ControllerFuncionario = new ControllerFuncionario();
        Modelo = (DefaultTableModel) tbFuncionario.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btNovo = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        cbCargo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Funcionarios");
        setFont(new java.awt.Font("Algerian", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        txtCod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cargo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Data");

        txData.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Busca");

        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Cargo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbFuncionarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionario);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir.png"))); // NOI18N
        btNovo.setContentAreaFilled(false);
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
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

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Cargo", "Atendente\t", "Caixa", "Gerente", "Administrador" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(200, 50, 619, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        DataAtual = new Date();
        txData.setText(FormatoData.format(DataAtual));
        habilitarCampos(true);
        ControllerFuncionario.controleDeCodigo();
        txtCod.setText(ControllerFuncionario.controleDeCodigo());
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        popularFuncionarioBeans();
        ControllerFuncionario.verificarDados(ModelFuncionario);
        LimparCmapos();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        Modelo.setNumRows(0);
        ControllerFuncionario.controlePesquisa(txtBusca.getText(), Modelo);
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void tbFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMousePressed
        ModelFuncionario = ControllerFuncionario.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tbFuncionario.getSelectedRow(), 0).toString()));
        txtCod.setText(ModelFuncionario.getCodigo() + "");
        txtNome.setText(ModelFuncionario.getNome());
        cbCargo.setSelectedItem(ModelFuncionario.getCargo());
        txData.setText(ModelFuncionario.getDataCad());
        habilitarCampos(true);
    }//GEN-LAST:event_tbFuncionarioMousePressed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        popularFuncionarioBeans();
        ControllerFuncionario.verificarDadosEditar(ModelFuncionario);
        LimparCmapos();
        txtBusca.setText("");
        habilitarCampos(false);
    }//GEN-LAST:event_btEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField txData;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {

        txtNome.setEnabled(valor);
        cbCargo.setEnabled(valor);
        txData.setEnabled(valor);

    }

    final void popularFuncionarioBeans() {
        ModelFuncionario.setNome(txtNome.getText());
        ModelFuncionario.setCargo(cbCargo.getSelectedItem().toString());
        ModelFuncionario.setDataCad(txData.getText());
    }

    final void LimparCmapos() {
        txtCod.setText("");
        txtNome.setText("");
        cbCargo.setSelectedIndex(0);
        txData.setText("");
    }

}
