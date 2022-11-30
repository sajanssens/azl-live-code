package org.example.classes;

public class Auto {
    // STATE: ----------------------------------
    // Attributen (UML):
    // Properties
    // - field
    // - getter/setter (accessors)
    // reference types:
    private String kleur = "wit"; // field
    private String merk = "";

    // primitive types:
    private int snelheid;
    private int maxSnelheid;
    private boolean heeftBluetooth = true;

    // Constructor
    public Auto() {

    }

    public Auto(String k, int max) {
        this.kleur = k;
        this.maxSnelheid = max;
    }

    // BEHAVIOUR -------------------------------
    public void accelereer() {
        if (this.snelheid < this.maxSnelheid) {
            this.snelheid++;
            // snelheid = snelheid + 1;
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
