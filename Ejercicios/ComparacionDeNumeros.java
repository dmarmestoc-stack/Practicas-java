public class ComparacionDeNumeros {
    public static void main(String[] args){
        int numero1=18;
        int numero2=8;
        if (numero1>numero2){
            System.out.println("El numero "+numero1+  " es mayor que el numero "+numero2);
        }else if(numero2>numero1){
            System.out.println("El numero "+numero2+ " es mayor que el numero "+numero1);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
}