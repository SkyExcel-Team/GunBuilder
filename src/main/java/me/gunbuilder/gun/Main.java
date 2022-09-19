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



        AK47 ak47 = new AK47();
        System.out.println(ak47.getName() + " : " + ak47.getBullet().getBulletName() + " : 총알 갯수: ");
        ak47.addChoke();
        K2 k2 = new K2();
        System.out.println(k2.getName() + " : " + k2.getBullet().getBulletName() + " : 총알 갯수: ");
        k2.addChoke();
        S1897 S1897 = new S1897();
        System.out.println(S1897.getName() + " : " + S1897.getBullet().getBulletName() + " : 총알 갯수: ");

        S1897.addChoke();

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(this, this);
    }

    @EventHandler
    public void reload(GunReloadEvent event) {
        event.getGun().getName();
    }


    @EventHandler
    public void pick(GunPickUpEvent event) {
        event.getGun().getName();
    }
}
