package Transaccion;

public class Usuario {
    private double saldo;
    private double montoRetiro;

    public Usuario(double saldo, double montoRetiro) {
        this.setSaldo(saldo);
        this.setMontoRetiro(montoRetiro);
    }

    public double getMontoRetiro() {
        return montoRetiro;
    }

    public void setMontoRetiro(double montoRetiro) {
        this.montoRetiro = montoRetiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
