package org.example;

import org.example.classes.Auto;

public class Start {
    public static void main(String[] args) {
        var auto1 = new Auto();
        auto1.setMerk("Skoda");

        Auto auto2 = new Auto("Rood", 300);
        auto2.setMerk("Ferrari");
    }
}
