package me.gunbuilder.gun.guns;

import me.gunbuilder.gun.attachment.Angle;
import me.gunbuilder.gun.module.gun.Gun;

import me.gunbuilder.gun.storage.Storage;
import net.minecraft.world.item.Items;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class AK47 extends Gun {

    public AK47() {
        super("AK47", "7.62mm", new ItemStack(Material.GRASS_BLOCK), Sound.AMBIENT_BASALT_DELTAS_ADDITIONS, Sound.BLOCK_CHEST_OPEN);
    }

    public void addChoke() {
        Angle angle = new Angle();
        angle.setGun(this);

        Storage storage = new Storage();

        storage.setGun(this);
        storage.getGun().getStorage().setAmmo(0);
        storage.getGun().getStorage().setMaxAmmo(50);
        System.out.println("대용량 탄창 용량 : " + storage.getAmmo() + "/" +  storage.getMaxAmmo());

    }
}
