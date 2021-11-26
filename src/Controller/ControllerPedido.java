package Controller;

import DAO.DAOPedido;
import MODEL.ModelPedido;
import VIEW.FrmPedido;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ControllerPedido {

    DAOPedido DAOPedido;

    public ControllerPedido() {
        DAOPedido = new DAOPedido();
    }

    public void controleItens(String Pesquisa, List<String> ListaItens) {
        DAOPedido.pesquisaItens(Pesquisa, ListaItens);
    }

    public Double controleValor(String Pesquisa) {
        return DAOPedido.valorDoItem(Pesquisa);
    }

    public int controleCodigo(String Pesquisa) {
        return DAOPedido.valorDoCodigo(Pesquisa);
    }

    public boolean verificarItens(String Valor, String Quantidade, String Codigo, String Itens) {

        if (Valor.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Valor", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

        try {
            int x = Integer.parseInt(Quantidade);
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "Quantidade não pode ser zero", "Erro", 0, new ImageIcon("Imagens/erro.png"));
                FrmPedido.txtQuantidade.grabFocus();
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Insira um número inteiro na Quantidade", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            FrmPedido.txtQuantidade.grabFocus();
        }

        if (Quantidade.equals("") || Quantidade.isEmpty()) {
            return false;
        }

        if (Codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Código", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Itens.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Itens", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }
        return true;

    }

    public void controlePedido(String codigoCliente, String codigoFuncionario, String Total, int TamanhoTabela, ModelPedido ModelPedido) {
        DAOPedido.CadastrarPedido(codigoCliente, codigoFuncionario, Total, TamanhoTabela, ModelPedido);
    }
}
