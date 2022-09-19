package me.gunbuilder.gun.module.gun;

public abstract class Bullet {
    private String name;

    private double speed = 50;


    protected Bullet(String name) {
        this.name = name;
    }

    public String getBulletName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}
