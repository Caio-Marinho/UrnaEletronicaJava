public class ValidadorDeVotos {
    public boolean validarVotos(String voto) {
        if (voto.matches("0\\d{1}$")) {
            return true;
        }
        return false;
    }
}
