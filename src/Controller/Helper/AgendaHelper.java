
package Controller.Helper;

import Model.Agendamento;
import View.AgendaGUI;


public class AgendaHelper implements IHelper{
    private final AgendaGUI view;

    public AgendaHelper(AgendaGUI view) {
        this.view = view;
    }
    
    @Override
    public Agendamento obterModelo(){
        int id_cliente = Integer.parseInt(view.getjTextFieldAgendamentoID().getText());
        String data = view.getjDateChooserAgendamentoData().getDateFormatString();
        String hora = view.getjFormattedTextFieldAgendamentoHora().getText();
        String dataHora = (data+" "+hora);
        String procedimento = (String) view.getjComboBoxAgendamentoProcedimento().getSelectedItem();
        String procedimento2 = (String) view.getjComboBoxAgendamentoProcedimento2().getSelectedItem();
        String local = (String) view.getjComboBoxAgendamentoLocal().getSelectedItem();
        double preco = Double.valueOf(view.getjTextFieldAgendamentoPreco().getText());
        double preco2 = Double.valueOf(view.getjTextFieldAgendamentoPreco2().getText());
        double precoLocal = Double.valueOf(view.getjTextFieldAgendamentoPrecoLocal().getText());
        double precoTotal = Double.valueOf(view.getjTextFieldAgendamentoPrecoTotal().getText());
        String obs = view.getjTextAreaAgendamentoOBS().getText();
        
        Agendamento modelo = new Agendamento(0, id_cliente, dataHora, procedimento, preco, procedimento2, preco2, local, precoLocal, obs, precoTotal);
        
        return modelo;
    }
    
    @Override
    public void limparTela(){
        view.getjFormattedTextFieldAgendamentoHora().setText("");
        view.getjComboBoxAgendamentoProcedimento().setSelectedIndex(0);
        view.getjComboBoxAgendamentoProcedimento2().setSelectedIndex(0);
        view.getjComboBoxAgendamentoLocal().setSelectedIndex(0);
        view.getjTextFieldAgendamentoPreco().setText("");
        view.getjTextFieldAgendamentoPreco2().setText("");
        view.getjTextFieldAgendamentoPrecoLocal().setText("");
        view.getjTextFieldAgendamentoPrecoTotal().setText("");
        view.getjTextAreaAgendamentoOBS().setText("");
    }
    
    
    
    
}
