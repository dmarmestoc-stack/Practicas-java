public class Digitos {
    public static void main(String[] args) {
        final int DIGITO_MENOR=0;
        final int DIGITO_MAXIMO=9;
       int numero = 8;
       if (numero>=DIGITO_MENOR && numero<=DIGITO_MAXIMO){
        System.out.println("El número "+ numero + " es de un dígito");

       }else{
        System.out.println("El número "+ numero + " no es de un único dígito");
       }
    }
}