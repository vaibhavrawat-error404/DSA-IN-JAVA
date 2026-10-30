
class Student {

    // 1. Attributes (Instance Variables)
    String name;
    int age;
    String branch;
    double cgpa;

    // 2. Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        branch = "Not Assigned";
        cgpa = 0.0;

        System.out.println("Default Constructor Called");
    }

    // 3. Parameterized Constructor
    Student(String name, int age, String branch, double cgpa) {

        this.name = name;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;

        System.out.println("Parameterized Constructor Called");
    }

    // 4. Copy Constructor
    Student(Student obj) {

        this.name = obj.name;
        this.age = obj.age;
        this.branch = obj.branch;
        this.cgpa = obj.cgpa;

        System.out.println("Copy Constructor Called");
    }

    // 5. Behaviour (Methods)
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA   : " + cgpa);
        System.out.println("--------------------");
    }

    void study() {
        System.out.println(name + " is studying.");
    }

    void updateCGPA(double newCGPA) {
        cgpa = newCGPA;
        System.out.println("CGPA Updated!");
    }
}

// Modern Java main syntax (Java 25)
void main() {

    // Object 1: Default Constructor
    Student s1 = new Student();

    // Object 2: Parameterized Constructor
    Student s2 = new Student("Vibhu", 19, "CSE", 8.5);

    // Object 3: Copy Constructor
    Student s3 = new Student(s2);

    // Displaying Objects
    System.out.println("\nStudent 1:");
    s1.display();

    System.out.println("Student 2:");
    s2.display();

    System.out.println("Student 3:");
    s3.display();

    // Calling Behaviour Methods
    s2.study();

    s2.updateCGPA(9.2);

    System.out.println("\nAfter Updating CGPA:");
    s2.display();
}
