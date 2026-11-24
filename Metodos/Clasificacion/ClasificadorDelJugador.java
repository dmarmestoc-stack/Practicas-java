public class ClasificadorDelJugador {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(50);
        Clasificador clasificador = new Clasificador();
        clasificador.clasificarPuntaje(jugador);
    }
}