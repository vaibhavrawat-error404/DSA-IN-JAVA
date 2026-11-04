
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}



public class oops {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}
