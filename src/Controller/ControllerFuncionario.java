
package Controller;


import MODEL.FuncionarioBeans;
import DAO.DAOFuncionario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerFuncionario {
    
    DAOFuncionario FuncD;
    
    public ControllerFuncionario(){
       FuncD = new DAOFuncionario();
       
    }
    
    public boolean verificarDados(FuncionarioBeans Func){
        if(Func.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
           if(Func.getCargo().equals("Selecione um Cargo")){
            JOptionPane.showMessageDialog(null, "Selecione um Cargo", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        FuncD.cadastrarFuncionario(Func);
        return true;
    }
    
    public String controleDeCodigo(){
        return FuncD.proximoFuncionario();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        FuncD.buscarFuncionario(Pesquisa, Modelo);
    }
    
    public FuncionarioBeans controlePreencherCampos(int Codigo){
        return FuncD.PreencherCampos(Codigo);
    }
    
    
     public boolean verificarDadosEditar(FuncionarioBeans Func){
        if(Func.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
          if(Func.getCargo().equals("Selecione um Cargo")){
            JOptionPane.showMessageDialog(null, "Selecione um Cargo", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        FuncD.editarFuncionario(Func);
        return true;
    }
    
}
