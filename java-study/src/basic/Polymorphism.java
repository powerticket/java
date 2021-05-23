package basic;

public class Polymorphism {
    private static class Animal {
        void sound() {
            System.out.println("I'm animal!");
        }
    }

    private static class Dog extends Animal {
        void sound() {
            System.out.println("Bark! Bark!");
        }
    }
    
    private static class Bird extends Animal {
        void sound() {
            System.out.println("Tweet! Tweet!");
        }
    }

    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.sound();
        System.out.println(animal.getClass());
        animal = new Dog();
        animal.sound();
        System.out.println(animal.getClass());
        animal = new Bird();
        animal.sound();
        System.out.println(animal.getClass());
        
        Dog dog;
        dog = new Dog();
        dog.sound();
        System.out.println(dog.getClass());
        
        Bird bird;
        bird = new Bird();
        bird.sound();
        System.out.println(bird.getClass());
    }
}
