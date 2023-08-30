import java.util.ArrayList;

public class Musical extends Evento implements IImprimir{
    private ArrayList <Interprete> interpretes = new ArrayList<>();
    private ArrayList <Musico> musicos = new ArrayList<>();
    private ArrayList <Musica> musicas = new ArrayList<>();
    
    public Musical(String nome, String data, int duracao, ArrayList<Interprete> interpretes, ArrayList<Musico> musicos, ArrayList<Musica> musicas) {
        super(nome, data, duracao);
        this.interpretes = interpretes;
        this.musicos = musicos;
        this.musicas = musicas;
        this.pessoas.addAll(interpretes);
        this.pessoas.addAll(musicos);
    }

    public ArrayList<Interprete> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(ArrayList<Interprete> interpretes) {
        this.interpretes = interpretes;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(ArrayList<Musico> musicos) {
        this.musicos = musicos;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data: " + this.data);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Musicas: ");
        for (Musica musica : musicas) {
            System.out.println(musica.getNomeMusica());
        }
        
    }

    @Override
    public void listarPessoas() {
        System.out.println("Interpretes: ");
        for (Interprete interprete : interpretes) {
            System.out.println("Nome: " + interprete.getNome());
            System.out.println("CPF: " + interprete.getCpf());
            System.out.println("RG: " + interprete.getRg());
        }
        System.out.println("Musicos: ");
        for (Musico musico : musicos) {
            System.out.println("Nome: " + musico.getNome());
            System.out.println("CPF: " + musico.getCpf());
            System.out.println("RG: " + musico.getRg());
        }
    }
}
