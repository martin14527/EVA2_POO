package eva2_16;
public class Eva2_16 {

    public static void main(String[] args) {

        circulo c1 = new circulo(50);
        rectangulo r1 = new rectangulo(20, 20);

        System.out.println("area del circulo: " + c1.calcularArea());
        System.out.println("area del rectangulo: " + r1.calcularArea());

        // Polimorfismo con arreglo de figuras
        figura[] figuras = new figura[2];
        figuras[0] = c1;
        figuras[1] = r1;
        for (figura f : figuras) {
            System.out.println("area: " + f.calcularArea());
            System.out.println("Perimetro: " + f.calcularPerimetro());
        }
    }
}

interface figura {
    double calcularArea();
    double calcularPerimetro();
}
class circulo implements figura {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
class rectangulo implements figura {
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

