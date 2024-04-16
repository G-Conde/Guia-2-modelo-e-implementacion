abstract class Figura {
    String color; //Factor comun entre las subclases

    public Figura(String color) {
        this.color = color;
    }
    //METODOS ABSTRACTOS QUE LUEGO CADA FIGURA VA A SOBRE ESCRIBIR
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
