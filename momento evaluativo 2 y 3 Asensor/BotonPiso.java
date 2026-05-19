public class BotonPiso extends Boton {
    // Atributo propio: true para subir, false para bajar
    private boolean subir; 

    // Constructor: Recibe la dirección en forma de booleano
    public BotonPiso(boolean subir) { 

        super(); // Llama al padre Boton para que la luz arranque apagada (false)
        this.subir = subir;
    }

    // El Getter para saber la dirección de este botón
    // Recuerda que por estándar, los booleanos empiezan por "is"
    public boolean isSubir() {
        return this.subir;
    }
}
 