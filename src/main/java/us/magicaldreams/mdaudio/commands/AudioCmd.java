package us.magicaldreams.mdaudio.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import us.magicaldreams.mdaudio.objects.CommonObjects;

public class AudioCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = ((Player) sender).getPlayer();

            if (player != null) {
                new CommonObjects().sendAudioLink(player);
            }
        } else {
            new CommonObjects().sendVersionString(sender);
        }
        return false;
    }
}
