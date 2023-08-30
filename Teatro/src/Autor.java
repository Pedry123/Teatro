public class Autor extends Artista {
    private PecaTeatral peca;
    private String formacao;

    public Autor(String nome, String cpf, String rg, String nomeArtistico, String especialidade, PecaTeatral peca, String formacao) {
        super(nome, cpf, rg, nomeArtistico, especialidade);
        this.peca = peca;
        this.formacao = formacao;
    }

    public PecaTeatral getPeca() {
        return peca;
    }

    public void setPeca(PecaTeatral peca) {
        this.peca = peca;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Olá, eu sou o autor " + getNome() + ". Minha formação é " + getFormacao() + ". Minha peça é " + getPeca().getNome() + "." );
    }

    @Override
    public void consultarSindicato() {
        System.out.format("Eu, artista %f, faço parte dos sindicato dos autores de peças teatrais. Curioso sindicato, não?\n", this.getNome());
    }
}
