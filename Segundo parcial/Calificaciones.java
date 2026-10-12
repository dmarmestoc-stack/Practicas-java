public class Calificaciones {

    public static void main(String[] args) {
        int calificaciones[] = {48, 72, 89, 55, 96, 63, 38};
        double promedio=0;
        int calificacionModificada=0;
        int sumaCalificaciones=0;
        int size=calificaciones.length;
        for(int i=0;i<size;i++){
             System.out.println("Calificaciones originales:"+calificaciones[i]);
            if(calificaciones[i]<60){
                calificaciones[i]+=10;
                calificacionModificada++;  
            }
            sumaCalificaciones+=calificaciones[i];
           
        }
        System.out.println("Cantidad de calificaciones modificadas:"+calificacionModificada);
        promedio=sumaCalificaciones/size;
        System.out.println("Nuevo promedio:"+promedio);
       for(int i=0;i<size;i++){
          System.out.println("Calificaciones modificadas:"+calificaciones[i]);  
       }
       
    }
}