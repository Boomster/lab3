package ru.oleynikov.main;

import java.util.Scanner;

public class IntParser {
    public static int checkInputInt(Scanner sc, String name){
        int a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.next();
            try {
                a = Integer.parseInt(str);
                gotNumber = true;
            } catch (Exception e) {
                System.out.println("This is not an integer!");
                System.out.print(name + " = ");
            }
        }
        return a;
    }
}
