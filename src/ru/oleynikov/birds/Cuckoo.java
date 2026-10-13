package ru.oleynikov.birds;

import java.util.Random;

public class Cuckoo implements Bird{
    public void sing(){
        int k = (new Random()).nextInt(10) + 1;
        for (int i = 0; i < k; i++) {
            System.out.println("ку-ку");
        }
    }

    public Cuckoo(){}
}
