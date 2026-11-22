
public class AccesoVideojuego {
    public static void main(String[] args) {
       final int    EDAD_MINIMA= 13;
       int edad=15;
       boolean tienePermiso= false;
       double montoPago= 150000;
       if(edad>=EDAD_MINIMA || edad<EDAD_MINIMA && tienePermiso==true ){
           System.out.println("Puede comprar el juego"); 
       }else{
           System.out.println("No puede comprar el juego");
         }
     }
}
