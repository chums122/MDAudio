package us.magicaldreams.mdaudio;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import us.magicaldreams.mdaudio.events.PlayerJoin;
import us.magicaldreams.mdaudio.servers.WebServer;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        WebServer.runServer(this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }
}
