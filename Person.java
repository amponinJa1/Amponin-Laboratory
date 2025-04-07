public class Person {
    private String name;
    private int id;
     
    //CONSTRUCTOR
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        //METHOD CALLS
    }
    public String getName() {
        return this.name;
    }
    public int getid() {
        return this.id;
    }
    //DISPLAY METHOD=
    public void displayinfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }

    public static void main(String[] args) {
            Students student = new Students("Go, Miguel", 2024000, "1st Year");
            Teacher teacher = new Teacher("Fabro Jr,  Junnie", 2024001, "1st Year Math");
            Staff staff = new Staff("Pansit, Bato", 2024002, "Janitor");
    
            System.out.println("Student Info:");
            student.displayinfo();
            System.out.println();
    
            System.out.println("Teacher Info:");
            teacher.displayinfo();
            System.out.println();
    
            System.out.println("Staff Info:");
            staff.displayinfo();
        }
    
   

}
