package eva2_10_interfaz;

public class persona implements mensaje {

    private String nombre;
    private String apellido;
    private int edad;

   
    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

  
    public void mostrarmensaje() {
        System.out.println("Hola, soy " + nombre + " " + apellido + 
                           " y tengo " + edad + " años.");
    }
}