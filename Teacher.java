public class Teacher extends Person {
  
        String subject;
    
        // Constructor
        public Teacher(String name, int id, String subject) {
            super(name, id);
            this.subject = subject;
        }
    
        // Overridden method
        @Override
        public void displayinfo() {
            super.displayinfo();
            System.out.println("Subject: " + subject);
        }
    }
