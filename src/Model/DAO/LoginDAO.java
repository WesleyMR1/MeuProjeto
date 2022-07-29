package Model.DAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private final Connection conexao;

    public LoginDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    
    public boolean autenticaUsuarioESenha(Usuario usuario) throws SQLException{
        
        
        
        String sql = "select * from Usuario where usuario = ? and senha = ?;";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        
        ResultSet result = statement.getResultSet();
        
        return result.next();
}
}
