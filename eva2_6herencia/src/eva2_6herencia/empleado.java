
package eva2_6herencia;

public class empleado {
    private String nombre;
    private String apellido;
    private String empleadonum;
    private double salario;

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + nombre +
                ", apellido=" + apellido +
                ", numeroEmpleado=" + empleadonum +
                ", salario=" + salario +
                '}';
    }

    public double calcularSalario() {
        return salario;
    }

    public empleado(String nombre, String apellido, String empleadonum, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empleadonum = empleadonum;
        this.salario = salario;
    }

    public void imprimirDatoEmpleado(){
        System.out.println(this.toString());
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmpleadonum() { return empleadonum; }
    public void setEmpleadonum(String empleadonum) { this.empleadonum = empleadonum; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}