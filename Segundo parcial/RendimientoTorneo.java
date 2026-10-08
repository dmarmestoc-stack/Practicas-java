public class RendimientoTorneo {

    public static void main(String[] args) {
             int[] puntuaciones = {850, 1200, 430, 1560, 920, 300};
         int suma=0;
        int contadorMayor=0;
        int contadorMenor=0;
        int contadorMedio=0;
        int mayor=0;

        for (int i=0; i<puntuaciones.length; i++){ 
            System.out.println("Puntuacion: " + puntuaciones[i]);
           
            if(puntuaciones[i]>=1000){
                contadorMayor++;
            }else if(puntuaciones[i]<500){
                contadorMenor++;
            }else{
                contadorMedio++;
            }
             if(puntuaciones[i]>mayor){
                mayor=puntuaciones[i];
            }

             suma+=puntuaciones[i];
        }
        
        System.out.println("Total de puntajes:"+suma);
        System.out.println("Cantidad de puntajes mayores o iguales a 1000:"+contadorMayor);
        System.out.println("La puntuacion mas alta es:"+mayor);
       
           if (contadorMedio+contadorMayor>=4){
            System.out.println("La puntuacion fue constante");
           }
           
        

        
    }
}
}