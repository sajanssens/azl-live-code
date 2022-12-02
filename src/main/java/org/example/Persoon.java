package org.example;

public class Persoon {
    private String naam;

    public Persoon(String eenNaam){
        this.naam = eenNaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}

