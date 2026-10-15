package ru.oleynikov.main;
import ru.oleynikov.birds.*;

import static ru.oleynikov.inputs.TaskParser.*;

public class Main {
    public static void main(String[] args){
        //4.3+
        Bird bird1 = new Cuckoo();
        Bird bird2 = new Sparrow();
        Bird bird3 = new Parrot(checkInputString("Bird text"));
        bird1.sing();
        bird2.sing();
        bird3.sing();
        System.out.println(bird1);
        System.out.println(bird3);
        //5.2+
        Rookery rookery = new Rookery();
        rookery.add(bird2);
        rookery.add(bird1);
        rookery.add(new Sparrow());
        rookery.add(bird3);
        rookery.add(new Cuckoo());
        rookery.add(new Parrot(checkInputString("Bird text")));
        rookery.add(new Cuckoo());
        rookery.add(new Sparrow());
        rookery.add(new Sparrow());
        rookery.callBirds();
        System.out.println(rookery);
    }
}
