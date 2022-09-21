package me.gunbuilder.gun.data;

import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Config {
    public FileConfiguration config;
    public File file;
    private String name;
    private ConfigurationSection section;

    private Plugin plugin;

    public Config(String name) {
        this.name = name;
    }


    public void addNode(Gun gun) {

        getConfig().set(gun.getName() + ".damage", gun.getDamage());

        getConfig().set(gun.getName() + ".bullet.name", gun.getBullet().getName());

        getConfig().set(gun.getName() + ".bullet.speed", gun.getBullet().getSpeed());

//        getConfig().set(gun.getName() + ".attachment", );
        saveConfig();
    }


    public void reloadConfig() {
        if (this.config == null)
            this.file = new File(plugin.getDataFolder(), name + ".yml");
        this.config = YamlConfiguration.loadConfiguration(this.file);

        InputStream inputStream = plugin.getResource(name + ".yml");
        if (inputStream != null) {
            YamlConfiguration config = YamlConfiguration.loadConfiguration(new InputStreamReader(inputStream));
            this.config.setDefaults(config);
        }
    }

    public FileConfiguration getConfig() {
        if (this.config == null) reloadConfig();
        return config;
    }

    public boolean saveConfig() {
        if (this.config == null || this.file == null) return false;
        try {
            getConfig().save(this.file);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
