package us.magicaldreams.mdaudio;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import us.magicaldreams.mdaudio.commands.TestCommand;
import us.magicaldreams.mdaudio.events.PlayerJoin;
import us.magicaldreams.mdaudio.servers.WebServer;
import us.magicaldreams.mdaudio.servers.WebsocketServer;

import java.io.IOException;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        WebServer.runServer(this);

        try {
            WebsocketServer.runServer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);

        getCommand("test").setExecutor(new TestCommand());
    }
}
