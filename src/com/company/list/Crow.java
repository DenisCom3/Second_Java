package com.company.list;

public class Crow extends Bird {


    public Crow(String name) {
        super(name);
    }

    @Override
    public void food() {
        setFlying(false);

    }
}

