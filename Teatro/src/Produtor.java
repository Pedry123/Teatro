public class Produtor extends Pessoa implements IImprimir{

    public Produtor(String nome, String cpf, String rg) {
        super(nome, cpf, rg);
    }

    public void imprimir() {
        System.out.println("Olá, eu sou o produtor " + getNome() + ".");
    }
}
