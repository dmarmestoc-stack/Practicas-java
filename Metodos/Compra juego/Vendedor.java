

public class Vendedor {
     public void verificarPermiso(Comprador comprador , Videojuego juego){

            //Edad minima para comprar:13//
        if(comprador.getEdad()>=13 ){
            System.out.println("Puede comprar el juego"); 
             if(comprador.getMontoPago()>=juego.getValorJuego()){
                System.out.println("Tiene el dinero necesario para comprarlo");
            }else{
                System.out.println("No tiene el dinero necesario para comprarlo");
            }
        }else if(comprador.getEdad()<13 && comprador.isPermiso()== true){
            System.out.println("Puede comprar el juego");
            if(comprador.getMontoPago()>=juego.getValorJuego()){
                System.out.println("Tiene el dinero necesario para comprarlo");
            }else{
                System.out.println("No tiene el dinero necesario para comprarlo");
            }
        }else{
            System.out.println("No puede comprar el juego");
        }
    }
}
