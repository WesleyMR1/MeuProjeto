
package Controller;

import View.MenuPrincipalGUI;
import View.ProcedimentosGUI;

public class ProcedimentosController {
    
    private final ProcedimentosGUI view;

    public ProcedimentosController(ProcedimentosGUI view) {
        this.view = view;
    }
    
    public void voltarAoMenuPrincipal(){
       MenuPrincipalGUI menuPrincipalView = new MenuPrincipalGUI();
       menuPrincipalView.setVisible(true);
       view.dispose();    
    }
    
    
}
