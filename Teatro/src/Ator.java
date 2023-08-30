public class Ator extends Artista {
    private String papel;

    public Ator(String nome, String cpf, String rg, String nomeArtistico, String especialidade, String papel) {
        super(nome, cpf, rg, nomeArtistico, especialidade);
        this.papel = papel;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá, eu sou o " + this.getEspecialidade() + " " + this.getNome() + ". Meu papel é " + this.getPapel() + ".");
    }

    @Override
    public void consultarSindicato() {
        System.out.format("Eu, artista %f, faço parte do sindicato dos atores.\n", this.getNomeArtistico());
    }
}
