package me.github.gun.guns.module.attachment;

import me.github.gun.guns.module.Gun;

import java.util.ArrayList;
import java.util.List;

public abstract class Attachment {

    private String name;
    private List<Gun> guns = new ArrayList<>();

    private Gun gun;


    protected Attachment(String name, List<Gun> guns) {
        this.name = name;
        this.guns = guns;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public Gun getGun() {
        return gun;
    }
}
