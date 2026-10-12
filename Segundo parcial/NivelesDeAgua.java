public class NivelesDeAgua {
    public static void main(String[] args) {
       double nivelesAgua[] = {85.5, 20.0, 46.8, 15.2, 70.5, 32.4};
       int i=0;
       int contarNivelMenor=0;
       int contarNivelMayor=0;
       int sumaNiveles=0;
       double promedio=0;
       while(i<nivelesAgua.length){
           System.out.println("Porcentaje de cada sensor:"+nivelesAgua[i]);
           if(nivelesAgua[i]<25){
               contarNivelMenor++;
           }
           if(nivelesAgua[i]>=70){
               contarNivelMayor++;
           }
           sumaNiveles+= nivelesAgua[i];
             i++;
       }
        System.out.println("Cantidad de tanques con un porcentaje menor al 25:"+contarNivelMenor);
        System.out.println("Cantidad de tanques con un porcentaje mayor o igual al 70:"+contarNivelMayor);
       promedio=sumaNiveles/nivelesAgua.length;
        System.out.println("promedio = " + promedio);
       if(contarNivelMenor>=2){
           System.out.println("Alerta de abastecimiento");
       }
    }
}