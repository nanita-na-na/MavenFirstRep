package org.example.animalImpl;

import org.example.Animal;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Wof! Wof! Wof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
