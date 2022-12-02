package org.example.classes;

public final class Deelnemer extends Persoon {

    private ActiefDienstverband adv;

    public Deelnemer(String n, int l) {
        super(n, l);
        this.adv = new ActiefDienstverband();
    }

    @Override
    public void jarig() {
        System.out.println("Ik ben " + naam + " en ik ben jarig maar ik word niet ouder!");
    }

    @Override
    public void indexeer() {
        System.out.println("Deelnemer indexeren...");
    }

    @Override
    public String toString() {
        return "Deelnemer{" +
                "adv=" + adv.toString() +
                ", naam='" + naam + '\'' +
                '}';
    }
}
