
package Banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InserirUsuario {
    public static void inserirUsuario(Connection conexao, String nome, String email) {
        String sql = "INSERT INTO usuarios(nome, email) VALUES(?, ?)";
        
        try (PreparedStatement psmt = conexao.prepareStatement(sql)) {
            psmt.setString(1, nome); 
            psmt.setString(2, email); 
            psmt.executeUpdate(); 
            System.out.println("Usuario inserido com sucesso"); 
        } catch (Exception e) {
            System.out.print("Erro ao inserir usuario" + e.getMessage());
        }
    }
}

