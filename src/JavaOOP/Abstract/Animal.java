package JavaOOP.Abstract;

abstract class Animal {
    abstract void makeSound();
}
//abstract classes cannot be instantiated therefore we create a concrete subclass that extends the superclass
class Dog extends Animal {
    // Implementing the abstract method from the superclass
    void makeSound() {
        System.out.println("Dog barks");
    }
}


