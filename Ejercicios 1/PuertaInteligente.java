import java.util.Scanner;

public class PuertaInteligente {
    public static void main(String[] args) {
         final String TIENE_TARJETA= "S";
        final String CONTRASENIA="12345PEPE";
   
        Scanner ingresar= new Scanner(System.in);
        System.out.println("Ingrese S  si tiene tarjeta y N si no tiene:");
        String tarjeta = ingresar.nextLine();
        if(tarjeta.equalsIgnoreCase(TIENE_TARJETA)){
            System.out.println("Bienvenido");  
        }else {
           System.out.println("Ingrese una clave de acceso:");
            String clave= ingresar.nextLine();
         if(clave.equals(CONTRASENIA)){
             System.out.println("Bienvenido");
         }else{
             System.out.println("Clave incorrecta");
         }
    }
}
}
