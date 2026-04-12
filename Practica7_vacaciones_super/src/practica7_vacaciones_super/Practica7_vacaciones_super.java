package practica7_vacaciones_super;

public class Practica7_vacaciones_super {

    public static void main(String[] args) {
        carros C = new carros("Toyota", "Corolla");
    }
}

class vehiculo {
    String marca;

    public vehiculo(String marca) {
        this.marca = marca;
    }

    public void registrarprecio() {
        System.out.println("el precio tiene un 5% de descuento pagado de forma inmediata");
    }

    public void imprimridatos() {
        System.out.println("carros electricos");
    }
}

class carros extends vehiculo {
    String modelo;

    public carros(String marca, String modelo) {
        super(marca); 
        this.modelo = modelo;
    }

    public void pintura() {
        System.out.println("la pintura es de color rojo");
    }
}