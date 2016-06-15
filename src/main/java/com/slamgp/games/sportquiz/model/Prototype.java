package com.slamgp.games.sportquiz.model;

public class Prototype {
    String name;

    public Prototype(String name) {
        super();
        this.name = name;
    }

    public Prototype() {
        this.name = "no name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
