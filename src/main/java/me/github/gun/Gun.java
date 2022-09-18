package me.github.gun;

public abstract class Gun {

    private String name;

    protected void Gun(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
