public class DronEnvio {
    public static void main(String[] args) {
        Dron dron1= new Dron(60, 25, 18);
        Validacion validacion= new Validacion();
        validacion.validarEnvio(dron1);
        
    }
}
