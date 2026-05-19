public class Piso {
    // atributos

    private int numPiso;

    // Aqui se usa la composicion por que el piso tiene BotonPiso y PuertaPiso
    private BotonPiso botonSube;
    private BotonPiso botonBaja;
    private PuertaPiso puerta;

    // Creo el piso dandole el numero del piso
    public Piso(int numPiso) {

        this.numPiso = numPiso;

        // creo los objetos del piso: botonsube, botonbaja, puerta y ya con los objetos
        // accedo a los metodos

        // (true=subir y false=bajar)
        this.botonSube = new BotonPiso(true);
        this.botonBaja = new BotonPiso(false);
        this.puerta = new PuertaPiso(); // Nace cerrada por defecto
    }

    // Metodos

    public boolean abrirPuertaPiso() {
        // El piso le ordena a SU objeto puerta que se abra
        this.puerta.abrirPuerta();
        return true;
    }

    public boolean cerrarPuertaPiso() {
        // El piso le ordena a SU objeto puerta que se cierre
        this.puerta.cerrarPuerta();
        return true;
    }

    // Getters para que el Sistema de Control pueda revisar los botones y la puerta
    public int getNumPiso() {
        return numPiso;
    }

    public BotonPiso getBotonSube() {
        return botonSube;
    }

    public BotonPiso getBotonBaja() {
        return botonBaja;
    }

    public PuertaPiso getPuerta() {
        return puerta;
    }

}
 