
package practica10vacaciones;
public class Practica10vacaciones {
 
    
    public static void main(String[] args) {
        motoclicleta mt = new motoclicleta("LALO,", "45");
 mt.imprimirmarca();
    }
    
}
class vehiculo{
 String marca;

public vehiculo(String marca){
   System.out.println("los vehiculos estan en el lote 7 ");
this.marca=marca;
}
 

public void imprimirmarca(){
System.out.println("datos del vehiculo ---->" + marca);

}
}
class motoclicleta extends vehiculo{
String rodada;
public motoclicleta(String rodada,String marca){
    super(marca);
this.rodada=rodada;
}

@Override
public void imprimirmarca(){
System.out.println("datos del vehiculo ----> la marca es:" + marca + "y la rodada es :" + rodada);

}
    
    
    
}