package Controller;

import MODEL.ModelEntregador;
import DAO.DAOEntregador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerEntregador {

    DAOEntregador DAOEntregador;

    public ControllerEntregador() {
        DAOEntregador = new DAOEntregador();

    }

    public boolean verificarDados(ModelEntregador Entregador) {
        if (Entregador.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        DAOEntregador.cadastrarEntregador(Entregador);
        return true;
    }

    public String controleDeCodigo() {
        return DAOEntregador.proximoEntregador();
    }

    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        DAOEntregador.buscarEntregador(Pesquisa, Modelo);
    }

    public ModelEntregador controlePreencherCampos(int Codigo) {
        return DAOEntregador.PreencherCampos(Codigo);
    }

    public boolean verificarDadosEditar(ModelEntregador Entregador) {
        if (Entregador.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        DAOEntregador.editarEntregador(Entregador);
        return true;
    }

}
