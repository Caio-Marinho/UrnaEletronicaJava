import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String votar;
        UrnaEletronica urna = new UrnaEletronica();
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
