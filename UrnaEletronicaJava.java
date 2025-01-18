import java.util.ArrayList;
import java.util.Scanner;

public class UrnaEletronicaJava{
    private ArrayList<Candidato> _candidatos;    
    private int _votosNulos;

    public UrnaEletronicaJava() {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String votar;
        UrnaEletronicaJava urna = new UrnaEletronicaJava();
        Menu menu = new Menu();
        ValidadorDeVotos validador = new ValidadorDeVotos();
        Resultados resultados = new Resultados();
        System.out.println("\n\tBem-Vindo à Urna Elétronica!\n");
        System.out.println("\t\tCandidatos: \n");
        menu.mostrarCandidatos(urna.getCandidatos());
        for (int i = 1; i<= urna.votantes(); i++){
            do{
                System.out.println("\nSó será aceito voto do 01 ao 05 como voto valido.");
                System.out.println("Qualquer outro voto do 06 em diante ou anterior ao 01 será considerado nulo.");
                System.out.println("Somente caracteres números são aceitos.\n");
                System.out.print("Informe seu voto sendo de 01 a 05: ");
                votar = sc.nextLine();
                if (!validador.validarVotos(votar)) {
                    System.out.println("Voto inválido. Por favor, tente novamente.");
                }
                
            }while (!validador.validarVotos(votar));
            urna.receberVoto(Integer.parseInt(votar));
        } sc.close();
        System.out.println();
        resultados.apurarResultados(urna.getCandidatos(),urna.votantes(),urna.votosNulos());
        System.out.println(resultados.exibirResultados(urna.getCandidatos()));
    }
}
