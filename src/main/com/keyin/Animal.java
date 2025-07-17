//Name: Khoa Pham
//Project: Assignment 5 (Animal-Shelter)
//Date: 07/17/2025
package com.keyin;

public abstract class Animal implements Comparable<Animal> {
    private static int counter = 0;
    private int arrivalTime;
    private String name;

    public Animal(String name) {
        this.name = name;
        this.arrivalTime = counter++;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.arrivalTime, other.arrivalTime);
    }

    @Override
    public String toString() {
        return name;
    }
}
