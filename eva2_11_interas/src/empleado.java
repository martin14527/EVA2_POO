class empleado extends persona implements Mensaje {

    private String puesto;
    private double salario;

    public empleado() {
        super();
        this.puesto = "";
        this.salario = 0;
    }

    public empleado(String puesto, double salario, String nombre, String apellido) {
        super(nombre, apellido);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Nombre: " + getnombre());
        System.out.println("Apellido: " + getapellido());
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }
}
