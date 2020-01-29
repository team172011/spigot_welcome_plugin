package org.sjwimmer.welcomeplugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class WelcomePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        this.getServer().getPluginManager().registerEvents(new JoinEventHandler(), this);
    }
}
