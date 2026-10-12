public class PreciosProductos {

    public static void main(String[] args) {
      double precios[] = {45000, 120000, 78000, 150000, 99000};
      int i=0;
      int preciosModificados=0;
     double valorTotal=0;
      while(i<precios.length){
          System.out.println("Precio de cada producto:"+precios[i]);
          if(precios[i]>100000){
              precios[i]=precios[i]*1.1;
              preciosModificados++;
          }
          valorTotal+=precios[i];
          i++;}
          i=0;
          while(i<precios.length){
            System.out.println("Precio modificado:"+precios[i]);
            i++;
          }
      
        System.out.println("Cantidad de precios modificados:"+preciosModificados);
        System.out.println("Valor total:"+valorTotal);
     }
}
