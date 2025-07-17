//Name: Khoa Pham
//Project: Assignment 5 (Animal-Shelter)
//Date: 07/17/2025
package com.keyin;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Dog("Kiki"));
        shelter.enqueue(new Cat("Lulu"));
        shelter.enqueue(new Dog("Taytay"));
        shelter.enqueue(new Cat("Lili"));

        System.out.println("\n--- Animals added to the shelter ---");
        shelter.displayAnimals();

        Animal adopted1 = shelter.dequeueAny();
        System.out.println("\nAdopted (any): " + adopted1.getName());

        Animal adopted2 = shelter.dequeueDog();
        System.out.println("Adopted (dog): " + adopted2.getName());

        Animal adopted3 = shelter.dequeueCat();
        System.out.println("Adopted (cat): " + adopted3.getName());

        System.out.println("\n--- Animals remaining in the shelter ---");
        shelter.displayAnimals();
    }
}
