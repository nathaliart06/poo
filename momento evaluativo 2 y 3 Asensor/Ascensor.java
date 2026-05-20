public class Ascensor {
    // Atributos
    private int pisoActual;
    private boolean enMovimiento; 

    private PuertaAscensor puertaCabina;
    private BotonAscensor[] botonesInternos; 
    
    // Constructor donde solo pido el total de los pisos

    public Ascensor(int totalPisos) {

     
        this.pisoActual = 1;
        this.enMovimiento = false;
        this.puertaCabina = new PuertaAscensor();

        this.botonesInternos = new BotonAscensor[totalPisos];

        for (int i = 0; i < totalPisos; i++) {
            
            this.botonesInternos[i] = new BotonAscensor(i + 1);
        }
    }

    // Métodos (Para simular el movimiento)
    public void moverAscensor(int pisoDestino) {
        if (pisoDestino == this.pisoActual) {

            System.out.println("Ya te encuentras en el piso " + pisoDestino);

            // uso return para que si entra en este if detenga el codigo
            return;
        }

        this.enMovimiento = true;
        System.out.println("----ASCENSOR EN MOVIMIENTO----");
        System.out.println("Saliendo del piso: " + this.pisoActual);

        // aqui actualizo el piso actual con el piso destino que llega al metodo
        this.pisoActual = pisoDestino;

        this.enMovimiento = false;
        System.out.println("Ascensor llegó al piso: " + this.pisoActual);
        System.out.println("==============================");
    }

    // Getters necesarios para el Sistema de Control
    public int getPisoActual() {
        return pisoActual;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    public PuertaAscensor getPuertaCabina() {
        return puertaCabina;
    }

    public BotonAscensor[] getBotonesInternos() {
        return botonesInternos;
    }

}
 