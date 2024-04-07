public class Author {
    private String name;
    private String lastName;
    private String email;
    private Character genre;

    public Author() {
    }
    public Author(String name, String lastName, String email, Character genre) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Character getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "[Nombre: " + name + ", Apellido: " + lastName + ", Email: " + email + ", Genero: " + genre + "]";
    }

}
