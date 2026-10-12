public class CalidadDeAire {

    public static void main(String[] args) {
        int calidadAire[] = {42, 85, 120, 65, 150, 38, 95};
        int contadorSuperior=0;
        int suma=0;
        int i=0;
        int mayor= calidadAire[0];
        int menor= calidadAire[0];
        double promedio=0;
       
       for(int calidad:calidadAire){
           System.out.println("Calidad del aire:"+calidad);
  
           if(calidad>100){
                contadorSuperior++;
           }
           suma+=calidad;
           if(calidadAire[i]>mayor){
               mayor=calidadAire[i];
           }
           if(calidadAire[i]<menor){
               menor=calidadAire[i];
           }
           i++;
       }
        System.out.println("Mediciones superiores a 100:"+ contadorSuperior);
       promedio= suma/calidadAire.length;
        System.out.println("Promedio:" + promedio);
        System.out.println("Valor mayor:"+mayor);
        System.out.println("Valor menor:"+menor);
       if(contadorSuperior>=2){
           System.out.println("Alerta ambiental");
       }
     }
    }         