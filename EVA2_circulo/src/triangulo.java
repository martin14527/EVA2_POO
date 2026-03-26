
public class triangulo extends figuras {
    public triangulo(double lado) {
        this.lado = lado;
    }
    private double lado;
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public triangulo(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
