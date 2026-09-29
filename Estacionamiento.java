public class Estacionamiento {
    public static void main(Strin[] args){
        final int HORA_MAXIMA=5;
        int VALOR_HORA=3000;
        int VALOR_HORA_RETARDO=7000;
        int total=0;
        Scanner ingresar= new Scanner(System.in);
        System.out.println("Ingrese cuantas horas permanecio en el estacionamiento:");
        int horas= ingresar.nextInt();
        if (horas>HORA_MAXIMA){
            total=horas*VALOR_HORA_RETARDO;
            System.out.println("El total a pagar es: "+ total);
        }else{
            total=horas*VALOR_HORA;
            System.out.println("El total a pagar es: "+ total);
        }

    }
    
}
