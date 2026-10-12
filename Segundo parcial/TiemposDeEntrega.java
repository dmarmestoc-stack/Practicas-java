public class TiemposDeEntrega {

    public static void main(String[] args) {
        int tiemposEntrega[] = {35, 50, 28, 45, 60, 32, 40};
        int sumaTiempos=0;
        double promedio=0;
        int entregasSuperiores=0;
        for(int tiempoEntrega:tiemposEntrega){
            sumaTiempos+=tiempoEntrega;
        }
        System.out.println("Total de los tiempos:"+sumaTiempos);
        promedio=sumaTiempos/tiemposEntrega.length;
        System.out.println("Tiempo promedio de entrega:" + promedio);
         for(int tiempoEntrega:tiemposEntrega){
             System.out.println("Tiempos de entrega:"+tiempoEntrega+ " minutos");
             if(tiempoEntrega>promedio){
                 entregasSuperiores++;
             }
         }
         System.out.println("Cantidad de entregas superiores al promedio:"+entregasSuperiores);
      
 
    }
}