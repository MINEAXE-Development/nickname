package org.mcodin5569.nickName;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatUtil {

    public static void send(Player player, String message) {
        Component full = Prefix.PREFIX.append(MiniMessage.miniMessage().deserialize(message));
        player.sendMessage(full);
    }

    public static void send(CommandSender sender, String message) {
        Component full = Prefix.PREFIX.append(MiniMessage.miniMessage().deserialize(message));
        sender.sendMessage(full);
    }
}