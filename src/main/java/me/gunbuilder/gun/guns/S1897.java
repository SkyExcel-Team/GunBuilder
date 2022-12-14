package me.gunbuilder.gun.guns;

import me.gunbuilder.gun.attachment.Choke;
import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class S1897 extends Gun {

    String type = "";
    public S1897() {
        super("S1897", "산탄총",
                new ItemStack(Material.MELON),
                Sound.AMBIENT_BASALT_DELTAS_ADDITIONS,
                Sound.BLOCK_CHEST_OPEN);

    }

    public void addChoke() {
        Choke choke = new Choke();
        choke.setGun(this);
    }

    @Override
    public void setType() {
        type = "fire";
    }

    public String getType() {
        return type;
    }
}
