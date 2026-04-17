package Eva2_20_composicion2;

public class Eva2_20_composicion2 {

    public static void main(String[] args) {

        motor mo = new motor(4, 'G', 1.5);
        vehiculo ve = new vehiculo("ford", "fiesta", 2020, mo);

        ve.imprimir();
    }

}

class vehiculo {

    private String marea;
    private String modelo;
    private int fecha;
    private motor motor;

    public vehiculo(String marea, String modelo, int fecha, motor motor) {
        this.marea = marea;
        this.modelo = modelo;
        this.fecha = fecha;
        this.motor = motor;
    }

    public void setMarea(String marea) {
        this.marea = marea;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getMarea() {
        return marea;
    }

    public String getModelo() {
        return modelo;
    }

    public int getFecha() {
        return fecha;
    }

    public void imprimir() {
        System.out.println("marca: " + marea);
        System.out.println("modelo: " + modelo);
        System.out.println("fecha: " + fecha);
        System.out.println("cilindros: " + motor.getCilindro());
        System.out.println("combustible: " + motor.getCombustible());
        System.out.println("color: " + motor.getColor());
    }
}

class motor {

    private int cilindro;
    private char combustible;
    private double color;

    public motor(int cilindro, char combustible, double color) {
        this.cilindro = cilindro;
        this.combustible = combustible;
        this.color = color;
    }

    public int getCilindro() {
        return cilindro;
    }

    public char getCombustible() {
        return combustible;
    }

    public double getColor() {
        return color;
    }

    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    public void setColor(double color) {
        this.color = color;
    }
}