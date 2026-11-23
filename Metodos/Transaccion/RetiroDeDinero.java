package Transaccion;

public class RetiroDeDinero {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario(10000000, 5000000);
        Cajero transaccion = new Cajero();
        transaccion.verificarTransaccion(usuario1);

    }
}
