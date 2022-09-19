package me.gunbuilder.gun.guns;

import me.gunbuilder.gun.attachment.Angle;
import me.gunbuilder.gun.attachment.scope.Scope2x;
import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class K2 extends Gun {
    public K2() {
        super("K2", "5.56mm",
                new ItemStack(Material.GRASS_BLOCK), Sound.AMBIENT_BASALT_DELTAS_ADDITIONS, Sound.BLOCK_CHEST_OPEN);
    }

    public void addChoke() {
        Angle angle = new Angle();
        angle.setGun(this);

        Scope2x scope2x = new Scope2x();
        scope2x.setGun(this);
    }
}
