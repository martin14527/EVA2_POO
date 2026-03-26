abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String apellido;

    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Apellido: " + apellido);
    }

    public abstract int calcularAntiguedad();
}