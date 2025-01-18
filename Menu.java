import java.util.ArrayList;

public class Menu {
    public void mostrarCandidatos(ArrayList<Candidato> candidato){
        
        for (Candidato candidatos : candidato) {
            System.out.println("0"+candidatos.getNumero() + " - " + candidatos.getNome());
        }
    }
}
