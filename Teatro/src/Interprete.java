public class Interprete extends Pessoa implements IImprimir {
    private String estiloVocal;

    public Interprete(String nome, String cpf, String rg, String estiloVocal) {
        super(nome, cpf, rg);
        this.estiloVocal = estiloVocal;
    }

    public String getEstiloVocal() {
        return estiloVocal;
    }

    public void setEstiloVocal(String estiloVocal) {
        this.estiloVocal = estiloVocal;
    }

    public void imprimir() {
        System.out.println("Olá, eu sou o intérprete " + this.getNome() + ". Meu estilo vocal é " + this.getEstiloVocal() + ".");
    }

    public void consultarSindicato() {
        System.out.format("Eu, artista %f, faço parte do sindicato dos cantores.\n", this.getNome());
    }
}
