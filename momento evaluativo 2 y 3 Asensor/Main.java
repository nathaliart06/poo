public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE ASCENSOR INICIADO ===");

        SistemaControl edificio = new SistemaControl(5);

        edificio.llamarAscensorDesdePiso(3, true);

        edificio.seleccionarPisoInterno(5);
        
        edificio.llamarAscensorDesdePiso(1, true);
    }
}