public abstract class Artista extends Pessoa implements IImprimir {
    private String nomeArtistico;
    private String especialidade;

    public Artista(String nome, String cpf, String rg, String nomeArtistico, String especialidade) {
        super(nome, cpf, rg);
        this.nomeArtistico = nomeArtistico;
        this.especialidade = especialidade;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá, eu sou o " + this.getEspecialidade() + " " + this.getNome() + ".");
    }

    public abstract void consultarSindicato();
}
