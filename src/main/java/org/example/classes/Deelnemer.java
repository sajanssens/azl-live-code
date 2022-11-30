package org.example.classes;

public class Deelnemer extends Persoon {

    private ActiefDienstverband adv;

    public Deelnemer(String naam, int leeftijd) {
        super(naam, leeftijd);
        this.adv = new ActiefDienstverband();
    }

    @Override
    public void jarig() {
        System.out.println("Ik ben " + naam + " en ik ben jarig maar ik word niet ouder!");
    }

    @Override
    public String toString() {
        return "Deelnemer{" +
                "adv=" + adv.toString() +
                ", naam='" + naam + '\'' +
                '}';
    }
}
