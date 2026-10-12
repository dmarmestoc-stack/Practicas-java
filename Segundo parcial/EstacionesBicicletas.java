public class EstacionesBicicletas {
    public static void main(String[] args) {
       int bicicletasDisponibles[] = {0, 8, 3, 12, 0, 6, 15};
       int i=0;
       int size=bicicletasDisponibles.length;
       int estacionesVacias=0;
       int estacionesMayores=0;
       int totalBicicletas=0;
       while(i<size){
           System.out.println("Bicicletas disponible por estacion:"+bicicletasDisponibles[i]);
           if(bicicletasDisponibles[i]==0){
               estacionesVacias++;
               
           }
           if(bicicletasDisponibles[i]>=10){
               estacionesMayores++;
               
           }
           totalBicicletas+=bicicletasDisponibles[i];
           i++;
       }
        System.out.println("Cantidad de estaciones vacias:"+estacionesVacias);
        System.out.println("Total de bicicletas disponibles:"+totalBicicletas);
        System.out.println("Cantidad de estaciones con 10 o mas bicicletas:"+estacionesMayores);
       if(estacionesVacias>=2){
           System.out.println("Redistribucion necesaria");
       }
    }
}