
package Controller;

import MODEL.ModelCliente;
import DAO.DAOCliente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerCliente {
    
    DAOCliente DAOCliente;
    
    public ControllerCliente(){
       DAOCliente = new DAOCliente(); 
    }
    
    public boolean verificarDados(ModelCliente Cliente){
        if(Cliente.getNome().equals("")){
          JOptionPane.showMessageDialog(null, "Preencha o campoNome", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        
        if(Cliente.getRua().equals("")){
          JOptionPane.showMessageDialog(null, "Preencha o campoRua", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        if(Cliente.getBairro().equals("")){
          JOptionPane.showMessageDialog(null, "Preencha o campoBairro", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        if(Cliente.getTelefone().equals("  )      -    ")){
          JOptionPane.showMessageDialog(null, "Preencha o campoTelefone", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        DAOCliente.cadastrarCliente(Cliente);
        return true;
    }
    
    public String controleDeCodigo(){
        return DAOCliente.proximoCliente();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo ){
       DAOCliente.buscarCliente(Pesquisa, Modelo);
    }
    
    public ModelCliente controlePreencherCampos(int Codigo){
        return DAOCliente.PreencherCampos(Codigo);
    }
    
    public boolean verificarDadosEditar(ModelCliente Cliente){
        if(Cliente.getNome().equals("")){
          JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        
        if(Cliente.getRua().equals("")){
          JOptionPane.showMessageDialog(null, "Preencha o campo Rua", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        if(Cliente.getBairro().equals("")){
          JOptionPane.showMessageDialog(null, "Preencha o campo Bairro", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        if(Cliente.getTelefone().equals("  )      -    ")){
          JOptionPane.showMessageDialog(null, "Preencha o campo Telefone", "Erro",0 ,new ImageIcon("Imagens/erro.png"));
          return false;
        }
        DAOCliente.editarCliente(Cliente);
        return true;
    }
}
