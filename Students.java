public class Students extends Person {
    public String gradelevel;
    // Constructor
    public Students(String name, int id, String gradeLevel ) {
        super(name, id );
        this.gradelevel = gradeLevel;
        
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Grade Level: " + this.gradelevel);
    }
    
}
