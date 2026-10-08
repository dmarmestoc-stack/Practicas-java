public class RobotEntregas {

    public static void main(String[] args) {
       double pesos[] = {2.5, 7.8, 4.2, 12.5, 6.0, 15.3, 3.1};
  int cantidadLiviano=0;
  int cantidadMediano=0;
  int cantidadPesado=0;
  int pesoTotal=0;
  double promedio=0;
  for(int i=0; i<pesos.length;i++){
      System.out.println("Peso por paquete:"+pesos[i]);
      if(pesos[i]<=5){
          System.out.println("El paquete es liviano");
          cantidadLiviano++;
      }else if(pesos[i]>5 && pesos[i]<=10){
      System.out.println("El paquete es mediano");
      cantidadMediano++;
      }else{
              System.out.println("El paquete es pesado");
              cantidadPesado++;
              }
      pesoTotal+=pesos[i];
              
        }
        System.out.println("Cantidad de paquetes livianos:"+ cantidadLiviano);
        System.out.println("Cantidad de paquetes medianos:"+ cantidadMediano);
        System.out.println("Cantidad de paquetes pesados:"+ cantidadPesado);
        promedio=pesoTotal/pesos.length;
        System.out.println("Promedio = " + promedio);
