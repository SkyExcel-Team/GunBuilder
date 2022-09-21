package me.gunbuilder.gun;

import me.gunbuilder.gun.attachment.Angle;
import me.gunbuilder.gun.guns.AK47;
import me.gunbuilder.gun.module.event.GunEvent;
import me.gunbuilder.gun.module.event.action.GunAction;
import me.gunbuilder.gun.storage.Storage;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        super.onEnable();

        AK47 ak47 = new AK47();

        ak47.addAttachment(new Angle());

        ak47.addAttachment(new Storage());

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(this, this);
    }

    @EventHandler
    public void Gun(GunEvent event) {
        if (event.getAction().equals(GunAction.RELOAD)) {
            event.getPlayer().sendMessage(event.getGun().getName() + " 리로드를 했습니다!");
        }
    }

}
