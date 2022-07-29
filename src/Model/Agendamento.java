
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Agendamento {
    
    private int id;
    private int id_cliente;
    private Date data;
    private String procedimento;
    private double precoProcedimento;
    private String procedimento2;
    private double precoProcedimento2;
    private String local;
    private double precoLocal;
    private String obs;
    private double precoTotal;

    public Agendamento(int id, int id_cliente, String data, String procedimento, double precoProcedimento, String procedimento2, double precoProcedimento2, String local, double precoLocal, String obs, double precoTotal) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.procedimento = procedimento;
        this.precoProcedimento = precoProcedimento;
        this.procedimento2 = procedimento2;
        this.precoProcedimento2 = precoProcedimento2;
        this.local = local;
        this.precoLocal = precoLocal;
        this.obs = obs;
        this.precoTotal = precoTotal;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public double getPrecoProcedimento() {
        return precoProcedimento;
    }

    public void setPrecoProcedimento(double precoProcedimento) {
        this.precoProcedimento = precoProcedimento;
    }

    public String getProcedimento2() {
        return procedimento2;
    }

    public void setProcedimento2(String procedimento2) {
        this.procedimento2 = procedimento2;
    }

    public double getPrecoProcedimento2() {
        return precoProcedimento2;
    }

    public void setPrecoProcedimento2(double precoProcedimento2) {
        this.precoProcedimento2 = precoProcedimento2;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getPrecoLocal() {
        return precoLocal;
    }

    public void setPrecoLocal(double precoLocal) {
        this.precoLocal = precoLocal;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    

    
    
    
    
    
    
    
}
