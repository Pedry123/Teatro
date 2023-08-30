public class Interprete extends Artista {
    private String estiloVocal;

    public Interprete(String nome, String cpf, String rg, String nomeArtistico, String especialidade, String estiloVocal) {
        super(nome, cpf, rg, nomeArtistico, especialidade);
        this.estiloVocal = estiloVocal;
    }

    public String getEstiloVocal() {
        return estiloVocal;
    }

    public void setEstiloVocal(String estiloVocal) {
        this.estiloVocal = estiloVocal;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá, eu sou o intérprete " + this.getNome() + ". Meu estilo vocal é " + this.getEstiloVocal() + ".");
    }

    @Override
    public void consultarSindicato() {
        System.out.format("Eu, artista %f, faço parte do sindicato dos cantores.\n", this.getNome());
    }
}
