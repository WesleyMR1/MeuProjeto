
package Controller;

import Model.DAO.Conexao;
import Model.DAO.LoginDAO;
import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.LoginGUI;
import View.MenuPrincipalGUI;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginController {
    private final LoginGUI view;
    private final LoginHelper helper;
    
    
    public LoginController(LoginGUI view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
 
    public void autenticaLogin() throws SQLException{
        //pegar Usuario na view
        Usuario modelo = helper.obterModelo();
        //pesquisar Usuario no banco
        Connection conexao = new Conexao().getConnection();
        LoginDAO loginDAO = new LoginDAO(conexao);
        
        boolean pesquisa = loginDAO.autenticaUsuarioESenha(modelo);
        //
        //se Usuario da view = usuario do banco -> menu
        //se não -> mensagem de usuario e senha invalidos
            if (pesquisa) {
                
            MenuPrincipalGUI menuView = new MenuPrincipalGUI();
            menuView.setVisible(true);
            view.dispose();
            
        } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos");
        }
        
        
    }

    
    
    
    
    
}
