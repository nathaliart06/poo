public class Boton {
    // Cambiamos luzBoton por activo
    private boolean activo; 

    public Boton() {
        // Al crearse, el botón no ha sido presionado (está inactivo)
        this.activo = false;
    }

    public void encenderBoton() { // Puedes mantener el nombre o llamarlo presionarBoton()
        if (activo == false) { 
            activo = true; 
            System.out.println("Botón presionado. Registrando llamada...");
        } else {
            System.out.println("El botón ya se encuentra activo.");
        }
    }

    public void apagarBoton() { // Puedes mantener el nombre o llamarlo liberarBoton()
        if (activo == false) { 
            System.out.println("El botón ya está inactivo.");
        } else {
            activo = false; 
            System.out.println("Llamada atendida. Botón liberado.");
        }
    }

    public String subir() {
        encenderBoton();
        return "El sistema ha registrado una orden para SUBIR.";
    }

    public String bajar() {
        encenderBoton();
        return "El sistema ha registrado una orden para BAJAR.";
    }

    // El getter ahora sigue el estándar total de Java para booleanos
    public boolean isActivo() {
        return this.activo;
    }
}