package practica11_vacaciones;

public class Practica11_vacaciones {

    public static void main(String[] args) {
        gerente gt = new gerente("memo",180000,10000,"almacen2342_%");
        gt.imprimirdatos();
    }
    
}

class empleado{
  
  String nombrecompleto;
  double salario;
  
  public empleado(String nombrecompleto,double salario){
    this.nombrecompleto = nombrecompleto;
    this.salario = salario; 
    System.out.println("datos de empleado");
  }
  
  public void imprimirdatos(){
   System.out.println("nombre del empleado " + nombrecompleto + 
   " salario del empleado " + salario);
  }
  
  public void funcionesdeempleado(){
    System.out.println("trabajar");
  }
}

class supervisor extends empleado{
    
    double bono;
    
    public supervisor(String nombrecompleto, double salario,double bono) {
        super(nombrecompleto, salario);
        this.bono = bono; 
    }
    
    @Override
    public void imprimirdatos(){
   System.out.println("nombre del empleado " + nombrecompleto + 
   " salario del empleado " + salario + 
   " su bono navideño asciende a: " + bono);
    }
}

class gerente extends supervisor{
    
    String accesos;
    
    public gerente(String nombrecompleto, double salario, double bono, String accesos) {
        super(nombrecompleto, salario, bono);
        this.accesos = accesos; 
    }
    
    @Override
    public void imprimirdatos(){
   System.out.println("nombre del empleado " + nombrecompleto + 
   " salario del empleado " + salario + 
   " su bono navideño asciende a: " + bono + 
   " sus accesos son: " + accesos);
    }
}