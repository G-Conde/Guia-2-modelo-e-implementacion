import java.util.List;
import java.util.ArrayList;

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
        System.out.println("Nombre: " + b1.getName() + ", Apellido: " + b1.getLastName() + ", Email: " + b1.getEmail() + ", Genero: " + b1.getGenre());

        //Student[] arreglo = new Student[10];//fijo
        //uso de un Arraylist
        List<Person> peoples = new ArrayList<>();//Dinamico
        Student s1 = new Student(34943760, "German", "Conde", "germanconde79@gmail.com", "Monsalvo 3310", 2023, 30, "Programacion");
        Student s2 = new Student(34943761, "Gaston", "Guliber", "germanconde79@gmail.com", "Monsalvo 3310", 2023, 30, "Programacion");
        Student s3 = new Student(34943762, "Jorge", "Gascon", "germanconde79@gmail.com", "Monsalvo 3310", 2023, 30, "Programacion");
        Student s4 = new Student(34943763, "Ricardo", "Jubilo", "germanconde79@gmail.com", "Monsalvo 3310", 2023, 30, "Programacion");
        peoples.add(s1);
        peoples.add(s2);
        peoples.add(s3);
        peoples.add(s4);

        MemberStaff m1 = new MemberStaff(123456789, "Jorge", "Rawson", "algo", "otra cosa", 55, "noche");
        MemberStaff m2 = new MemberStaff(123456780, "Jorge", "Rawson", "algo", "otra cosa", 55, "noche");
        MemberStaff m3 = new MemberStaff(123456781, "Jorge", "Rawson", "algo", "otra cosa", 55, "noche");
        MemberStaff m4 = new MemberStaff(123456787, "Jorge", "Rawson", "algo", "otra cosa", 55, "noche");
        peoples.add(m1);
        peoples.add(m2);
        peoples.add(m3);
        peoples.add(m4);

        //USO DEL INSTANCEOF
        Integer memberStaff=0;
        Integer students=0;
        Integer quotaFinal=0;

        for(Person person : peoples){
            if(person instanceof Student){
                Student student = (Student) person; // Hacemos un cast de la persona a Student
                quotaFinal += student.getMonthlyFee(); // Accedemos al atributo monthlyFee de la instancia de Student
                students++;
            }else if(person instanceof MemberStaff) {
                memberStaff++;
            }
        }

        Circulo circulo = new Circulo("Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Azul", 4, 6);
        Cuadrado cuadrado = new Cuadrado("Verde", 3);

        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Color: " + circulo.color);

        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Color: " + rectangulo.color);

        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("Color: " + cuadrado.color);




        /*
        if (s1 instanceof Student) {
            System.out.println("La persona es un estudiante.");
        } else {
            System.out.println("La persona no es un estudiante.");
        }
*/
    }
    /*
        La palabra clave instanceof en Java se utiliza
        para verificar si un objeto es una instancia de una
        clase particular, una subclase de esa clase o una implementación
        de una interfaz. Su sintaxis es la siguiente: objeto instanceof Clase



        Diagramar el UML identificando superclase y subclases, crear constructores
        necesarios, getters y setters, métodos de ayuda como salario anual y toString para
        facilitar la impresión.
        ● Inicializar 4 estudiantes diferentes.
        ● Inicializar 4 miembros de staff con características diferentes.
        ● Crear un array que permita almacenar juntos los tipos anteriores y
        almacenar las 8 instancias creadas anteriormente.
        ● Investigar el uso de la palabra reservada instanceof.
        ● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
        la cantidad de miembros de staff.
        ● Recorrer el array y sumar el total de ingresos que percibe la
        institución por parte de la cuota de estudiantes.

   */
}
