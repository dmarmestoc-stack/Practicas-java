public class BateriasDeDrones {

    public static void main(String[] args) {
       final int BATERIA_MINIMA=30;
       final int CANTIDAD_BATERIAS_BAJAS=2;
       int baterias[]={85,22,60,15,95,40};
       int contadorMinima=0;
       int contadorNormal=0;
       int suma=0;
       double promedio=0;
       int size=baterias.length;
       for(int bateria:baterias){
        if(bateria<BATERIA_MINIMA){
            contadorMinima++;

        }else{
            contadorNormal++;
        }
        suma=suma+bateria;

       }if(contadorMinima>=CANTIDAD_BATERIAS_BAJAS){
        System.out.println("Revision urgente hay mas de 2 baterias bajas");

       }
       promedio=suma/size;
       System.out.println("Promedio de baterias: " + promedio);
       System.out.println("Baterias con menos de 30%:"+contadorMinima);
       System.out.println("Baterias con 60% o mas:"+contadorNormal);
    }
}