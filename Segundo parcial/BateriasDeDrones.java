public class BateriasDeDrones {

    public static void main(String[] args) {
       int baterias[]={85,22,60,15,95,40};
       int bateriasMenor30=0;
       int bateriasMayor60=0;
       int sumaValores=0;
       double promedio=0;
         for(int i=0; i<baterias.length;i++){
            System.out.println("Carga de la bateria:"+baterias[i]);
            if(baterias[i]<30){
                bateriasMenor30++;
            }
            if(baterias[i]>=60){
                bateriasMayor60++;
            }
            sumaValores+=baterias[i];

         }
         promedio=sumaValores/baterias.length;
         if(bateriasMenor30>=30){
             System.out.println("Revision urgente de la flota");
         }
         System.out.println("Drones con bateria menor al 30%:"+bateriasMenor30);
           System.out.println("Drones con bateria mayor o igual a 60%:"+bateriasMayor60);
           System.out.println("Promedio:"+promedio);
    }
}