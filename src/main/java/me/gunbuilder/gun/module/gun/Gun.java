package me.gunbuilder.gun.module.gun;

import me.gunbuilder.gun.module.event.GunReloadEvent;

import me.gunbuilder.gun.storage.Storage;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public abstract class Gun extends Bullet {

    private String name;

    private String type;

    private ItemStack item;

    private Bullet bullet;

    private double damage;

    private Storage storage;

    private double reload_speed;

    private Sound run_sound;


    private Sound reload_sound;


    /**
     * This Collection's size by the storage
     */

    private Collection<Bullet> bullets;


    /**
     * Register new gun in your own class constructor.
     * You can register multiple variables of the gun's parameter
     *
     * @param gun    GunName
     * @param bullet BulletName
     * @param item   GunItem
     * @param sound  LaunchSound
     */
    protected Gun(String gun, String bullet, ItemStack item, Sound run_sound, Sound reload_sound) {
        super(bullet);
        this.bullet = this;
        this.name = gun;
        this.item = item;
        this.run_sound = run_sound;
        this.reload_sound = reload_sound;
    }


    protected void reloadGun(Player player) {
        GunReloadEvent event = new GunReloadEvent(this, player);
        Bukkit.getPluginManager().callEvent(event);

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



    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setReload_speed(double reload_speed) {
        this.reload_speed = reload_speed;
    }

    public double getReload_speed() {
        return reload_speed;
    }
}
