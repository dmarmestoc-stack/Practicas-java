import java.util.Scanner;

public class TransferenciaDigital {
    public static void main(String[] args) {
        Scanner ingresar= new Scanner(System.in);
        double saldo= 2500000;
        System.out.println("Ingrese cantidad de dinero que quiere transferir:");
        double transferencia= ingresar.nextInt();
        if(transferencia<=saldo){
            double totalCuenta= saldo-transferencia;
            System.out.println("Se ha realizado con exito su transferencia, su saldo es de:"+totalCuenta);
            
        }else{
            double saldoFaltante= transferencia-saldo;
            System.out.println("La transferencia no se ha podido realizar, le hacen falta:"+ saldoFaltante+" pesos");
        }
        
    }
}
