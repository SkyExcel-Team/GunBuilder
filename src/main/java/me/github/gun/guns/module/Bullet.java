package me.github.gun.guns.module;

public abstract class Bullet {
    private String name;

    private int maxBullet;

    private int bullet;

    private double speed;
    

    protected Bullet(String name) {
        this.name = name;
    }

    public int setMaxBullet(int maxBullet) {
        this.maxBullet = maxBullet;
        return maxBullet;
    }

    public int decrease() {
        if (this.bullet != 0) {
            return this.bullet - 1;
        }
        return -1;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public int getMaxBullet() {
        return maxBullet;
    }

    protected int getNowBullet() {
        return bullet;
    }

    public String getBulletName() {
        return name;
    }
}
