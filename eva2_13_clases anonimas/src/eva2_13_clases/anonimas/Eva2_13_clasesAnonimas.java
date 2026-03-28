package eva2_13_clases.anonimas;

public class Eva2_13_clasesAnonimas {

    public static void main(String[] args) {

        prueba p = new prueba() {
            @Override
            public void mostrarmensaje() {
                System.out.println("Hola");
            }
        };

        p.mostrarmensaje();
    }
}

// Interfaz
interface prueba {
    public void mostrarmensaje();
}