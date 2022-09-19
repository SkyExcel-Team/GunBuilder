package me.github.gun.attachment.scope;

import me.github.gun.guns.K2;
import me.github.gun.module.attachment.Attachment;

import java.util.Arrays;

public class Scope2x extends Attachment {

    public Scope2x() {
        super("2배율 스코프", Arrays.asList(new K2()));
    }


    @Override
    public void option() {
        getGun().setReload_speed(20);
        System.out.println("2배율 스코프를 장착! 정조준 속도 + " +
                getGun().getReload_speed() + "%, 1.8 배율 ");

    }
}
