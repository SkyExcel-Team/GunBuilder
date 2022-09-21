package me.gunbuilder.gun.module.event;

import me.gunbuilder.gun.module.event.action.GunAction;
import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Include the attachment for consider what's gun and part of it
 * This event can seperate gun's action
 * if the gun is null action might return null too.
 */
public class GunEvent extends Event implements Cancellable {

    private Gun gun;
    private Player player;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private boolean isCancelled;

    private GunAction action;


    /**
     * @param gun    What's reloaded
     * @param player Who's reload
     */
    public GunEvent(Gun gun, Player player) {
        this.gun = gun;
        this.player = player;
    }


    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }

    public void setAction(GunAction action) {
        this.action = action;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public Gun getGun() {
        return gun;
    }

    public Player getPlayer() {
        return player;
    }

    public GunAction getAction() {
        return action;
    }
}
