public class PERSONA {
    private String nombre;
    private String paterno;
    private String materno;
    private String rfc;
    private int edad;
    private char genero;

    public PERSONA(String nombre, String paterno, String materno, String rfc, int edad, char genero) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.rfc = rfc;
        this.edad = edad;
        this.genero = genero;
    }

    public PERSONA(){}

    public String regresargenero() {
        switch (genero) {
            case 'M': return "Hombre";
            case 'F': return "Mujer";
            case 'O': return "Otro";
            default: return "No especificado";
        }
    }

    public void imprimir() {
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido paterno es " + paterno);
        System.out.println("Tu apellido materno es " + materno);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu RFC es " + rfc);
        System.out.println("Tu genero es " + regresargenero());
    }
}