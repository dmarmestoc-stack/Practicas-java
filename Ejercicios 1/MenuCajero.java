import java.util.Scanner;

public class MenuCajero {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        double saldo = 2000000;
        System.out.println("Menu");
        System.out.println("1.Consultar");
        System.out.println("2.Retirar");
        System.out.println("3.Depositar");
        System.out.println("Elija la opcion que desea ejecutar:");
        int opcion = ingresar.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Su saldo es de:" + saldo);
                break;
            case 2:
                System.out.println("Ingrese cantidad de dinero que desea retirar:");
                double montoRetiro = ingresar.nextDouble();
                double saldoRestante = saldo - montoRetiro;
                System.out.println("Su saldo restante es de:" + saldoRestante);
                break;
            case 3:
                System.out.println("Ingrese cantidad de dinero que desea consignar:");
                double montoConsigno = ingresar.nextDouble();
                double saldoTotal = saldo + montoConsigno;
                System.out.println("Su saldo total es de:" + saldoTotal);
                break;

        }
    }
}
