package com.ftn.sbnz.backward.model.models;

public class Parent extends Person {
    private String descendantName;

    public Parent(String name, String descendantName) {
        super(name);
        this.descendantName = descendantName;
    }

    public String getDescendantName() {
        return descendantName;
    }

    public void setDescendantName(String descendantName) {
        this.descendantName = descendantName;
    }
}
