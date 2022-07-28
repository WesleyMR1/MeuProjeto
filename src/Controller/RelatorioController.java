package Controller;

import View.MenuPrincipalGUI;
import View.RelatorioGUI;

public class RelatorioController {
    
    private final RelatorioGUI view;

    public RelatorioController(RelatorioGUI view) {
        this.view = view;
    }
    
    public void voltarAoMenuPrincipal(){
       MenuPrincipalGUI menuPrincipalView = new MenuPrincipalGUI();
       menuPrincipalView.setVisible(true);
       view.dispose();    
    }
    
    
    
}
