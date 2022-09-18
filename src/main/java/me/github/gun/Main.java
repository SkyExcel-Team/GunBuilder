package me.github.gun;

import me.github.gun.guns.module.Gun;
import me.github.gun.guns.event.ReloadEvent;
import me.github.gun.guns.module.gun.AK47;
import me.github.gun.guns.module.gun.K2;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        AK47 ak47 = new AK47();
        System.out.print(ak47.getName() + " : " + ak47.getBullet().getBulletName());

        System.out.println(new K2().getBullet().getBulletName());
        new K2();
    }



    @EventHandler
    public void test(ReloadEvent event) {
        Player player = event.getPlayer();
        Gun gun = event.getGun();

    }
}
