package Controller;

import MODEL.ModelCardapio;
import DAO.DAOCardapio;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerCardapio {

    DAOCardapio DAOCardapio;

    public ControllerCardapio() {
        DAOCardapio = new DAOCardapio();

    }

    public boolean verificarDados(ModelCardapio Cardapio) {
        if (Cardapio.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição ", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Cardapio.getTipo().equals("Selecione um Item")) {
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Cardapio.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o valor", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        DAOCardapio.cadastrarCardapio(Cardapio);
        return true;
    }

    public String controleDeCodigo() {
        return DAOCardapio.proximoCardapio();
    }

    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        DAOCardapio.buscarCardapio(Pesquisa, Modelo);
    }

    public ModelCardapio controlePreencherCampos(int Codigo) {
        return DAOCardapio.PreencherCampos(Codigo);
    }

    public boolean verificarDadosEditar(ModelCardapio Cardapio) {
        if (Cardapio.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Cardapio.getTipo().equals("Selecione um Item")) {
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Cardapio.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o valor", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        DAOCardapio.editarCardapio(Cardapio);
        return true;
    }

}
