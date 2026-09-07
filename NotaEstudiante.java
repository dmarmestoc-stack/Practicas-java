public class NotaEstudiante {
    public static void main(String[] args) {
        final double NOTA_MINIMA= 3.0;
        double notaEstudiante= 3.2;
        if (notaEstudiante >= NOTA_MINIMA) {
            System.out.println("El estudiante aprueba la materia");
        } else {
            System.out.println("El estudiante reprueba la materia");
        }
    }
}