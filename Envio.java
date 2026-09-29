public class Envio {
    public static void main(String[] args){
        double TOPE_SUMA_PRECIOS=100000;
        double COSTO_ENVIO=5000;
        Scanner ingresar= new Scanner(System.in);
        System.out.println("Ingrese el precio de 3 productos comprados");
        int primerProducto= ingresar.nextInt();
        int segundoProducto= ingresar.nextInt();    
        int tercerProducto= ingresar.nextInt();
        int sumaPrecios=0;
        double total=0;
        sumaPrecios=primerProducto+segundoProducto+tercerProducto;
        if (sumaPrecios>=TOPE_SUMA_PRECIOS){
           System.out.println("El envio es gratis");
            System.out.println("El total a pagar es: "+ sumaPrecios);
    }else{
        System.out.println("Debe pagar el envio");
        total=sumaPrecios+COSTO_ENVIO;
        System.out.println("El total a pagar con el envio es: "+ total);
    }
    }
}