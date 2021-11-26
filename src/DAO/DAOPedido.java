package DAO;

import MODEL.ModelPedido;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DAOPedido {

    public void pesquisaItens(String Pesquisa, List<String> ListadeItens) {

        try {
            String SQLPesquisa = "SELECT * FROM cardapio WHERE car_descricao LIKE '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ListadeItens.add(rs.getString("car_descricao"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Itens", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }
    }

    public double valorDoItem(String Pesquisa) {
        try {
            String SQLPesquisa = "SELECT * FROM cardapio WHERE car_descricao = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            st.setString(1, Pesquisa);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getDouble("car_valor");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Retornar Valor do Item!", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

        return 0;
    }

    public int valorDoCodigo(String Pesquisa) {
        try {
            String SQLPesquisa = "SELECT * FROM cardapio WHERE car_descricao = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            st.setString(1, Pesquisa);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt("car_cod");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Retornar Valor do Código!", "Erro", 0, new ImageIcon("Imagens/erro.png"));
        }

        return 0;
    }

    public void CadastrarPedido(String CodigoCliente, String CodigoFuncionario, String Total, int TamanhoTabela, ModelPedido ModelPedido) {
        Date Data = new Date();
        SimpleDateFormat FormatoData = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String SQLInsert = "INSERT INTO PEDIDOS(ped_cli_cod, ped_fun_cod, ped_ent_cod, ped_data, ped_total, ped_status) VALUES (?,?,?,?,?,?)";
            PreparedStatement st;
            st = Conexao.getConnection().prepareStatement(SQLInsert);

            st.setString(1, CodigoCliente);
            st.setString(2, CodigoFuncionario);
            st.setString(3, "1");
            st.setString(4, FormatoData.format(Data));
            
            st.setString(5, Total.replace(',', '.'));
            st.setString(6, "Pedido Aberto");

            st.execute();
            CadastrarItens(CodigoCliente, CodigoFuncionario, CodigoDoPedido(), TamanhoTabela, ModelPedido);
            CodigoDoPedido();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao cadastrar Pedido!", 0, new ImageIcon("Imagens/erro.png"));
            // JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }

    }

    public String CodigoDoPedido() {
        String Cod = "0";

        try {
            String SQLSelection = "SELECT ped_cod from pedidos ORDER BY ped_cod DESC LIMIT 1";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Cod = rs.getString("ped_cod");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao retornar CÓD do Pedido", 0, new ImageIcon("Imagens/erro.png"));
        }
        return Cod;
    }

    public void CadastrarItens(String CodigoCliente, String CodigoFuncionario, String CodigoPedido, int TamanhoTabela, ModelPedido ModelPedido) {
        for (int i = 0; i < TamanhoTabela; i++) {
            String SQLInserir = "INSERT INTO item(item_ent_cod, item_fun_cod, item_cli_cod, item_ped_cod, item_car_cod, item_quantidade) VALUES (?,?,?,?,?,?)";
            try {
                PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInserir);
                st.setString(1, "1");
                st.setString(2, CodigoFuncionario);
                st.setString(3, CodigoCliente);
                st.setString(4, CodigoPedido);
                st.setInt(5, ModelPedido.getCodCardapio(i));
                st.setInt(6, ModelPedido.getQuantidade(i));

                st.execute();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/erro.png"));
            }

        }
    }
}
