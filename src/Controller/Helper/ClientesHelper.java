package Controller.Helper;

import Model.Cliente;
import View.ClientesGUI;

public class ClientesHelper implements IHelper{
    
    private final ClientesGUI view;

    public ClientesHelper(ClientesGUI view) {
        this.view = view;
    }
    
    @Override
    public Cliente obterModelo(){
        String cpf = view.getjFormattedTextFieldCadastroCPF().getText();
        String celular = view.getjFormattedTextFieldCadastroCelular().getText();
        String obs = view.getjTextAreaCadastroOBS().getText();
        int id = Integer.parseInt(view.getjTextFieldCadastroID().getText());
        String nome = view.getjTextFieldCadastroNome().getText();
        
        Cliente modelo = new Cliente(id, nome, cpf, celular, obs);
        
        return modelo;
    }
    
    
    @Override
    public void limparTela(){
        
        view.getjFormattedTextFieldCadastroCPF().setText("");
        view.getjFormattedTextFieldCadastroCelular().setText("");
        view.getjTextAreaCadastroOBS().setText("");
        view.getjTextFieldCadastroID().setText("0");
        view.getjTextFieldCadastroNome().setText("");
           
    }
    
    
    
    
}
