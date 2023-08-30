public class Formando extends Pessoa implements IImprimir{
    private Curso curso;
    private int anoConclusao;
    private String temaTCC;

    public Formando(String nome, String cpf, String rg, Curso curso, int anoConclusao, String temaTCC) {
        super(nome, cpf, rg);
        this.curso = curso;
        this.anoConclusao = anoConclusao;
        this.temaTCC = temaTCC;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String gettemaTCC() {
        return temaTCC;
    }

    public void settemaTCC(String temaTCC) {
        this.temaTCC = temaTCC;
    }

    @Override
    public void imprimir() {
        System.out.println("YES! Meu nome é " + this.getNome() + ". Estou me formando em " + this.getCurso().getNomeCurso() + ". Meu tema de TCC foi " + this.gettemaTCC() + ".");
    }    
}
