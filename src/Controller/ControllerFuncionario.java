package Controller;

import MODEL.ModelFuncionario;
import DAO.DAOFuncionario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerFuncionario {

    DAOFuncionario DAOFuncionario;

    public ControllerFuncionario() {
        DAOFuncionario = new DAOFuncionario();

    }

    public boolean verificarDados(ModelFuncionario Funcionario) {
        if (Funcionario.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Funcionario.getCargo().equals("Selecione um Cargo")) {
            JOptionPane.showMessageDialog(null, "Selecione um Cargo", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        DAOFuncionario.cadastrarFuncionario(Funcionario);
        return true;
    }

    public String controleDeCodigo() {
        return DAOFuncionario.proximoFuncionario();
    }

    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        DAOFuncionario.buscarFuncionario(Pesquisa, Modelo);
    }

    public ModelFuncionario controlePreencherCampos(int Codigo) {
        return DAOFuncionario.PreencherCampos(Codigo);
    }

    public boolean verificarDadosEditar(ModelFuncionario Funcionario) {
        if (Funcionario.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        if (Funcionario.getCargo().equals("Selecione um Cargo")) {
            JOptionPane.showMessageDialog(null, "Selecione um Cargo", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return false;
        }

        DAOFuncionario.editarFuncionario(Funcionario);
        return true;
    }

}
