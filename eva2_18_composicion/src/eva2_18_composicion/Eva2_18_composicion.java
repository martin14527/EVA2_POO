package eva2_18_composicion;

public class Eva2_18_composicion {

    public static void main(String[] args) {

        direccion dir = new direccion("Nombre de Dios", 123, "Chihuahua", "Centro");

        persona persona = new persona("MG", "VL", 13, dir);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Calle: " + persona.getDireccion().getCalle());
        System.out.println("Numero: " + persona.getDireccion().getNumero());
        System.out.println("Ciudad: " + persona.getDireccion().getCiudad());
        System.out.println("Colonia: " + persona.getDireccion().getColonia());
    }
}

// Clase Direccion
class direccion {

    private int numero;
    private String calle;
    private String ciudad;
    private String colonia;

    public direccion(String calle, int numero, String ciudad, String colonia) {
        this.numero = numero;
        this.calle = calle;
        this.ciudad = ciudad;
        this.colonia = colonia;
    }

    public int getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
}

// Clase Persona (usa composición)
class persona {

    private String nombre;
    private String apellido;
    private int edad;
    private direccion direccion;

    public persona(String nombre, String apellido, int edad, direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
}