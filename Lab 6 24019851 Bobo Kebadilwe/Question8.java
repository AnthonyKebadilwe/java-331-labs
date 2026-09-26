public class Question8 {
//parent class with a method that can be overridden by subclasses.
    static class Animal {
        void speak() {
            System.out.println("The animal makes a sound.");
        }
    }
//subclass that overrides the speak() method of the Animal class.
    static class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("The cat says Meow!");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();//uses Animal's speak() method

        Cat c = new Cat();//uses Cat's overridden speak() method
        c.speak();
    }
}