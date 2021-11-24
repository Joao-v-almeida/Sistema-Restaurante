package DAO;

import MODEL.ModelFuncionario;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOFuncionario {

    public DAOFuncionario() {

    }

    public void cadastrarFuncionario(ModelFuncionario Funcionario) {
        try {

            String SQLInsertion = "INSERT INTO funcionarios(fun_nome, fun_cargo,fun_data_cad) VALUES (?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Funcionario.getNome());
            st.setString(2, Funcionario.getCargo());

            st.setString(3, Corretores.ConverterParaSQL(Funcionario.getDataCad()));

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }

    public String proximoFuncionario() {
        String SQLSelection = "SELECT * FROM funcionarios ORDER BY fun_cod DESC LIMIT 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("fun_cod")) + 1) + "";
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return "0";
        }

    }

    public void buscarFuncionario(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "SELECT * FROM funcionarios WHERE fun_nome LIKE '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[]{rs.getString("fun_cod"), rs.getString("fun_nome"), rs.getString("fun_cargo"), Corretores.ConverterParaJava(rs.getString("fun_data_cad"))});
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionário", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

    }

    public ModelFuncionario PreencherCampos(int Codigo) {
        ModelFuncionario Func = new ModelFuncionario();
        try {
            String SQLSelection = "SELECT * FROM funcionarios WHERE fun_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Func.setCodigo(rs.getInt("fun_cod"));
                Func.setNome(rs.getString("fun_nome"));
                Func.setCargo(rs.getString("fun_cargo"));
                Func.setDataCad(Corretores.ConverterParaJava(rs.getString("fun_data_cad")));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionário", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

        return Func;
    }

    public void editarFuncionario(ModelFuncionario Funcionario) {
        try {

            String SQLInsertion = "UPDATE funcionarios SET fun_nome = ?,  fun_cargo = ? WHERE fun_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Funcionario.getNome());
            st.setString(2, Funcionario.getCargo());
            st.setInt(3, Funcionario.getCodigo());

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro editado com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }
}
