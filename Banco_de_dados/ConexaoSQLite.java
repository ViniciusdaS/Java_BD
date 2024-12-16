
package Banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQLite {
    
    // Método de conexão com o banco de dados. 
    public Connection conectar() {
        Connection conexao = null; 
        String url = "jdbc:sqlite:usuarios.db"; // Caminho para o banco de dados. 
        
        try {
            conexao = DriverManager.getConnection(url);
            System.out.println("A conexão com o SQLite foi estabelecida!"); 
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
            
        }
        
        return conexao; 
        
    }
    
    // Método para fechar a conexão. 
    public void desconectar(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.close(); 
                System.out.print("Conexão fechada");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage()); 
        }
    }
}
