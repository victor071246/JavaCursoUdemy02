package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.println("O nome atual é " + p.getNome());

            System.out.print("Informe o novo nome: ");
            String novoNome = entrada.next();


            stmt.close();
            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");

        }


        entrada.close();
        conexao.close();
    }
}
