

public class MetodosReturn {
    public static void main(String[] args) {
        int numero1=9;
        int numero2=5;
        int totalSuma=MetodosReturn.sumar(numero1, numero2);
        int totalResta=MetodosReturn.restar(numero1, numero2);
        int total=MetodosReturn.totalFinal(totalSuma, totalResta);
        System.out.println("El total es: "+total);
    }
    public static int sumar(int numero1, int numero2){
        int total= numero1+numero2;
        return total;
    }
      public static int restar(int numero1, int numero2){
        int total= numero1-numero2;
        return total;
    }
      public static int totalFinal(int totalSuma, int totalResta){
        int total= totalSuma+totalResta;
        return total;
    }
}
