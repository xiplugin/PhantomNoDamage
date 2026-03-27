package com.coderxi.plugin.phantomNoDamage;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PhantomNoDamage extends JavaPlugin implements Listener {

    @EventHandler
    public void onPhantomAttack(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() == EntityType.PHANTOM) {
            event.setCancelled(true);
        }
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll((Listener) this);
    }
}
