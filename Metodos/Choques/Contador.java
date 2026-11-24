package Choques;

import java.util.Scanner;

public class Contador {
     public void restarChoques(Jugador jugador){
        Scanner scanner = new Scanner(System.in);
        // 3 veces que tiene que preguntar//
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ha chocado?, responda true o false): ");
            boolean haChocado = scanner.nextBoolean();

            if (haChocado == true) {
                int vidasRestantes = jugador.getVidas() - 1;
                jugador.setVidas(vidasRestantes);
                System.out.println("Ha chocado, perdio una vida.");
            } else {
                System.out.println("No choco, no ha perdido sus vidas.");
            }
        }

        System.out.println("Sus vidas restantes son:"+ jugador.getVidas());
  
    }
}
