
package practica9.vacaciones.override;


public class PRACTICA9VACACIONESOVERRIDE {
 
    public static void main(String[] args) {
     gerente GERE = new gerente("memo","25550720");
    GERE.funcionesbasicas();
    }
    
}
 class empleado{
 String nombre;
 
 public empleado(String nombre){
 this.nombre=nombre;

 }
 
 
 public void funcionesbasicas(){
 
 System.out.println("el empleado trabaja haciendo documentacion");
 }
 }
class gerente extends empleado{
String numerodeempleado;
public gerente(String nombre,String numerodeempleado){
    super(nombre);
this.numerodeempleado=numerodeempleado;
}
 @Override
 public void funcionesbasicas(){
 
 System.out.println("el gerente trabaja.... o eso dice");
 
 
 }
}