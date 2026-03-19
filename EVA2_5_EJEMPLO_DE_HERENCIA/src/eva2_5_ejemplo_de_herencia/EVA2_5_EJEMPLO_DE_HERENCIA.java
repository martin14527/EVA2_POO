package eva2_5_ejemplo_de_herencia;

public class EVA2_5_EJEMPLO_DE_HERENCIA {

    public static void main(String[] args) {
        PERSONA p = new PERSONA("MARTIN", "VALLEJO", "LOYA", "1259204", 17, 'M');
        p.imprimirdatosempleado();
        
        EMPLEADO pe = new EMPLEADO("1", "gerente", 100000, "MARTIN", "VALLEJO", "LOYA", "1259204", 17, 'M');
        pe.imprimir(); // método heredado de PERSONA
        pe.imprimirdatosempleados(); // método propio de EMPLEADO
    }
}
//sobre escritura de metodos