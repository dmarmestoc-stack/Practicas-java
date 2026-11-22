import java.util.Scanner;
public class RetiroDinero {
    final double RESTO=0;
    public static void main(String[] args) {
        Scanner ingresar= new Scanner(System.in);
        double saldo = 2450000;
        System.out.println("Ingrese cantidad de dinero que quiere retirar:");
        double montoDinero = ingresar.nextDouble();
        double totalSaldo = saldo-montoDinero;
        if(totalSaldo>=resto){
            System.out.println("Transaccion realizada con exito, su dinero restante es de:"+totalSaldo);
            
        }else{
            System.out.println("No se puede realizar la transaccion, fondos insuficientes");
        }

    }
    
}
