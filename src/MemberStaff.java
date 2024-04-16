public class MemberStaff extends Person{
    private Integer salary;
    private String shift;

    public MemberStaff (Integer dni, String name, String surname, String email, String address, Integer salary, String shift){
        super(dni,name,surname,email,address);
        this.salary=salary;
        this.shift=shift;
    }
}
