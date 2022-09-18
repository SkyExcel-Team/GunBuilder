package me.github.gun.test;

import me.github.gun.Gun;

public class AK47 extends Gun {

    public AK47(){
        Gun("AK-47");
    }


    @Override
    protected void Gun(String name) {
        super.Gun(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
