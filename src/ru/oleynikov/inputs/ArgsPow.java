package ru.oleynikov.inputs;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class ArgsPow {
    public static int myPow(String[] args) throws RuntimeException{
        int x, y;
        if (args.length != 2){
            throw new RuntimeException("Incorrect number of arguments!");
        } else {
            try {
                x = parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Incorrect input type.");
            }
            try {
                y = parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Incorrect input type.");
            }
            return (int)pow(x, y);
        }
    }
}
