package me.gunbuilder.gun;

import me.gunbuilder.gun.module.event.GunPickUpEvent;
import me.gunbuilder.gun.module.event.GunReloadEvent;
import me.gunbuilder.gun.guns.AK47;
import me.gunbuilder.gun.guns.K2;
import me.gunbuilder.gun.guns.S1897;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        super.onEnable();

        new AK47().register();





        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(this, this);
    }


}
