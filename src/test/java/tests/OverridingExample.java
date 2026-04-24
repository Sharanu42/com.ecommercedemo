package tests;

    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class OverridingExample {
        public static void main(String[] args) {

            Animal obj = new Animal();
            obj.sound();   // parent method

            Dog d = new Dog();
            d.sound();     // child method

            Animal ref = new Dog();
            ref.sound();   // runtime polymorphism (calls Dog method)
        }
    }

