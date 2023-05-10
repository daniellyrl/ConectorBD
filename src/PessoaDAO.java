import java.sql.*;
import java.util.ArrayList;
public class PessoaDAO {
    private Connection connection;

    public PessoaDAO() {
        this.connection = new Conexao().GeraConexao();
    }

    public void adiciona(Pessoa p) {
        String sql = "INSERT INTO pessoa(nome,idade) VALUES(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getIdade());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

