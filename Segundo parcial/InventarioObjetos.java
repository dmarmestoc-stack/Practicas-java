import java.util.Scanner;

public class InventarioObjetos {

    public static void main(String[] args) {
        Scanner ingresar= new Scanner(System.in);
    String objetos[] = {"Espada", "Pocion", "Escudo","Pocion", "Llave", "Pocion"};
    int contador=0;
        System.out.println("Ingrese el nombre de un objeto:");
        String nombreObjeto= ingresar.nextLine();
        for(String objeto:objetos){
            System.out.println("Objeto:"+ objeto);
            if(objeto.equalsIgnoreCase(nombreObjeto)){
                contador++;
            }            
        }
            if(contador>0){
            System.out.println("Objeto disponible");
        }else{
            System.out.println("Objeto no disponible");
        }
        if(contador>1){
        System.out.println("El jugador tiene mas de una unidad de ese objeto");

        }


    }
}