public class BotonAscensor extends Boton {
    // atributos

    private int numPiso;

    // constructor

    public BotonAscensor(int numPiso) {
        // uso super oblogatoriamente como constructor de la clase padre
        super();
        this.numPiso = numPiso;
    }

    // metodos get y setters para retornar y modificar en cualquier momento

    public int getNumBoton() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

}
 