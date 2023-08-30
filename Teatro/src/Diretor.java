public class Diretor extends Pessoa implements IImprimir {
    private String formacao;
    private String especialidade;

    public Diretor(String nome, String cpf, String rg, String formacao, String especialidade) {
        super(nome, cpf, rg);
        this.formacao = formacao;
        this.especialidade = especialidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá, eu sou o diretor " + getNome() + ". Sou especializado em " + getEspecialidade() + ". Minha formação é " + getFormacao() + ".");
    }
}
