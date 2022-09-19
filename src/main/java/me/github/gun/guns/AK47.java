package me.github.gun.guns;

import me.github.gun.attachment.Angle;
import me.github.gun.module.gun.Gun;

public class AK47 extends Gun {

    public AK47() {
        super("AK47", "7.62mm", 50);
    }
    public void addChoke() {
        Angle angle = new Angle();
        angle.setGun(this);
    }
}
