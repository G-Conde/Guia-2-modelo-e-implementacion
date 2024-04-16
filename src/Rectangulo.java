public class Rectangulo extends Figura{
    double ancho;
    double largo;

    public Rectangulo(String color, double ancho, double largo) {
        super(color);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return ancho * largo;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + largo);
    }
}

class Cuadrado extends Rectangulo {
    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }
}
