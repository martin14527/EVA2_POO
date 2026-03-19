
package eva2_4constructores;


public class EVA2_4CONSTRUCTORES {
persona p = new persona();
empleado emple = new empleado("hola");
    
    public static void main(String[] args) {
        
    }
    
}
class persona{
 public persona(){
  System.out.println("clase persona");
 
 
 }
}
class empleado extends persona{
 public empleado(){
 
 super();  //acceso publico (unifica las clases)
 }
public empleado (int salario){
    super();
 System.out.println("clase persona" + "salario" + salario);

}

public empleado (String mensaje){
super(mensaje);

}
}