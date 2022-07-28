package Controller;

import View.LoginGUI;
import View.MenuPrincipalGUI;



public class MenuPrincipalController {
    private final MenuPrincipalGUI view;

    public MenuPrincipalController(MenuPrincipalGUI view) {
        this.view = view;
    }
    
    
    
    public void sair(){
        LoginGUI loginView = new LoginGUI();
        loginView.setVisible(true);
        view.dispose();
    }
    
    
}
