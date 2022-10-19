package org.example.animalImpl;

import org.example.Animal;

public class Horse implements Animal {
    @Override
    public void voice() {
        System.out.println("Igogo!");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }

    @Override
    public void walk() {
        System.out.println("Horse is walking");
    }
}
