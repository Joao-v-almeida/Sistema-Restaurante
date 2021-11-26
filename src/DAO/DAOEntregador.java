package DAO;

import MODEL.ModelEntregador;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOEntregador {

    public DAOEntregador() {

    }

    public void cadastrarEntregador(ModelEntregador Entregador) {
        try {

            String SQLInsertion = "INSERT INTO entregador(ent_nome, ent_status, ent_data_cad) VALUES (?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Entregador.getNome());
            st.setString(2, "Livre");
            st.setString(3, Corretores.ConverterParaSQL(Entregador.getDataCad()));

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro" + erro, "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }

    public String proximoEntregador() {
        String SQLSelection = "SELECT * FROM entregador ORDER BY ent_cod DESC LIMIT 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("ent_cod")) + 1) + "";
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro", "Erro", 0, new ImageIcon("Imagens/erro.png"));
            return "0";
        }

    }

    public void buscarEntregador(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "SELECT * FROM entregador WHERE ent_nome LIKE '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[]{rs.getString("ent_cod"), rs.getString("ent_nome"), Corretores.ConverterParaJava(rs.getString("ent_data_cad"))});
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Dados", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

    }

    public ModelEntregador PreencherCampos(int Codigo) {
        ModelEntregador Entregador = new ModelEntregador();
        try {
            String SQLSelection = "SELECT * FROM entregador WHERE ent_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Entregador.setCodigo(rs.getInt("ent_cod"));
                Entregador.setNome(rs.getString("ent_nome"));
                Entregador.setDataCad(Corretores.ConverterParaJava(rs.getString("ent_data_cad")));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro" + erro, "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

        return Entregador;
    }

    public void editarEntregador(ModelEntregador Func) {
        try {

            String SQLInsertion = "UPDATE entregador SET ent_nome = ? WHERE ent_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Func.getNome());
            st.setInt(2, Func.getCodigo());
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro editado com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro" + erro, "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }
}
