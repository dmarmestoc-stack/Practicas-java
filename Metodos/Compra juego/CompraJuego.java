

public class CompraJuego {
    public static void main(String[] args) {
    Videojuego juego= new Videojuego(350000);
        Comprador comprador1= new Comprador(12, true, 5000);
       Vendedor vendedor = new Vendedor();
       vendedor.verificarPermiso(comprador1, juego);
    }
}
