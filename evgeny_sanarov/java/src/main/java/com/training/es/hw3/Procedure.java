package com.training.es.hw3;

public class Procedure {
    Marker marker = new Marker("non static var");
    static Marker statMarker = new Marker("static var");

    public static void main(String[] args) {
        new Procedure();
        Marker marker;
        System.out.println("Reference variable 'marker' initialized");
        marker = new Marker("'marker' has a reference to object");
    }

    {
        System.out.println("First non-static block initialized");
    }

    {
        System.out.println("Second non-static block initialized");
    }

    static {
        System.out.println("First static block initialized");
    }

    static {
        System.out.println("Second static block initialized");
    }
}