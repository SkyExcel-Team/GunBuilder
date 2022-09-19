package me.gunbuilder.gun.storage;

import me.gunbuilder.gun.guns.AK47;
import me.gunbuilder.gun.module.attachment.Attachment;

import java.util.Arrays;

public class Storage extends Attachment {

    private int Ammo;
    private int MaxAmmo = 10;


    public Storage() {
        super("대용량 탄창", Arrays.asList(new AK47()));
    }

    @Override
    public void option() {
        getGun().setStorage(this);

        System.out.println("대용량 탄창 장착!");
    }

    public int getAmmo() {
        return Ammo;
    }

    public int getMaxAmmo() {
        return MaxAmmo;
    }

    public void setAmmo(int ammo) {
        Ammo = ammo;
    }

    public void setMaxAmmo(int maxAmmo) {
        MaxAmmo = maxAmmo;
    }
}
