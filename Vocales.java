import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
       Scanner ingresar= new Scanner(System.in);
       System.out.print("Ingrese una letra: ");
       String letra= ingresar.nextLine();
       String vocales[]={"a","e","i","o","u"};
       boolean esVocal=false;
       for (String vocal:vocales){
        if (vocal.equalsIgnoreCase(letra)){
            esVocal=true;
            break;
        }

       }
       if (esVocal){
        System.out.println("La letra "+ letra + " es una vocal");

       }else{
        System.out.println("La letra "+ letra + " no es una vocal");
       }
    }
    
}
