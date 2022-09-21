package me.gunbuilder.gun.guns;

import me.gunbuilder.gun.module.attachment.Attachment;
import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class AK47 extends Gun {

    public AK47() {
        super("AK47", "7.62mm", new ItemStack(Material.GRASS_BLOCK), Sound.AMBIENT_BASALT_DELTAS_ADDITIONS, Sound.BLOCK_CHEST_OPEN);

    }

    @Override
    public void addAttachment(Attachment attachment) {
        System.out.println(attachment.getName());
        setBullet(null);
        super.addAttachment(attachment);
    }

    @Override
    public void removePart(Attachment attachment) {

        super.removePart(attachment);
    }

    @Override
    protected void launchGun() {
        super.launchGun();
    }
}
