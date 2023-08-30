public class Musico extends Artista {
    private String instrumento;

    public Musico(String nome, String cpf, String rg, String nomeArtistico, String especialidade, String instrumento) {
        super(nome, cpf, rg, nomeArtistico, especialidade);
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public void imprimir() {
        System.out.println("Olá, eu sou o " + this.getEspecialidade() + " " + this.getNome() + ". Meu instrumento é " + this.getInstrumento() + ".");
    }

    public void consultarSindicato() {
        System.out.format("Eu, artista %f, faço parte do sindicato dos músicos.\n", this.getNomeArtistico());
    }
}
