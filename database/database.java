import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDados {

    public static void main(String[] args) throws SQLException {

        System.out.println("Banco de dados");

        String dsn = "jdbc:mysql://localhost/localhome";
        Connection connection = DriverManager.getConnection(dsn, "fsociety", "fsociety");

        String sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) values('fsociety', 'fsociety1337@telegram.com', 'bariro BARRO BRANCO', '2023/10/07')";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        statement.close();

    }

}
