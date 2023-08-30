import java.util.ArrayList;

public abstract class Evento {
    protected String nome;
    protected String data;
    protected int duracao;
    protected ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();


    public Evento(String nome, String data, int duracao) {
        this.nome = nome;
        this.data = data;
        this.duracao = duracao;
        this.pessoas = new ArrayList<Pessoa>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public abstract void listarPessoas();
}

