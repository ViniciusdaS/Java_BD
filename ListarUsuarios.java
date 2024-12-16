
package Banco_de_dados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListarUsuarios {
    public static void listarUsuarios(Connection conexao) {
        String sql = "SELECT * FROM usuarios";
        
        try (Statement stmt = conexao.createStatement(); 
                ResultSet rs = stmt.executeQuery(sql)) {
                
                System.out.println("ID | Nome | Email");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + "|" + rs.getString("Nome") + "|" + rs.getString("Email")); 
                }
    } catch (Exception e) {
        System.out.println("Erro ao listar usuarios: " + e.getMessage());
    }
}
}