
package eva2_2_herencia;

public class EVA2_2_HERENCIA {

    public static void main(String[] args) {
        
        EMPLEADO per = new EMPLEADO();
        
        per.setNombre("Guillermo");
        per.setApellido("Vallejo");
        per.setEdad(19);
        per.setNempleado(1001);
        per.setSalario(190);
        System.out.println(per.getNombre());
        System.out.println(per.getApellido());
        System.out.println(per.getEdad());
         System.out.println(per.getNempleado());
             System.out.println(per.getSalario());
    }
}

class person {

    private String nombre;
    private String apellido;
    private int edad;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}

class EMPLEADO extends person {

    private int nempleado;
    private double salario;

    public void setNempleado(int nempleado) {
        this.nempleado = nempleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNempleado() {
        return nempleado;
    }

    public double getSalario() {
        return salario;
    }

}