package me.gunbuilder.gun.attachment;

import me.gunbuilder.gun.module.attachment.Attachment;
import me.gunbuilder.gun.guns.K2;

import java.util.Arrays;

public class Choke extends Attachment {

    public Choke() {
        super("Choke", Arrays.asList(new K2()));
    }

    @Override
    public void option() {
        System.out.println(getName() + " 총에 파츠 " + getName() + " 장착!");
    }
}
