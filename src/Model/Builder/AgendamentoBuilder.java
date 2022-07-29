/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Builder;

import Model.Agendamento;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AgendamentoBuilder {

    private int id = 0;
    private int id_cliente;
    private Date data;
    private String procedimento;
    private double precoProcedimento;
    private String procedimento2 = null;
    private double precoProcedimento2 = 0;
    private String local;
    private double precoLocal;
    private String obs = null;
    private double precoTotal;

    public AgendamentoBuilder() {
    }

    public AgendamentoBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public AgendamentoBuilder setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
        return this;
    }

    public AgendamentoBuilder setData(String data) {
       
        try {
            this.data = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse(data);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(AgendamentoBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        return this;
    }

    public AgendamentoBuilder setProcedimento(String procedimento) {
        this.procedimento = procedimento;
        return this;
    }

    public AgendamentoBuilder setPrecoProcedimento(double precoProcedimento) {
        this.precoProcedimento = precoProcedimento;
        return this;
    }

    public AgendamentoBuilder setProcedimento2(String procedimento2) {
        this.procedimento2 = procedimento2;
        return this;
    }

    public AgendamentoBuilder setPrecoProcedimento2(double precoProcedimento2) {
        this.precoProcedimento2 = precoProcedimento2;
        return this;
    }

    public AgendamentoBuilder setLocal(String local) {
        this.local = local;
        return this;
    }

    public AgendamentoBuilder setPrecoLocal(double precoLocal) {
        this.precoLocal = precoLocal;
        return this;
    }

    public AgendamentoBuilder setObs(String obs) {
        this.obs = obs;
        return this;
    }

    public AgendamentoBuilder setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
        return this;
    }

    public Agendamento createAgendamento() {
        return new Agendamento(id, id_cliente, data, procedimento, precoProcedimento, procedimento2, precoProcedimento2, local, precoLocal, obs, precoTotal);
    }
    
}
