package DAO;

import MODEL.ModelCardapio;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOCardapio {

    public DAOCardapio() {

    }

    public void cadastrarCardapio(ModelCardapio Cardapio) {
        try {

            String SQLInsertion = "INSERT INTO cardapio(car_descricao, car_tipo, car_valor) VALUES (?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Cardapio.getDescricao());
            st.setString(2, Cardapio.getTipo());
            st.setDouble(3, Cardapio.getValor());

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public String proximoCardapio() {
        String SQLSelection = "SELECT * FROM cardapio ORDER BY car_cod DESC LIMIT 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("car_cod")) + 1) + "";
            } else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }

    }

    public void buscarCardapio(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "SELECT * FROM cardapio WHERE car_descricao LIKE '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[]{rs.getString("car_cod"), rs.getString("car_descricao"), rs.getString("car_tipo"), rs.getString("car_valor")});
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cardápio", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }

    }

    public ModelCardapio PreencherCampos(int Codigo) {
        ModelCardapio Cardapio = new ModelCardapio();
        try {
            String SQLSelection = "SELECT * FROM cardapio WHERE car_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Cardapio.setCodigo(rs.getInt("car_cod"));
                Cardapio.setDescricao(rs.getString("car_descricao"));
                Cardapio.setTipo(rs.getString("car_tipo"));
                Cardapio.setValor(rs.getDouble("car_valor"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cardápio", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }

        return Cardapio;
    }

    public void editarCardapio(ModelCardapio Cardapio) {
        try {

            String SQLInsertion = "UPDATE cardapio SET car_descricao = ?,  car_tipo = ?, car_valor = ? WHERE car_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Cardapio.getDescricao());
            st.setString(2, Cardapio.getTipo());
            st.setDouble(3, Cardapio.getValor());
            st.setInt(4, Cardapio.getCodigo());

            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro editado com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
}
