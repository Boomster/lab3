package ru.oleynikov.birds;

public abstract class Bird {
    abstract public void sing();

    @Override
    public String toString() {
        return "This is a bird.";
    }
}
