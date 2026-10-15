package ru.oleynikov.inputs;

import java.util.Scanner;

public class TaskParser {
    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputInt(String name){
        int a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.nextLine();
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

    public static int checkInputIntPos(String name){
        int a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.nextLine();
            try {
                a = Integer.parseInt(str);
                if (a >= 0) {
                    gotNumber = true;
                } else {
                    System.out.println("Number should be not negative!");
                    System.out.print(name + " = ");
                }
            } catch (Exception e) {
                System.out.println("This is not an integer!");
                System.out.print(name + " = ");
            }
        }
        return a;
    }

    public static int checkInputIntMaxPos(String name, int max){
        int a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.nextLine();
            try {
                a = Integer.parseInt(str);
                if (a >= 0 && a < max) {
                    gotNumber = true;
                } else {
                    System.out.println("Number should be not negative and less then " + max + "!");
                    System.out.print(name + " = ");
                }
            } catch (Exception e) {
                System.out.println("This is not an integer!");
                System.out.print(name + " = ");
            }
        }
        return a;
    }

    public static double checkInputDouble(String name){
        double a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.nextLine();
            try {
                a = Double.parseDouble(str);
                gotNumber = true;
            } catch (Exception e) {
                System.out.println("This is not a number!");
                System.out.print(name + " = ");
            }
        }
        return a;
    }

    public static String checkInputString(String name){
        System.out.print(name + " = ");
        return sc.nextLine();
    }
}
