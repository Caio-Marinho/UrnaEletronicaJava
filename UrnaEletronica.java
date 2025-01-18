import java.util.ArrayList;

public class UrnaEletronica{
    private ArrayList<Candidato> _candidatos;    
    private int _votosNulos;

    public UrnaEletronica() {
        this._candidatos = new ArrayList<>();
        this._votosNulos = 0;
        this.incializarCandidatos();
    }

    public void incializarCandidatos() {
        this._candidatos.add(new Candidato(01, "Ada Lovelace"));
        this._candidatos.add(new Candidato(02, "Alan Turing"));
        this._candidatos.add(new Candidato(03, "Marie Curie"));
        this._candidatos.add(new Candidato(04, "Albert Einstein"));
        this._candidatos.add(new Candidato(05, "Ludwing van Beethoven"));
    }

    public ArrayList<Candidato> getCandidatos() {
        return this._candidatos;
    }

    public int votosNulos(){
        return this._votosNulos;
    }

    public int receberVoto(int numero) {
        for (Candidato candidato : this._candidatos) {
            if (candidato.getNumero() == numero) {
                candidato.incrementarVotos();
                return 0;
            }
        }   
            return this._votosNulos++;
    }
    public int votantes(){
        return this.getCandidatos().size() * 2;
    }
}
