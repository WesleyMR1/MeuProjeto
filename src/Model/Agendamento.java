
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

    public Agendamento(int id, int id_cliente, Date data, String procedimento, double precoProcedimento, String procedimento2, double precoProcedimento2, String local, double precoLocal, String obs, double precoTotal) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.data = data;
        this.procedimento = procedimento;
        this.precoProcedimento = precoProcedimento;
        this.procedimento2 = procedimento2;
        this.precoProcedimento2 = precoProcedimento2;
        this.local = local;
        this.precoLocal = precoLocal;
        this.obs = obs;
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", id_cliente=" + id_cliente + ", data=" + data + ", procedimento=" + procedimento + ", precoProcedimento=" + precoProcedimento + ", procedimento2=" + procedimento2 + ", precoProcedimento2=" + precoProcedimento2 + ", local=" + local + ", precoLocal=" + precoLocal + ", obs=" + obs + ", precoTotal=" + precoTotal + '}';
    }

    
    
}
