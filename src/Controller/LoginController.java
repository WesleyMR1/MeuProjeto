
package Controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import Helper.LoginHelper;
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
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        this.view.exibemensagem("Executei o fiz tarefa");
    }
    
    public void autenticaLogin() throws SQLException{
        //pegar Usuario na view
        Usuario modelo = helper.obterModelo();
        //pesquisar Usuario no banco
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean pesquisa = usuarioDao.autenticaUsuarioESenha(modelo);
        //
        //se Usuario da view = usuario do banco -> menu
        //se não -> mensagem de usuario e senha invalidos
            if (pesquisa) {
                
            MenuPrincipalGUI menu = new MenuPrincipalGUI();
            menu.setVisible(true);
            
        } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos");
        }
        
        
    }

    
    
    
    
    
}
