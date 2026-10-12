 import java.util.Scanner;
public class ColoresPrimarios {
    public static void main(String[] args) {
        String coloresPrimarios[]={"Rojo","Azul","Amarillo"};
        Scanner ingresar=new Scanner(System.in);
        System.out.println("Ingrese un color: ");
        String colorEscogido=ingresar.nextLine();
        boolean esColorPrimario=false;

        for(String color:coloresPrimarios){
            if(color.equalsIgnoreCase(colorEscogido)){
                esColorPrimario=true;
                break;
            }
        }
        if (esColorPrimario){
            System.out.println("El color "+ colorEscogido + " es un color primario");
        }else{
            System.out.println("El color "+ colorEscogido + " no es un color primario");
        }
        }
    }
