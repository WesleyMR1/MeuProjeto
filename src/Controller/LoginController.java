
package Controller;

import Helper.LoginHelper;
import Model.Usuario;
import View.LoginGUI;
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
    
    public void entrarNoSistema(){
        //pegar Usuario na view
        Usuario modelo = helper.obterModelo();
        //pesquisar Usuario no banco
        //
        //se Usuario da view = usuario do banco -> menu
        //se não -> mensagem de usuario e senha invalidos
        
    }
    
    
    
    
    
}
