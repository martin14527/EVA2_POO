package eva2_9_persona;

public class Eva2_9_persona {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Memo", 19, "Vallejo","123", "Gerente", 100000, 2007);
        empleado.imprimirDatos();
        System.out.println("\nAntigüedad: " + empleado.calcularAntiguedad());
    }
}