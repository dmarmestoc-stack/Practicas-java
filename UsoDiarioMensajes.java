public class UsoDiarioMensajes {

    public static void main(String[] args) {
        final int LIMITE_MENSAJES = 20;
        int USUARIOS_LIMITE=3;
        int[] mensajesEnviados = {8, 25, 12, 30, 5, 18, 22};
        int contadorLimite=0;
        int contadorRegulado=0;
        int sumaLimite=0;
        

        for (int mensajes : mensajesEnviados) {
            System.out.println("Consumo de mensajes por usario:"+mensajes);
            if(mensajes>LIMITE_MENSAJES){
                contadorLimite++;
                sumaLimite=sumaLimite+mensajes;

            }else{
                contadorRegulado++;
            }
       }
       System.out.println("Usuarios que superaron el limte de mensajes:"+contadorLimite);
       System.out.println("Usuarios que no superaron el limite de mensajes:"+contadorRegulado);
       System.out.println("Mensajes enviados por encima del limite:"+sumaLimite);
       if(contadorLimite>=USUARIOS_LIMITE){
        System.out.println("Capacidad sobrecargada");

       }



        }

  }
