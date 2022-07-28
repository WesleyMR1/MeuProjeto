package Controller;

import View.RelatorioGUI;

public class RelatorioController {
    
    private final RelatorioGUI view;

    public RelatorioController(RelatorioGUI view) {
        this.view = view;
    }
    
    public void voltarAoMenuPrincipal(){
        RelatorioGUI relatorioView = new RelatorioGUI();
        relatorioView.setVisible(true);
        view.dispose();    
 }
    
    
    
}
