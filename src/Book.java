public class Book extends Author {
    private String title;
    private Double price;
    private Integer stock;

    public Book(String name, String lastName, String email, Character genre, String title, Double price, Integer stock) {
        super(name, lastName, email, genre);
        this.title = title;
        this.price = price;
        this.stock = stock;
    }/*
    e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
    cantidad en 50 copias.*/

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "El libro pertenece: "+super.toString()+ ", Titulo: "+title+" ,Precio:"+price+" Stock: "+stock;
    }

}
