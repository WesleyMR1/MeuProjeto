
package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 public class Conexao {
    
    private String url = "jdbc:mysql://localhost:3306/meuprojeto?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "Senha123@";
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
     
     
     
}
