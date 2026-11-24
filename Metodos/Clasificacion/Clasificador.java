

public class Clasificador {
    public void clasificarPuntaje(Jugador jugador){
        if(jugador.getPuntaje()<500 && jugador.getPuntaje()>=0){
            System.out.println("Principiante");
        }else if(jugador.getPuntaje()<=999 && jugador.getPuntaje()>=500){
            System.out.println("Intermedio");
        }else if(jugador.getPuntaje()>=1000){
            System.out.println("Experto");
        }else{
            System.out.println("Puntaje invalido");
        }
    }

}
