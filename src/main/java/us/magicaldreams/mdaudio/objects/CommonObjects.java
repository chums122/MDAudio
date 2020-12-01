package us.magicaldreams.mdaudio.objects;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class CommonObjects {

    public void sendAudioLink(Player player) {
        TextComponent audioMessage = new TextComponent("Click here to connect to our audio server!");

        audioMessage.setColor(ChatColor.GREEN);
        audioMessage.setBold(true);
        audioMessage.setUnderlined(true);

        String audioHostAddress = "147.135.37.207:8080";
        String audioURL = "http://" + audioHostAddress + "/index.html?name=";
        String sessionID = "&sessionId=" + new Random(System.currentTimeMillis()).nextInt(10000);

        ComponentBuilder linkHover = new ComponentBuilder(audioURL + player.getName() + sessionID).color(ChatColor.AQUA);
        audioMessage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, linkHover.create()));

        audioMessage.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, audioURL + player.getName() + sessionID));

        player.sendMessage("");
        player.spigot().sendMessage(new TextComponent(audioMessage));
        player.sendMessage("");
    }

    public void sendVersionString(CommandSender sender) {
        sender.sendMessage("MDAudio > Version 0.0.1-ALPHA");
    }
}
