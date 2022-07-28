
package Controller;

import View.AgendaGUI;
import View.MenuPrincipalGUI;


public class AgendaController{

private final AgendaGUI view;

    public AgendaController(AgendaGUI view) {
        this.view = view;
    }


 public void voltarAoMenuPrincipal(){
    AgendaGUI agendaView = new AgendaGUI();
    agendaView.setVisible(true);
    view.dispose();    
 }
    
    
}
