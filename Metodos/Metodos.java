public class Metodos {
    public static void main(String[] args) {
        int baterias[]={85,22,60,15,95,40};
        Metodos.recorrer(baterias);
        Metodos.contarMenores(baterias);
        Metodos.contarMayores(baterias);
        Metodos.acumular(baterias);
        Metodos.mostrar(baterias);

    
}
public static void recorrer(int baterias[]){
   int size=baterias.length;
   for(int i=0;i<size;i++){
       System.out.println("El valor de la bateria es: "+baterias[i]);
   }
}
public static void contarMenores(int baterias[]){
    int size=baterias.length;
    int contadorMenor=0;
    for(int i=0;i<size;i++){
        if(baterias[i]<30){
            contadorMenor++;
        }
    }
    System.out.println("El total de baterias menores a 30 es: "+contadorMenor);
}
public static void contarMayores(int baterias[]){
    int size=baterias.length;
    int contadorMayor=0;
    for(int i=0;i<size;i++){
        if(baterias[i]>=60){
            contadorMayor++;
        }
    }
    System.out.println("El total de drones listos para volar es: "+contadorMayor);
}
}
public static void acumular(int baterias[]){
    int size=baterias.length;
    int suma=0;
    double promedio=0;
    for(int i=0;i<size;i++){
        suma+=baterias[i];
    }
    System.out.println("El total de la suma de las baterias es: "+suma);
  promedio=suma/size;
    System.out.println("El promedio de las baterias es: "+promedio);
   
}
public static void mostrar(int baterias[]){
    int size=baterias.length;
  int contadorMenor=0;
    for(int i=0;i<size;i++){
        if(baterias[i]<30){
            System.out.println("El valor de la bateria es: "+baterias[i]);
            contadorMenor++;
        }
    }
    if(contadorMenor>=2){
        System.out.println("Revision urgente de la flota");
    }
}