
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class oops {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}
