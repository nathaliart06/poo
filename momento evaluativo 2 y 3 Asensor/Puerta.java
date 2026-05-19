public class Puerta {

    private boolean estadoPuerta;

    public Puerta() {
        // asingo por defecto el estado de la puerta como cerrada (recien se crea)

        this.estadoPuerta = false;
    }

    // Métodos
    public void abrirPuerta() {
        if (estadoPuerta == false) { // Si está cerrada...
            estadoPuerta = true; // La abrimos
            System.out.println("Puerta abriéndose... [Abierta]");
        } else {
            System.out.println("La puerta ya estaba abierta.");
        }
    }

    public void cerrarPuerta() {
        if (estadoPuerta == true) { // Si está abierta...
            estadoPuerta = false; // La cerramos
            System.out.println("Puerta cerrándose... [Cerrada]");
        } else {
            System.out.println("La puerta ya estaba cerrada.");
        }
    }

    // El Getter para que el Ascensor o el Piso revisen si está abierta antes de
    // moverse
    public boolean isEstadoPuerta() {
        return this.estadoPuerta;
    }

}
