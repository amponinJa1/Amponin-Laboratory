package Act3;
class Staff extends Person {
        String department;
    
        // Constructor
        public Staff(String name, int id, String department) {
            super(name, id);
            this.department = department;
        }
    
        // Overridden method
        @Override
        public void displayinfo() {
            super.displayinfo();
            System.out.println("Department: " + department);
        }
    }

