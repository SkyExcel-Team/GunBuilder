package me.github.gun.guns.module.gun;

import me.github.gun.guns.module.Gun;
import me.github.gun.guns.module.attachment.Choke;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class S1897 extends Gun {
    public S1897() {
        super("S1897", "7.62mm", new ItemStack(Material.MELON));
    }

    public void addChoke() {
        Choke choke = new Choke();
        choke.setGun(this);
        System.out.println(getName() + " 총에 파츠 " + choke.getName() + " 장착!");
    }
}
