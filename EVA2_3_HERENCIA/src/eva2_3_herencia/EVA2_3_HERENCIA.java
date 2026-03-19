
package eva2_3_herencia;

public class EVA2_3_HERENCIA {

    public static void main(String[] args) {
        
        animal animal = new animal();
        animalmamifero ma = new animalmamifero();
          System.out.println("----------------clase persona-------------------");
          persona pe= new persona();
          pe.debate();
    }
    
}

class animal {

    public animal() {
        System.out.println("clase animal");
    }

    public void comer() {
        System.out.println("animal : come");
    }
}

class animalmamifero extends animal {

    public animalmamifero() {
        System.out.println("clase mamifero");
    }

    public void mama() {
        System.out.println("mamifero : mama");
    }
}

class persona extends animalmamifero{
public persona(){
  System.out.println("thinking");

}

 public void debate() {
        System.out.println("debating");
    }
}