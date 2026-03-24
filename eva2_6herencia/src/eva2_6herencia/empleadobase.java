package eva2_6herencia;

public class empleadoBase extends empleado {

    private int fechaInicio;

    public EmpleadoBase(String nombre, String apellido, String empleadonum, double salario, int fechaInicio) {
        super(nombre, apellido, empleadonum, salario);
        this.fechaInicio = fechaInicio;
    }

    public int antiguedad(){
        return 2026 - fechaInicio;
    }

    public double bonoAntiguedad(){
        return getSalario() * (antiguedad() * 0.10);
    }

    // GETTERS Y SETTERS
    public int getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(int fechaInicio) { this.fechaInicio = fechaInicio; }
}
public class empleadohoras extends Empleado {

    private int horas;
    private double pagoPorHora;

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public empleadoHoras(String nombre, String apellido, String empleadonum, double salarioBase, int horas, double pagoPorHora) {
        super(nombre, apellido, empleadonum, salarioBase);
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
    }
    public double calcularSalario(){
        return horas * pagoPorHora;
    }

    // GETTERS Y SETTERS
   
    public void setPagoPorHora(double pagoPorHora) { this.pagoPorHora = pagoPorHora; }
}