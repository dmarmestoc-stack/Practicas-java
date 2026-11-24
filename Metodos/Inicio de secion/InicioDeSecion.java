
public class InicioDeSecion {
    public static void main(String[] args) {
    Usuario usuario1 = new Usuario("estudiante","java2026"); 
       Verificador verificador = new Verificador();
       verificador.autorizarAcceso(usuario1);
    }
}
