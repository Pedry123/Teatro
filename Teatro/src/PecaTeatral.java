import java.util.ArrayList;

public class PecaTeatral extends Evento implements IImprimir {
    private Diretor diretor;
    private ArrayList <Autor> autores = new ArrayList<>();
    private ArrayList <Produtor> produtores = new ArrayList<>();
    private ArrayList <Ator> elenco = new ArrayList<>();

    public PecaTeatral(String nome, String data, int duracao, Diretor diretor, ArrayList<Autor> autores, ArrayList<Produtor> produtores, ArrayList<Ator> elenco) {
        super(nome, data, duracao);
        this.diretor = diretor;
        this.autores = autores;
        this.produtores = produtores;
        this.elenco = elenco;
        this.pessoas.addAll(autores);
        this.pessoas.addAll(produtores);
        this.pessoas.addAll(elenco);
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

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Produtor> getProdutores() {
        return produtores;
    }

    public void setProdutores(ArrayList<Produtor> produtores) {
        this.produtores = produtores;
    }

    public ArrayList<Ator> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<Ator> elenco) {
        this.elenco = elenco;
    }

    @Override
    public void imprimir() {
        System.out.println("Essa é a peça " + getNome() + ". Sua data é " + getData() + ". Sua duração é " + getDuracao() + ".");
    }

    @Override
    public void listarPessoas() {
        System.out.println("Lista de pessoas: o diretor é " + getDiretor().getNome() + ". Seus autores são: ");
        for (Autor autor : getAutores()) {
            System.out.println(autor.getNome());
        }
        System.out.println("Seus produtores são: ");
        for (Produtor produtor : getProdutores()) {
            System.out.println("Nome: " + produtor.getNome());
            System.out.println("CPF: " + produtor.getCpf());
            System.out.println("RG: " + produtor.getRg());
        }
        System.out.println("Seu elenco é: ");
        for (Ator ator : getElenco()) {
            System.out.println("Nome: " + ator.getNome());
            System.out.println("CPF: " + ator.getCpf());
            System.out.println("RG: " + ator.getRg());
        }
    }

    
}
