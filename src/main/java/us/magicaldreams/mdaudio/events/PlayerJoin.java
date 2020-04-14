package us.magicaldreams.mdaudio.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public class PlayerJoin implements Listener {

    @EventHandler
    public void  onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Click here to connect to our audio server!");
        p.sendMessage(ChatColor.WHITE + "" + ChatColor.UNDERLINE + "http://" + "127.0.0.1" + ":8080/index.html?name=" + p.getName() + "&sessionId=" + new Random().nextInt(10000));
    }
}


