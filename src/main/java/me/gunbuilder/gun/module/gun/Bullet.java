package me.gunbuilder.gun.module.gun;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Bullet implements ConfigurationSerializable {
    private String name;

    private double speed = 50;


    protected Bullet(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    @NotNull
    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("bullet", getName());
        result.put("speed", getSpeed());
        return result;
    }
}
