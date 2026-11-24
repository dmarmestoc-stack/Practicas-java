public class Verificador {
     public void autorizarAcceso(Usuario usuario){
        if(usuario.getNombreUsuario().equalsIgnoreCase("estudiante") && usuario.getContrasenia().equals("Java2026")){
            System.out.println("Inicio de sesion exitoso");
        }else{
            System.out.println("Fallo en inicio de secion, contrasenia o usuario incorrectos");
        }
    }
}
