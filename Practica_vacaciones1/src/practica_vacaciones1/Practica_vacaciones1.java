
package practica_vacaciones1;


public class Practica_vacaciones1 {
    public static void main(String[] args) {
       jugadorfuerte jf = new jugadorfuerte(); //se llama a este poque es el ultimo y ya incluye a todos
        
        jf.jugar();
        jf.analiza();
        
        jugador j= new jugador();
        j.jugar();
    }
    
}

class jugador{
public void jugar (){

 System.out.println("mueve piezas");
}

}
class jugadorfuerte extends jugador{ //aqui jugador fuerte mueve piezas pq extend jala de la otra clase y analiza 
public void analiza (){
 System.out.println("analiza "); //comportamiento 
}


}