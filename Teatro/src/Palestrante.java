public class Palestrante extends Pessoa implements IImprimir {
    private String formacao;
    private String instituicao;
    private int numPalestras;

    public Palestrante(String nome, String cpf, String rg, String formacao, String instituicao, int numPalestras) {
        super(nome, cpf, rg);
        this.formacao = formacao;
        this.instituicao = instituicao;
        this.numPalestras = numPalestras;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getNumPalestras() {
        return numPalestras;
    }

    public void setNumPalestras(int numPalestras) {
        this.numPalestras = numPalestras;
    }

    public void darPalestra() {
        this.numPalestras++;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá, meu nome é " + this.getNome() + ". Sou formado em " + this.getFormacao() + " pela " + this.getInstituicao() + ". Já dei " + this.getNumPalestras() + " palestras.");
    }
}
