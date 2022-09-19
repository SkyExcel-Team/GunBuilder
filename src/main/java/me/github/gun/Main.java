package me.github.gun;

import me.github.gun.module.gun.Gun;
import me.github.gun.guns.AK47;
import me.github.gun.guns.K2;
import me.github.gun.guns.S1897;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;
import java.util.UUID;

public class Main extends JavaPlugin implements Listener {

    HashMap<UUID, Gun> gun = new HashMap<>();

    @Override
    public void onEnable() {
        super.onEnable();

        AK47 ak47 = new AK47();
        System.out.println(ak47.getName() + " : " + ak47.getBullet().getBulletName() + " : 총알 갯수: " + ak47.getMaxAmmunition());
        ak47.addChoke();
        K2 k2 = new K2();
        System.out.println(k2.getName() + " : " + k2.getBullet().getBulletName() + " : 총알 갯수: " +  k2.getMaxAmmunition());
        k2.addChoke();
        S1897 S1897 = new S1897();
        System.out.println(S1897.getName() + " : " + S1897.getBullet().getBulletName() + " : 총알 갯수: " + S1897.getMaxAmmunition());

        S1897.addChoke();

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(this, this);
    }


}
