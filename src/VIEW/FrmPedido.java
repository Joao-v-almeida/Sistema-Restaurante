package VIEW;

import Controller.ControllerCliente;
import Controller.ControllerPedido;
import DAO.DAOPedido;
import MODEL.ModelCliente;
import MODEL.ModelPedido;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class FrmPedido extends javax.swing.JInternalFrame {

    MODEL.ModelCliente ModelCliente;
    MODEL.ModelPedido ModelPedido;
    ControllerCliente ControllerCliente;
    List<String> Lista;
    List<String> ListaItens;
    MaskFormatter FormatoTel;
    DAO.DAOPedido DAOPedido;
    ControllerPedido ControllerPedido;
    DefaultTableModel Modelo;
    DecimalFormat Decimal;
    int CodigoFuncionario;
    Date DataAtual;
    SimpleDateFormat FormatoData, FormatoHora;

    public FrmPedido(int CodigoFuncionario) {
        initComponents();
        btnPedido.setEnabled(false);
        cbClientes.setEnabled(false);
        habilitarCampos(false);
        Lista = new ArrayList<>();
        ControllerCliente = new ControllerCliente();
        ModelCliente = new ModelCliente();
        ModelPedido = new ModelPedido();
        DAOPedido = new DAOPedido();
        ControllerPedido = new ControllerPedido();
        ListaItens = new ArrayList<>();
        painelPai.setEnabledAt(1, false);
        Modelo = (DefaultTableModel) tabela.getModel();
        Decimal = new DecimalFormat("0.00");
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.CodigoFuncionario = CodigoFuncionario;
        FormatoData = new SimpleDateFormat("yyyy-MM-dd");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPai = new javax.swing.JTabbedPane();
        painelCliente = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        cbClientes = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRuaCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBairroCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        try {
            FormatoTel = new MaskFormatter("(##) #####-####");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir campo personalizado", "Erro",0);
        }
        txtTelefoneCliente = new JFormattedTextField(FormatoTel);
        jLabel6 = new javax.swing.JLabel();
        txtDataCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodidoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPedido = new javax.swing.JButton();
        btnFecharCliente = new javax.swing.JButton();
        painelPedido = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbSelecionar = new javax.swing.JComboBox<>();
        btnValor = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodPedido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        btnFecharPedido = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Pedidos");

        painelPai.setBackground(new java.awt.Color(255, 255, 204));

        painelCliente.setBackground(new java.awt.Color(255, 255, 204));
        painelCliente.setPreferredSize(new java.awt.Dimension(470, 315));

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 204));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/procurar.png"))); // NOI18N
        btnPesquisar.setActionCommand("");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cbClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquise Cliente" }));
        cbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Rua");

        txtRuaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Bairro");

        txtBairroCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone");

        txtTelefoneCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Data");

        txtDataCliente.setEditable(false);
        txtDataCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        txtCodidoCliente.setEditable(false);
        txtCodidoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        btnPedido.setBackground(new java.awt.Color(255, 255, 204));
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/finalizar.png"))); // NOI18N
        btnPedido.setBorder(null);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnFecharCliente.setBackground(new java.awt.Color(255, 255, 204));
        btnFecharCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sairpng.png"))); // NOI18N
        btnFecharCliente.setBorder(null);
        btnFecharCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFecharCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbClientes, 0, 395, Short.MAX_VALUE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addComponent(txtTelefoneCliente)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBairroCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRuaCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addComponent(txtCodidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome)))))
                .addContainerGap())
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbClientes)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPai.addTab("Clientes", painelCliente);

        painelPedido.setBackground(new java.awt.Color(255, 255, 204));
        painelPedido.setPreferredSize(new java.awt.Dimension(470, 315));

        jLabel7.setText("Item");

        txtNomeCliente.setEditable(false);
        txtNomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemKeyReleased(evt);
            }
        });

        jLabel8.setText("Selecionar");

        cbSelecionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busque um Item" }));
        cbSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecionarActionPerformed(evt);
            }
        });

        btnValor.setText("Valor");
        btnValor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorActionPerformed(evt);
            }
        });

        txtValor.setEditable(false);

        jLabel10.setText("Quantidade");

        jLabel11.setText("Cód");

        txtCodPedido.setEditable(false);

        btnAdd.setBackground(new java.awt.Color(255, 255, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/add.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(255, 255, 204));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/menos.png"))); // NOI18N
        btnRemover.setBorder(null);
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        jLabel12.setText("Total Geral");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Item", "Descrição", "Valor Unitário", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnFinalizar.setBackground(new java.awt.Color(255, 255, 204));
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/finalizar.png"))); // NOI18N
        btnFinalizar.setBorder(null);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnFecharPedido.setBackground(new java.awt.Color(255, 255, 204));
        btnFecharPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sairpng.png"))); // NOI18N
        btnFecharPedido.setBorder(null);
        btnFecharPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPedidoLayout = new javax.swing.GroupLayout(painelPedido);
        painelPedido.setLayout(painelPedidoLayout);
        painelPedidoLayout.setHorizontalGroup(
            painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1)
                .addGap(10, 10, 10))
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomeCliente)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodPedido))
                    .addGroup(painelPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSelecionar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPedidoLayout.createSequentialGroup()
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoLayout.createSequentialGroup()
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelPedidoLayout.setVerticalGroup(
            painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPai.addTab("Pedido", painelPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPai, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPai, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        setBounds(400, 70, 512, 408);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharClienteActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharClienteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        limparCamposCliente();
        
        Lista.clear();
        String Pesquisa = JOptionPane.showInputDialog(null, "Pesquise um Cliente", "Pesquisar",3);
        ControllerCliente.controlePesquisa(Pesquisa, Lista);
        Lista.forEach((i) -> {
            cbClientes.addItem(i);
            cbClientes.setEnabled(true);
            btnPedido.setEnabled(true);
        });
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        if (!(cbClientes.getSelectedItem() == null)) {
            String codigo = cbClientes.getSelectedItem().toString();
            codigo = codigo.substring(0, codigo.indexOf(" "));
            ModelCliente = ControllerCliente.controlePreencherCampos(Integer.parseInt(codigo));
            txtCodidoCliente.setText(ModelCliente.getCodigo() + "");
            txtNome.setText(ModelCliente.getNome());
            txtRuaCliente.setText(ModelCliente.getRua());
            txtBairroCliente.setText(ModelCliente.getBairro());
            txtTelefoneCliente.setText(ModelCliente.getTelefone());
            txtDataCliente.setText(ModelCliente.getDataCad());
        }
    }//GEN-LAST:event_cbClientesActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        painelPai.setEnabledAt(1, true);
        painelPai.setEnabledAt(0, false);
        painelPai.setSelectedIndex(1);
        txtNomeCliente.setText(txtNome.getText());
        btnFinalizar.setEnabled(false);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorActionPerformed
        txtValor.setText(ControllerPedido.controleValor(cbSelecionar.getSelectedItem().toString()) + "");
        txtCodPedido.setText(ControllerPedido.controleCodigo(cbSelecionar.getSelectedItem().toString()) + "");
    }//GEN-LAST:event_btnValorActionPerformed

    private void txtItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemKeyReleased
        txtValor.setText("");
        cbSelecionar.removeAllItems();
        ListaItens.clear();
        ControllerPedido.controleItens(txtItem.getText(), ListaItens);
        ListaItens.forEach((i) -> {
            cbSelecionar.addItem(i);
        }
        );
    }//GEN-LAST:event_txtItemKeyReleased

    private void cbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecionarActionPerformed
        txtValor.setText("");
        txtQuantidade.setText("");
        txtCodPedido.setText("");
    }//GEN-LAST:event_cbSelecionarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (ControllerPedido.verificarItens(txtValor.getText(), txtQuantidade.getText(), txtCodPedido.getText(), cbSelecionar.getSelectedItem().toString()));
        {
            double Total = Double.parseDouble(txtValor.getText()) * Integer.parseInt(txtQuantidade.getText());

            Modelo.addRow(new Object[]{txtCodPedido.getText(), cbSelecionar.getSelectedItem(), txtValor.getText(), txtQuantidade.getText(), (Total)});
            limparCampos();
            calcularTotal();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPedidoActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharPedidoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Modelo.removeRow(tabela.getSelectedRow());
        calcularTotal();

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        popularBens();
        ControllerPedido.controlePedido(txtCodidoCliente.getText(), CodigoFuncionario + "", txtTotal.getText(), tabela.getRowCount(), ModelPedido);
        limparFinalizar();
        painelPai.setEnabledAt(0, true);
        painelPai.setEnabledAt(1, false);
        painelPai.setSelectedIndex(0);
        limparCamposCliente();
        cbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquise Cliente" }));
    }//GEN-LAST:event_btnFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFecharCliente;
    private javax.swing.JButton btnFecharPedido;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnValor;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JTabbedPane painelPai;
    private javax.swing.JPanel painelPedido;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JTextField txtCodPedido;
    private javax.swing.JTextField txtCodidoCliente;
    private javax.swing.JTextField txtDataCliente;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtRuaCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {
        txtBairroCliente.setEnabled(valor);
        txtRuaCliente.setEnabled(valor);
        txtNome.setEnabled(valor);
        txtTelefoneCliente.setEnabled(valor);
        txtDataCliente.setEnabled(valor);

    }

    final void limparCampos() {
        txtValor.setText("");
        txtQuantidade.setText("");
        txtItem.setText("");
        txtCodPedido.setText("");
        cbSelecionar.removeAllItems();

    }
    
    final void limparCamposCliente(){
        txtCodidoCliente.setText("");
        txtNome.setText("");
        txtRuaCliente.setText("");
        txtBairroCliente.setText("");
        txtTelefoneCliente.setText("");
        txtDataCliente.setText("");
        cbClientes.removeAllItems();
        btnPedido.setEnabled(false);
        cbClientes.setEnabled(false);
        
        
    }

    final void calcularTotal() {
        double totalPedido = 0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            totalPedido += Double.parseDouble(Modelo.getValueAt(i, 4).toString());

        }
        if (totalPedido > 0) {
            btnFinalizar.setEnabled(true);
        }
        txtTotal.setText(Decimal.format(totalPedido).replace('.', ','));

    }

    final void popularBens() {
        DataAtual = new Date();
        ModelPedido.setCodigoCliente(Integer.parseInt(txtCodidoCliente.getText()));
        ModelPedido.setCodigoFuncionario(CodigoFuncionario);
        ModelPedido.setCodigoEntregador(1);
        ModelPedido.setData(FormatoData.format(DataAtual));
        ModelPedido.setStatus("Pedido Aberto");
        ModelPedido.setValor(txtTotal.getText().replace(",", "."));
        for (int i = 0; i < tabela.getRowCount(); i++) {
            ModelPedido.setCodCardapio(Integer.parseInt(Modelo.getValueAt(i, 0).toString()));
            ModelPedido.setQuantidade(Integer.parseInt(Modelo.getValueAt(i, 3).toString()));
        }
    }

    final void limparFinalizar() {
        txtTotal.setText("");
        btnFinalizar.setEnabled(false);
        txtCodPedido.setText("");
        Modelo.setRowCount(0);

    }

}
