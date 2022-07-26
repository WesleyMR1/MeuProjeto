package Controller.Helper;

import Model.Usuario;
import View.LoginGUI;

public class LoginHelper implements IHelper{
    
    private final LoginGUI view;

    public LoginHelper(LoginGUI view) {
        this.view = view;
    }
    
    @Override
    public Usuario obterModelo(){
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        Usuario modelo = new Usuario(0, usuario, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String usuario = modelo.getUsuario();
        String senha = modelo.getSenha();
        
        view.getjTextFieldUsuario().setText(usuario);
        view.getjPasswordFieldSenha().setText(senha);
    }
    
    @Override
    public void limparTela(){
        view.getjTextFieldUsuario().setText("");
        view.getjPasswordFieldSenha().setText("");
    }
    
}
