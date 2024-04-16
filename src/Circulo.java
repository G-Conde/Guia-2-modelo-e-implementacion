public class Circulo extends Figura{
    double radio;

    public Circulo(String color, double radio) {
        super(color); //Llamamos al constructor de la figura que agrega el color
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
