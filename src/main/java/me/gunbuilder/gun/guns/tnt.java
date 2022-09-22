package me.gunbuilder.gun.guns;

import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class tnt extends Gun {
    String type;

    public tnt() {
        super("TNT", new ItemStack(Material.TNT),
                Sound.ENTITY_GENERIC_EXPLODE,
                Sound.ENTITY_GENERIC_EXPLODE);
    }


    @Override
    public void setType() {
        type = "Throwable";
    }
}
