package org.example;

import org.example.classes.Auto;
import org.example.classes.Deelnemer;
import org.example.classes.Indexeerbaar;
import org.example.classes.Persoon;
import org.example.classes.Slaper;

public class Start {
    public static void main(String[] args) {
        var auto1 = new Auto();
        auto1.setMerk("Skoda");

        Auto auto2 = new Auto("Rood", 300);
        auto2.setMerk("Ferrari");

        Persoon bram = new Deelnemer("Bram", 43);
        bram.setCooleWaggie(auto2);
        // bram.naam = "...";
        bram.jarig();

        auto2.setMerk("Trabant");

        Persoon ray = new Deelnemer("Raymond", 43);
        ray.jarig();
        ray.indexeer();

        Indexeerbaar z = new Slaper("Zzzzz", 43);
        z.indexeer();

        System.out.println(ray);

        System.out.println("De maximum snelheid op de NLse snelweg is: " + Auto.maxSnelheidOpNlSnelweg);
    }
}
