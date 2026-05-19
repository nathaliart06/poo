public class SistemaControl {
    private Ascensor ascensor;
    private Piso[] pisos;

    // Constructor: Crea el edificio con sus pisos y su ascensor
    public SistemaControl(int totalPisos) {
        this.ascensor = new Ascensor(totalPisos);
        this.pisos = new Piso[totalPisos];
        
        for (int i = 0; i < totalPisos; i++) {
            this.pisos[i] = new Piso(i + 1); 
        }
    }

    // Método para cuando alguien llama al ascensor desde un pasillo
    public void llamarAscensorDesdePiso(int numeroPiso, boolean quiereSubir) {
        System.out.println("\n[SISTEMA] Alguien pide el ascensor en el Piso " + numeroPiso);
        
        int indicePiso = numeroPiso - 1;
        
        // 1. Activar el botón del pasillo (Registrar la llamada)
        if (quiereSubir) {
            this.pisos[indicePiso].getBotonSube().encenderBoton();
        } else {
            this.pisos[indicePiso].getBotonBaja().encenderBoton();
        }

        // 2. Mover la cabina al piso de origen
        this.ascensor.moverAscensor(numeroPiso);

        // 3. Abrir ambas puertas (Cabina y Piso) para recibir al pasajero
        System.out.println("[SISTEMA] Abriendo puertas de seguridad...");
        this.ascensor.getPuertaCabina().abrirPuerta();
        this.pisos[indicePiso].abrirPuertaPiso();

        // 4. Desactivar el botón del pasillo (La llamada ya fue atendida)
        if (quiereSubir) {
            this.pisos[indicePiso].getBotonSube().apagarBoton();
        } else {
            this.pisos[indicePiso].getBotonBaja().apagarBoton();
        }

        // 5. Entran pasajeros y se cierran ambas puertas de forma segura
        System.out.println("[SISTEMA] Pasajeros a bordo. Cerrando puertas...");
        this.ascensor.getPuertaCabina().cerrarPuerta();
        this.pisos[indicePiso].cerrarPuertaPiso();
    }

    // Método para cuando el pasajero ya está ADENTRO y marca el piso destino
    public void seleccionarPisoInterno(int pisoDestino) {
        System.out.println("\n[SISTEMA] Botón " + pisoDestino + " presionado dentro del ascensor.");
        
        int indiceBoton = pisoDestino - 1;

        // 1. Activar el botón interno de la cabina (Registrar destino)
        this.ascensor.getBotonesInternos()[indiceBoton].encenderBoton();

        // 2. Mover el ascensor al destino solicitado
        this.ascensor.moverAscensor(pisoDestino);

        // 3. Abrir puertas al llegar para que bajen los pasajeros
        System.out.println("[SISTEMA] Destino alcanzado. Abriendo puertas...");
        this.ascensor.getPuertaCabina().abrirPuerta();
        this.pisos[pisoDestino - 1].abrirPuertaPiso();

        // 4. Desactivar el botón interno (Destino completado)
        this.ascensor.getBotonesInternos()[indiceBoton].apagarBoton();

        // 5. Cerrar puertas, quedando el sistema listo para el próximo viaje
        System.out.println("[SISTEMA] Pasajeros bajaron. Cerrando puertas...");
        this.ascensor.getPuertaCabina().cerrarPuerta();
        this.pisos[pisoDestino - 1].cerrarPuertaPiso();
    }
}