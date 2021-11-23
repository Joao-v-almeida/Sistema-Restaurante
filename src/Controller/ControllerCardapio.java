package Controller;

import MODEL.CardapioBeans;
import DAO.DAOCardapio;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerCardapio {

    DAOCardapio CardapioD;

    public ControllerCardapio() {
        CardapioD = new DAOCardapio();

    }

    public boolean verificarDados(CardapioBeans Card) {
        if (Card.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Card.getTipo().equals("Selecione um Item")) {
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Card.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o valor", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        CardapioD.cadastrarCardapio(Card);
        return true;
    }

    public String controleDeCodigo() {
        return CardapioD.proximoCardapio();
    }

    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        CardapioD.buscarCardapio(Pesquisa, Modelo);
    }

    public CardapioBeans controlePreencherCampos(int Codigo) {
        return CardapioD.PreencherCampos(Codigo);
    }

    public boolean verificarDadosEditar(CardapioBeans Card) {
        if (Card.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Card.getTipo().equals("Selecione um Item")) {
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Card.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o valor", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        CardapioD.editarCardapio(Card);
        return true;
    }

}
