public class Dron {
    private int bateria;
    private double velocidadViento;
    private double peso;

    public Dron(int bateria, double velocidadViento, double peso) {
        this.setBateria(bateria);
        this.setVelocidadViento(velocidadViento);
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(double velocidadViento) {
        this.velocidadViento = velocidadViento;
    }
    
    
    
}
