
package Controller;

import View.ClientesGUI;
import View.MenuPrincipalGUI;

public class ClienteController {
    
    private final ClientesGUI view;

    public ClienteController(ClientesGUI view) {
        this.view = view;
    }
    
    
    public void voltarAoMenuPrincipal(){
       MenuPrincipalGUI menuPrincipalView = new MenuPrincipalGUI();
       menuPrincipalView.setVisible(true);
       view.dispose();    
    }
    
    
}
