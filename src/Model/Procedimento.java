
package Model;


public class Procedimento {
    
    private int id;
    private String nome;
    private double preco;
    private String situacao;

    public Procedimento(int id, String nome, double preco, String situacao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
}
