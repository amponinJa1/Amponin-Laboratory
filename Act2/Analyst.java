package Act2;
public class Analyst extends Employee {
    private String department;

    public Analyst(String name,  int age,  double salary) {
        super(name, age, salary);
    }
     
    public double getAnnualBonus() {
        return super.salary * 0.5;
    }

    
}
