class Empleado extends persona {
    private String cEmpleado;
    private String puesto;
    private double salario;
    private int anioIngreso;

    public Empleado(String nombre, int edad, String apellido,
                    String cEmpleado, String puesto,
                    double salario, int anioIngreso) {
        super(nombre, edad, apellido);
        this.cEmpleado = cEmpleado;
        this.puesto = puesto;
        this.salario = salario;
        this.anioIngreso = anioIngreso;
    }

    public int calcularAntiguedad() {
        return 2026 - anioIngreso;
    }

    public void imprimirDatos() {
     
        System.out.println("Clave: " + cEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
    }
}
