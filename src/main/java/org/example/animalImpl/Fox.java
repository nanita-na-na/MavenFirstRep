package org.example.animalImpl;

import org.example.Animal;

public class Fox implements Animal {
    @Override
    public void voice() {
        System.out.println("Fur, fur, fur");
    }

    @Override
    public void eat() {
        System.out.println("Fox is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Fox is sleeping");
    }

    @Override
    public void walk() {
        System.out.println("Fox is walking");
    }
}
