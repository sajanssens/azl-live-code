package org.example.ezelsoor;

public class Customer {
    private String name;
    private String address;
    private String residence;

    public Customer(String name, String address, String residence) {
        this.name = name;
        this.address = address;
        this.residence = residence;
    }

    @Override public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", residence='" + residence + '\'' +
                '}';
    }
}
