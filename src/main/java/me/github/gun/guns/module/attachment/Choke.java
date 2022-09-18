package me.github.gun.guns.module.attachment;

import me.github.gun.guns.module.gun.AK47;
import me.github.gun.guns.module.gun.K2;
import me.github.gun.guns.module.gun.S1897;

import java.util.Arrays;

public class Choke extends Attachment implements AttachmentOption {

    public Choke() {
        super("Choke", Arrays.asList(new S1897()));
    }

    @Override
    public void option() {

    }
}
