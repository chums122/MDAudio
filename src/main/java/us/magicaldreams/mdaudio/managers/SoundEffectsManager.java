package us.magicaldreams.mdaudio.managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import us.magicaldreams.mdaudio.servers.WebsocketServer;

public class SoundEffectsManager {
    public static void playToPlayer(Player p, String data) {
        if (WebsocketSessionManager.getSessionManager().getSessionByName(p.getName()) != null) {
            WebsocketServer.s.sendData(WebsocketSessionManager.getSessionManager().getSessionByName(p.getName()), data);
        }
    }

    public static void playToAll(String data) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (WebsocketSessionManager.getSessionManager().getSessionByName(p.getName()) != null) {
                WebsocketServer.s.sendData(WebsocketSessionManager.getSessionManager().getSessionByName(p.getName()), data);
            }
        }
    }
}