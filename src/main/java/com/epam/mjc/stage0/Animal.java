package com.epam.mjc.stage0;

public abstract class Animal {
    private static String color;
    private static int numberOfPaws;
    private static boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;

    }
    public String getDescription() {
        String answ;
        String paws;
        if (numberOfPaws == 1) {
            paws = "paw";
        }else {
            paws = "paws";
        }
        if (hasFur){
            answ = "a";
        }else {
            answ = "no";
        }
        return "This animal is mostly  "  +
                color + ". It has " + numberOfPaws + " " + paws +
                        " and " +  answ + " fur.";

    }


}

