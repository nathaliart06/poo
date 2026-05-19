public class Boton {
    private boolean activo; 

    public Boton() {
        this.activo = false;
    }

    public void encenderBoton() { 
        if (activo == false) { 
            activo = true; 
            System.out.println("Botón presionado. Registrando llamada...");
        } else {
            System.out.println("El botón ya se encuentra activo.");
        }
    }

    public void apagarBoton() { 
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

    public boolean isActivo() {
        return this.activo;
    }
}