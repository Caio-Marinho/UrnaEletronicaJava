import java.util.ArrayList;

public class Resultados {

    public void apurarResultados(ArrayList<Candidato> candidato,int votantes,int votosNulos) {
        System.out.println("Votos Validos: " + (int)this.totaisVotosValidos(votantes,votosNulos));
        for (Candidato candidatos : candidato) {
            System.out.printf("%s: %d votos (%.2f%%)\n", candidatos.getNome(), candidatos.getVotos(),this.porcentagemVotosValidos(candidatos
            .getVotos(),votantes,votosNulos));
        }
        System.out.println("Votos Nulos: " + votosNulos);
    }

    public String exibirResultados(ArrayList<Candidato> candidato) {
        int maxVotos=0;
        ArrayList <Candidato> vencedores = new ArrayList<>();
        for (Candidato candidatos : candidato){
            if (candidatos.getVotos() > maxVotos) {
                maxVotos = candidatos.getVotos();
                vencedores.clear();
                vencedores.add(candidatos);
            } else if (candidatos.getVotos() == maxVotos) {
                vencedores.add(candidatos);
            }
        }

        if (vencedores.size() == 1) {
            return "Vencedor: " + vencedores.get(0).getNome();
        } else {
            System.out.println("Houve empate entre os candidatos: ");
            for (Candidato vencedor : vencedores) {
                System.out.println(" - "+vencedor.getNome());
            }
            return "";
        }
    }

    public double totaisVotosValidos(int votantes, int votosNulos){
        return votantes - votosNulos;
    }

    public double porcentagemVotosValidos(double votos,int votantes,int votosNulos){
    
        if (votosNulos > 0) {
            return  (votos /(this.totaisVotosValidos(votantes,votosNulos)))*100;
        }
        return (votos / votantes)*100;
    }
    
}
