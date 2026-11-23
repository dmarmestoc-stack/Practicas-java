  import java.util.Scanner;
public class VidasJugador {
  

    public static void main(String[] args) {
        Scanner ingresar= new Scanner(System.in);
      int vidas = 2;

        System.out.println("Vidas iniciales del jugador:" + vidas);
 
        System.out.println("Ha chocado?, responda true o false:");
        boolean haChocado=ingresar.nextBoolean();
        if (haChocado) {
            vidas--;
            
        }

        System.out.println("Ha chocado?, responda true o false:");
        boolean haChocado2=ingresar.nextBoolean();
        if (haChocado2) {
            vidas--;
        }

         System.out.println("Ha chocado?, responda true o false:");
        boolean haChocado3=ingresar.nextBoolean();
        if (haChocado3) {
            vidas--;
        }
        if(vidas<=0){
            System.out.println("El jugador ha muerto, no tiene mas vidas");
        }else{

        System.out.println("El jugador quedo con " + vidas + " vidas.");}
       
      
    }
}
