
package Controller;

import View.ProcedimentosGUI;

public class ProcedimentosController {
    
    private final ProcedimentosGUI view;

    public ProcedimentosController(ProcedimentosGUI view) {
        this.view = view;
    }
    
    public void voltarAoMenuPrincipal(){
        ProcedimentosGUI procedimentosView = new ProcedimentosGUI();
        procedimentosView.setVisible(true);
        view.dispose();
 }
    
    
}
