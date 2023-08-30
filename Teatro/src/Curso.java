import java.util.ArrayList;
import java.util.Arrays;

public class Curso implements IImprimir{
    private String nomeCurso;
    private String descricaoCurso;
    private int cargaHoraria;
    private ArrayList <Formando> formandos = new ArrayList<Formando>();
    
    public Curso(String nomeCurso, String descricaoCurso, int cargaHoraria, Formando... formandos) {
        this.nomeCurso = nomeCurso;
        this.descricaoCurso = descricaoCurso;
        this.cargaHoraria = cargaHoraria;
        this.formandos = new ArrayList<Formando>(Arrays.asList(formandos));
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Formando> getFormandos() {
        return formandos;
    }

    public void setFormandos(ArrayList<Formando> formandos) {
        this.formandos = formandos;
    }

    public void imprimir() {
        System.out.println("Nome do curso: " + this.getNomeCurso() + ". Descrição do curso: " + this.getDescricaoCurso() + ". Carga horária: " + this.getCargaHoraria() + ".");
    }
}
