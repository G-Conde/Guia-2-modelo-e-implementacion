public class Main {
    public static void main(String[] args) {

        Author a1 = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        String caracteristics = a1.toString();
        System.out.println(caracteristics);
        Book b1 = new Book(a1.getName(), a1.getLastName(), a1.getEmail(), a1.getGenre(), "Effective Java", 450.0, 150);
        String libro = b1.toString();
        System.out.println(libro);
        b1.setPrice(500.0);
        b1.setStock(500);
        libro = b1.toString();
        System.out.println(libro);
        System.out.println("Nombre: "+b1.getName()+", Apellido: "+b1.getLastName()+", Email: "+ b1.getEmail()+", Genero: "+b1.getGenre());
    }
    /*


    g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    siguiente mensaje:
    “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
    h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
    cambios necesarios en el método del punto g, para imprimir un nuevo
    mensaje que liste los autores que contribuyeron a ese libro.*/
}
