public class Palestra extends Evento implements IImprimir{
    private String temaPalestra;
    private Palestrante palestrante;
    
    public Palestra(String nome, String data, int duracao, String temaPalestra, Palestrante palestrante) {
        super(nome, data, duracao);
        this.temaPalestra = temaPalestra;
        this.palestrante = palestrante;
        this.pessoas.add(palestrante);
    }

    public String getTemaPalestra() {
        return temaPalestra;
    }

    public void setTemaPalestra(String temaPalestra) {
        this.temaPalestra = temaPalestra;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data: " + this.data);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Tema: " + this.temaPalestra);
        System.out.println("Palestrante: " + this.palestrante.getNome());
    }    

    @Override
    public void listarPessoas() {
        System.out.println("Palestrante: " + this.palestrante.getNome());
        System.out.println("CPF: " + this.palestrante.getCpf());
        System.out.println("RG: " + this.palestrante.getRg());
    }
}
