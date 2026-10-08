import java.util.Scanner;

public class RevisionDrones {

    public static void main(String[] args) {
         Scanner ingresar= new Scanner(System.in);
  int codigosDrones[] = {104, 215, 308, 417, 526, 639};
  int i=0;
  int elementosRevisados=0;
  boolean codigoEncontrado=false;
        System.out.println("¿Que codigo desea buscar?:");
        int codigo= ingresar.nextInt();
  while(i<codigosDrones.length){
      System.out.println("Codigo de cada dron:"+ codigosDrones[i]);
      if(codigo==codigosDrones[i]){
            codigoEncontrado=true;
          break;
      }else{
          elementosRevisados++;
      }
      i++;
  }
  if(codigoEncontrado){
       System.out.println("El dron esta registrado");
  
  }else{
      System.out.println("Dron no encontrado");
  }
        System.out.println("Fueron revisados "+elementosRevisados+" elementos");
    }
}