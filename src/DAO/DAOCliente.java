package DAO;

import MODEL.ModelCliente;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOCliente {

    public DAOCliente() {

    }

    public void cadastrarCliente(ModelCliente Cliente) {
        try {
            String SQLInsertion = "INSERT INTO clientes(cli_nome, cli_rua, cli_bairro, cli_telefone, cli_data_cad) VALUES (?,?,?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Cliente.getNome());
            st.setString(2, Cliente.getRua());
            st.setString(3, Cliente.getBairro());
            st.setString(4, Cliente.getTelefone());
            st.setString(5, Corretores.ConverterParaSQL(Cliente.getDataCad()));

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar com o Banco", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }

    public String proximoCliente() {
        String SQLSelection = "SELECT * FROM clientes ORDER BY cli_cod DESC LIMIT 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("cli_cod")) + 1) + "";
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarCliente(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "SELECT * FROM clientes WHERE cli_nome like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[]{rs.getString("cli_cod"), rs.getString("cli_nome"), rs.getString("cli_rua"), rs.getString("cli_bairro"), rs.getString("cli_telefone")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }

    }

    public void buscarCliente(String Pesquisa, List<String> Lista) {

        try {
            String SQLSelection = "SELECT * FROM clientes WHERE cli_nome like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Lista.add(rs.getString("cli_cod") + " - " + rs.getString("cli_nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }

    public ModelCliente PreencherCampos(int Codigo) {
        ModelCliente Cliente = new ModelCliente();
        try {
            String SQLSelection = "SELECT * FROM clientes WHERE cli_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Cliente.setCodigo(rs.getInt("cli_cod"));
                Cliente.setNome(rs.getString("cli_nome"));
                Cliente.setRua(rs.getString("cli_rua"));
                Cliente.setBairro(rs.getString("cli_bairro"));
                Cliente.setTelefone(rs.getString("cli_telefone"));
                Cliente.setDataCad(Corretores.ConverterParaJava(rs.getString("cli_data_cad")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
        return Cliente;
    }

    public void editarCliente(ModelCliente Cliente) {
        try {
            String SQLInsertion = "UPDATE clientes SET cli_nome = ?, cli_rua = ?, cli_bairro = ?, cli_telefone = ? WHERE cli_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Cliente.getNome());
            st.setString(2, Cliente.getRua());
            st.setString(3, Cliente.getBairro());
            st.setString(4, Cliente.getTelefone());
            st.setInt(5, Cliente.getCodigo());

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Editado com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

    }
}
