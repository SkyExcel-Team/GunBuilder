package me.github.gun.guns.module;

import me.github.gun.guns.event.ReloadEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class Gun extends Bullet {

    private String name;
    private ItemStack item;

    private Bullet bullet;

    /**
     * Register new Gun in the class's constructor.
     *
     * @param gun The name of the gun
     */
    protected Gun(String gun, String bullet) {
        super(bullet);
        this.bullet = this;
        this.name = gun;
    }

    /**
     * Register new Gun in the class's constructor.
     *
     * @param gun  The name of the gun
     * @param item The item of the gun
     */
    protected Gun(String gun, String bullet, ItemStack item) {
        super(bullet);
        this.bullet = this;
        this.name = gun;
        this.item = item;
    }

    public Bullet getBullet() {
        return bullet;
    }

    protected void reload(Player player) {
        ReloadEvent event = new ReloadEvent(this, player);
        Bukkit.getPluginManager().callEvent(event);

    }

    public ItemStack getItem() {
        return item;
    }

    public String getName() {
        return name;
    }
}
