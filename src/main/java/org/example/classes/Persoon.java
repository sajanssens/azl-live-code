package org.example.classes;

public abstract class Persoon extends Object {
    protected String naam;
    private int leeftijd;
    private Auto cooleWaggie;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public abstract void jarig();

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Auto getCooleWaggie() {
        return cooleWaggie;
    }

    public void setCooleWaggie(Auto cooleWaggie) {
        this.cooleWaggie = cooleWaggie;
    }

    @Override public String toString() {
        return super.toString() + "Persoon{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", cooleWaggie=" + cooleWaggie +
                '}';
    }
}
