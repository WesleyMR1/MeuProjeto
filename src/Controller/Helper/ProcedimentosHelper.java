package Controller.Helper;

import Model.Procedimento;
import View.ProcedimentosGUI;

public class ProcedimentosHelper implements IHelper{
        private final ProcedimentosGUI view;

    public ProcedimentosHelper(ProcedimentosGUI view) {
        this.view = view;
    }

    
    @Override
    public Procedimento obterModelo() {
            
            String situacao  = (String) view.getjComboBoxSituacao().getSelectedItem();
            int id = Integer.parseInt(view.getjTextFieldID().getText());
            String nome = view.getjTextFieldNome().getText();
            double preco = Double.parseDouble(view.getjTextFieldPreco().getText());
            
            Procedimento modelo = new Procedimento(id, nome, preco, situacao);
            
        
        return modelo;
    }

    @Override
    public void limparTela() {
        view.getjComboBoxSituacao().setSelectedIndex(0);
        view.getjTextFieldID().setText("0");
        view.getjTextFieldNome().setText("");
        view.getjTextFieldPreco().setText("");
    }
    
    
}
