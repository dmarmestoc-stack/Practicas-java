import java.util.Scanner;

public class ClasificacionJugador {
    public static void main(String[] args) {
         final int PUNTAJE_MAYOR=1000;
        final int PUNTAJE_BAJO=500;
        final int SIN_PUNTAJE=0;
        Scanner ingresar= new Scanner(System.in);
        System.out.println("Ingrese su puntaje:");
        int puntaje = ingresar.nextInt();
        if(puntaje>=PUNTAJE_MAYOR){
            System.out.println("Experto");
        }else if(puntaje>=PUNTAJE_BAJO && puntaje<PUNTAJE_MAYOR){
            System.out.println("Intermedio");
        }else if(puntaje<PUNTAJE_BAJO && puntaje>=SIN_PUNTAJE){
            System.out.println("Principiante");
        }else{
            System.out.println("El puntaje es invalido");
        }
    }
}
