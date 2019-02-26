package io.pfuenzle;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedListener implements Listener {
    @EventHandler
    public void onPlayerBedEnterEvent(PlayerBedEnterEvent event)
    {
        Player player = event.getPlayer();

        if(event.isCancelled()) //Falls Spieler nicht schlafen gehen kann
            return;

        Bukkit.broadcastMessage("Spieler " + player.getDisplayName() + " ist schlafen gegangen");

        World world = Bukkit.getWorld("world"); //Setze Zeit in allen Welten auf 0
        world.setTime(0);


        event.getPlayer().eject(); //Schmeiße Spieler aus Bett
    }
}
