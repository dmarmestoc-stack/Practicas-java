public class ControlDeIntentos {
    public static void main(String[] args) {
      int intentosFallidos[] = {1, 4, 2, 5, 0, 3, 1};
         int i=0;
         int size= intentosFallidos.length;
         int cuentasBloqueadas=0;
         int mayor=0;
         int suma=0;
         double promedio=0;
         while(i<size){
             System.out.println("Intentos de cada usuario:"+intentosFallidos[i]);
             if(intentosFallidos[i]>=3){
                 cuentasBloqueadas++;
                 
             }
             if(intentosFallidos[i]>mayor){
                 mayor=intentosFallidos[i];
                 
             }
             suma+=intentosFallidos[i];
             i++;
         }
         promedio=suma/size;
         System.out.println("Cantidad de cuentas que deben bloquearse:"+cuentasBloqueadas);
         System.out.println("El mayor numero de intentos registrado fue:"+mayor);
         System.out.println("Total de intentos fallidos:"+suma);
         System.out.println("Promedio de intentos fallidos:"+promedio);
    }
}