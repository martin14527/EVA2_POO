
package eva2_11_interas;

public class Eva2_11_interas {

    public static void main(String[] args) {

        empleado emp = new empleado("Gerente", 1000000, "Martin", "Vallejo");
        emp.mostrarMensaje();
    }
}
interface Mensaje {
    void mostrarMensaje();
}