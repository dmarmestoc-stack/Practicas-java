

public class Comprador {
    private int edad;
    private boolean permiso;
    private double montoPago;

    public Comprador(int edad, boolean permiso, double montoPago) {
        this.edad = edad;
        this.permiso = permiso;
        this.montoPago = montoPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPermiso() {
        return permiso;
    }

    public void setPermiso(boolean permiso) {
        this.permiso = permiso;
    }
}
