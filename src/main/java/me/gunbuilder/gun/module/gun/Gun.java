package me.gunbuilder.gun.module.gun;

import me.gunbuilder.gun.module.attachment.Attachment;
import me.gunbuilder.gun.module.event.GunEvent;
import me.gunbuilder.gun.module.event.action.GunAction;
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


    private Collection<Attachment> attachments;


    /**
     * This constructor not require the bullet information
     * You can use this constructor but the bullet might return null
     *
     * @param gun  GunName
     * @param item GunItem
     */
    protected Gun(String gun, ItemStack item, Sound run_sound, Sound reload_sound) {
        super(null);
        this.name = gun;
        this.item = item;
        this.run_sound = run_sound;
        this.reload_sound = reload_sound;
    }


    /**
     * Register new gun in your own class constructor.
     * You can register multiple variables of the gun's parameter
     *
     * @param gun    GunName
     * @param bullet BulletName
     * @param item   GunItem
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
        GunEvent event = new GunEvent(this, player);
        event.setAction(GunAction.RELOAD);

        Bukkit.getPluginManager().callEvent(event);

    }

    protected void launchGun() {
        if (bullets.size() != 0) {
            bullets.remove(bullet);
        }
    }

    public void addAttachment(Attachment attachment) {
        attachment.setGun(this);
        attachments.add(attachment);
    }

    public void removePart(Attachment attachment) {
        attachment.setGun(this);
        attachments.remove(attachment);
    }


    public Bullet getBullet() {
        return bullet;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
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

    public Sound getReload_sound() {
        return reload_sound;
    }

    public Sound getRun_sound() {
        return run_sound;
    }

    public void register() {
        System.out.println(getName() + " Config Node 추가!");
    }
}
