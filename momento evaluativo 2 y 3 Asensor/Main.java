public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE ASCENSOR INICIADO ===");

        // Creamos un sistema de control para un edificio de 5 pisos
        SistemaControl edificio = new SistemaControl(5);

        // ESCENARIO: 
        // 1. Un usuario está en el piso 3 y quiere SUBIR. Llama al ascensor.
        edificio.llamarAscensorDesdePiso(4, true);

        // 2. El usuario ya se subió al ascensor y ahora quiere ir al piso 5.
        edificio.seleccionarPisoInterno(3);
        
        // 3. Alguien en el piso 1 (Planta baja) llama al ascensor para subir.
        edificio.llamarAscensorDesdePiso(2, true);
    }
}