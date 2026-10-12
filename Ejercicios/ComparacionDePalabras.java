public class ComparacionDePalabras{
    public static void main(String[] args){
        String palabra1="Pepe";
        String palabra2="pepe";
        String palabra3="pepe";
        if(palabra1.equalsIgnoreCase(palabra2) && palabra2.equalsIgnoreCase(palabra3) && palabra1.equalsIgnoreCase(palabra3)){
            System.out.println("Las tres palabras son iguales");

        }else{
            System.out.println("Las palabras son diferentes");
        }
    } 
}