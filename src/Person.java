public class Person {
    private Integer dni;
    private String name;
    private String surname;
    private String email;
    private String address;

    protected Person(Integer dni, String name, String surname, String email, String address) {
        this.dni=dni;
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.address=address;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
