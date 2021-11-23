
package VIEW;

import Utilitarios.FundoTela;
import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.ImageIcon;


public class FormPrincipal extends javax.swing.JFrame {

    FundoTela tela;
    formCliente formcliente;
    formFuncionario formfuncionario;
    CardapioTela cardTela;
    
    public FormPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("imagens/teste1.jpg");
        getContentPane().add(tela);
        
        menuCliente.setIcon(new ImageIcon("Imagens/Cliente.png"));
        menuFuncionario.setIcon(new ImageIcon("Imagens/funcionario.png"));
        menuCardapio.setIcon(new ImageIcon("Imagens/hamburger.png"));
        menuEntregador.setIcon(new ImageIcon("Imagens/transporte.png"));
        menuCadastro.setIcon(new ImageIcon ("Imagens/add.png"));
        menuCaixa.setIcon(new ImageIcon("Imagens/caixa.png"));
        menuRelatorio.setIcon(new ImageIcon("Imagens/relatorio.png"));
        menuSair.setIcon(new ImageIcon("Imagens/sair.png"));
        menuPedido.setIcon(new ImageIcon("Imagens/pedido.png"));
        
        ImageIcon icone = new ImageIcon("Imagens/ico_cardapio.png");
        setIconImage(icone.getImage());
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
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria Shirae");

        menuCadastro.setText("Cadastro");

        menuCliente.setText("Clientes");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuFuncionario.setText("Funcionários");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionario);

        menuCardapio.setText("Cardápio");
        menuCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCardapioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCardapio);

        menuEntregador.setText("Entregador");
        menuCadastro.add(menuEntregador);

        jMenuBar1.add(menuCadastro);

        menuCaixa.setText("Caixa");

        menuPedido.setText("Pedido");
        menuCaixa.add(menuPedido);

        jMenuBar1.add(menuCaixa);

        menuRelatorio.setText("Relatórios");
        jMenuBar1.add(menuRelatorio);

        menuSair.setText("Sair");
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
      formcliente = new formCliente();
      tela.add(formcliente);
      formcliente.setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
      formfuncionario = new formFuncionario();
      tela.add(formfuncionario);
      formfuncionario.setVisible(true);
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCardapioActionPerformed
        cardTela = new CardapioTela();
        tela.add(cardTela);
        cardTela.setVisible(true);
    }//GEN-LAST:event_menuCardapioActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenuItem menuCardapio;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEntregador;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuPedido;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
