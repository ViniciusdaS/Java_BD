
package Banco_de_dados;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite(); 
        Connection conexao = conexaoSQLite.conectar(); 
        
        // Se a conexão não for nula, ou seja se ouver conexão. 
        if (conexao != null) {
            CriarTabela.criarTabelaUsuarios(conexao); 
            
            // Insere usuario.
            InserirUsuario.inserirUsuario(conexao, "Cleber", "Cleber@Gmail.com"); 
            InserirUsuario.inserirUsuario(conexao, "Vinicius", "ViniLindo@gmail.com");
            InserirUsuario.inserirUsuario(conexao, "Clovis", "Clovis@gmail.com");
            InserirUsuario.inserirUsuario(conexao, "Clorisvaldo", "Clorisvaldonildo@Gmail.com");
            InserirUsuario.inserirUsuario(conexao, "Aleatorio", "Aleatorio@gmail.com");
            
            ListarUsuarios.listarUsuarios(conexao); 
            
            conexaoSQLite.desconectar(conexao);
        }
    }
}
