package org.sjwimmer.welcomeplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getServer;

public class JoinEventHandler implements Listener {

    @EventHandler
    public void onPlayerJointServer(PlayerJoinEvent playerJoinEvent){
        playerJoinEvent.setJoinMessage(String.format("%s, welcome to our server!", playerJoinEvent.getPlayer().getName()));
        getServer().dispatchCommand(getServer().getConsoleSender(),String.format("title @p title {\"text\":\" %s joined the server!\",\"color\":\"green\"}", playerJoinEvent.getPlayer().getName()));
    }
}
