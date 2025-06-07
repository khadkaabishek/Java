//Here Use can able to add own exceptions cases 
//Take an Example of Semester if user input enters the value out of range (lets say 1-8) then program should throw an Error 
class User_Exception extends Exception {
    public User_Exception(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int sem;

    public Student(String name, int sem) throws User_Exception {
        if (sem < 1 || sem > 8) {
            throw new User_Exception("Invalid Semester");
        } else {
            this.name = name;
            this.sem = sem;
        }
    }
}

class Test {
    public static void main(String[] args) {
        try {
            Student s = new Student("Abishek", 04);
            System.out.println("Name of Student = "+s.name);
        } catch (User_Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
