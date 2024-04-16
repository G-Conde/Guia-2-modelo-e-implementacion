public class Student extends Person {
    private Integer dateOfIngress;
    private Integer monthlyFee;
    private String career;

    public Student(Integer dni, String name, String surname, String email, String address, Integer dateOfIngress, Integer monthlyFee, String career) {
        super(dni,name,surname,email,address);
        this.dateOfIngress=dateOfIngress;
        this.monthlyFee=monthlyFee;
        this.career=career;
    }

    public Integer getMonthlyFee() {
        return monthlyFee;
    }
}
