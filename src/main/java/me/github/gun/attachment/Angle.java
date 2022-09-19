package me.github.gun.attachment;

import me.github.gun.module.attachment.Attachment;
import me.github.gun.guns.AK47;
import me.github.gun.guns.K2;
import java.util.Arrays;

public class Angle extends Attachment {

    public Angle() {
        super("Angle", Arrays.asList(new K2(), new AK47()));

    }
    @Override
    public void option() {
        System.out.println(getName() + " 파츠를 " + getGun().getName() + " 총기에 장착 하였습니다!");
        System.out.println("수직 반동 20% 감소!");
    }
}
