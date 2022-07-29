
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import View.AgendaGUI;
import View.MenuPrincipalGUI;
import javax.swing.JOptionPane;


public class AgendaController{

private final AgendaGUI view;
private final AgendaHelper helper;

    public AgendaController(AgendaGUI view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }


    public void voltarAoMenuPrincipal(){
       MenuPrincipalGUI menuPrincipalView = new MenuPrincipalGUI();
       menuPrincipalView.setVisible(true);
       view.dispose();    
    }
    
    public void mostrarNaTela(){
    Agendamento modelo = helper.obterModelo();
        JOptionPane.showMessageDialog(null, modelo.toString());
        
    }
}
