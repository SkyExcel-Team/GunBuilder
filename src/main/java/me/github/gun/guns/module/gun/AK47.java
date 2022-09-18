package me.github.gun.guns.module.gun;

import me.github.gun.guns.module.Gun;
import me.github.gun.guns.module.attachment.Choke;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AK47 extends Gun {

    public AK47() {
        super("AK47", "7.62mm", new ItemStack(Material.MELON));
        setMaxBullet(30);

    }


}
