package me.github.gun.guns.module.gun;

import me.github.gun.guns.module.Gun;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AK47 extends Gun {

    public AK47() {
        super("AK47","", new ItemStack(Material.MELON));


    }

    @Override
    protected void reload(Player player) {
        super.reload(player);
    }

}
