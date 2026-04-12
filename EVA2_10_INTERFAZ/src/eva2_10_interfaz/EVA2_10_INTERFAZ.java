package eva2_10_interfaz;

public class EVA2_10_INTERFAZ {

    public static void main(String[] args) {

        Persona p = new Persona("guillermo", "vallejo", 18);
        p.mostrarMensaje();
    }
}

interface Mensaje {
    public void mostrarMensaje();
}


class Persona implements Mensaje {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola, soy " + nombre + " " + apellido +
                " y tengo " + edad + " años.");
    }
}
