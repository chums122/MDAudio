package us.magicaldreams.mdaudio.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import us.magicaldreams.mdaudio.objects.CommonObjects;

public class PlayerJoin implements Listener {

    @EventHandler
    public void  onPlayerJoin(PlayerJoinEvent event) {

        // Send audio link on player join
        new CommonObjects().sendAudioLink(event.getPlayer());
    }
}


