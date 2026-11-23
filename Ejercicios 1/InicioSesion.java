import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        final String NOMBRE_USUARIO= "estudiante";
        final String CONTRASENIA_USUARIO= "Java2026";
        Scanner ingresar= new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
       String nombreUsuario= ingresar.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasenia= ingresar.nextLine();
        if(nombreUsuario.equalsIgnoreCase(NOMBRE_USUARIO) && contrasenia.equals(CONTRASENIA_USUARIO)){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }
    }
}
