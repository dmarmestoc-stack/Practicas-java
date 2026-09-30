public class RobotEntregas {

    public static void main(String[] args) {
        final double PESO_BASICO=5;
        final double PESO_MAYOR=10;
        final double TOPE_LIMITE=50;
           double[] pesos = {2.5, 7.8, 4.2, 12.5, 6.0, 15.3, 3.1};
           double pesoTotal=0;
           int contadorLiviano=0;
           int contadorMediano=0;
           int contadorPesado=0;
           int size= pesos.length;
           double promedio=0;
           double contadorTransportable=0;

        for (double peso : pesos) {
            System.out.println("Peso de paquete: "+peso);
            if(peso<=PESO_BASICO){
                System.out.println("Liviano");
                contadorLiviano++;


            }else if(peso>PESO_BASICO && peso<=PESO_MAYOR){
                System.out.println("Mediano");
                contadorMediano++;

            }else{
                System.out.println("Pesado");
                contadorPesado++;
            }
     pesoTotal=pesoTotal+peso;   
    }
    System.out.println("Paquetes livianos:"+contadorLiviano);
     System.out.println("Paquetes medianos:"+contadorMediano);
      System.out.println("Paquetes pesados:"+contadorPesado);
    System.out.println("Total de pesos:"+pesoTotal);
    promedio=pesoTotal/size;
    System.out.println("Promedio de pesos:"+promedio);
     for (double peso : pesos) {
        if(peso<=PESO_MAYOR){
            contadorTransportable++;

        }

     }
     if(contadorTransportable>TOPE_LIMITE){
        System.out.println("El total de transportablessupera el limite");
     }
}
}