package org.mcodin5569.nickName;

import org.mcodin5569.nickName.NicknameManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            ChatUtil.send(sender, "<red>Nur Spieler können diesen Befehl benutzen.");
            return true;
        }

        if (args.length != 1) {
            ChatUtil.send(player, "<red>Benutzung: /nick <Name>");
            return true;
        }

        String rawNick = args[0];
        String nick = ChatColor.translateAlternateColorCodes('&', rawNick);

        NicknameManager.applyNickname(player, nick);
        ChatUtil.send(player, "<green>Dein Nickname ist jetzt: " + nick);
        return true;
    }
}
