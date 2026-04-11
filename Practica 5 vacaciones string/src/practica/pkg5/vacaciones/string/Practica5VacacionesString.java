
package practica.pkg5.vacaciones.string;

public class Practica5VacacionesString {

    public static void main(String[] args) {
        nombres N = new nombres("memo");
        N.imprimir();
    }
}

class nombres {

    String nombre; 

    public nombres(String nombre) {
        this.nombre = nombre; 
    }

    public void imprimir() {
        System.out.println(nombre); 
    }
}







