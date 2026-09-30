public class ConsumoEnergetico {

    public static void main(String[] args) {
        final double CONSUMO_MAYOR=17;
        final double CONSUMO_MENOR=12;
        final double TOPE_CONSUMO_SEMANAL=100;
        double[] consumos = {12.5, 15.8, 9.7, 18.4, 21.2, 11.6, 16.3};
        double consumoTotal=0;
        int contadorMasDias=0;
        int contadorMenosDias=0;
        double promedio=0;
        int size=consumos.length;

                 for (double consumo : consumos) {
            System.out.println("Consumo diario:"+consumo);
            consumoTotal=consumoTotal+consumo;
            if(consumo>CONSUMO_MAYOR){
                contadorMasDias++;

            }else if(consumo<=CONSUMO_MENOR){
                contadorMenosDias++;
            }else{

            }


         }
         System.out.println("Consumo total de la semana:"+consumoTotal);
         promedio=consumoTotal/size;
         System.out.println("Promedio de consumo de la semana:"+promedio);
         if(consumoTotal>TOPE_CONSUMO_SEMANAL){
            System.out.println("Hay un consumo elevado");

         }
        
    }
}