//Name: Khoa Pham
//Project: Assignment 5 (Animal-Shelter)
//Date: 07/17/2025
package com.keyin;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat: " + getName();
    }
}
