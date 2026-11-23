package Transaccion;

public class Cajero {
     
    public void verificarTransaccion(Usuario usuario){
        if(usuario.getMontoRetiro()<= usuario.getSaldo()){
            double saldoRestante= usuario.getSaldo()-usuario.getMontoRetiro();
            System.out.println("Se puede realizar la transaccion, su saldo es de:"+saldoRestante);
        }else{
            System.out.println("Fondos insuficientes");
        }
    }
}
