public class RevisionPaquetes {

    public static void main(String[] args) {
         double pesos[] = {4.5, 12.8, 7.2, 18.6, 3.9, 10.5};
       int size= pesos.length;
       double pesoTotal=0;
       double paquetePesado=0;
       boolean esEspecial=false;
       for(int i=size-1; i>=0; i--){
           System.out.println("Peso paquete en la posicion "+i+":"+pesos[i]);
           pesoTotal+=pesos[i];
           if(pesos[i]>paquetePesado){
               paquetePesado=pesos[i];
           }
           if(pesos[i]>15){
               esEspecial=true;
               
           }
       }
        System.out.println("Peso total:"+pesoTotal);
        System.out.println("El paquete mas pesado fue:"+paquetePesado);
       if(esEspecial){
           System.out.println("Carga especial");
       }
    }
}