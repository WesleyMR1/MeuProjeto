
package Controller;

import View.ClientesGUI;

public class ClienteController {
    
    private final ClientesGUI view;

    public ClienteController(ClientesGUI view) {
        this.view = view;
    }
    
    
    public void voltarAoMenuPrincipal(){
        ClientesGUI clientesView = new ClientesGUI();
        clientesView.setVisible(true);
        view.dispose();
 }
    
    
}
