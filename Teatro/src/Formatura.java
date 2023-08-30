import java.util.ArrayList;
public class Formatura extends Evento implements IImprimir {
    private ArrayList <Curso> cursos = new ArrayList<>();
    private ArrayList <Formando> formandos = new ArrayList<>();

    public Formatura(String nome, String data, int duracao, ArrayList<Curso> cursos, ArrayList<Formando> formandos) {
        super(nome, data, duracao);
        this.cursos = cursos;
        this.formandos = formandos;
        this.pessoas.addAll(formandos);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Formando> getFormandos() {
        return formandos;
    }

    public void setFormandos(ArrayList<Formando> formandos) {
        this.formandos = formandos;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data: " + this.data);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Cursos: ");
        for (Curso curso : cursos) {
            System.out.println("Nome: " + curso.getNomeCurso());
            System.out.println("Duração: " + curso.getDuracaoCurso());
        }
    }

    @Override
    public void listarPessoas() {
        System.out.println("Formandos: ");
        for (Formando formando : formandos) {
            System.out.println("Nome: " + formando.getNome());
            System.out.println("CPF: " + formando.getCpf());
            System.out.println("RG: " + formando.getRg());
        }
    }
}
