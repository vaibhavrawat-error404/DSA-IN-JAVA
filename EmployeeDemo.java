class Employee {
    //Attributes of Class
    public String employeeName;
    private int salary;
    private String address;
    private int age;
    public String branch;

    //Constructor to Set or assign values of Attributes of instances
    public Employee(String employeeName, int salary, String address, int age, String branch) {
        this.employeeName = employeeName;
        this.branch = branch;
        this.salary = salary;
        this.address = address;
        this.age = age;
    }
    //Getters to access the private attributes
    public int getSalary() { return salary; }
    public String getAddress() { return address; }
    public int getAge() { return age; }

    //Setter to assign the values of private attributes from outside the class
    public void setSalary(int salary) { this.salary = salary; }
    public void setAddress(String address) { this.address = address; }
    public void setAge(int age) {
        if(age>=0&&age<=100){
        this.age = age;
        }
        else{
            System.out.println("Invalid Age");
            return;
        }
    }

    //Display function to show output of public attributes
    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Branch: " + branch);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        //e1 instance of Employee class and its arguments
        Employee e1 = new Employee("Vaibhav Rawat", 50000, "Dudhai", 20, "Software Developer");
        e1.display();
        e1.setAddress("Delhi");
        e1.setAge(20);
        System.out.println("Age: "+e1.getAge());
        System.out.println("Address: "+e1.getAddress());
        System.out.println("Salary "+e1.getSalary());


    }
}