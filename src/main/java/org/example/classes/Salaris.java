package org.example.classes;

public class Salaris implements Indexeerbaar {

    private int waarde = 2500;

    @Override
    public void indexeer() {
        this.waarde *= 1.2;
    }
}
