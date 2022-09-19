package me.github.gun.guns;

import me.github.gun.attachment.Choke;
import me.github.gun.module.gun.Gun;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class S1897 extends Gun {
    public S1897() {
        super("S1897", "산탄총", new ItemStack(Material.MELON));
        setType("SG");
    }

    public void addChoke() {
        Choke choke = new Choke();
        choke.setGun(this);
    }
}
