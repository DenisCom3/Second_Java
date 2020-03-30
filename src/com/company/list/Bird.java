package com.company.list;

public abstract class Bird {
    private boolean IsFlying;
    private final String name;

    Bird(String name) {
        this.IsFlying = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFlying() {
        return IsFlying;
    }
    public abstract void food();

     void setFlying(boolean flying) {
        IsFlying = flying;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "IsFlying=" + IsFlying +
                ", name='" + name + '\'' +
                '}';
    }

}

