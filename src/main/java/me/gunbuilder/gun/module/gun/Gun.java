package me.gunbuilder.gun.module.gun;

import me.gunbuilder.gun.module.attachment.Attachment;
import me.gunbuilder.gun.module.event.GunEvent;
import me.gunbuilder.gun.module.event.action.GunAction;
import me.gunbuilder.gun.module.type.GunType;
import me.gunbuilder.gun.storage.Storage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

/**
 * <pre>{@code
 *
 * public class AK47 extends Gun {
 *
 * private String type = "";
 *
 * public AK47() {
 * super("AK47", "7.62mm",
 * new ItemStack(Material.GRASS_BLOCK),
 *      Sound.BLOCK_CHEST_OPEN, //Gun Launch Sound
 *      Sound.BLOCK_CHEST_OPEN); //Gun Reload Sound
 *      }
 *
 * @Override
 * public void setType() {
 * type = "fire";
 *      }
 *
 * public String getType() {
 * return type;
 *     }
 * }
 * }</pre>
 */
public abstract class Gun extends Bullet implements GunType {

    private String name;

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
     * This constructor doesn't require the bullet information
     * You can use this constructor but the bullet might return null
     *
     * @param gun  GunName
     * @param item GunItem
     */
    protected Gun(String gun, ItemStack item, Sound run_sound, Sound reload_sound) {
        super("null");
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


    /**
     * This method must be use when it's reload
     * You can call this method in event, or class
     *
     * @param player Get the player
     */
    public void reloadGun(Player player) {
        registerGunEvent(GunAction.RELOAD, player);

    }

    public void launchGun(Player player) {
        if (bullets.size() != 0) {

            registerGunEvent(GunAction.RELOAD, player);
        }
    }

    /**
     * Add attachment and register attachment event with type(set to add)
     *
     * @param attachment Added object class
     */
    public void addAttachment(Attachment attachment) {
        attachment.setGun(this);
        attachments.add(attachment);

    }

    /**
     * This method remove automatically check bullet or gun is null
     * So You can do whatever in this method with sort of this class
     *
     * @param attachment remove part object class
     */
    public void removeAttachment(Attachment attachment) {
        attachment.setGun(this);

    }


    /**
     * This method should be use when using constructor not require bullet
     * Or, change the bullet information
     *
     * @param bullet newBullet
     */
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }


    /**
     * If the bullet class is null, the bullet might return the class name by "null"
     *
     * @return Bullet class even there's empty on bullet but the error message going to print
     */
    public Bullet getBullet() {
        return (bullet != null ? bullet : new Bullet("null") {
            @Override
            public String getName() {
                Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "The Bullet class might be null! ");
                return super.getName();
            }
        });
    }

    public Collection<Attachment> getAttachments() {
        return attachments;
    }

    public ItemStack getItem() {
        return item;
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

    private void registerGunEvent(GunAction action, Player player) {
        GunEvent event = new GunEvent(this, player);
        event.setAction(action);
        Bukkit.getPluginManager().callEvent(event);
    }
}
