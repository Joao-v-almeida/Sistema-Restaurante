
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Conexao {
 private final String URL = "jdbc:mysql://localhost:3306/sistema_restaurante";
 private final String Driver = "org.gjt.mm.mysql.Driver";
 private final String Usuario = "root";
 private final String Senha = "";
 private static Connection Con;
 
 public Conexao(){
    try {
        Con = DriverManager.getConnection(URL, Usuario, Senha);
        Con.setAutoCommit(false);
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco", "Erro",0, new ImageIcon("Imagens/bancoErro.png"));
    } 
 }
 public static Connection getConnection(){
     if(Con==null){
         Conexao conexao = new Conexao();
     }
     return Con;
 }
 public static void fecharConexao(){

     try {
         if(!Con.isClosed()){
             Con.close();
         }
     } catch (SQLException ex) {
         Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }

public static void main(String args[]){
    Conexao.getConnection();
}
}