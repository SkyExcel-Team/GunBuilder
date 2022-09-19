package me.github.gun.module.gun;

import me.github.gun.module.event.ReloadEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public abstract class Gun extends Bullet {

    private String name;

    private String type;

    private ItemStack item;

    private Bullet bullet;

    private double damage;

    private int Storage;

    private double reload_speed;

    private int MaxAmmunition;
    private Collection<Bullet> bullets;


    /**
     * Register new Gun in the class's constructor.
     *
     * @param gun The name of the gun
     */
    protected Gun(String gun, String bullet, int MaxAmmunition) {
        super(bullet);
        this.MaxAmmunition = MaxAmmunition;
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


    protected void reloadGun(Player player) {
        ReloadEvent event = new ReloadEvent(this, player);
        Bukkit.getPluginManager().callEvent(event);
        for (int i = Storage; i < MaxAmmunition; i++) {
            bullets.add(bullet);
        }
    }

    protected void launchGun() {
        if (bullets.size() != 0) {
            bullets.remove(bullet);
        }
    }


    public Bullet getBullet() {
        return bullet;
    }

    public ItemStack getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public int getStorage() {
        return Storage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getMaxAmmunition() {
        return MaxAmmunition;
    }

    public void setReload_speed(double reload_speed) {
        this.reload_speed = reload_speed;
    }

    public double getReload_speed() {
        return reload_speed;
    }
}
