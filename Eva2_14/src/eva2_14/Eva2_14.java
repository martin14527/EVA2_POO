package eva2_14;

// pendiente esta práctica hazla en tu casa

public class Eva2_14 {

    public static void main(String[] args) {
        // modificador final, detener herencia
        persona p1 = new persona("LOYA");
        empleado e1 = new empleado("Vallejo");

        System.out.println("Persona: " + p1.getNombre());
        System.out.println("Empleado: " + e1.getNombre());
    }
}

class persona {
    private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

final class empleado extends persona {
    private String puesto;

    public empleado(String nombre) {
        super(nombre);
    }

    public empleado() {
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

// class ceo extends empleado
// final corta la cadena de herencia, empleado ya no puede tener más hijos
