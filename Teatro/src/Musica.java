import java.util.ArrayList;
import java.util.Arrays;

public class Musica implements IImprimir{
    private String nomeMusica;
    private String estiloMusical;
    private String letraMusica;
    private Interprete interprete;
    private ArrayList <Musico> musicos = new ArrayList<Musico>();
    
    public Musica(String nomeMusica, String estiloMusical, String letraMusica, Interprete interprete, Musico... musicos) {
        this.nomeMusica = nomeMusica;
        this.estiloMusical = estiloMusical;
        this.letraMusica = letraMusica;
        this.interprete = interprete;
        this.musicos = new ArrayList<Musico>(Arrays.asList(musicos));
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

    public String getLetraMusica() {
        return letraMusica;
    }

    public void setLetraMusica(String letraMusica) {
        this.letraMusica = letraMusica;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(ArrayList<Musico> musicos) {
        this.musicos = musicos;
    }

    public void imprimir() {
        System.out.println(this.letraMusica);
    }
}
