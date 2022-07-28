
package Controller;

import View.AgendaGUI;
import View.MenuPrincipalGUI;


public class AgendaController{

private final AgendaGUI view;

    public AgendaController(AgendaGUI view) {
        this.view = view;
    }


    public void voltarAoMenuPrincipal(){
       MenuPrincipalGUI menuPrincipalView = new MenuPrincipalGUI();
       menuPrincipalView.setVisible(true);
       view.dispose();    
    }
    
    
}
