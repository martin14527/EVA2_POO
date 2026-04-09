
package practica_vacaciones2;


public class Practica_vacaciones2 {

 
    public static void main(String[] args) {
        jugador J = new jugador ();
        J.jugar();
        J.atacar();
        J.defenderse();
    }
    
}
class personaje{ //clase 1 
    public void atacar(){
    System.out.println("el personaje se defiende");
    
    }

}
class guerrero extends personaje {
public void defenderse (){
System.out.println("el guerrero ataca");

}

}
class jugador extends guerrero{
public void jugar(){
System.out.println("matar y jugar ");

}


}