package Controller;

import View.AgendaGUI;
import View.ClientesGUI;
import View.LoginGUI;
import View.MenuPrincipalGUI;
import View.ProcedimentosGUI;
import View.RelatorioGUI;



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
    
    public void abrirAgendaGUI(){
        AgendaGUI agendaView = new AgendaGUI();
        agendaView.setVisible(true);
        view.dispose();
    }
    public void abrirClientesGUI(){
        ClientesGUI clientesView = new ClientesGUI();
        clientesView.setVisible(true);
        view.dispose();
    }
    public void abrirProcedimentosGUI(){
        ProcedimentosGUI procedimentosView = new ProcedimentosGUI();
        procedimentosView.setVisible(true);
        view.dispose();
    }
    public void abrirRelatorioGUI(){
        RelatorioGUI relatorioView = new RelatorioGUI();
        relatorioView.setVisible(true);
        view.dispose();
    }
    
}
