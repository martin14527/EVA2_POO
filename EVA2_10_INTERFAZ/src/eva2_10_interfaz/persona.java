package eva2_10_interfaz;

public class persona implements Mensaje {

    private String nombre;
    private String apellido;
    private int edad;

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("hola, soy " + nombre + " " + apellido +
                " y tengo " + edad + " años.");
    }
}
