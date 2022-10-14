package org.example.animalImpl;

import org.example.Animal;

public class Tiger implements Animal {
    @Override
    public void voice() {
        System.out.println("Grrr! grr! grrr!");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void walk() {
        System.out.println("Tiger is walking");
    }
}
