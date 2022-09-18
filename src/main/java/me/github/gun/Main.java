package me.github.gun;

import me.github.gun.test.AK47;
import me.github.gun.test.K2;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        new AK47();
        new K2();
    }

}
