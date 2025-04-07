package Act2;
public class SalesPerson extends Employee {
   
    private double comissionPercentage;
    public SalesPerson(String name, int age, double salary, double comissionPercentage)  {
        super(name, age, ,salary);
        this.comissionPercentage = comissionPercentage; 
    }    
    public double getComissionPercentage() {
        return comissionPercentage;
    }
    public void raiseComission() {
       if (this.comissionPercentage < .30){
        this.comissionPercentage = this.comissionPercentage * 1.2;
       }
    }     
}