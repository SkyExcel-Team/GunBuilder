package me.github.gun.attachment;

import me.github.gun.module.attachment.Attachment;
import me.github.gun.guns.K2;

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
