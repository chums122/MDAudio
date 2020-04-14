package us.magicaldreams.mdaudio.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import us.magicaldreams.mdaudio.managers.WebsocketSessionManager;
import us.magicaldreams.mdaudio.servers.WebsocketServer;

public class TestCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if (cmd.getName().equals("test")) {
            if (WebsocketSessionManager.getSessionManager().getSessionByName(p.getName()) != null) {
                WebsocketServer.s.sendData(WebsocketSessionManager.getSessionManager().getSessionByName(p.getName()), "test.ogg");
            }

        }

        return true;
    }

}




