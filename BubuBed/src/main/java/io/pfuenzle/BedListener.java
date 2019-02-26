package io.pfuenzle;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedListener implements Listener {
    @EventHandler
    public void onPlayerBedEnterEvent(PlayerBedEnterEvent event)
    {
        if(event.getBedEnterResult() != PlayerBedEnterEvent.BedEnterResult.OK)
            return;
        Bukkit.broadcastMessage("Spieler " + event.getPlayer().getDisplayName() + " ist schlafen gegangen");
        World thisWorld = Bukkit.getWorld(event.getPlayer().getUniqueId());
        thisWorld.setTime(0);
        event.getPlayer().eject();
    }
}
