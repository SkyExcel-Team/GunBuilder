package me.github.gun.module.attachment;

import me.github.gun.module.gun.Gun;
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

        guns.stream().forEach(gun1 -> {
            if(gun1.getName().equalsIgnoreCase(gun.getName())){
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
