
public class EMPLEADO extends PERSONA {
    
    private String numero;
    private String rol;
    private double salario;

    public EMPLEADO(String numero, String rol, double salario, String nombre, String paterno, String materno, String rfc, int edad, char genero) {
        super(nombre, paterno, materno, rfc, edad, genero);
        this.numero = numero;
        this.rol = rol;
        this.salario = salario;
    }

    public EMPLEADO(){
        super();
    }

    public void imprimirdatosempleados(){
        imprimir();
        System.out.println("Numero de empleado: " + numero);
        System.out.println("Rol: " + rol);
        System.out.println("Salario: " + salario);
        
        
       
               
    }
    public void imprimirdatos(){
    super.imprimir();
    System.out.println("Numero de empleado: " + numero);
        System.out.println("Rol: " + rol);
        System.out.println("Salario: " + salario);
        
    
    
    public String toString(){
    String resu="datos";
    "nombre": + generarnombre() + "edad": getedad() + "RFC":getrfc
            "puesto": + rol;
            "salario" + salario;
            return resu;
    }
    
}
}
