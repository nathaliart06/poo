public class SistemaControl {
    private Ascensor ascensor;
    private Piso[] pisos;

    public SistemaControl(int totalPisos) {
        this.ascensor = new Ascensor(totalPisos);
        this.pisos = new Piso[totalPisos];
        
        for (int i = 0; i < totalPisos; i++) {
            this.pisos[i] = new Piso(i + 1); 
        }
    }

    public void llamarAscensorDesdePiso(int numeroPiso, boolean quiereSubir) {
        System.out.println("[SISTEMA] Alguien pide el ascensor en el Piso " + numeroPiso);
        
        int indicePiso = numeroPiso - 1;
        
        if (quiereSubir) {
            this.pisos[indicePiso].getBotonSube().encenderBoton();
        } else {
            this.pisos[indicePiso].getBotonBaja().encenderBoton();
        }

        this.ascensor.moverAscensor(numeroPiso);

        System.out.println("[SISTEMA] Abriendo puertas de seguridad...");
        this.ascensor.getPuertaCabina().abrirPuerta();
        this.pisos[indicePiso].abrirPuertaPiso();

        if (quiereSubir) {
            this.pisos[indicePiso].getBotonSube().apagarBoton();
        } else {
            this.pisos[indicePiso].getBotonBaja().apagarBoton();
        }

        System.out.println("[SISTEMA] Pasajeros a bordo. Cerrando puertas...");
        this.ascensor.getPuertaCabina().cerrarPuerta();
        this.pisos[indicePiso].cerrarPuertaPiso();
    }

    public void seleccionarPisoInterno(int pisoDestino) {
        System.out.println("\n[SISTEMA] Botón " + pisoDestino + " presionado dentro del ascensor.");
        
        int indiceBoton = pisoDestino - 1;

        this.ascensor.getBotonesInternos()[indiceBoton].encenderBoton();

        this.ascensor.moverAscensor(pisoDestino);

        System.out.println("[SISTEMA] Destino alcanzado. Abriendo puertas...");
        this.ascensor.getPuertaCabina().abrirPuerta();
        this.pisos[pisoDestino - 1].abrirPuertaPiso();

        this.ascensor.getBotonesInternos()[indiceBoton].apagarBoton();

        System.out.println("[SISTEMA] Pasajeros bajaron. Cerrando puertas...");
        this.ascensor.getPuertaCabina().cerrarPuerta();
        this.pisos[pisoDestino - 1].cerrarPuertaPiso();
    }
}