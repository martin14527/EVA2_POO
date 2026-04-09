
package practica_vacaciones3;

public class Practica_vacaciones3 {

    public static void main(String[] args) {
       laptop P = new laptop ();
       System.out.println("para que el dispositivo funcione deben seguirse 3  requisitos");
       P.funcionar();
       P.estabilidad();
       P.ingresaralsat();
    } 
}
class dispositivos {
public dispositivos() {
System.out.println("probando......");


}
  

public void funcionar(){

System.out.println("el dispositivo funciona");


}


}
class red extends dispositivos{
public void estabilidad(){


System.out.println("la red esta en funcionamiento");

}       
}
class laptop extends red{
public void ingresaralsat(){
System.out.print("entrada exitosa");



}


}