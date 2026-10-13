package ru.oleynikov.main;

import ru.oleynikov.birds.Bird;

import java.util.ArrayList;
import java.util.List;

public class Rookery {
    private List<Bird> birds;

    public Rookery(){
        birds = new ArrayList<>();
    }

    public void add(Bird bird){
        birds.add(bird);
    }

    public void callBirds(){
        for(Bird b : this.birds){
            b.sing();
        }
    }
}
