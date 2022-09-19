package me.gunbuilder.gun.module.event;

import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GunReloadEvent extends Event implements Cancellable {

    private Gun gun;
    private Player player;
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;


    /**
     * Call When the player reload the gun
     *
     * @param gun    What's reloaded
     * @param player Who's reload
     */
    public GunReloadEvent(Gun gun, Player player) {
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
}
