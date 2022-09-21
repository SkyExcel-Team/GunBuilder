package me.gunbuilder.gun.module.attachment;

import me.gunbuilder.gun.module.gun.Gun;

import java.util.List;

public abstract class Attachment implements AttachmentOption {

    private String name;
    private List<Gun> guns;

    private Gun gun;

    protected Attachment(String name, List<Gun> guns) {
        this.name = name;
        this.guns = guns;
    }


    public void setGun(Gun gun) {

        this.gun = gun;

        guns.stream().forEach(guns -> {
            if(guns.getName().equalsIgnoreCase(gun.getName())){
                System.out.println(gun.getName());
                option();
            }
        });
    }

    public String getName() {
        return name;
    }

    public Gun getGun() {
        return gun;
    }

    public List<Gun> getGuns() {
        return guns;
    }

}
