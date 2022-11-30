package org.example.classes;

public class Auto {
    // STATE: ----------------------------------
    // Attributen (UML):
    // Properties
    // - field
    // - getter/setter (accessors)
    // reference types:
    private String kleur; // field
    private String merk;

    // primitive types:
    private int snelheid;
    private int maxSnelheid;
    private boolean heeftBluetooth = true;

    // Constructor
    public Auto() {
        kleur = "wit";
        merk = "";
    }

    public Auto(String k, int max) {
        this.kleur = k;
        this.maxSnelheid = max;
        this.merk = "";
    }

    // BEHAVIOUR -------------------------------
    public void accelereer() {
        accelereer(1);
    }

    // method overloading
    public void accelereer(int hoeveelheid) {
        if (this.snelheid + hoeveelheid < this.maxSnelheid) {
            snelheid = snelheid + hoeveelheid;
        } else {
            this.snelheid = this.maxSnelheid;
        }
    }

    public void wassen() {
        this.kleur = this.kleur + "glans";
    }

    public String getKleur() {
        return this.kleur;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setSnelheid(int nieuweSnelheid) {
        if (nieuweSnelheid < this.maxSnelheid) {
            this.snelheid = nieuweSnelheid;
        }
    }
}
