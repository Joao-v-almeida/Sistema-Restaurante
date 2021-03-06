package VIEW;

import Utilitarios.Conexao;
import Utilitarios.FundoTela;
import com.lowagie.text.pdf.codec.Base64.InputStream;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class FrmPrincipal extends javax.swing.JFrame {
    FundoTela FundoTela;
    FrmCliente FrmCliente;
    FrmFuncionario FrmFuncionario;
    FrmEntregador FrmEntregador;
    FrmCardapio FrmCardapio;
    FrmPedido FrmPedido;
    Connection conexao = null;

    public FrmPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        FundoTela = new FundoTela("imagens/fundoTela.jpg");
        getContentPane().add(FundoTela);

        menuCliente.setIcon(new ImageIcon("Imagens/Cliente.png"));
        menuPedido.setIcon(new ImageIcon("Imagens/pedido.png"));
        menuFuncionario.setIcon(new ImageIcon("Imagens/funcionario.png"));
        menuCardapio.setIcon(new ImageIcon("Imagens/hamburger.png"));
        menuEntregador.setIcon(new ImageIcon("Imagens/transporte.png"));
        menuCadastro.setIcon(new ImageIcon("Imagens/add.png"));
        menuCaixa.setIcon(new ImageIcon("Imagens/caixa.png"));
        menuRelatorio.setIcon(new ImageIcon("Imagens/relatorio.png"));
        menuSair.setIcon(new ImageIcon("Imagens/sair.png"));
        menuSaindo.setIcon(new ImageIcon("Imagens/sair2.png"));

        ImageIcon icone = new ImageIcon("Imagens/sistema.png");
        setIconImage(icone.getImage());
        
        conexao = Conexao.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenuItem();
        menuCardapio = new javax.swing.JMenuItem();
        menuEntregador = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        menuPedido = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioCliente = new javax.swing.JMenuItem();
        jMenuItemRelatorioPedidos = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuSaindo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Restaurante");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuCadastro.setText("Cadastro");
        menuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuCliente.setText("Clientes");
        menuCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuFuncionario.setText("Funcion??rios");
        menuFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionario);

        menuCardapio.setText("Card??pio");
        menuCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCardapioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCardapio);

        menuEntregador.setText("Entregador");
        menuEntregador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntregadorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuEntregador);

        jMenuBar1.add(menuCadastro);

        menuCaixa.setText("Caixa");
        menuCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuPedido.setText("Pedido");
        menuPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidoActionPerformed(evt);
            }
        });
        menuCaixa.add(menuPedido);

        jMenuBar1.add(menuCaixa);

        menuRelatorio.setText("Relat??rios");
        menuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemRelatorioCliente.setText("Clientes");
        jMenuItemRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioClienteActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItemRelatorioCliente);

        jMenuItemRelatorioPedidos.setText("Pedidos");
        jMenuItemRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioPedidosActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItemRelatorioPedidos);

        jMenuBar1.add(menuRelatorio);

        menuSair.setText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        menuSaindo.setText("Sair");
        menuSaindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaindoActionPerformed(evt);
            }
        });
        menuSair.add(menuSaindo);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        FrmCliente = new FrmCliente();
        FundoTela.add(FrmCliente);
        FrmCliente.setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        FrmFuncionario = new FrmFuncionario();
        FundoTela.add(FrmFuncionario);
        FrmFuncionario.setVisible(true);
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntregadorActionPerformed
        FrmEntregador = new FrmEntregador();
        FundoTela.add(FrmEntregador);
        FrmEntregador.setVisible(true);
    }//GEN-LAST:event_menuEntregadorActionPerformed

    private void menuCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCardapioActionPerformed
        FrmCardapio = new FrmCardapio();
        FundoTela.add(FrmCardapio);
        FrmCardapio.setVisible(true);
    }//GEN-LAST:event_menuCardapioActionPerformed

    private void menuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidoActionPerformed
        FrmPedido = new FrmPedido(1);
        FundoTela.add(FrmPedido);
        FrmPedido.setVisible(true);
    }//GEN-LAST:event_menuPedidoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSaindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaindoActionPerformed
        dispose();
    }//GEN-LAST:event_menuSaindoActionPerformed

    private void jMenuItemRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioClienteActionPerformed
        try {
           java.io.InputStream caminho = getClass().getResourceAsStream("/rel/relcliente.jasper");
           JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
           JasperViewer.viewReport(print, false);
        } catch (JRException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemRelatorioClienteActionPerformed

    private void jMenuItemRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioPedidosActionPerformed
        try {
           java.io.InputStream caminho = getClass().getResourceAsStream("/rel/relpedido.jasper");
           JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
           JasperViewer.viewReport(print, false);
        } catch (JRException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemRelatorioPedidosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemRelatorioCliente;
    private javax.swing.JMenuItem jMenuItemRelatorioPedidos;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenuItem menuCardapio;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEntregador;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuPedido;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuSaindo;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
