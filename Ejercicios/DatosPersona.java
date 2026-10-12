public class DatosPersona {
    public static void main(String[] args) {
        final int MAYOR_EDAD=18;
      String datosPersona[]={"Pepito","Cedula","18"};
      int edad=Integer.parseInt(datosPersona[2]);
      if (edad>=MAYOR_EDAD){
        System.out.println("La persona es mayor de edad");

      }


    }
}