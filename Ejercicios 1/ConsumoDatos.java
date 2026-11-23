public class ConsumoDatos {
    public static void main(String[] args) {
       final int PAQUETE_COMPRADO=18;
    final int CONSUMO_BAJO=5;
    final int CONSUMO_MODERADO=15;
    int paqueteConsumo=18;
    if(paqueteConsumo>PAQUETE_COMPRADO){
        System.out.println("Ha excedido el consumo de su paquete");
    }else if(paqueteConsumo<=CONSUMO_BAJO){
        System.out.println("Consumo bajo");
    }else if(paqueteConsumo>CONSUMO_BAJO && paqueteConsumo<=CONSUMO_MODERADO){
        System.out.println("Consumo moderado");
    }else if(paqueteConsumo>CONSUMO_MODERADO){
        System.out.println("Consumo alto");
    }
    }
}
