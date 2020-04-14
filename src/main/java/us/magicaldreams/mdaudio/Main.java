package us.magicaldreams.mdaudio;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import us.magicaldreams.mdaudio.events.PlayerJoin;
import us.magicaldreams.mdaudio.servers.WebServer;
import us.magicaldreams.mdaudio.servers.WebsocketServer;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        WebServer.runServer(this);
        WebsocketServer.runServer();
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }
}
