package eva2_17_polimorfismo;

public class Eva2_17_polimorfismo {

    public static void main(String[] args) {

        persona p1 = new empleado("Juan", 25, "Lopez", "Gerente", 15000);
        persona p2 = new cliente("ABC123", 5000, "Maria", 30, "Gomez");

        System.out.println(p1.generardatos());
        System.out.println(p2.generardatos());

        empleado e1 = new empleado("Pedro", 19, "Perez", "Gerente", 10000);
        System.out.println(e1.generardatos());

        System.out.println("\nUsar instanceof:");

        imprimirTipo(p1);
        imprimirTipo(p2);
        imprimirTipo(e1);
    }


    public static void imprimirTipo(persona p) {

        if (p instanceof cliente) {
            System.out.println("Es cliente");
        } else if (p instanceof empleado) {
            System.out.println("Es empleado");
        } else {
            System.out.println("Es persona");
        }
    }
}


class persona {

    private String nombre;
    private int edad;
    private String apellido;

    public persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String generardatos() {
        return "Nombre: " + nombre +
               ", Apellido: " + apellido +
               ", Edad: " + edad;
    }
}


class empleado extends persona {

    private String puesto;
    private double salario;

    public empleado(String nombre, int edad, String apellido,
                    String puesto, double salario) {
        super(nombre, edad, apellido);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String generardatos() {
        return super.generardatos() +
               ", Puesto: " + puesto +
               ", Salario: " + salario;
    }
}

class cliente extends persona {

    private String rfc;
    private double credito;

    public cliente(String rfc, double credito,
                   String nombre, int edad, String apellido) {
        super(nombre, edad, apellido);
        this.rfc = rfc;
        this.credito = credito;
    }

    @Override
    public String generardatos() {
        return super.generardatos() +
               ", RFC: " + rfc +
               ", Crédito: " + credito;
    }
}