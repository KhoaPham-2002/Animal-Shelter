//Name: Khoa Pham
//Project: Assignment 5 (Animal-Shelter)
//Date: 07/17/2025
package com.keyin;

import java.util.PriorityQueue;

public class AnimalShelter {
    private PriorityQueue<Dog> dogQueue = new PriorityQueue<>();
    private PriorityQueue<Cat> catQueue = new PriorityQueue<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty() && catQueue.isEmpty())
            return null;
        if (dogQueue.isEmpty())
            return dequeueCat();
        if (catQueue.isEmpty())
            return dequeueDog();

        Dog oldestDog = dogQueue.peek();
        Cat oldestCat = catQueue.peek();

        return (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) ? dogQueue.poll() : catQueue.poll();
    }

    public Dog dequeueDog() {
        return dogQueue.poll();
    }

    public Cat dequeueCat() {
        return catQueue.poll();
    }

    public void displayAnimals() {
        System.out.println("Current number of animals at the shelter:");
        System.out.println("Dogs: " + dogQueue.size() + " | Cats: " + catQueue.size());
    }
}
