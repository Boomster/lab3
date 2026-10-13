package ru.oleynikov.birds;

import java.util.Random;

public class Parrot implements Bird{
    private String text;

    public void sing(){
        int n = (new Random()).nextInt(this.text.length()) + 1;
        System.out.println(this.text.substring(0, n));
    }

    public Parrot(String text){
        this.text = text;
    }
}
