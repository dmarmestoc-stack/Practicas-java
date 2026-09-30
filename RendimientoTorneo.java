public class RendimientoTorneo {

    public static void main(String[] args) {
         int[] puntuaciones = {850, 1200, 430, 1560, 920, 300};
         int suma=0;
        int contadorMayor=0;
        int contadorMenor=0;
        int contadorMedio=0;
        int mayor=0;

        for (int puntuacion : puntuaciones) {
            System.out.println("Puntuación: " + puntuacion);
            suma=suma+puntuacion;
            if(puntuacion>=1000){
                contadorMayor++;
            }else if(puntuacion<500){
                contadorMenor++;
            }else{
                contadorMedio++;
            }

            
        }
        System.out.println("Total de puntajes:"+suma);
        System.out.println("Cantidad de puntajes mayores o iguales a 1000:"+contadorMayor);
        System.out.println("Cantidad de puntajes menores a 500:"+contadorMenor);
        for(int puntuacion: puntuaciones){
            if(puntuacion>mayor){
                mayor=puntuacion;
            }
        }
        System.out.println("La puntuacion mas alta es:"+mayor);
       
           if (contadorMedio+contadorMayor>=4){
            System.out.println("La puntuacion fue constante");
           }
           
        

        
    }
}