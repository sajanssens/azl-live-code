package org.example.classes;

public class Slaper extends Persoon {

    public Slaper(String naam, int leeftijd) {
        super(naam, leeftijd);
    }

    @Override
    public void jarig() {
        setLeeftijd(getLeeftijd() + 1);
        System.out.println("Ik ben " + naam + " en ik ben jarig!");
    }
}
