
public class EntregaDron {

    final int BATERIA_MINIMA=50;
        final double VELOCIDAD_MINIMA_VIENTO=30;
        final double PESO_MINIMO=10;
        int bateria= 65;
        double velocidadViento = 37;
        double peso= 5;
        if (bateria>=BATERIA_MINIMA && velocidadViento<=VELOCIDAD_MINIMA_VIENTO && peso<PESO_MINIMO){
            System.out.println("La entrega se puede autorizar");
        }else{
            System.out.println("La entrega no se puede realizar");
        }
    
}
