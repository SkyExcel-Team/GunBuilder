package me.gunbuilder.gun.attachment;

import me.gunbuilder.gun.module.attachment.Attachment;
import me.gunbuilder.gun.guns.AK47;
import me.gunbuilder.gun.guns.K2;

import java.util.Arrays;

public class Angle extends Attachment {

    public Angle() {
        super("Angle", Arrays.asList(new K2() ));

    }
    @Override
    public void option() {
        System.out.println(getName() + " 파츠를 " + getGun().getName() + " 총기에 장착 하였습니다!");
        System.out.println("수직 반동 20% 감소!");
    }
}
