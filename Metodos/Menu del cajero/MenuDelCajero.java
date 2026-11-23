import Transaccion.Cajero;

public class MenuDelCajero {
    public static void main(String[] args) {
         Saldo saldo1= new Saldo(2000000);
       Menu menu= new Menu();
       menu.mostrarMenu();
       CajeroMenu cajero = new CajeroMenu();
       cajero.verificarOpcion(menu, cajero, saldo1); 

    }
}