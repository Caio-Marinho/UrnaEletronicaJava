public class Candidato {
    // Atributos para representar um candidato
    private String _nome;
    private int _numero;
    private int _votos;
    
        // Construtor para criar um novo candidato
        public Candidato (int numero,String candidato) {
            this._nome = candidato;
            this._numero = numero;
            this._votos = 0;
        }
        
        // Métodos para obter informações sobre o candidato
        public String getNome() {
            return this._nome;
        }
    
        public int getNumero() {
            return this._numero;
        }
    
        public int getVotos() {
            return this._votos;
    }

    // Método para incrementar o número de votos
    public void incrementarVotos() {
        this._votos++;
    }
}
