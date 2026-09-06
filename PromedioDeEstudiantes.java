public class PromedioDeEstudiantes{
    public static void main(String[] args){
        final int EDAD_BASE=15;
        int edad[]=new int[15];
        int sumaDeEdades=0;
        double promedio=0;
        edad[0]=12;
        edad[1]=13;
        edad[2]=14;
        edad[3]=15;
        edad[4]=16;
        edad[5]=17;
        edad[6]=16;
        edad[7]=19;
        edad[8]=15;
        edad[9]=14;
        edad[10]=12;
        edad[11]=14;
        edad[12]=16;
        edad[13]=13;
        edad[14]=15;
        for(int i=0;i<15;i++){
            sumaDeEdades=sumaDeEdades+edad[i];

        }
        promedio=sumaDeEdades/15;
        System.out.println("El promedio de edades es: "+promedio);
        if(promedio>=EDAD_BASE){
            System.out.println("El promedio de edades de la clase es mayor o igual a 15");
        }else{
            System.out.println("El promedio de edades de la clase es menor a 15");
        }


    }
}