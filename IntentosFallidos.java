public class IntentosFallidos {
    public static void main(String[] args) {
       int intentosFallidos[] = {1, 4, 2, 5, 0, 3, 1};
        int i = 0;
        int cuentasBloqueadas = 0;
        int mayor = 0;
        int sumaIntentos = 0;
        double promedio = 0;
        while (i < intentosFallidos.length) {
            System.out.println("Cantidad de intentos fallidos:" + intentosFallidos[i]);
            if (intentosFallidos[i] >= 3) {
                cuentasBloqueadas = cuentasBloqueadas + 1;
            }
            if (intentosFallidos[i] > mayor) {
                mayor = intentosFallidos[i];
            }
            sumaIntentos = sumaIntentos + intentosFallidos[i];
            i++;
        }
        promedio = sumaIntentos / intentosFallidos.length;
        System.out.println("Se deben bloquear " + cuentasBloqueadas + " cuentas");
        System.out.println("El mayor numero de intentos fue:" + mayor);
        System.out.println("El promedio de intentos fallidos fue:" + promedio);
        System.out.println("El total de intentos fallidos fue:" + sumaIntentos);

    }

}
    