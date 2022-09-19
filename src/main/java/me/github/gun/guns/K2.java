package me.github.gun.guns;

import me.github.gun.attachment.Angle;
import me.github.gun.attachment.scope.Scope2x;
import me.github.gun.module.gun.Gun;

public class K2 extends Gun {
    public K2(){
        super("K2","5.56mm",10);
    }

    public void addChoke() {
        Angle angle = new Angle();
        angle.setGun(this);

        Scope2x scope2x = new Scope2x();
        scope2x.setGun(this);
    }
}
