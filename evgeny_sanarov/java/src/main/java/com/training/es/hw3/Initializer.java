package com.training.es.hw3;

public class Initializer {
    static byte b;
    static short sh;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bool;
    static char ch;
    static Object o;

    public static void main(String[] args) {
        System.out.print("byte: " + b + "; short: " + sh + "; int: " + i +
                "; long: " + l + "; float: " + f + "; double: " + d +
                "; boolean: " + bool + "; char: " + ch + "; reference: " + o);
    }
}